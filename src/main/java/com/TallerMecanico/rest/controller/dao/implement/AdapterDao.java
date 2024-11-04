package com.TallerMecanico.rest.controller.dao.implement;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

import com.TallerMecanico.rest.controller.tda.list.LinkedList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Array;
import java.lang.reflect.Type;

public class AdapterDao <T> implements InterfazDao<T> {
    private Class<?> clazz;
    private Gson gson = new Gson();
    public static String URL = "/media/";

    public AdapterDao() {}

    public AdapterDao(Class<?> clazz){
        this.clazz = clazz;
    }

    @Override
    public LinkedList<T> getListAll() throws Exception {
        LinkedList<T> list = new LinkedList<>();
        try {
            String data = readFile();
            Type arrayType = Array.newInstance(clazz, 0).getClass();
            T[] arrayObjects = gson.fromJson(data, arrayType);
            list.fromArrayToLinkedList(arrayObjects);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public T get(Integer id) throws Exception {
        LinkedList<T> listaux = getlistAll();
        return listaux.get(id-1);
    }
    
    public AdapterDao(InterfazDao<T> dao) {
    }
    
    public void persist(T object) throws Exception {
        LinkedList<T> list = getListAll();
        list.add(object);
        try {
            saveFile(list.toArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void merge(T object, Integer index) throws Exception {
        LinkedList<T> list = getListAll();
        list.set(index, object);
        saveFile(list.toArray());
    }
        //lee archivo
    public String readFile() throws Exception {
        BufferedReader bf = new BufferedReader(new FileReader(URL + clazz.getSimpleName() + ".json"));
        StringBuilder sb = new StringBuilder();
        String line = "";
        while ((line = bf.readLine()) != null) {
            sb.append(line).append("\n");
        }
        bf.close();
        return sb.toString();
    }

    private void saveFile(T[] object) throws Exception {
        gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter(URL + clazz.getSimpleName() + ".json");
        fw.write(gson.toJson(object));
        fw.flush();
        fw.close();
    }
}

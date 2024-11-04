package com.TallerMecanico.rest.controller.dao.implement;
import java.io.File;
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
        LinkedList<T> list = listAll();
        if (!list.isEmpty()) {
            T [] matriz = list.toArray();
            return matriz[id - 1];
            
        }
        return null;
    }
    
    

    public void merge(T object, Integer index) throws Exception {
        LinkedList<T> list = listAll();
        list.update(object, index);
        String info = g.toJson(list.toArray());
        saveFile(info);
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
        //lee archivo
   private String readFile() throws Exception {
        File file = new File(URL + clazz.getSimpleName() + ".json");

        if (!file.exists()) {
            System.out.println("El archivo no existe, creando uno nuevo: " + file.getAbsolutePath());
            saveFile("[]");
        }

        StringBuilder sb = new StringBuilder();
        try (Scanner in = new Scanner(new FileReader(file))) {
            while (in.hasNextLine()) {
                sb.append(in.nextLine()).append("\n");
            }
        }
        return sb.toString().trim();
    }

    private void saveFile(String data) throws Exception {
        File file = new File(URL + clazz.getSimpleName() + ".json");
        file.getParentFile().mkdirs();

        if (!file.exists()) {
            System.out.println("Creando el archivo JSON: " + file.getAbsolutePath());
            file.createNewFile();
        }

        try (FileWriter f = new FileWriter(file)) {
            f.write(data);
            f.flush();
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}

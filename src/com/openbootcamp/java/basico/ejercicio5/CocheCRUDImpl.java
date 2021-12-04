package com.openbootcamp.java.basico.ejercicio5;

public class CocheCRUDImpl implements CocheCRUD{

    public CocheCRUDImpl(){};

    @Override
    public void save() {
        System.out.println("Estás ejecutando el método save()");
    }

    @Override
    public void findAll() {
        System.out.println("Estás ejecutando el método findAll()");
    }

    @Override
    public void delete() {
        System.out.println("Estás ejecutando el método delet()");
    }
}

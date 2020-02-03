package com.backend.restservice.application.repositories;

import java.util.ArrayList;

public abstract class Repository <Model>{
    protected ArrayList<Model> models;

    protected Repository (){
        models = new ArrayList<Model>();
    }

    abstract public Model get(long id);
    abstract public ArrayList<Model> getAll();
    abstract public boolean delete(long id);
    abstract public boolean add(Model model);
    abstract public boolean update(Model model, long id);
}
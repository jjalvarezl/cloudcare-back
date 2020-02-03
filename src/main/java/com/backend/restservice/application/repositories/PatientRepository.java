package com.backend.restservice.application.repositories;

import java.util.ArrayList;
import java.util.Iterator;

import com.backend.restservice.application.models.Patient;
import com.backend.restservice.application.repositories.Repository;

public class PatientRepository extends Repository<Patient> {

    @Override
    public Patient get(long id) {
        Iterator<Patient> it = models.iterator();
        while(it.hasNext()){
            Patient patient = it.next();
            if (patient.getId() == id){
                return patient;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Patient> getAll() {
        return models;
    }

    @Override
    public boolean delete(long id) {
        Iterator<Patient> it = models.iterator();
        while(it.hasNext()){
            Patient patient = it.next();
            if (patient.getId() == id){
                return models.remove(patient);
            }
        }
        return false;
    }

    @Override
    public boolean add(Patient model) {
        Iterator<Patient> it = models.iterator();
        while(it.hasNext()){
            Patient patient = it.next();
            if (patient.getId() == model.getId()){
                return false;
            }
        }
        return models.add(model);
    }

    @Override
    public boolean update(Patient model, long id) {
        Iterator<Patient> it = models.iterator();
        while(it.hasNext()){
            Patient patient = it.next();
            if (patient.getId() == id){
                models.set(models.indexOf(patient), model);
                return true;
            }
        }
        return false;
    }

}
package com.backend.restservice.infrastructure.controllers;

import com.backend.restservice.application.models.Patient;
import com.backend.restservice.application.repositories.PatientRepository;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class PatientController {
    private final String endpoint = "patients";
    private PatientRepository patientRepository;

    public PatientController (){
        patientRepository = new PatientRepository();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(endpoint+"/{id}")
    public Patient get(@PathVariable Long id){
        return patientRepository.get(id);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(endpoint)
    public ArrayList<Patient> getAll(){
        return patientRepository.getAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(endpoint)
    public boolean add(@RequestBody Patient patient){
        return patientRepository.add(patient);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping(endpoint+"/{id}")
    public boolean update(@RequestBody Patient patient, @PathVariable Long id){
        return patientRepository.update(patient, id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping(endpoint+"/{id}")
    public boolean delete(@PathVariable Long id){
        return patientRepository.delete(id);
    }

    // @GetMapping("/greeting-javaconfig")
	// public Greeting greetingWithJavaconfig(@RequestParam(required=false, defaultValue="World") String name) {
	// 	System.out.println("==== in greeting ====");
	// 	return new Greeting(counter.incrementAndGet(), String.format(template, name));
	// }
}
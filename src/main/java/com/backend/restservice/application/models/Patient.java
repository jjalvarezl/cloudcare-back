package com.backend.restservice.application.models;

import java.util.Date;

enum IdentificationType{
    CITIZENSHIP_CARD("Cedula de Ciudadanía"),
    IDENTIFICATION_CARD("Tarjeta de Identidad");

    public final String label;
 
    private IdentificationType(String label) {
        this.label = label;
    }
}

public class Patient {
    private final long id;
    private String firstNames;
    private String lastNames;
    private Date birthDate;
    private IdentificationType identificationType;
    private String identificationNumber;
    private String residenceAddress;

    public Patient (
        long id, 
        String firstNames, 
        String lastNames, 
        Date birthDate,
        IdentificationType identificationType,
        String identificationNumber,
        String residenceAddress
    ) {
        this.id = id;
        this.firstNames = firstNames;
        this.lastNames = lastNames;
        this.birthDate = birthDate;
        this.identificationType = identificationType;
        this.identificationNumber = identificationNumber;
        this.residenceAddress = residenceAddress;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getFirstNames() {
        return firstNames;
    }

    public String getLastNames() {
        return lastNames;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public IdentificationType getIdentificationType() {
        return identificationType;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    // Setters
    public void setFirstNames(String firstNames) {
        this.firstNames = firstNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setIdentificationType(IdentificationType identificationType) {
        this.identificationType = identificationType;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public void setResidenceAddress(String residenceAddress) {
        this.residenceAddress = residenceAddress;
    }
}
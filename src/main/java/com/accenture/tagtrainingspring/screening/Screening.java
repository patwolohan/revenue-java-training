package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;

import java.time.LocalDate;

public class Screening {

    private Integer screeningId;
    private Patient patient;
    private LocalDate dateOfScreening;
    private boolean isMalignant;

    public boolean isMalignant() {
        return isMalignant;
    }

    public void setMalignant(boolean malignant) {
        isMalignant = malignant;
    }

    public Integer getScreeningId() {
        return screeningId;
    }

    public void setScreeningId(Integer screeningId) {
        this.screeningId = screeningId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDate getDateOfScreening() {
        return dateOfScreening;
    }

    public void setDateOfScreening(LocalDate dateOfScreening) {
        this.dateOfScreening = dateOfScreening;
    }



    public Screening(Integer screeningId, Patient patient, LocalDate dateOfScreening, boolean isMalignant) {
        this.screeningId = screeningId;
        this.patient = patient;
        this.dateOfScreening = dateOfScreening;
        this.isMalignant = isMalignant;
    }
}

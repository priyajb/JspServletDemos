package com.doctorapp.repository;

import java.util.List;

import com.doctorapp.model.Doctor;

public interface IDoctorRepository {
	void addDoctor(Doctor doctor);
    void updateDoctor(int doctorId,double fees);
    void deleteDoctor(int doctorId);
    Doctor findById(int doctorId);
    List<Doctor> findAll();

    List<Doctor> findByspeciality(String speciality);
    List<Doctor> findByspecialityAndExp(String speciality,int experience);
    List<Doctor> findByspecialityAndLessFees(String speciality,double fees);
    List<Doctor> findByspecialityAndRatings(String speciality,int ratings );
    List<Doctor> findByspecialityAndNameContains(String speciality,String doctorName);


}

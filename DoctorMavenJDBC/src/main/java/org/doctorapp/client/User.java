package org.doctorapp.client;

import org.doctorapp.model.Doctor;
import org.doctorapp.model.Specialisation;
import org.doctorapp.service.DoctorServiceImpl;
import org.doctorapp.service.IDoctorService;

import javax.print.Doc;

public class User {
    public static void main(String[] args) {
        IDoctorService doctorService = new DoctorServiceImpl();


        //enum constant
        Specialisation specialization = Specialisation.ORTHO;
        String speciality = specialization.getSpeciality();
        System.out.println(speciality);
//        String special = specialization.getSpeciality();


//        Doctor doctor = new Doctor("abc",speciality,500,10,12);
//        doctorService.addDoctor(doctor);
    }
}

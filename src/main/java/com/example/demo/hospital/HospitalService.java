package com.example.demo.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class HospitalService {
    @Autowired
    private HospitalRepository hr;
    public List<Hospital> getAllHospitals() {
        List<Hospital> hospitalList=new ArrayList<>();
        hr.findAll().forEach(hospitalList::add);
        return hospitalList;
    }
    public Hospital getHospitalByID(int id) {
        return hr.findById(id).get();
    }
    public void saveHospitals(Hospital hospital){
        hr.save(hospital);
    }
    public void updateHospital(Hospital hospital){
        hr.save(hospital);
    }
    public void deleteHospital(int id){
        hr.deleteById(id);
    }
}

package com.example.demo.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class HospitalController {
    @Autowired
    private HospitalService hs;
    @GetMapping("/hospitals")
    public List<Hospital> getAllHospitals(){
        return hs.getAllHospitals();
    }
    @GetMapping("/hospitals/{id}")
    public Hospital getHospitalByID(@PathVariable("id") int id){
        return hs.getHospitalByID(id);
    }
    @PostMapping("/hospitals")
    public int saveHospitals(@RequestBody Hospital hospital){
        hs.saveHospitals(hospital);
        return hospital.getId();
    }
    @PutMapping("/hospitals")
    public int updateHospital(@RequestBody Hospital hospital){
        hs.updateHospital(hospital);
        return hospital.getId();
    }
    @DeleteMapping("/hospitals/{id}")
    public void deleteHospital(@PathVariable("id") int id){
        hs.deleteHospital(id);
    }
}

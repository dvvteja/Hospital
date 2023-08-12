package com.example.demo.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    List<Student> students= new ArrayList<>();
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/students")
    public List<Student> students(){

        Student student1=new Student();
        student1.setId(1);
        student1.setFirstName("Teja");
        student1.setLastName("Dvv");
        Student student2=new Student();
        student2.setId(2);
        student2.setFirstName("Teja");
        student2.setLastName("Dvv");
        students.add(student1);
        students.add(student2);
        return students;
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }
    @GetMapping("/hospitals/{id}")
    public Hospital getHospitalByID(@PathVariable("id") int id){
        return hs.getHospitalByID(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/hospitals")
    public int saveHospitals(@RequestBody Hospital hospital){
        hs.saveHospitals(hospital);
        return hospital.getId();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/hospitals")
    public int updateHospital(@RequestBody Hospital hospital){
        hs.updateHospital(hospital);
        return hospital.getId();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/hospitals/{id}")
    public void deleteHospital(@PathVariable("id") int id){
        hs.deleteHospital(id);
    }
}

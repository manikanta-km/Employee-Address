package com.example.EmployeeAddress.service;

import com.example.EmployeeAddress.model.Emp;
import com.example.EmployeeAddress.repo.IEmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EmpService {
    @Autowired
    IEmpRepo iEmpRepo;

    public String addEmp(Emp newEmp){
        iEmpRepo.save(newEmp);
        return "Employee Added";
    }

    public List<Emp> getEmpById(Integer id){
        return iEmpRepo.findAllById(Collections.singleton(id));
    }

    public List<Emp> getAllEmp(){
        return iEmpRepo.findAll();
    }

    public String updateEmp(Integer id, String name){
        Emp pEmp = iEmpRepo.findById(id).orElse(null);
        if(pEmp != null){
            pEmp.setEmpFirstName(name);
            iEmpRepo.save(pEmp);
            return "Employee Added";
        }
        else
            return "Employee Not Found";
    }

    public String deleteEmp(Integer id){
        iEmpRepo.deleteById(id);
        return "Employee Deleted";
    }

}

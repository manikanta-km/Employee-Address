package com.example.EmployeeAddress.controller;

import com.example.EmployeeAddress.model.Emp;
import com.example.EmployeeAddress.repo.IEmpRepo;
import com.example.EmployeeAddress.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    EmpService empService;

    @PostMapping("employee")
    public String addEmp(@RequestBody Emp newEmp){
        return empService.addEmp(newEmp);
    }

    @GetMapping("employee")
    public List<Emp> getEmp(@RequestParam Integer id){
        return empService.getEmpById(id);
    }

    @GetMapping("employees")
    public List<Emp> getEmployees(){
        return empService.getAllEmp();
    }

    @PutMapping("employee/name")
    public String updateEmp(@RequestParam Integer id,@RequestParam String name){
        return  empService.updateEmp(id, name);
    }

    @DeleteMapping("employee")
    public String deleteEmp(@RequestParam Integer id){
        return  empService.deleteEmp(id);
    }
}

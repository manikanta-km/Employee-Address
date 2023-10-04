package com.example.EmployeeAddress.repo;

import com.example.EmployeeAddress.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpRepo extends JpaRepository<Emp,Integer> {
}

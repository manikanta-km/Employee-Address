package com.example.EmployeeAddress.repo;

import com.example.EmployeeAddress.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Integer> {
}

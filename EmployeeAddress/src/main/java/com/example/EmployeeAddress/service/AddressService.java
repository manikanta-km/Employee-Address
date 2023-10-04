package com.example.EmployeeAddress.service;

import com.example.EmployeeAddress.model.Address;
import com.example.EmployeeAddress.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;
    public String addAddress(Address newAdd){
        iAddressRepo.save(newAdd);
        return "Address Added";
    }

    public List<Address> getAddressById(Integer id){
        return iAddressRepo.findAllById(Collections.singleton(id));
    }

    public List<Address> getAllAddress(){
        return iAddressRepo.findAll();
    }

    public String updateAdd(Integer id, String city){
        Address pAdd = iAddressRepo.findById(id).orElse(null);
        if(pAdd != null){
            pAdd.setAddCity(city);
            iAddressRepo.save(pAdd);
            return "Address Updated";
        }
        else
            return "Address Not Found";
    }

    public String deleteAdd(Integer id){
        iAddressRepo.deleteById(id);
        return "Address Deleted";
    }
}

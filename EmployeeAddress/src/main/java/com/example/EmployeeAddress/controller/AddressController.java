package com.example.EmployeeAddress.controller;

import com.example.EmployeeAddress.model.Address;
import com.example.EmployeeAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address newAdd){
        return addressService.addAddress(newAdd);
    }

    @GetMapping("address")
    public List<Address> getAddById(@RequestParam Integer id){
        return addressService.getAddressById(id);
    }

    @GetMapping("addresses")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @PutMapping("address/city")
    public String updateAddress(@RequestParam Integer id, @RequestParam String city){
        return addressService.updateAdd(id, city);
    }

    @DeleteMapping("address")
    public String deleteAdd(@RequestParam Integer id){
        return addressService.deleteAdd(id);
    }


}

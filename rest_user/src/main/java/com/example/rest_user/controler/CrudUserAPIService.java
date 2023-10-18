package com.example.rest_user.controler;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest_user.model.CrudeUser;

@RestController
@RequestMapping("/user")
public class CrudUserAPIService {
    CrudeUser crudeUser;
    @GetMapping("{id}")
    public CrudeUser getCrudeUserDetails(Long id){
        return  crudeUser ;
    }
    @PostMapping
    public String createCrudUserDetails(@RequestBody CrudeUser crudeUser){
           this.crudeUser=crudeUser;
           return "Sucessfuly is created";
    }
     @PutMapping
    public String updateCrudUserDetails(@RequestBody CrudeUser crudeUser){
           this.crudeUser=crudeUser;
           return "Sucessfuly  is updated";

    }
    @DeleteMapping("{id}")
    public String deleteCrudUserDetails(Long id){
           this.crudeUser=null;
           return "Sucessfuly is deleted";
    }
    
}

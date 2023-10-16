package com.soa.rest_book.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soa.rest_book.model.CrudBook;

@RestController
@RequestMapping("/book")
public class CrudBookAPIService {
    CrudBook crudBook;
     @GetMapping("{id}")
    public CrudBook getCrudBookDetails(String id){
        return  crudBook ;
        //("1", "1948", "George Orwell", "political science fiction");
    }
    @PostMapping
    public String createCrudBookDetails(@RequestBody CrudBook crudBook){
           this.crudBook=crudBook;
           return "Sucessfuly is created";
    }
    @PutMapping
    public String updateCrudBookDetails(@RequestBody CrudBook crudBook){
           this.crudBook=crudBook;
           return "Sucessfuly is updated";
    }
    @DeleteMapping("{id}")
    public String deleteCrudBookDetails(String id){
           this.crudBook=null;
           return "Sucessful is deleted";
    }
}
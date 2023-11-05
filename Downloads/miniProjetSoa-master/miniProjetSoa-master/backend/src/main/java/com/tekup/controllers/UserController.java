package com.tekup.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tekup.models.User;
import com.tekup.services.RegistrationService;
public class UserController {
    @Autowired
     RegistrationService service;
     @PostMapping("/register")
    public User registerUser(@RequestBody User user)throws Exception{
        String tempEmailId = user.getEmailId();
        if(tempEmailId != null && !"".equals(tempEmailId)){
             User userobj = service.fetchUserByEmailId(tempEmailId);
           if(userobj!=null){
              throw new Exception("user with "+tempEmailId+"is already exist");
           }
        }
        User userObj = null;
         userObj= service.saveUser(user);
         return userObj;
    } 

    @PostMapping("/login")

    public User loginUser(@RequestBody User user) throws Exception{
        String tempEmailId= user.getEmailId();
        String tempPass= user.getModepasse();
        User userObj=null;
        if(tempEmailId !=null && tempPass!=null){
              userObj = service.fetchUserByEmailIdAndModepasse(tempEmailId, tempPass);
        } 
        if(userObj==null){
           throw new Exception("Bad credentials");
        }
        return userObj;
    }
    
}
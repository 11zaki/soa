package com.tekup.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.models.User;
import com.tekup.repository.UserRepository;
@Service
public class RegistrationService {
   
    
        @Autowired
        private UserRepository repo;
        public User saveUser(User user){
           return repo.save(user);
        }
        public User fetchUserByEmailId(String email){
            return repo.findByEmailId(email);
    
        }
         public User fetchUserByEmailIdAndModepasse(String email , String Mode_passe){
            return repo.findByEmailIdAndModepasse(email,Mode_passe);
    
        }
    
}
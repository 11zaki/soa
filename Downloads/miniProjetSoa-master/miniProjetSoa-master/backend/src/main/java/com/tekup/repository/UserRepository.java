package com.tekup.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tekup.models.User;
public interface UserRepository extends JpaRepository<User,Integer> {

    User findByEmailId(String emailId);

    User findByEmailIdAndModepasse(String emailId ,String modepasse);
    
}
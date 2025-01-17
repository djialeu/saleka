package com.saleka.application.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);
/*    @Query(" select u from User u " +
            " where u.username = ?1")
    Optional<User> findUserWithName(String username);*/
}
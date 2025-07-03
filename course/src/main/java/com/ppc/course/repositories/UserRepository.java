package com.ppc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ppc.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

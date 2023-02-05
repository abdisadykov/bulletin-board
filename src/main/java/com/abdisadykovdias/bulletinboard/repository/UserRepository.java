package com.abdisadykovdias.bulletinboard.repository;

import com.abdisadykovdias.bulletinboard.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

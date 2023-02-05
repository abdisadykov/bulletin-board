package com.abdisadykovdias.bulletinboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bid extends JpaRepository<Bid, Long> {
}

package com.abdisadykovdias.bulletinboard.repository;

import com.abdisadykovdias.bulletinboard.model.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {
}

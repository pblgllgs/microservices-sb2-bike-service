package com.pblgllgs.bikeservice.repository;

import com.pblgllgs.bikeservice.entity.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BikeRepository extends JpaRepository<Bike,Integer> {
    List<Bike> findBikeByUserId(int userId);
}

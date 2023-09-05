package com.pblgllgs.bikeservice.service;

import com.pblgllgs.bikeservice.entity.Bike;
import com.pblgllgs.bikeservice.exception.BikeNotFoundException;
import com.pblgllgs.bikeservice.repository.BikeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BikeService {

    private final BikeRepository bikeRepository;

    public List<Bike> getAll() {
        return bikeRepository.findAll();
    }

    public Bike findBikeById(int id) {
        return bikeRepository.findById(id).orElseThrow(() -> new BikeNotFoundException("Bike not found with id: "+id));
    }

    public Bike save(Bike bike) {
        return bikeRepository.save(bike);
    }

    public List<Bike> findBikesByUserId(int userId) {
        return bikeRepository.findBikeByUserId(userId);
    }
}

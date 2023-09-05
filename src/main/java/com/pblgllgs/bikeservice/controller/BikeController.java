package com.pblgllgs.bikeservice.controller;

import com.pblgllgs.bikeservice.entity.Bike;
import com.pblgllgs.bikeservice.exception.BikeNotFoundException;
import com.pblgllgs.bikeservice.service.BikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bike")
public class BikeController {
    private final BikeService bikeService;


    @PostMapping
    public ResponseEntity<Bike> save(@RequestBody Bike bike){
        return new ResponseEntity<>(bikeService.save(bike), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bike> findBikeById(@PathVariable("id") int id){
        return new ResponseEntity<>(bikeService.findBikeById(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Bike>> findAllBikes(){
        List<Bike> bikes = bikeService.getAll();
        if (bikes == null) {
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity<>(bikes,HttpStatus.OK);
    }

    @GetMapping("/byUser/{userId}")
    public ResponseEntity<List<Bike>> findAllBikesByUserId(@PathVariable("userId") int userId){
        List<Bike> bikes = bikeService.findBikesByUserId(userId);
        if (bikes == null) {
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity<>(bikes,HttpStatus.OK);
    }
}

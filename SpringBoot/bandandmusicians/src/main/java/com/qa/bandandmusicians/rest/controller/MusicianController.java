package com.qa.bandandmusicians.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.bandandmusicians.persistence.domain.Musician;
import com.qa.bandandmusicians.service.MusicianService;

@RestController
public class MusicianController {
    @Autowired
    MusicianService service;

    @PostMapping("/musician/create")
    public ResponseEntity<Musician> create(@RequestBody Musician musician) {
        return new ResponseEntity<>(this.service.create(musician), HttpStatus.CREATED);
    }

    @GetMapping("/musician/readAll")
    public ResponseEntity<List<Musician>> read() {
        return ResponseEntity.ok(this.service.readAll());
    }

    @GetMapping("/musician/readOne/{id}")
    public ResponseEntity<Optional<Musician>> readId(@PathVariable Integer id) {
        return ResponseEntity.ok(this.service.readOne(id));
    }

    // -------------------------
    @PutMapping("/musician/update/{id}")
    public ResponseEntity<Musician> update(@RequestBody Musician musician, @PathVariable Integer id) {
        return new ResponseEntity<>(this.service.update(musician, id), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/musician/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        return ResponseEntity.ok(this.service.delete(id));
    }
}

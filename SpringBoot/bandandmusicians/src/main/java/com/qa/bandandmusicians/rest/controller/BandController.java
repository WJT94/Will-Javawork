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

import com.qa.bandandmusicians.persistence.domain.Band;
import com.qa.bandandmusicians.service.BandService;

@RestController
public class BandController {
	@Autowired
	BandService service;

	@PostMapping("/band/create")
	public ResponseEntity<Band> create(@RequestBody Band band) {
		return new ResponseEntity<>(this.service.create(band), HttpStatus.CREATED);
	}

	@GetMapping("/band/readAll")
	public ResponseEntity<List<Band>> read() {
		return ResponseEntity.ok(this.service.readAll());
	}

	@GetMapping("/band/read/{id}")
	public ResponseEntity<Optional<Band>> readId(@PathVariable Integer id) {
		return ResponseEntity.ok(this.service.readOne(id));
	}

	// -------------------------
	@PutMapping("/band/update/{id}")
	public ResponseEntity<Band> update(@RequestBody Band band, @PathVariable Integer id) {
		return new ResponseEntity<>(this.service.update(band, id), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/band/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		return ResponseEntity.ok(this.service.delete(id));
	}

}
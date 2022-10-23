package com.qa.bandandmusicians.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.bandandmusicians.persistence.domain.Musician;
import com.qa.bandandmusicians.persistence.repository.MusicianRepository;

@Service
public class MusicianService {
    MusicianRepository musicianRepo;

    public MusicianService(MusicianRepository musicianRepo) {
        super();
        this.musicianRepo = musicianRepo;
    }

    public Musician create(Musician musician) { // Added via the body of the Postman request.
        return this.musicianRepo.save(musician);
    }

    public List<Musician> readAll() {
		return this.musicianRepo.findAll();
	}

	public Optional<Musician> readOne(Integer id) {
		return this.musicianRepo.findById(id);
	}

	// ---------------------------
	public Musician update(Musician musician, Integer id) {
		Optional<Musician> x = this.musicianRepo.findById(id);
		Musician foundMusician = x.get();
		foundMusician.setName(musician.getName());
		this.musicianRepo.save(foundMusician);
		return foundMusician;

	}

	public boolean delete(Integer id) {
		this.musicianRepo.deleteById(id);
		return !this.musicianRepo.existsById(id);
	}
}

package com.qa.bandandmusicians.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.bandandmusicians.persistence.domain.Band;
import com.qa.bandandmusicians.persistence.repository.BandRepository;

@Service
public class BandService {
    BandRepository bandRepo;

    public BandService(BandRepository bandRepo) {
        super();
        this.bandRepo = bandRepo;
    }

    public Band create(Band band) { // Added via the body of the Postman request.
        return this.bandRepo.save(band);
    }

    public List<Band> readAll() {
		return this.bandRepo.findAll();
	}

	public Optional<Band> readOne(Integer id) {
		return this.bandRepo.findById(id);
	}

	// ---------------------------
	public Band update(Band band, Integer id) {
		Optional<Band> x = this.bandRepo.findById(id);
		Band foundBand = x.get();
		foundBand.setName(band.getName());
		this.bandRepo.save(foundBand);
		return foundBand;

	}

	public boolean delete(Integer id) {
		this.bandRepo.deleteById(id);
		return !this.bandRepo.existsById(id);
	}
}

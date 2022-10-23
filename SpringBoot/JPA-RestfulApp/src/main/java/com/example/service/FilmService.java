package com.example.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.model.Film;
import com.example.repository.FilmRepository;

@Service
public class FilmService {
	FilmRepository filmRepo;

	public FilmService(FilmRepository filmRepo) {
		super();
		this.filmRepo = filmRepo;
	}

	public Film create(Film film)// film will be added from POSTMAN BODY
	{
		return this.filmRepo.save(film);
	}

	public List<Film> readAll() {
		return this.filmRepo.findAll();
	}

	public Optional<Film> readOne(Integer id) {
		return this.filmRepo.findById(id);
	}

	// ---------------------------
	public Film update(Film film, Integer id) {
		Optional<Film> x = this.filmRepo.findById(id);
		Film foundFilm = x.get();
		foundFilm.setTitle(film.getTitle());
		foundFilm.setReleaseYear(film.getReleaseYear());
		foundFilm.setDirector(film.getDirector());
		foundFilm.setBoxOffice(film.getBoxOffice());
		foundFilm.setGenre(film.getGenre());
		foundFilm.setPlatform(film.getPlatform());
		foundFilm.setDuration(film.getDuration());
		foundFilm.setLanguage(film.getLanguage());
		this.filmRepo.save(foundFilm);
		return foundFilm;

	}

	public boolean delete(Integer id) {
		this.filmRepo.deleteById(id);
		return !this.filmRepo.existsById(id);
	}

}

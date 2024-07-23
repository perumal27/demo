package com.example.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Showtime;
import com.example.repository.ShowtimeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ShowtimeService implements IShowtimeService {

    @Autowired
    private ShowtimeRepository showtimeRepository;

    @Override
    public List<Showtime> getAllShowtimes() {
        return showtimeRepository.findAll();
    }

    @Override
    public Optional<Showtime> getShowtimeById(Long id) {
        return showtimeRepository.findById(id);
    }

    @Override
    public Showtime createShowtime(Showtime showtime) {
        return showtimeRepository.save(showtime);
    }

    @Override
    public Showtime updateShowtime(Long id, Showtime showtimeDetails) {
        Showtime showtime = showtimeRepository.findById(id).orElseThrow();
        showtime.setMovie(showtimeDetails.getMovie());
        showtime.setTheater(showtimeDetails.getTheater());
        showtime.setShow_date(showtimeDetails.getShow_date());
        showtime.setShow_time(showtimeDetails.getShow_time());
        return showtimeRepository.save(showtime);
    }

    @Override
    public void deleteShowtime(Long id) {
        showtimeRepository.deleteById(id);
    }
}


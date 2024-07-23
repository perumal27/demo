package com.example.service;



import java.util.List;
import java.util.Optional;

import com.example.entity.Showtime;

public interface IShowtimeService {
    List<Showtime> getAllShowtimes();
    Optional<Showtime> getShowtimeById(Long id);
    Showtime createShowtime(Showtime showtime);
    Showtime updateShowtime(Long id, Showtime showtimeDetails);
    void deleteShowtime(Long id);
}

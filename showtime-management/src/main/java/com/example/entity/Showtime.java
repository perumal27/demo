package com.example.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="showtime")
public class Showtime {
   

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long showtime_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "theater_id", nullable = false)
    private Theater theater;

    private LocalDate show_date;
    private LocalTime show_time;

    @OneToMany(mappedBy = "showtime", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Booking> bookings;
    

    public Showtime() {
		super();
		// TODO Auto-generated constructor stub
	}
    

	public Showtime(Long showtime_id, Movie movie, Theater theater, LocalDate show_date, LocalTime show_time,
			Set<Booking> bookings) {
		super();
		this.showtime_id = showtime_id;
		this.movie = movie;
		this.theater = theater;
		this.show_date = show_date;
		this.show_time = show_time;
		this.bookings = bookings;
	}


	// Getters and Setters
    // Getters and Setters
    public Long getShowtime_id() {
        return showtime_id;
    }

    public void setShowtime_id(Long showtime_id) {
        this.showtime_id = showtime_id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public LocalDate getShow_date() {
        return show_date;
    }

    public void setShow_date(LocalDate show_date) {
        this.show_date = show_date;
    }

    public LocalTime getShow_time() {
        return show_time;
    }

    public void setShow_time(LocalTime show_time) {
        this.show_time = show_time;
    }

    public Set<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(Set<Booking> bookings) {
        this.bookings = bookings;
    }
}

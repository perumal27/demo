package com.example.entity;

import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="theater")
public class Theater {
   

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long theater_id;

    private String name;
    private String location;
    private int capacity;

    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Showtime> showtimes;


    public Theater() {
		super();
		// TODO Auto-generated constructor stub
	}
    

	public Theater(Long theater_id, String name, String location, int capacity, Set<Showtime> showtimes) {
		super();
		this.theater_id = theater_id;
		this.name = name;
		this.location = location;
		this.capacity = capacity;
		this.showtimes = showtimes;
	}


	// Getters and Setters
    public Long getTheater_id() {
        return theater_id;
    }

    public void setTheater_id(Long theater_id) {
        this.theater_id = theater_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Set<Showtime> getShowtimes() {
        return showtimes;
    }

    public void setShowtimes(Set<Showtime> showtimes) {
        this.showtimes = showtimes;
    }
}

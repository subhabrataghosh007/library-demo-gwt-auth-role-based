package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.model.LibrarianDto;

@Repository
public interface LibrarianRepository extends JpaRepository<LibrarianDto, Long> {

}

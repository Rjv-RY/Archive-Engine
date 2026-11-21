package com.rjv.archive_engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rjv.archive_engine.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{

}

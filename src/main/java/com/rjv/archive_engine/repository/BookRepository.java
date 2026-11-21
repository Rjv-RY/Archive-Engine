package com.rjv.archive_engine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rjv.archive_engine.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	List<Book> findByLanguage(String language);
}

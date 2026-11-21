package com.rjv.archive_engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rjv.archive_engine.entity.TextChunk;

public interface TextChunkRepository extends JpaRepository<TextChunk, Long>{

}

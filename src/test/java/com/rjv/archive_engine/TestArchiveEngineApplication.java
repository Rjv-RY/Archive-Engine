package com.rjv.archive_engine;

import org.springframework.boot.SpringApplication;

public class TestArchiveEngineApplication {

	public static void main(String[] args) {
		SpringApplication.from(ArchiveEngineApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

package com.example.easynotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.easynotes.model.Note;
import com.example.easynotes.repository.NoteRepository;

@RestController
@RequestMapping("/api/user")
public class Usercontroller {
	@Autowired
	NoteRepository noteRepository;

	@GetMapping
	public List<Note> getAllNotes() {
		return noteRepository.findAll();
	}

	
}

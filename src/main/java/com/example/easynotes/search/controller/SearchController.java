/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.easynotes.search.controller;

import com.example.easynotes.user.model.Note;
import com.example.easynotes.user.repository.NoteRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.easynotes.user.repository.ResponseRepository;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author leo.masta
 */
@RestController
@RequestMapping("/api/search")
public class SearchController {

    @Autowired
    NoteRepository noteRepository;

    @GetMapping
    public String search() {
        return "query search here!";
    }
    
    @GetMapping("/list")
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }
    
    @GetMapping("/response")
    public @ResponseBody ResponseRepository getPerson(){
        ResponseRepository person = new ResponseRepository();
        
        List<Note> results = noteRepository.findAll();
        person.setStatus(1);
        person.setMessage("Success get List");
        person.setData(results);
        return  person;
    }
}
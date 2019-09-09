/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.easynotes.user.repository;

import java.lang.reflect.Array;
import java.util.List;

/**
 *
 * @author leo.masta
 */
public class ResponseRepository {
    
    private int status;
    private String message;
    private List<NoteRepository> data;
    
    public void setStatus(int id) {
        this.status = id;
    }

    public int getStatus() {
        return status;
    }
    
    public void setMessage(String name){
        this.message= name;
    }

    public String getMessage(){
        return message;
    }
    
    public void setData(List data){
        this.data= data;
    }
    public List getData(){
        return data;
    }



}

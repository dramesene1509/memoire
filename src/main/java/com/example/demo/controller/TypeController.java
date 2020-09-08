package com.example.demo.controller;

import com.example.demo.model.Type;
import com.example.demo.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;




@RestController

@RequestMapping(value = "/type", method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
public class TypeController {
   @Autowired
   TypeRepository typeRepository;
    @PostMapping(value = "/ajouType")
    public Type addtype(@RequestBody (required = false) Type ty) {
        Type type = new Type(ty.getLibelle());
       return typeRepository.save(ty);
    }
}

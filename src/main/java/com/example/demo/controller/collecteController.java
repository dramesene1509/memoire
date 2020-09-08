package com.example.demo.controller;

import com.example.demo.form.collecteform;
import com.example.demo.model.Collecte;
import com.example.demo.repository.collecteRepository;
import com.example.demo.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static java.util.Objects.requireNonNull;

@RestController
@CrossOrigin


public class collecteController {
    @Autowired
collecteRepository collecteRepository;

    @Autowired
    TypeRepository typeRepository;

    @PostMapping(value = "/add", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void addcollecte(@RequestBody collecteform collecteform){
        Collecte collecte = new Collecte(collecteform.getTitre(), collecteform.getBeneficiaire(), collecteform.getDescription(), collecteform.getType(), collecteform.getObjectif());
        collecte.setTitre(collecteform.getTitre());
        collecte.setBeneficiaire(collecteform.getBeneficiaire());
        collecte.setDescription(collecteform.getDescription());
        collecte.setType(collecteform.getType());
        collecte.setObjectif(collecteform.getObjectif());

       //Collecteservices.save(collecte);
    }

}

package com.example.demo.repository;


import com.example.demo.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {
    List<Type> findAll();
    Optional<Type>findByLibelle(String libelle);



    //List<Partenaire> findPartenaire();
}
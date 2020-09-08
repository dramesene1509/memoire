package com.example.demo.repository;

import com.example.demo.model.Collecte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface collecteRepository extends JpaRepository<Collecte, Integer> {

    //List<Partenaire> findPartenaire();
}
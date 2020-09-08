package com.example.demo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.w3c.dom.Text;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(exclude = "Collecte")
@Table(name = "collecte")
public class Collecte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public  String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collecte(int id, String titre, String beneficiaire, String description, Double objectif, Type type) {
        this.id = id;
        Titre = titre;
        Beneficiaire = beneficiaire;
        this.description = description;
        this.objectif = objectif;
        this.type = type;
    }

    @NotBlank
    @Column(length = 30)
    private String Titre;

    public Collecte(String titre, String beneficiaire, String description, Type type, Double objectif) {
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public String getBeneficiaire() {
        return Beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        Beneficiaire = beneficiaire;
    }


    public Double getObjectif() {
        return objectif;
    }

    public void setObjectif(Double objectif) {
        this.objectif = objectif;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @NotBlank
    @Column(length = 50)
    private String Beneficiaire;
    @NotBlank
    @Column(length = 50)
    private String description;
    @NotBlank
    @Column(length = 50)
    private Double objectif;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Type type;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}


package com.example.demo.form;

import com.example.demo.model.Type;
import org.w3c.dom.Text;

public class collecteform {
    private static String titre;
    private static String beneficiaire;
    private static String description;
    private static Type type;
    private static Double objectif;

    public static String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public static String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    public static String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public static Double getObjectif() {
        return objectif;
    }

    public void setObjectif(Double objectif) {
        this.objectif = objectif;
    }
}

package com.example.demo.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "utilisateur", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "username"
        }),
        @UniqueConstraint(columnNames = {
                "email"
        })
})
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min=3, max = 50)
    private String name;

    @NotBlank
    @Size(min=3, max = 50)
    private String username;

    @NaturalId

    @Size(max = 50)
    @Email
    private String email;

    @NotBlank
    @Size(min=6, max = 100)
    private String password;

    @Column(length = 10)
    private String adresse;

    @Column(length = 10)
    private String prenom;






    public Utilisateur(String adresse, String username, String email, String password, String prenom, String statut, String cni, String name) {
        this.adresse = adresse;
        this.username = username;
        this.email = email;
        this.password = password;

        this.prenom = prenom;
        this.statut = statut;
        this.name = name;
    }




    public String getAdresse() {
        return adresse;
    }

    public void setAdressse(String adresse) {
        this.adresse = adresse;
    }



    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Column(length = 10)
    private String statut;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<com.example.demo.model.Role> roles = new HashSet<>();

    public Utilisateur() {}



    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<com.example.demo.model.Role> getRoles() {
        return roles;
    }



    public void setRoles(Set<com.example.demo.model.Role> roles) {
        this.roles = roles;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
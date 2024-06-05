package com.example.League.Application.models;

import com.example.League.Application.Enum.Role;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String email;

    private String motDePasse;
    private String nom;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "utilisateur")
    private List<Commentaire> commentaires;

    @OneToMany(mappedBy = "utilisateur")
    private List<Evenement> evenements;

    @OneToMany(mappedBy = "utilisateur")
    private List<ReportMatch> reports;

    @OneToMany(mappedBy = "utilisateur")
    private List<SuspensionMatch> suspensions;
}

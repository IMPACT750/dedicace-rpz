package com.example.League.Application.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "`match`")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "equipe_domicile")
    private String equipeDomicile;

    @Column(name = "equipe_exterieur")
    private String equipeExterieur;

    @Column(name = "date_debut")
    private Date dateDebut;

    @Column(name = "date_fin")
    private Date dateFin;

    @Column(name = "statut")
    private String statut;

    @Column(name = "suspend_reason")
    private String suspendReason;

    @Column(name = "report_reason")
    private String reportReason;

    @ManyToOne
    @JoinColumn(name = "journee_id", nullable = false)
    @JsonBackReference
    private Journee journee;

    @OneToMany(mappedBy = "match", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    @ToString.Exclude
    private List<Commentaire> commentaires;

    @OneToMany(mappedBy = "match", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    @ToString.Exclude
    private List<Evenement> evenements;
}
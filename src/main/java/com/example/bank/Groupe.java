package com.example.bank;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name="Groupes")
public class Groupe implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long codeGroupe;
    private String nomGroupe;
    @ManyToMany(mappedBy="groupes")
    private Collection<Employes> employes;}
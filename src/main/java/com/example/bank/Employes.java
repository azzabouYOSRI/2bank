package com.example.bank;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Employes implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long codeEmploye;
    private String nomEmploye;
    @ManyToOne
    @JoinColumn(name="CODE_EMP_SUP")
    private Employes employeSup;
    @ManyToMany
    @JoinTable(name="EMP_GR",
            joinColumns=@JoinColumn(name="CODE_EMP"),
            inverseJoinColumns=@JoinColumn(name="CODE_GR"))
    private Collection<Groupe> groupes;
}
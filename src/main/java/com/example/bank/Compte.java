package com.example.bank;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * @author YOSRI AZABOU
 */
@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type_CPT",
        discriminatorType= DiscriminatorType.STRING, length=2)
public abstract class Compte implements Serializable {
    @Id
    private String codeCompte;
    private Date dateCreation;
    private double solde;
    @ManyToOne
    @JoinColumn(name = "Code_Cli")
    private Client client;

    public Compte(String codeCompte, Date dateCreation, double solde, Client client) {
    }

    public Compte() {

    }
     @ManyToOne
     @JoinColumn(name = "employe_ID")
     private Employes employe;
     @OneToMany( mappedBy="compte")
    private Collection<Operation> operations;
}
package com.example.bank;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeClient;
    private String nomClient;
    @OneToMany(mappedBy = "client",
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Collection<Compte> comptes;
}
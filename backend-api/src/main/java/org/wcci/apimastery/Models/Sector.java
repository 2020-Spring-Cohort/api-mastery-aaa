package org.wcci.apimastery.Models;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class Sector {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    Collection <Stock> stocks;



}

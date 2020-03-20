package org.wcci.apimastery.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Stock {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    Collection<Price> prices;

    private String title;
    private String description;



}

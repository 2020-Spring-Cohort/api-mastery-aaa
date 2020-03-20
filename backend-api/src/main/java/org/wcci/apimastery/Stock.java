package org.wcci.apimastery;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Stock {


    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    Collection<Price> prices;

    private String title;
    private String description
}

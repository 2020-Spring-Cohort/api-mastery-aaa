package org.wcci.apimastery;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Sector {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    Collection <Stock> stocks;
}

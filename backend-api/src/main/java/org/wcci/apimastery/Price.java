package org.wcci.apimastery;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Price {

    @Id
    @GeneratedValue
    private Long id;
    private Date date;
    private float price;

    @ManyToOne
    private Stock stock;


}

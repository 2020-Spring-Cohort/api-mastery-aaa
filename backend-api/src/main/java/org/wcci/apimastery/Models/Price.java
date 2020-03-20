package org.wcci.apimastery.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Price {


    @Id
    private Date date;

    private float price;

    @ManyToOne
    private Stock stock;


}

package org.wcci.apimastery.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Price {
    @Id
    private Date date;

    @ManyToOne
    private Stock stock;

    private float highPrice;
    private float lowPrice;
    private float openPrice;
    private float closePrice;

    private float volume;




}

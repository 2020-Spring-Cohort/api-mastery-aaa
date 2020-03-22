package org.wcci.apimastery.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;


public class Price {

    private Date date;


    private Stock stock;

    private float highPrice;
    private float lowPrice;
    private float openPrice;
    private float closePrice;

    private float volume;




}

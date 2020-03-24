package org.wcci.apimastery.Classes;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Rating {
    @Id
    @GeneratedValue
    private long id;
    public long getId(){
        return id;
    }


    private int score;
    public int getScore(){
        return score;
    }


}

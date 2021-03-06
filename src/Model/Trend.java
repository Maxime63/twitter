/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Maxime
 */
@Entity
public class Trend implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long trendId;
    
    private String localisation;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "trend")
    private List<Hashtag> hastags;

    public void setTrendId(long trendId) {
        this.trendId = trendId;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public void setHastags(List<Hashtag> hastags) {
        this.hastags = hastags;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Maxime
 */
@Entity
public class Hashtag extends Text implements Serializable{
    @JoinColumn (name = "trendId")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Trend trend;
}

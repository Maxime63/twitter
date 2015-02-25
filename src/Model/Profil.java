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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Maxime
 */
@Entity
public class Profil implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long profilId;
    
    private String name;
    
    @JoinColumn (name = "personId")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Person user;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Profil> followers;
    
    @OneToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Profil> following;
    
    @OneToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "twitter")
    private List<Tweet> tweets;
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable (name = "retweet_profil", joinColumns = {
        @JoinColumn(name = "profilId", nullable = false) },
        inverseJoinColumns = { @JoinColumn(name = "tweetId", nullable = false)
    })
    private List<Tweet> retweets;
}

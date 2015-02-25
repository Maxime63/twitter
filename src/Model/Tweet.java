/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Maxime
 */
@Entity
public class Tweet implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long tweetId;
 
    private Date tweetDate;
    
    @JoinColumn (name = "profilId")
    @ManyToOne (fetch = FetchType.LAZY)
    private Profil twitter;
    
    @ManyToMany (fetch = FetchType.LAZY, mappedBy = "retweets")
    private List<Profil> retweetProfil;
    
    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "contentId")
    private Content content;

    public void setTweetId(long tweetId) {
        this.tweetId = tweetId;
    }

    public void setTweetDate(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    public void setTwitter(Profil twitter) {
        this.twitter = twitter;
    }

    public void setRetweetProfil(List<Profil> retweetProfil) {
        this.retweetProfil = retweetProfil;
    }

    public void setContent(Content content) {
        this.content = content;
    }
    
    
}

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
import javax.persistence.OneToOne;

/**
 *
 * @author Maxime
 */
@Entity
public class Content implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long contentId;
    
    @OneToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "content")
    private Tweet tweet;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "content")
    private List<Text> texts;

    public void setContentId(long contentId) {
        this.contentId = contentId;
    }

    public void setTweet(Tweet tweet) {
        this.tweet = tweet;
    }

    public void setTexts(List<Text> texts) {
        this.texts = texts;
    }
}

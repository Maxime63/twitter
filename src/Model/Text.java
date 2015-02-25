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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Maxime
 */
@Entity
public class Text implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long textId;
    
    private String text;
    
    @JoinColumn (name = "contentId")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Content content;

    public void setTextId(long textId) {
        this.textId = textId;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setContent(Content content) {
        this.content = content;
    } 
}

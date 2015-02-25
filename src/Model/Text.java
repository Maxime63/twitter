/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Column;
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
    
    @JoinColumn (name = "Content")
    @ManyToOne(fetch = FetchType.LAZY)
    private Content content;
}

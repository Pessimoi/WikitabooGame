/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wikigame.content;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author vpeltoni
 */
@Entity(name = "ANSWER")
public class Answer {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String answerString;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the answerString
     */
    public String getAnswerString() {
        return answerString;
    }

    /**
     * @param answerString the answerString to set
     */
    public void setAnswerString(String answerString) {
        this.answerString = answerString;
    }
    
    
}

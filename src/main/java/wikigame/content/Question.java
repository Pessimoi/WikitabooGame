/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wikigame.content;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author vpeltoni
 */
@Entity(name = "QUESTION")
public class Question implements Serializable {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String questionString;
    
    @OneToMany(mappedBy = "Question")
    private List<Answer> AnswerList;

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
     * @return the questionString
     */
    public String getQuestionString() {
        return questionString;
    }

    /**
     * @param questionString the questionString to set
     */
    public void setQuestionString(String questionString) {
        this.questionString = questionString;
    }

    /**
     * @return the AnswerList
     */
    public List<Answer> getAnswerList() {
        return AnswerList;
    }

    /**
     * @param AnswerList the AnswerList to set
     */
    public void setAnswerList(List<Answer> AnswerList) {
        this.AnswerList = AnswerList;
    }
    
}

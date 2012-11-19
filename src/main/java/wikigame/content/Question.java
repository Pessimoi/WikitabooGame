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
 * The question class contains a question and a list of it's answers.
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
    
    @OneToMany(mappedBy = "question")

    private List<Answer> answerList;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionString() {
        return questionString;
    }

    public void setQuestionString(String questionString) {
        this.questionString = questionString;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> AnswerList) {
        this.answerList = AnswerList;
    }
    
    public void addAnswerToList(Answer answer){
        this.answerList.add(answer);
    }
    
}

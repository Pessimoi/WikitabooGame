/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wikigame.service;

import java.util.List;
import wikigame.content.Question;

/**
 *
 * @author vpeltoni
 */
public interface QuestionService {
    
    public void saveQuestion(Question question);
    
    public List<Question> getQuestionList();
    
    public Question getQuestion(Long id);
    
    public void deleteQuestion(Long id);

}

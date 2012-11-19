/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wikigame.service;

import java.util.List;
import wikigame.content.Answer;

/**
 *
 * @author vpeltoni
 */
public interface AnswerService {
    
    public void saveAnswer(Answer answer);
    
    public List<Answer> getAnswerList();
    
    public Answer getAnswer(Long id);
    
    public void deleteAnswer(Long id);
    
}

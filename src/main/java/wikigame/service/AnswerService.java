package wikigame.service;

import java.util.List;
import wikigame.content.Answer;


public interface AnswerService {

    public void saveAnswer(Answer answer);
    
    public List<Answer> getAnswerList();
    
    public Answer getAnswer(Long id);
    
    public void deleteAnswer(Long id);
    
}
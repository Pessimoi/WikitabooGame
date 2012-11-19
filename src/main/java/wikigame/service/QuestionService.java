package wikigame.service;

import java.util.List;
import wikigame.content.Question;

public interface QuestionService {
    
    public void saveQuestion(Question question);
    
    public List<Question> getQuestionList();
    
    public Question getQuestion(Long id);
    
    public void deleteQuestion(Long id);

    public void newQuestionFromString(String question);

}
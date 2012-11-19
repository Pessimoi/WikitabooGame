package wikigame.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import wikigame.content.Question;
import wikigame.repository.QuestionRepository;

/**
 *
 * @author vpeltoni
 */
public class QuestionService {
    
    @Autowired
    private QuestionRepository repo;
    
    public void saveQuestion(Question question) {
        repo.save(question);
    }
    
    public List<Question> getQuestionList() {
        return (List<Question>) repo.findAll();
    }
    
    public Question getQuestion(Long id) {
        return repo.findOne(id);
    }
    
    public void deleteQuestion(Long id){
        repo.delete(id);
    }

    
    
}

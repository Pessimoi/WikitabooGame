package wikigame.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wikigame.content.Answer;
import wikigame.repository.AnswerRepository;

/**
 *
 * @author vpeltoni
 */
@Service
public class AnswerServiceImp {
    
    @Autowired
    private AnswerRepository repo;
    
    public void saveAnswer(Answer answer) {
        repo.save(answer);
    }
    
    public List<Answer> getAnswerList() {
        return (List<Answer>) repo.findAll();
    }
    
    public Answer getAnswer(Long id) {
        return repo.findOne(id);
    }
    
    public void deleteAnswer(Long id){
        repo.delete(id);
    }

    
    
}

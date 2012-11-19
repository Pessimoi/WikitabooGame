package wikigame.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wikigame.content.Answer;
import wikigame.repository.AnswerRepository;


@Service
public class AnswerServiceImp implements AnswerService {
    
    @Autowired
    private AnswerRepository repo;
    
    @Override
    public void saveAnswer(Answer answer) {
        repo.save(answer);
    }
    
    @Override
    public List<Answer> getAnswerList() {
        return (List<Answer>) repo.findAll();
    }
    
    @Override
    public Answer getAnswer(Long id) {
        return repo.findOne(id);
    }
    
    @Override
    public void deleteAnswer(Long id){
        repo.delete(id);
    }

    
    
}
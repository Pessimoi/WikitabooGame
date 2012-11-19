package wikigame.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wikigame.content.Answer;
import wikigame.content.Question;
import wikigame.repository.QuestionRepository;

/**
 *
 * @author vpeltoni
 */
@Service
public class QuestionServiceImp implements QuestionService {
    
    @Autowired
    private QuestionRepository repo;
    
    @Override
    public void saveQuestion(Question question) {
        repo.save(question);
    }
    
    @Override
    public List<Question> getQuestionList() {
        return (List<Question>) repo.findAll();
    }
    
    @Override
    public Question getQuestion(Long id) {
        return repo.findOne(id);
    }
    
    @Override
    public void deleteQuestion(Long id){
        repo.delete(id);
    }

    @Override
    public void newQuestionFromString(String questionString) {
        Question q = new Question();
        q.setQuestionString(questionString);
        q.setAnswerList(new ArrayList<Answer>());
        saveQuestion(q);
    }

    
    
}

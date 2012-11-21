package wikigame.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wikigame.content.Answer;
import wikigame.content.Question;
import wikigame.repository.AnswerRepository;
import wikigame.repository.QuestionRepository;


@Service
public class AnswerServiceImp implements AnswerService {
    
    @Autowired
    private AnswerRepository answerRepository;
    
    @Autowired
    private QuestionRepository questionRepository;
    
    @Override
    public void saveAnswer(Answer answer) {
        answerRepository.save(answer);
    }
    
    @Override
    public List<Answer> getAnswerList() {
        return (List<Answer>) answerRepository.findAll();
    }
    
    @Override
    public Answer getAnswer(Long id) {
        return answerRepository.findOne(id);
    }
    
    @Override
    public void deleteAnswer(Long id){
        answerRepository.delete(id);
    }

    @Override
    public void newAnswerToQuestionFromString(Long questionid, String answerString) {
        Answer answer = new Answer();
        answer.setAnswerString(answerString);
        Question question = questionRepository.findOne(questionid);
        answer.setQuestion(question);
        question.addAnswerToList(answer);
        
        answerRepository.save(answer);
        questionRepository.save(question);
    }

    
    
}
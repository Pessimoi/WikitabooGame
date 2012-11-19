package wikigame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import wikigame.service.AnswerService;

@Controller
public class AnswerController {
    
    @Autowired
    private AnswerService answerService;
    
    

    @RequestMapping(value = "addanswer", method = RequestMethod.POST)
    public String addQuestions(@RequestParam(value = "answer", required = true) String answer,
                                @RequestParam(value = "questionid", required = true) Long questionid) {
        answerService.newAnswerToQuestionFromString(questionid,answer);
        return "";
    }
}

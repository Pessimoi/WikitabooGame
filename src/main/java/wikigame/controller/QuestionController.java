package wikigame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuestionController {
    
    @RequestMapping("addquestionpage")
    public String viewAddQuestionPage() {
        return "add_questions";
    }
    
    @RequestMapping(value = "addquestion", method = RequestMethod.POST)
    public String addQuestions(@RequestParam(value = "question", required = true) String question) {
        System.out.println("YO YO YO");
        return "";
    }
    
}

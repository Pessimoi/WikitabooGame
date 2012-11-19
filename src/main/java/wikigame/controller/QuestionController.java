package wikigame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuestionController {
    
    @RequestMapping("addquestions")
    public String viewAddQuestionPage() {
        return "add_questions";
    }
    
}

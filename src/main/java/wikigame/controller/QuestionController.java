package wikigame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import wikigame.service.QuestionService;

@Controller
public class QuestionController {
    
    @Autowired
    private QuestionService questionService;

    
    @RequestMapping("addquestionpage")
    public String viewAddQuestionPage() {
        return "add_questions";
    }
    
    @RequestMapping(value = "addquestions", method = RequestMethod.POST)
    public String addQuestions(@RequestParam(value = "question", required = true) String question) {
        System.out.println("Wuppiduu!");
        questionService.newQuestionFromString(question);
        return "redirect:/app/showquestions";
    }
    
    @RequestMapping(value = "showquestions", method = RequestMethod.GET)
    public String showQuestions(Model model){
        model.addAttribute("questions", questionService.getQuestionList());
        return "view_questions";
    }
    
}

package wikigame.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import wikigame.content.Question;
import wikigame.service.QuestionService;

@Controller
public class QuestionController {
    
    @Autowired
    private QuestionService questionService;

    /**
     * Shows the first page where user can add questions
     * @return jsp page that will be shown 
     */
    @RequestMapping("addquestionpage")
    public String viewAddQuestionPage() {
        return "add_questions";
    }
    
    /**
     * New questions that will be added from form are taken care here
     * @param question String that contains the question
     * @return redirect to page that shows questions
     */
    @RequestMapping(value = "addquestions", method = RequestMethod.POST)
    public String addQuestions(@RequestParam(value = "question", required = true) String question) {
        questionService.newQuestionFromString(question);
        return "redirect:/app/showquestions";
    }
    
    /**
     * Page that shows the questions that user has typed
     * @param model Model that contains the list of questions
     * @return page that has the questions
     */
    @RequestMapping(value = "showquestions", method = RequestMethod.GET)
    public String showQuestions(Model model){
        model.addAttribute("questions", questionService.getQuestionList());
        return "view_questions";
    }
    
}

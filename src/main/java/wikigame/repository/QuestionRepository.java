/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wikigame.repository;

import org.springframework.data.repository.CrudRepository;
import wikigame.content.Question;


/**
 *
 * @author vpeltoni
 */
public interface QuestionRepository extends CrudRepository<Question, Long> {
    
}
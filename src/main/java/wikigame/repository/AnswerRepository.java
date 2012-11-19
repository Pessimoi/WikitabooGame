/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wikigame.repository;

import org.springframework.data.repository.CrudRepository;
import wikigame.content.Answer;


/**
 *
 * @author vpeltoni
 */
public interface AnswerRepository extends CrudRepository<Answer, Long> {
    
}
package tsi.ensg.jee.tp2.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main (String[] args){
        // Create Spring Context
        ApplicationContext context = new ClassPathXmlApplicationContext("config-simple.xml");
        
        // Pose une question par Constructor
        QuestionService questions = (QuestionService) context.getBean("QuestionService");
        System.out.println("#################################################");
        System.out.println(questions.getQuestion());
        System.out.println("#################################################");
    }
}

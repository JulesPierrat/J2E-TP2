package tsi.ensg.jee.tp2.simplebis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main (String[] args){
        // Create Spring Context
        ApplicationContext context = new ClassPathXmlApplicationContext("config-simplebis.xml");
        
        // Pose une question par Constructor
        QuestionService questions = (QuestionService) context.getBean("QuestionService");
        System.out.println("#################################################");
        System.out.println(questions.getQuestion());
        System.out.println("#################################################");
        
        // Pose une question via Setters
        QuestionService questions2 = (QuestionService) context.getBean("QuestionService2");
        System.out.println("#################################################");
        System.out.println(questions2.getQuestion());
        System.out.println("#################################################");

    }
}

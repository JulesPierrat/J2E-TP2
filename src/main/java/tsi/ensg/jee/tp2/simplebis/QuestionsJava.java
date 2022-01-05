package tsi.ensg.jee.tp2.simplebis;

import java.util.ArrayList;
import java.util.List;

public class QuestionsJava implements Questions{
    // Atribute
    private List<String> questions;

    // Constructor
    public QuestionsJava(){
        this.questions = new ArrayList<>();
    }
    public QuestionsJava(List<String> questions){
        this.questions = questions;
    }

    // Method
    public List<String> questions() {
        return this.questions;
    }

    @Override
    public void setQuestions(List<String> questions) {
        this.questions = questions;     
    }
    
}

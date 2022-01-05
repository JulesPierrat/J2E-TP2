package tsi.ensg.jee.tp2.simplebis;

import java.util.ArrayList;
import java.util.List;

public class QuestionsJavaAvance implements Questions{
    // Attribute
    private List<String> questions;

    // Constructor
    public QuestionsJavaAvance(){
        this.questions = new ArrayList<>();
    }

    public QuestionsJavaAvance(List<String> questions){
        this.questions = questions;
    }

    public List<String> questions() {
        return this.questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }
    
    
}

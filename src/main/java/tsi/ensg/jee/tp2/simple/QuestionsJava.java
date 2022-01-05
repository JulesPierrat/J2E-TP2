package tsi.ensg.jee.tp2.simple;

import java.util.ArrayList;
import java.util.List;

public class QuestionsJava implements Questions{

    // Constructor
    public QuestionsJava(){

    }

    // Method
    public List<String> questions() {
        List<String> list = new ArrayList<>();

        list.add("Quelle est la question simple 1 ?");
        list.add("Quelle est la question simple 2 ?");
        list.add("Quelle est la question simple 3 ?");

        return list;
    }
    
}

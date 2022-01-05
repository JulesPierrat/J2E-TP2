package tsi.ensg.jee.tp2.simple;

import java.util.ArrayList;
import java.util.List;

public class QuestionsJavaAvance implements Questions{

    // Constructor
    public QuestionsJavaAvance(){

    }

    public List<String> questions() {
        List<String> list = new ArrayList<>();

        list.add("Quelle est la question avancées 1 ?");
        list.add("Quelle est la question avancées 2 ?");
        list.add("Quelle est la question avancées 3 ?");

        return list;
    }
    
}

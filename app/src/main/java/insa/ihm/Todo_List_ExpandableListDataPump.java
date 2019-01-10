package insa.ihm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Todo_List_ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<>();

        List<String> retard = new ArrayList<>();
        retard.add("Débuter le développement");

        List<String> today = new ArrayList<>();
        today.add("Validation des changements");

        List<String> demain = new ArrayList<>();
        demain.add("Aucune tâche présente");

        List<String> plusTard = new ArrayList<>();
        plusTard.add("Aucune tâche présente");

        expandableListDetail.put("En retard", retard);
        expandableListDetail.put("Aujourd'hui", today);
        expandableListDetail.put("Pour demain", demain);
        expandableListDetail.put("Plus tard", plusTard);
        return expandableListDetail;
    }
}

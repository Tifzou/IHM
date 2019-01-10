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
        today.add("Présentation des IHM");

        List<String> demain = new ArrayList<>();
        demain.add("Réaliser les tests unitaires");

        List<String> plusTard = new ArrayList<>();
        plusTard.add("Rendre le projet");

        expandableListDetail.put("En retard", retard);
        expandableListDetail.put("Aujourd'hui", today);
        expandableListDetail.put("Pour demain", demain);
        expandableListDetail.put("Plus tard", plusTard);
        return expandableListDetail;
    }
}

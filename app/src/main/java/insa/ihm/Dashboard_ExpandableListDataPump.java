package insa.ihm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dashboard_ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> dev = new ArrayList<String>();
        dev.add("Créer les classes et les fragments de l'application android");

        expandableListDetail.put("Débuter le développement", dev);

        List<String> presentation = new ArrayList<>();
        presentation.add("La présentation du projet COLLABORAT'IF avec diaporama");
        expandableListDetail.put("Présentation des IHM", presentation);

        return expandableListDetail;
    }
}

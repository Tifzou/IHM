package insa.ihm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dashboard_ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> presentation = new ArrayList<String>();
        presentation.add("Préparer l'oral");

        expandableListDetail.put("Présentation IHM", presentation);
        return expandableListDetail;
    }
}

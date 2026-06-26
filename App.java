package com.genspark.qa;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Defect> defects = new ArrayList<>();

        defects.add(new Defect("DEF-001", "Login crash", "critical", "open"));
        defects.add(new Defect("DEF-002", "Search broken", "high", "open"));

        Defect found = DefectService.findById(defects, "DEF-999");

        System.out.println(DefectService.getSeverityLabel(found));

        int count = DefectService.parseDefectCount("twenty");
        System.out.println("Count: " + count);
    }
}

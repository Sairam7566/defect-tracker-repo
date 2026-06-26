public class DefectReport {

    public static void printReport(String[] ids, String[] severities) {
        System.out.println("--- Defect Report ---");
        for (int i = 0; i < ids.length; i++) {
            System.out.println(ids[i] + " | " + severities[i]);
        }
        System.out.println("Total: " + ids.length + " defects");
    }
}
``
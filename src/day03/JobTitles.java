package day03;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {
        ArrayList<String> allJobs = new ArrayList<>();

        allJobs.addAll(Arrays.asList("SDET", "Developer", "PO", "CEO", "Dev op",
                "QA", "BA", "Chef", "Doctor", "Police Officer", "PO"));

        System.out.println("Original " + allJobs);

        ArrayList<String> jobs1 = new ArrayList<>(allJobs);
        jobs1.removeAll(Arrays.asList("PO", "QA", "BA")); //sadece eslesenleri
        //kaldirir.

        System.out.println(jobs1);//[SDET, Developer, CEO, Dev op, Chef, Doctor, Police Officer]


        ArrayList<String> jobs2 = new ArrayList<>(allJobs);
        jobs2.retainAll(Arrays.asList("SDET", "Developer", "Dev op",
                "xPO"));//sadece eslesenleri tutar.
        System.out.println(jobs2);//[SDET, Developer, Dev op]


        ArrayList<String> jobs3 = new ArrayList<>(allJobs);
        System.out.println(jobs3.containsAll(Arrays.asList("Chef", "CEO"))); //tum  TRUE
        //tumu eslesmesi lazim.
        System.out.println(jobs3.containsAll(Arrays.asList("Doctor", "Nurse")));//FALSE
    }
}

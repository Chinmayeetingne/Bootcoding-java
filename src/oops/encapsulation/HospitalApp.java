package oops.encapsulation;

import oops.encapsulation.hospital.Hospital;
import oops.encapsulation.patient.Patient;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class HospitalApp {
    public static void main(String[] args) {
        Patient ramesh = new Patient();
        ramesh.name = "Suresh";
        ramesh.admitDate = new Date();
        ramesh.dischargeDate = getNextDate(3);

        Hospital alexis = new Hospital();
        //setter and getter
        alexis.setName("Alexis");
        alexis.setAddress("Nagpur");
        alexis.setServices("MultiSpecialist Hospital");
        alexis.setId(UUID.randomUUID());

        System.out.println(alexis.getName());
        System.out.println(alexis.getAddress());
        System.out.println(alexis.getServices());
        System.out.println(alexis.getId());
    }
    private static Date getNextDate(int days){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, days * -1);
        System.out.println("Date = " + cal.getTime());
        return cal.getTime();
    }
}

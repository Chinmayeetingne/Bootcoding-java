package oops.encapsulation.election;

import java.util.Calendar;
import java.util.Date;

public class ElectionApp {
    public static void main(String[] args) {
        Candidate john = new Candidate();
        john.setName("Blake");
        john.setCity("Nagpur");
        john.setAge(24);
        john.setEducation("Btech");
        john.setNameOfParty("IT Engineers Union");
        john.setPartySymbol("Laptop");

        Election e= new Election();
        e.setCity("Nagpur");
        e.setElectionDate(getNextDate(3));

        System.out.println(john.getName());
        System.out.println(john.getCity());
        System.out.println(john.getAge());
        System.out.println(john.getEducation());
        System.out.println(john.getNameOfParty());
        System.out.println(john.getPartySymbol());
    }
    private static Date getNextDate(int days){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, days * 1);
        System.out.println("Date = " + cal.getTime());
        return cal.getTime();
    }
}

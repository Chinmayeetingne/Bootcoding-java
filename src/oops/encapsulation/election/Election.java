package oops.encapsulation.election;

import java.util.Date;

public class Election {
    private String city;
    public Date electionDate;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getElectionDate() {
        return electionDate;
    }

    public void setElectionDate(Date electionDate) {
        this.electionDate = electionDate;
    }
}

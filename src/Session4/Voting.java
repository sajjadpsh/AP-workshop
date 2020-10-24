package Session4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {

    private int type;
    private String question;
    private ArrayList<Person> voters;
    private HashMap<String, HashSet<Vote>> polls;

    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
    }

    public void createPoll(String question){

    }

    public void vote(Person person,ArrayList<String> q){

    }

    public void getVoters(){

    }

    public void printVotes(){

    }

    public String getQuestion() {
        return question;
    }

    public HashMap<String, HashSet<Vote>> getPolls() {
        return polls;
    }
}

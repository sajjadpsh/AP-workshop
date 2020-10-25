package Session4;

import ir.huri.jcal.JalaliCalendar;
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
        voters = new ArrayList<>();
        polls = new HashMap<>();
    }

    public void createPoll(String question) {
        polls.put(question, new HashSet<>());
    }

    public void vote(Person person, ArrayList<String> choice) {
        JalaliCalendar jalaliCalendar = new JalaliCalendar();
        Vote vote = new Vote(person, jalaliCalendar.toString());
        if (!voters.contains(person)) {
            voters.add(person);
            switch (type)
            {
                case 0:{
                    polls.get(choice.get(0)).add(vote);
                    System.out.println("vote submitted in " + vote.getDate() + ".");}
                case 1:
                    for (String temp : choice) {
                        if (polls.containsKey(temp)) {
                            polls.get(temp).add(vote);
                        }
                        System.out.println("votes submitted in " + vote.getDate() + ".");
                    }
                default:
                    System.out.println("Type isn't valid.");
                    break;
            }
        }
        else {
            System.out.println("This person voted before.");
        }
    }

    public void getVoters() {
        for(Person temp : voters) {
            System.out.println(temp.toString());
        }
    }

    public void printVotes() {
        int count = 1;
        for ( String temp : polls.keySet()) {
            System.out.println(count + "-" + temp + ": " + polls.get(temp).size() + " votes");
            for(Vote temp2 : polls.get(temp)) {
                System.out.print(" " + temp2.getVoter() + ",");
            }
            count++;
        }
    }

    public String getQuestion() {
        return question;
    }

    public int getType() {
        return type;
    }

    public ArrayList<String> getPolls() {
        return (new ArrayList<>(polls.keySet()));
    }
}

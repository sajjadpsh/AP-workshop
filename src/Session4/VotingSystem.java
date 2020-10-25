package Session4;

import java.util.ArrayList;

public class VotingSystem {

    private ArrayList<Voting> votingList;

    public VotingSystem() {
        votingList = new ArrayList<>();
    }

    public void createVoting(String question, int type, ArrayList<String> list) {
        Voting voting = new Voting(type, question);
        for (String temp: list) {
            voting.createPoll(temp);
        }
        votingList.add(voting);
        System.out.println("voting created.");
    }

    public void getVotingList() {
        for (Voting temp: votingList) {
            System.out.println(temp.getQuestion());
        }
    }

    public void getVoting(int i) {
        if (validIndex(i))
        {
            System.out.println("Question: "+ votingList.get(i).getQuestion());
            ArrayList<String> temp = votingList.get(i).getPolls();
            for (String move: temp)
            {
                System.out.println("\t"+move);
            }
        }

    }

    public void Vote(int i, Person voter, ArrayList<String> votes) {
        if(validIndex(i)) {
            votingList.get(i).vote(voter, votes);
        }
    }

    public void getResults(int i){
        if(validIndex(i)) {
            System.out.println("print result:\tvoters:");
            votingList.get(i).getVoters();
            System.out.println("\t\tresult:");
            votingList.get(i).printVotes();
        }
    }

    private boolean validIndex(int index) {
        if (index < 0 || index >= votingList.size()) {
            System.out.println("Index is invalid");
            return false;
        } else {
            return true;
        }
    }
}

package Session4;

import java.util.ArrayList;

public class VotingSystem {

    private ArrayList<Voting> votingList;

    /**
     * Create a new voting system.
     *
     */
    public VotingSystem() {
        votingList = new ArrayList<>();
    }

    /**
     * create a new Voting
     * @param question question of voting
     * @param type type of voting
     * @param list choices of voting
     */
    public void createVoting(String question, int type, ArrayList<String> list) {
        Voting voting = new Voting(type, question);
        for (String temp: list) {
            voting.createPoll(temp);
        }
        votingList.add(voting);
        System.out.println("voting created.");
    }

    /**
     * print Voting questions.
     */
    public void getVotingList() {
        for (Voting temp: votingList) {
            System.out.println(temp.getQuestion());
        }
    }

    /**
     * print Voting.
     * @param i index of voting.
     */
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

    public void vote(int i, Person voter, ArrayList<String> votes) {
        if(validIndex(i)) {
            votingList.get(i).vote(voter, votes);
        }
    }

    /**
     * Print result a voting.
     * @param i index of voting.
     */
    public void getResults(int i){
        if(validIndex(i)) {
            System.out.println("print result:\tvoters:");
            votingList.get(i).getVoters();
            System.out.println("\t\tresult:");
            votingList.get(i).printVotes();
        }
    }

    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index) {
        if (index < 0 || index >= votingList.size()) {
            System.out.println("Index is invalid");
            return false;
        } else {
            return true;
        }
    }
}

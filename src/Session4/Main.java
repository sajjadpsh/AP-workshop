package Session4;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        ArrayList<String> options = new ArrayList<>();
        ArrayList<String> days = new ArrayList<>();
        options.add("yes");
        options.add("no");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        votingSystem.createVoting("Do you come?", 0, options);

        votingSystem.createVoting("Which day?", 1, days);

        System.out.println("print voting questions.");
        votingSystem.getVotingList();
        System.out.println();

        System.out.println("print voting.");
        votingSystem.getVoting(0);
        votingSystem.getVoting(1);

        System.out.println("print result.");
        votingSystem.getResults(0);
        votingSystem.getResults(1);

        votingSystem.getVotingList();
        votingSystem.createVoting("Which day?", 1, days);
        votingSystem.getVotingList();
        System.out.println();

        Person p1 = new Person("Ali", "Razeghi");
        Person p2 = new Person("Mohammad", "Honarjoo");
        Person p3 = new Person("Gholi", "Rezayi");
        Person p4 = new Person("Hamed", "Ahmadi");


        ArrayList<String> vote1 = new ArrayList<>();
        ArrayList<String> vote2 = new ArrayList<>();
        ArrayList<String> vote3 = new ArrayList<>();
        ArrayList<String> vote4 = new ArrayList<>();
        vote1.add("no");
        vote2.add("no");
        vote3.add("yes");
        vote3.add("Thursday");
        vote3.add("Friday");
        vote3.add("Saturday");
        vote4.add("yes");
        vote4.add("Saturday");


        System.out.println("voting 0:");
        votingSystem.vote(0, p1, vote1);
        votingSystem.vote(0, p1, vote1);
        votingSystem.vote(0, p2, vote2);
        votingSystem.vote(0, p3, vote3);
        votingSystem.vote(0, p4, vote4);
        votingSystem.getResults(0);

        System.out.println("voting 1");
        votingSystem.vote(1, p3, vote3);
        votingSystem.vote(1, p4, vote4);
        votingSystem.getResults(1);

    }
}

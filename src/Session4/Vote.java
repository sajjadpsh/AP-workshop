package Session4;

import java.util.Objects;

public class Vote {

    private Person voter;
    private String date;

    /**
     * Create a new vote with a given person and date.
     *
     * @param voter person field.
     * @param date date of vote.
     */
    public Vote(Person voter, String date) {
        this.voter = voter;
        this.date = date;
    }

    /**
     * get The person's voter.
     * @return person field.
     */
    public Person getVoter() {
        return voter;
    }

    /**
     * get The date of vote.
     * @return date field.
     */
    public String getDate() {
        return date;
    }

    /**
     * Determine whether the given object equals a vote
     * @param o vote
     * @return true or false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vote)) return false;
        Vote vote = (Vote) o;
        return Objects.equals(getVoter(), vote.getVoter()) &&
                Objects.equals(getDate(), vote.getDate());
    }
    /**
     * @return a integer number.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getVoter(), getDate());
    }
}

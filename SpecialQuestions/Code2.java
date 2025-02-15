package org.example.SpecialQuestions;

import java.util.*;

public class Code2 {

    // Method to cast votes
    public static void castVote(Map<String, Integer> votes, String candidate) {
        // Increment the vote count for the candidate
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
    }

    // Method to display votes in insertion order using LinkedHashMap
    public static void displayVotesInOrder(Map<String, Integer> votes) {
        System.out.println("Votes in insertion order:");
        votes.forEach((candidate, voteCount) ->
                System.out.println(candidate + ": " + voteCount));
    }

    // Method to display votes in sorted order using TreeMap
    public static void displayVotesSorted(Map<String, Integer> votes) {
        TreeMap<String, Integer> sortedVotes = new TreeMap<>(votes);
        System.out.println("Votes in sorted order:");
        sortedVotes.forEach((candidate, voteCount) ->
                System.out.println(candidate + ": " + voteCount));
    }

    public static void main(String[] args) {
        // Using LinkedHashMap to maintain insertion order
        Map<String, Integer> votes = new LinkedHashMap<>();

        // Casting votes
        castVote(votes, "Alice");
        castVote(votes, "Bob");
        castVote(votes, "Alice");
        castVote(votes, "Charlie");
        castVote(votes, "Bob");

        // Displaying votes in insertion order
        displayVotesInOrder(votes);

        // Displaying votes in sorted order
        displayVotesSorted(votes);
    }
}

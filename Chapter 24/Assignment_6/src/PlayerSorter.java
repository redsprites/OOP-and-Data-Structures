// Yoseph Shibiru Assignment 6
import java.io.*;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
public class PlayerSorter {
    public static void main(String[] args) {
        ArrayList<Player> playerList = new ArrayList<>();
        try (Scanner file = new Scanner(new File("players.txt"))) {
            while (file.hasNext()) {
                String inputFName = file.next();
                String inputLName = file.next();
                Double inputScore = file.nextDouble();
                playerList.add(new Player(inputFName, inputLName, inputScore));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int Size = playerList.size();
        PriorityQueue<Player> PQueue1 = new PriorityQueue<>(Size, new NameLengthComparator());
        PriorityQueue<Player> PQueue2 = new PriorityQueue<>(Size, new ScoreComparator());
        int i = 0;
        while (i < Size) {
            PQueue1.add(playerList.get(i));
            PQueue2.add(playerList.get(i));
            i++;
        }
        System.out.println("---------Name Comparator ----------");
        while (!PQueue1.isEmpty()) {
            Player player = PQueue1.poll();
            System.out.println(player.getName() + " " + player.getScore());
        }
        System.out.println("");
        System.out.println("---------Score Comparator ----------");
        while (!PQueue2.isEmpty()) {
            Player player = PQueue2.poll();
            System.out.println(player.getName() + " " + player.getScore());
        }
    }
}
class Player {
    String firstName;
    String lastName;
    double score;
    public Player(String firstName, String lastName, Double score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }
    public String getName() {
        return firstName + " " + lastName;
    }
    public Double getScore() {
        return score;
    }
}
class ScoreComparator implements java.util.Comparator<Player> {
    public int compare(Player p1, Player p2) {
        if (p1.getScore() > p2.getScore()) {
            return 1;
        } else if (p1.getScore() == p2.getScore()) {
            return 0;
        } else {
            return -1;
        }
    }
}
class NameLengthComparator implements java.util.Comparator<Player> {
    public int compare(Player p1, Player p2) {
        if (p1.getName().length() > p2.getName().length()) {
            return 1;
        } else if (p1.getName().length() == p2.getName().length()) {
            return 0;
        } else {
            return -1;
        }
    }
}

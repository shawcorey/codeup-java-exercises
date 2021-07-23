import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] nouns = {"Orange", "Basketball", "Hawk", "Cake", "Seat", "Summer", "Table", "Rock", "Microphone", "Donut"};
        String[] adjectives = {"Smooth", "Brave", "Sad", "Hysterical", "Tart", "Suave", "Grotesque", "Jagged", "Astute", "Frozen"};
        String serverName1 = random(adjectives);
        String serverName2 = random(nouns);
        System.out.println("Here is your server name:");
        System.out.println(serverName1 + "-" + serverName2);
    }

    public static String random(String[] str) {
        Random random = new Random();
        int randomItem = random.nextInt(str.length);
        String randomString = str[randomItem];
        return randomString;
    }
}
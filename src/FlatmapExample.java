import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapExample {
    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("Riya","namdev", "story");
        List<String> teamB = Arrays.asList("Lanos", "Institute");
        List<List<String>> allTeams = Arrays.asList(teamA,teamB);
        System.out.println(allTeams);

        List<String> allStirngs = allTeams.stream().flatMap(List :: stream).collect(Collectors.toList());
        System.out.println(allStirngs);
    }
}

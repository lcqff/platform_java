import java.util.ArrayList;
import java.util.Objects;

public class FootballClub {
    private String name;
    private final int maxSquadSize = 25; //최대 25명만 등록가능

    private ArrayList<Player> squad = new ArrayList<Player>();

    public FootballClub(String name) {
        this.name = name;
    }
    public String toString() {
        String msg = "FootballClub Name: " + name + " Player Count: " +
                squad.size() + "\n";
        for(int i=0; i<squad.size(); i++) {
            msg += "\t" + squad.get(i) + "\n";
        }
        return msg;
    }

    public void addPlayer(Player newPlayer) {
        squad.add(newPlayer);
    }

    public Player findPlayer(String FirstName, int Number) {
        for(int i=0; i<squad.size(); i++) {
            if (squad.get(i).equals(FirstName, Number)) {
                return squad.get(i);
            }
        }
        return null;
    }

    public void removeAllPlayer() {
        squad.clear();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballClub that = (FootballClub) o;
        return maxSquadSize == that.maxSquadSize && Objects.equals(name, that.name) && Objects.equals(squad, that.squad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxSquadSize, squad);
    }
    //other methods (constructor equals,hash)
}

import java.util.ArrayList;

public class Team {
  private String name;
  private ArrayList<Player> squad;

  public Team(String name) {
    this.name = name;
    squad = new ArrayList<Player>();
  }

  public String getName() {
    return this.name;
  }

  public int playerCount() {
    return squad.size();
  }

  public void pickPlayer(Player player) {
    squad.add(player);
  }

  public void fullTime() {
    squad.clear();
  }

  public String teamStatus(Team team) {
    return (team.getName() + " currently has " + team.playerCount() + " in the squad.");
  }
}
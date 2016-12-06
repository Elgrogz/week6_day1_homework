import java.util.ArrayList;

public class Team {
  private String name;
  private ArrayList<Pickable> squad;

  public Team(String name) {
    this.name = name;
    this.squad = new ArrayList<Pickable>();
  }

  public String getName() {
    return this.name;
  }

  public int playerCount() {
    return squad.size();
  }

  public void pick(Pickable person) {
    squad.add(person);
  }

  // public void pickRestOfTeam(Pickable person) {
  //   if (teamFullCheck()) {
  //     for (int i = 0; i < 11; i++) {
  //       if (squad[i] == null) {
  //         squad.add(person);
  //       }
  //     }
  //   }
  // }

  public boolean teamFullCheck() {
    return playerCount() > 11;
  }

  public void fullTime() {
    squad.clear();
  }

  public String teamStatus(Team team) {
    return (team.getName() + " currently has " + team.playerCount() + " in the squad.");
  }
}
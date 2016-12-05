public class Team {
  private String name;
  private Player[] positions;

  public Team(String name) {
    this.name = name;
    this.positions = new Player[11];
  }

  public String getName() {
    return this.name;
  }

  public void setName() {

  }

  public int playerCount() {
    int count = 0;
    for (Player player : positions) {
      if (player != null){
        count++;
      }
    }
    return count;
  }

  public void pickPlayer(Player player) {
    if (positionsTaken()) {
      return;
    }
    int playerCount = playerCount();
    positions[playerCount] = player;
  }

  public void pickRestOfTeam(Player player) {
    if (positionsTaken()) {
      return;
    }
    for (int i = 0; i < positions.length; i++) {
      if (positions[i] == null) {
        positions[i] = player;
      }
    }
  }

  public boolean positionsTaken() {
    return playerCount() == positions.length;
  }

  public void fullTime() {
    for (int i = 0; i < positions.length; i++) {
      positions[i] = null;
    }
  }

  public void teamStatus(Team team) {
    System.out.println(team.getName() + " currently has " + team.playerCount() + " in the matchday squad.");
  }
}
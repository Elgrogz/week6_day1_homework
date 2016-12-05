public class Team {
  private String name;
  private Player[] positions;

  public Team(String name) {
    this.name = name;
    this.position = new positions[11];
  }

  public String getName() {
    return this.name;
  }

  public void setName() {

  }

  public int positionCount() {
    int count = 0
    for (Player player : positions) {
      if (player != null){
        count++;
      }
    }
  }

  public void pickPlayer(Player player) {
    if (positionsTaken()) {
      return;
    }
    int positionCount = positionCount();
    belly[positionCount] = player;
  }

  public boolean positionsTaken() {
    return positionCount() == positions.length;
  }

  public void fullTime() {
    for (i = 0; i < positions.length; i++) {
      positions[i] = null;
    }
  }
}
class Runner {
  public static void main(String[] args) {
    Team liverpool = new Team("Liverpool F.C");
    Goalkeeper goalkeeper = new Goalkeeper();
    Player player = new Player();

    System.out.println(liverpool.teamStatus(liverpool));

    liverpool.pick(goalkeeper);
    liverpool.pick(player);
    liverpool.pick(player);
    System.out.println(liverpool.teamStatus(liverpool));
    
    liverpool.fullTime();
    System.out.println(liverpool.teamStatus(liverpool));
  }
}

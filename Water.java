public class Water extends PokectMonster{
  public Water(String n, String s, int h){
    super(n,s,h,"Agua");
  }

  public void Battle(Pokémon p){
    p.AttackToWater(this);
  }

  public void AttackToFire(Fire fire){
    fire.TakeDamage(10);
  }

  public void AttackToPlant(Plant plant){
    plant.TakeDamage(5);
  }

  public void AttackToWater(Water water){
    water.TakeDamage(5);
  }
}
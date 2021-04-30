/**
*Clase Water
*Extiende de Pokémon e implementa
*los metodos PokectMonster con un
*Double Dispach para los tipo agua
*/
public class Water extends Pokémon{
  /**
  *Constructor Water
  *Crea al Pokémon de tipo agua
  */
  public Water(String n, String s, int h){
    super(n,s,h,"Agua");
  }

  /**
  *Battle: PokectMonster-->void
  *Un Pokémon de tipo agua ataca a 
  *un PokectMonster p
  */
  public void Battle(PokectMonster p){
    p.AttackByWater(this);
  }

  /**
  *AttackByFire: Fire-->void
  *El Pokémon tipo agua recibe 5
  *puntos de daño cuando es atacado por 
  *otro del tipo fuego
  */
  public void AttackByFire(Fire fire){
    fire.DealDamage(5,this);
  }

  /**
  *AttackByPlant: Plant-->void
  *El Pokémon tipo agua recibe 10
  *puntos de daño cuando es atacado por 
  *otro del tipo planta
  */
  public void AttackByPlant(Plant plant){
    plant.DealDamage(10,this);
  }

  /**
  *AttackByWater: Water-->void
  *El Pokémon tipo agua recibe 5
  *puntos de daño cuando es atacado por 
  *otro del tipo agua
  */
  public void AttackByWater(Water water){
    water.DealDamage(5,this);
  }
}
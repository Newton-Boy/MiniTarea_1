/**
*Clase Plant
*Extiende de Pokémon e implementa
*los metodos PokectMonster con un
*Double Dispach para los tipo planta
*/
public class Plant extends Pokémon{
  /**
  *Constructor Plant
  *Crea al Pokémon de tipo planta
  */
  public Plant(String n, String s, int h){
    super(n,s,h,"Planta");
  }

  /**
  *Battle: PokectMonster-->void
  *Un Pokémon de tipo planta ataca a 
  *un PokectMonster p
  */
  public void Battle(PokectMonster p){
    p.AttackByPlant(this);
  }

  /**
  *AttackByFire: Fire-->void
  *El Pokémon tipo planta recibe 10
  *puntos de daño cuando es atacado por 
  *otro del tipo fuego
  */
  public void AttackByFire(Fire fire){
    fire.DealDamage(10,this);
  }

  /**
  *AttackByPlant: Plant-->void
  *El Pokémon tipo planta recibe 5
  *puntos de daño cuando es atacado por 
  *otro del tipo planta
  */
  public void AttackByPlant(Plant plant){
    plant.DealDamage(5,this);
  }

  /**
  *AttackByWater: Water-->void
  *El Pokémon tipo planta recibe 5
  *puntos de daño cuando es atacado por 
  *otro del tipo agua
  */
  public void AttackByWater(Water water){
    water.DealDamage(5,this);
  }
}
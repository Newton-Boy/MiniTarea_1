/**
*Interface PokectMonster
*Promete los métodos de combate
*entre los distintos PokectMonster(Pokémons)
*que se usarán
*/
interface PokectMonster{
  /**
  *Battle: PokectMonster-->void
  *Realiza combate entre un PokectMonster
  *a otro
  */
  void Battle(PokectMonster P);

  /**
  *AttackByPlant: Plant-->void
  *Determina que ocurre en caso que
  *un PokectMonster sea atacado por 
  *otro del tipo planta
  */
  void AttackByPlant(Plant plant);

  /**
  *AttackByFire: Fire-->void
  *Determina que ocurre en caso que
  *un PokectMonster sea atacado por 
  *otro del tipo fuego
  */
  void AttackByFire(Fire fire);

  /**
  *AttackByWater: Water-->void
  *Determina que ocurre en caso que
  *un PokectMonster sea atacado por 
  *otro del tipo agua
  */
  void AttackByWater(Water water);
}
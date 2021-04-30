/**
*Clase main
*Esta clase se usará para realizar testers
*de los métodos y clases de la Tarea 1
*¡¡Combates Pokémon!!
*/
public class main{

  /**
  *constructTest: void-->void
  *Imprime los distintos getters que tiene
  *el constructor, para las distintas variables.
  */
  static void constructTest(Pokémon p){
    System.out.println("-------Test Constructor--------");
    System.out.println("Este Pokémon se llama "+p.getName());
    System.out.println("Este Pokémon es un "+p.getSpecies());
    System.out.println("Este Pokémon tiene "+p.getHP()+" puntos de vida actuales");
    System.out.println("Este Pokémon es del tipo "+p.getType());
    System.out.println("---------------");
  }

  /**
  *cambioDeMote: String Pokémon-->void
  *Imprime un ejemplo de cambio de nombre
  *del Pokémon p
  */
  static void cambioDeMote(String Mote, Pokémon p){
    System.out.println("-------Test setName--------");
    System.out.println("Vamos a cambiar el nombre de "+p.getName());
    p.setName(Mote);
    System.out.println("Ahora se llamara "+p.getName());
    System.out.println("---------------");
  }

  /**
  *Estado: void-->void
  *Sí el Pokémon sigue de pie, entrega
  *la salud actual del Pokémon
  */
  static void Estado(Pokémon p){
    System.out.println("Salud de "+p.getName()+" : "+p.getHP());
  }

  /**
  *Combate: void-->void
  *Comienza un Test de combate entre 2 Pokémons
  *que prosigue hasta que uno quede KO
  */
  static void Combate(Pokémon p1, Pokémon p2){
    System.out.println("-------Test Batalla--------");
    Estado(p1);
    Estado(p2);
    int turno=0;
    while (p1.isKO()==false && p2.isKO()==false){
      if(turno%2==0){
        p1.Battle(p2);
        Estado(p2);
      }
      else{
        p2.Battle(p1);
        Estado(p1);
      }
      turno++;
    }
    if(p1.isKO()){
      System.out.println(p1.getName()+" ha quedado inconsciente y no puede continuar.");
    }
    else{
      System.out.println(p2.getName()+" ha quedado inconsciente y no puede continuar.");
    }
    System.out.println("---------------");
  }

  /**
  *Método main
  *Ejecuta los Testers
  */
  public static void main(String[] args){

    Pokémon Charmander= new Fire("Salamandra","Charmander",13);
    Pokémon Squarel= new Water("Donatelo", "Squarel",20);
    Pokémon Bulbasor= new Plant("Cebolla", "Bulbasor", 12);

    constructTest(Charmander);
    constructTest(Squarel);
    constructTest(Bulbasor);

    cambioDeMote("Di Caprio",Squarel);

    Combate(Charmander,Bulbasor);
    Combate(Charmander,Squarel);
    Combate(Bulbasor,Squarel);
  }
}
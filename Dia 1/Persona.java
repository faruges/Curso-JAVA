
public class Persona {

 String name;
 String sexo;
 int edad;

 public void caminar(){
	System.out.println(name + "Esta caminando");
}
 public void estudiar(){
	System.out.println(name + "Esta estudiando");
	}
 public void  comer(String comida){
	System.out.println(name + "Esta Comiendo" + comida);
	} 
 public void pedirCerveza(){

 if(edad>= 18){
	System.out.print("cerveza Entregada");
   }else{
	System.out.print("No tienes edad para tomar");	
 
    }
  }

}

class Curso {

 public satatic void main(String args[]){
 Persona juan = new Persona();
 juan.name="JUAN PEREZ";
 juna.sexo="M";
 juan.edad=22;
 juan.caminar();
 juan.estudiar();
 juan.comer("Torta Cubana + Guacamole");
 
 Persona bety= new Persona();
 bety.name="Beatriz";
 bety.sexo="F";
 bety.edad=18;
 bety.caminar();
 bety.estudiar();



 }
}

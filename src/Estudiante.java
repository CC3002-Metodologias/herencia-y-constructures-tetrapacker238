public class Estudiante extends Persona{
    public Estudiante(String ocupacionE, String nombreE, int edadE){
        super(ocupacionE, nombreE, edadE);
    }
    @Override
    public void comer(){
        System.out.println("ñam ñam que rico kongpleto");
    }
    @Override
    public void dormir(){
        System.out.println("zZZzZz");
    }
    @Override
    public String hacerLoSuyo(){
        return "Anime y ver Series de Netflix";
    }
}

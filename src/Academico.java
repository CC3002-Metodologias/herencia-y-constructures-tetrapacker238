public class Academico extends Persona{
    protected String paper;
    public Academico(String ocupacionA, String nombreA, int edadA, String paper){
        super(ocupacionA, nombreA, edadA);
        this.paper = paper;
    }
    @Override
    public void comer(){
        super.comer();
    }
    @Override
    public void dormir(){
        System.out.println("zZZzzZz");
    }
    @Override
    public String hacerLoSuyo(){
        return "Aprender a ocupar Zoom";
    }
    public void publicarPaper(){
        System.out.println(this.paper);
    }
}

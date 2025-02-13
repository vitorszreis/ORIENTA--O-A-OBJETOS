package exercicioListaOO;

public abstract class FormaGeometrica {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

public class Circle extends FormaGeometrica{
    private double raio;

    public Circle(double raio){
        this.raio = raio;
    }

    @Override
    public  double  calcularArea(){
        return Math.PI * raio * raio;
    }

    @Override
    public  double calcularPerimetro(){
        return 2 *Math.PI * raio;

    }
}

public class square extends FormaGeometrica {

}


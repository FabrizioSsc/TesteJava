import org.w3c.dom.ls.LSOutput;

public class Carro {

    // atributos
    String nome = "Celta";
    String cor = "Preto";
    int acelerar = 10;
    int velocidade = 100;
    int soma;

    // metodo
    public void acelerando() {
        soma = velocidade + acelerar;
    }

    public static void main(String[] args) {

        Carro car = new Carro();


        car.acelerando();


        System.out.println("A  velocidade é : " + car.soma + " km/h");
    }
}



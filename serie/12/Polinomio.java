

public class Polinomio{
    double a;
    double b;
    double c;

    public  Polinomio(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }


    public void raiz() throws ComplexRException {
        
        if ((b*b-4*(a)*(c))>0) {
            System.out.printf("Las raices del polinomio son:\n%f    %f\n", ((-b + Math.sqrt((b*b)-4*(a*c)))/(2*a)),((-b - Math.sqrt((b*b)-4*(a*c)))/(2*a)));
        }
        else if (b*b-4*(a)*(c)<0){
            throw new ComplexRException();//return(-b/2*a);
        }
    }
}

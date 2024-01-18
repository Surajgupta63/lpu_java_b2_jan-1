package Day3;


class Metric{
    double km;
    double m;
    Metric(double km, double m){
        this.km = km;
        this.m = m;
    }
    Metric(Impereal imp){
        km = imp.foot/1.6;
        m = imp.inches/12;
    }
}

class Impereal{
    double foot;
    double inches;
    Impereal(double foot, double inches){
        this.foot = foot;
        this.inches = inches;
    }
    Impereal(Metric i){
        foot = i.km/3.2;
        inches = i.m/12.0;

    }
}




public class CtoC {
    public static void main(String args[]){
        Metric m = new Metric(10.8, 1000.8);
        Impereal imp = new Impereal(4.5, 80.5);
        imp = new Impereal(m);
        System.out.println(" "+ imp.foot + " " + imp.inches);
        m = new Metric(imp);
        System.out.println(" "+ m.km + " " + m.m);
    }
}

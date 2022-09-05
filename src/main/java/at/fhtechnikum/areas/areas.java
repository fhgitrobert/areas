package at.fhtechnikum.areas;

public class areas {

    public String getInfo(){
        return "Kreis - Radius \n Quadrat - Seite \n Rechteck - Länge/Breite";
    }

    public double getArea(String form, double value){
        if(form.equals("Kreis")){
            return value*value*Math.PI;
        }
        else return value*value;
    }

    public double getArea(String form, double val1, double val2){
        return val1*val2;
    }

}

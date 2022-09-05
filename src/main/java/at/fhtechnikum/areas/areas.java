package at.fhtechnikum.areas;

public class areas {

    public String getInfo(){
        return "Kreis - Radius \n Quadrat - Seite \n Rechteck - Länge/Breite";
    }

    private double area;
    private String form;

    public void setArea(String form, double value){
        if(form.equals("Kreis")){
            this.area = value*value*Math.PI;
        }
        else this.area = value*value;
    }

    public void setArea(String form, double val1, double val2){
        this.area = val1*val2;
            }

}


public class Main {
    public static void main(String[] args) {

        System.out.println("shouldWakeUp>>>>>" +shouldWakeUp(true,21));
        System.out.println("hasTeen>>>>>" + hasTeen(22, 23, 34));
        System.out.println("isCatPlaying>>>>>" + isCatPlaying(false, 35));
        System.out.println("areaRectangle>>>>>" + areaRectangle(5.0,4.0));
        System.out.println("areaCircle>>>>>" + areaCircle(5.0));
    }
    public static boolean shouldWakeUp(boolean state,int hour){
        if(((hour > 20 && hour < 23) || (hour < 8 && hour > 0)) && state ){
            return true;
        }else{
            return false;
        }

    }
    public static boolean hasTeen(int age1, int age2, int age3){
        if((age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <= 19) || (age3 >= 13 && age3 <= 19)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isCatPlaying(boolean season , int degree){
        if(season == false && (degree >= 25 && degree <= 35)){
            return true;
        }else if(season == true && (degree >25 && degree <= 45)){
            return true;
        }else{
            return false;
        }
    }
    public static double areaRectangle(double side1 , double side2){
        if(side1 >= 0 && side2 >= 0){
            return side1 * side2;
        }else{
            return -1;
        }

    }
    public static double areaCircle(double radius){
        if(radius >= 0){
            return radius*radius*Math.PI;
        }else{
            return -1;
        }
    }


}
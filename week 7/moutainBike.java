public class moutainBike extends bike {
    int gear;

    public moutainBike(){
        this.gear = 2;
        this.currentspeed = 10;
    }

    public int gearUP(int gearUP){
        this.currentspeed = currentspeed + (gearUP*gear);
        return gearUP;
    }


}
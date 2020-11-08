public abstract class GenerelBank {
    public abstract int getSavingInterstRate();
    public abstract double getFixedInterstRate();
}

class ICICIBank extends GenerelBank{
    public int getSavingInterstRate(){
        return 4;
    }
    public double getFixedInterstRate(){
        return 8.5;
    }
}
class KotMBank extends GenerelBank{
    public int getSavingInterstRate(){
        return 6;
    }
    public double getFixedInterstRate(){
        return 9;
    }
}


class Mainclass5{
    public static void main(String[] args) {
        ICICIBank obj = new ICICIBank();
        System.out.println("ICICI Bank's rate of interst on saving is: " +obj.getSavingInterstRate());
        System.out.println("ICICI Bank's rate of interst on fixed is: " + obj.getFixedInterstRate());
        KotMBank obj1 = new KotMBank();
        System.out.println("kotak M Bank's rate of interst on saving is: " + obj1.getSavingInterstRate());
        System.out.println("Kotak M Bank's rate of interst on saving is: " + obj1.getFixedInterstRate());
        GenerelBank obj2 = new KotMBank();
        obj2.getFixedInterstRate();
        obj.getSavingInterstRate();
        GenerelBank obj3 = new ICICIBank();
        obj3.getFixedInterstRate();
        obj.getSavingInterstRate();
    }
}
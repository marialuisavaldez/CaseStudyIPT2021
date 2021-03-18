class Average{
	public void Points(){
	System.out.println("Welcome ");
	}
}
class Viper extends Average{
    public void Table(){
        System.out.println("To ");
    }
}
class Sova extends Viper{
    public void Chair(){
        System.out.println("College of Computer Studies");
    }
}



public class MainClass {

    
    public static void main(String[] args) {
       Sova sova = new Sova();

	sova.Points();
        sova.Table();
        sova.Chair();
    }
    
}

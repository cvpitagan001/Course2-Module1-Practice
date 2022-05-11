import java.util.Scanner;

public class MapleTreeDriver {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        MapleTree mt = new MapleTree();

        System.out.print("Enter plant date (dd/mm/yyyy): ");
        String plantDate = get.next();
        System.out.print("Enter germination date (dd/mm/yyyy): ");
        String heightDate = get.next();
        System.out.print("Enter observed height in meters: ");
        double height = get.nextDouble();

        mt.plant(plantDate);
        mt.germinate(heightDate, height);
        mt.dumpData();
    }
    
}
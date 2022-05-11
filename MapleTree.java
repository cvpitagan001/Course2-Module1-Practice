public class MapleTree {
    private String plantDate, heightDate;
    private double height;

    public void plant(String d) {
        plantDate = d;
    }

    public void germinate(String d, double h) {
        heightDate = d;
        height = h;
    }

    public void dumpData() {
        System.out.println("Plant Date : " + plantDate);
        System.out.println("Germinate Date : " + heightDate);
        System.out.println("Initial Height : " + height + " meters");
    }
}

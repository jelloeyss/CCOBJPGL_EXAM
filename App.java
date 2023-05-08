import Locations.*;
import Tourists.*;

public class App {
    public static void main(String[] args) throws Exception {

        Locations Batanes = new Batanes();
        Locations Bohol = new Bohol();
        Locations Cebu = new Cebu();
        Locations Palawan = new Palawan();
        Locations Siargao = new Siargao();
        Locations Tagaytay = new Tagaytay();

        Tourist Me = new Me();

        Batanes.accept(Me);
        Bohol.accept(Me);
        Cebu.accept(Me);
        Palawan.accept(Me);
        Siargao.accept(Me);
        Tagaytay.accept(Me);

    }
}
package Tourists;

import Locations.Batanes;
import Locations.Locations;
import Locations.Bohol;
import Locations.Cebu;
import Locations.Palawan;
import Locations.Siargao;
import Locations.Tagaytay;

public interface Tourist {

    int budget = 1000;

    void visit();

    void visit(Batanes batanes);

    void visit(Bohol bohol);

    void visit(Cebu cebu);

    void visit(Palawan palawan);

    void visit(Siargao siargao);

    void visit(Tagaytay tagaytay);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
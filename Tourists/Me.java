package Tourists;

import Locations.*;

public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Batanes batanes) {
        System.out.println("ang budget ko ay " + getBudget());

        if (budget > batanes.airFare) {
            System.out.println("forda go sa batanes");
            budget -= batanes.airFare;

        } else {
            System.out.println("wala zero wala pera");
        }

        checkBudget();

    }

    public void visit(Bohol bohol) {

        if (budget > bohol.airFare) {
            System.out.println("forda go sa bohol");
            budget -= bohol.airFare;
        } else {
            System.out.println("wala zero wala pera");
        }

        checkBudget();
    }

    public void visit(Cebu cebu) {
        if (budget > cebu.airFare) {
            System.out.println("forda gowtch sa cebu");
            budget -= cebu.airFare;
        } else {
            System.out.println("zero ang keki wala pera");
        }

        checkBudget();
    }

    public void visit(Palawan palawan) {
        if (budget > palawan.airFare) {
            System.out.println("G tara sa palawan");
            budget -= palawan.airFare;
        } else {
            System.out.println("eh walang pera ang gei");
        }

        checkBudget();
    }

    public void visit(Siargao siargao) {
        if (budget > siargao.airFare) {
            System.out.println("forda swimming na sa siargao");
            budget -= siargao.airFare;
        } else {
            System.out.println("eh na dikya ang backluh");
        }

        checkBudget();
    }

    public void visit(Tagaytay tagaytay) {
        if (budget > tagaytay.airFare) {
            System.out.println("laz g tagaytay skyranch");
            budget -= tagaytay.airFare;
        } else {
            System.out.println("nagpalamig lang wala pera");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    public static int getBudget() {
        return budget;
    }

}
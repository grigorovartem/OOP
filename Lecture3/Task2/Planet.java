package Lecture3.Task2;

import java.util.ArrayList;
import java.util.List;

public class Planet {

    private String name;
    private List<Mainland> mainlands = new ArrayList<>();
    private List<Island> islands = new ArrayList<>();
    private List<Ocean> oceans = new ArrayList<>();

    public Planet(String name) {
        this.name = name;
    }

    public void printMainland(List<Mainland> mainlands) {
        for (int i = 0; i < mainlands.size(); i++) {
            System.out.println(mainlands.get(i).getName());
        }
    }

    public void printName() {
        System.out.println(name);
    }

    public int mainlandCount(List<Mainland> mainlands) {
        System.out.println("Count of mainlands: " + mainlands.size());
        return mainlands.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Mainland> getMainland() {
        return mainlands;
    }

    public void setMainland(Mainland... args) {
        for (int i = 0; i < args.length; i++) {
            this.mainlands.add(args[i]);
        }
    }

    public List<Island> getIsland() {
        return islands;
    }

    public void setIsland(Island island) {
        this.islands.add(island);
    }

    public List<Ocean> getOceans() {
        return oceans;
    }

    public void setOceans(Ocean ocean) {
        this.oceans.add(ocean);
    }
}

package com.company;

@TargetSub(target = "military facility", destinationReg = "China")
public class AtomSubmarine {
    private String name;
    private int weaponPower;
    private Engine engine;

    AtomSubmarine () {
        engine = new Engine();
    }
    class Engine {
        public String start () {
            return "Поехали!";
        }
    }
    public void startSubmarine () {
        System.out.println(engine.start());
    }

}

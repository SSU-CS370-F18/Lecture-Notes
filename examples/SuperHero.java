

abstract class SuperHero {
    abstract void useSuperPower();
}

interface FlyingHero {
    void fly();
}

interface CapedHero {
    void swishCape();
}


class Superman extends SuperHero implements FlyingHero, CapedHero {
    @Override
    void useSuperPower() {
        // heat vision, freezing breath, etc.
    }

    @Override
    void fly() {
        // whoosh away
    }

    @Override
    void swishCape() {
        // swish
    }
}

class Batman extends SuperHero implements CapedHero {
    @Override
    void useSuperPower() {
        // throw money at problem
    }

    @Override
    void swishCape() {
        // swish darkly
    }
}

class WonderWoman extends SuperHero {
    @Override
    void useSuperPower() {
        // lasso
    }
}


class GothamCity {

    void fightCrime(SuperHero hero) {
        hero.useSuperPower();  // all SuperHeroes can do this

        if (hero instanceof CapedHero) {  // check if it's a specific sub-type
            ((CapedHero)hero).swishCape();  // cast to CapedHero type
        }
        else {
            // Edna Mode approves this hero
        }
    }
}


    int main() {
        Superman kal-el = new Superman();
        Batman bruce = new Batman();
        WonderWoman diana = new WonderWoman();

        GothamCity setting = new GothamCity();
        setting.fightCrime(bruce)
    }

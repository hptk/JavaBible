
class Genesis {

    final static God god = new God();

    public static void main(String[] args) {

        Heaven heaven = new Heaven();
        Earth earth = new Earth();

        earth.setForm(null);
        earth.setLightInTheDeep(false);

        god.moveOverWater(earth);

        day1(earth);
        day2(earth);
        day3(earth);
        day4(heaven);
        day5(earth);
        day6(earth);


    }

    private static void day1(Earth earth) {
        god.say("Let there be light");
        earth.setLight(true);
        god.contemplate("light is good");

        god.split("light", "dark");

        earth.setDay("light");
        earth.setNight("dark");

        return;
    }

    private static void day2(Earth earth) {
        earth.splitWater();
        earth.separateHeavenFromEarth();
        return;
    }

    private static void day3(Earth earth) {
        earth.getWater().gather();
        earth.getDryLand().setName("Earth");
        earth.getWater().setName("Seas");

        god.contemplate("this is good");
        god.say("Let the earth bring forth grass, the herb yielding seed, " + 
                "and the fruit tree yielding fruit after his kind, whose " +
                "seed is in itself, upon the earth");

        earth.grow("grass");
        earth.grow("herb yielding seed");
        earth.grow("fruit tree");

        god.contemplate("this is good");
        return;
    }

    private static void day4(Heaven heaven) {
        god.say("Let there be lights in the firmament of the heaven to " +
                "divide the day from the night; and let them be for signs, " +
                "and for seasons, and for days, and years. And let them " +
                "be for lights in the firmament of the heaven to give " +
                "light upon the earth");

        heaven.createStars();
        heaven.createSun();
        heaven.createMoon();

        god.contemplate("this is good");
        return;
    }

    private static void day5(Earth earth) {
        god.say("Let the waters bring forth abundantly the moving creature " +
                "that hath life, and fowl that may fly above the earth in " +
                "the open firmament of heaven.");

        god.createWaterCreatures(earth);
        god.createWingedFowls(earth);

        god.contemplate("this is good");

        god.bless(earth.creatures);
        god.sayTo(earth.creatures, "Be fruitful, and multiply, and fill the " + 
                "waters in the seas, and let fowl multiply in the earth");
        return;
    }

    private static void day6(Earth earth) {
        god.say("Let the earth bring forth the living creature after his " + 
            "kind, cattle, and creeping thing, and beast of the earth " +
            "after his kind");

        god.createBeasts(earth);
        god.createCattle(earth);
        god.createCreepingCreatures(earth);

        god.contemplate("this is good");

        god.say("Let us make man in our image, after our likeness: and let " + 
                "them have dominion over the fish of the sea, and over the " + 
                "fowl of the air, and over the cattle, and over all the " + 
                "earth, and over every creeping thing that creepeth upon " + 
                "the earth");

        god.createManFromImage(god, earth);
        god.createFemaleFromImage(god, earth);

        god.bless(earth.humans);

        god.sayTo(earth.humans, "Be fruitful, and multiply, and replenish " +
                "the earth, and subdue it: and have dominion over the " + 
                "fish of the sea, and over the fowl of the air, and over " +
                "every living thing that moveth upon the earth.");

        god.sayTo(earth.humans, "Behold, I have given you every herb bearing " + 
                "seed, which is upon the face of all the earth, and every " + 
                "tree, in the which is the fruit of a tree yielding seed; " + 
                "to you it shall be for meat");

        god.sayTo(earth.humans, "And to every beast of the earth, and to " + 
                "every fowl of the air, and to every thing that creepeth " + 
                "upon the earth, wherein there is life, I have given every " + 
                "green herb for meat");

        god.contemplate("this is very good");
    }
}

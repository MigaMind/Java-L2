public class Main {

    public static void main(String[] args) {
         startCrossRun();
    }

    static void startCrossRun() {
        Running[] athletes = new Running[] {
                new Human("Luc", 300, 2),
                new Human("Solo", 250, 1.5),
                new Cat("Chubaka", 900, 2.7),
                new Robot("C-3PO", 100, 0.5),
                new Robot("R2-D2", 500, 0)
        };
        Obstacle[] obstacles = new Obstacle[] {
                new Track(200),
                new Wall(1.25),
                new Wall(1.9),
                new Track(300),
        };
        for (Running athlete : athletes) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Track) {
                    if (!athlete.runOnTrack((Track)obstacle)) {
                        break;
                    }
                }
                if (obstacle instanceof Wall) {
                    if (!athlete.jumpOverWall((Wall)obstacle)) {
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
}

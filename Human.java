public class Human implements Running{

    private String name;
    private int maxRunDistance;
    private double maxJumpHeight;

    public Human (String name, int distance, double height){
        this.name = name;
        maxRunDistance = distance;
        maxJumpHeight = height;
    }

    @Override
    public boolean runOnTrack(Obstacle track) {
        if (track instanceof Track) {
            if (maxRunDistance >= ((Track) track).getLength()) {
                System.out.println(String.format("Human %s run a %d-meter track", name, ((Track) track).getLength()));
                return true;
            } else {
                System.out.println(String.format("Human %s can not run a %d-meter track", name, ((Track) track).getLength()));
                return false;
            }
        } else {
            System.out.println("Error: Wrong obstacle!");
            return false;
        }
    }

    @Override
    public boolean jumpOverWall(Obstacle wall) {
        if (wall instanceof Wall) {
            if (maxJumpHeight >= ((Wall) wall).getHeight()) {
                System.out.println(String.format("Human %s jumped through a %.2f-meter-height wall", name, ((Wall) wall).getHeight()));
                return true;
            } else {
                System.out.println(String.format("Human %s can not jump through a %.2f-meter-height wall", name, ((Wall) wall).getHeight()));
                return false;
            }
        } else {
            System.out.println("Error: Wrong obstacle!");
            return false;
        }
    }
}

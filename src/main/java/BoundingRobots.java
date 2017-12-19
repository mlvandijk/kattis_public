import java.util.Scanner;

/**
 * Created by Marit on 25-2-2017.
 */
public class BoundingRobots {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int width, length;
        while (true){
            width = in.nextInt();
            length = in.nextInt();

            if (width == 0 && length == 0){
                in.close();
                System.exit(0);
            }

            Robot robot = new Robot();

            int n = in.nextInt();
            for (int i = 0; i < n; i++){
                char direction = in.next().charAt(0);
                int meters = in.nextInt();
                robot.walk(direction, meters, width, length);
            }
            System.out.println(robot.toString());
        }
    }
}

class Robot{
    //actual location
    int xa;
    int ya;
    // where robot thinks it is
    int xr;
    int yr;

    public void walk(char d, int m, int w, int l){
        switch (d){
            case 'u':
                this.ya += m;
                if (this.ya >= l) {
                    this.ya = l - 1;//correct for max length
                }
                this.yr += m;
                break;
            case 'd':
                this.ya -= m;
                if (this.ya < 0) {
                    this.ya = 0;//correct for min length
                }
                this.yr -= m;
                break;
            case 'r':
                this.xa += m; //correct for max width
                if (this.xa >= w){
                    this.xa = w - 1;
                }
                this.xr += m;
                break;
            case 'l':
                this.xa -= m; //correct for min width
                if (this.xa < 0){
                    this.xa = 0;
                }
                this.xr -= m;
                break;
        }
    }

    public String toString(){
        return "Robot thinks " + this.xr + " " + this.yr +
        "\nActually at " + this.xa + " " + this.ya + "\n";
    }
}

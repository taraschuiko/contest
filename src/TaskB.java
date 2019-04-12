import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int x3 = x1;
        int y3 = y2;
        int x4 = x2;
        int y4 = y1;

        int nX = (x2 + x3) / 2;
        int nY = y2;

        int eX = x2;
        int eY = (y4 + y2) / 2;

        int sX = (x1 + x4) / 2;
        int sY = y1;

        int wX = x1;
        int wY = (y1 + y3) / 2;

        double [] distance = new double[8];
        distance[0] = Math.sqrt(Math.pow((x - x1),2) + Math.pow((y - y1),2));
        distance[1] = Math.sqrt(Math.pow((x - x2),2) + Math.pow((y - y2),2));
        distance[2] = Math.sqrt(Math.pow((x - x3),2) + Math.pow((y - y3),2));
        distance[3]= Math.sqrt(Math.pow((x - x4),2) + Math.pow((y - y4),2));
        distance[4]= Math.sqrt(Math.pow((x - nX),2) + Math.pow((y - nY),2));
        distance[5]= Math.sqrt(Math.pow((x - eX),2) + Math.pow((y - eY),2));
        distance[6]= Math.sqrt(Math.pow((x - sX),2) + Math.pow((y - sY),2));
        distance[7]= Math.sqrt(Math.pow((x - wX),2) + Math.pow((y - wY),2));

        double minDistance = distance[0];
        int f = 0;

        for(int i = 0; i < distance.length; i++){
            if(distance[i] < minDistance)
            {
                minDistance = distance[i];
                f = i;

            }
        }

        switch (f){
            case 0:
                System.out.println("SW");break;
            case 1:
                System.out.println("NE");break;
            case 2:
                System.out.println("NW");break;
            case 3:
                System.out.println("SE");break;
            case 4:
                System.out.println("N");break;
            case 5:
                System.out.println("E");break;
            case 6:
                System.out.println("S");break;
            case 7:
                System.out.println("W");break;

        }




    }
}

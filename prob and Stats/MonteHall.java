import java.util.Random;
public class MonteHall
{
    int firstChoice = 0;
    int switchChoice = 0;

    Random ran = new Random();
    {
        for(int i = 0; i < 10000; i++)
        {
            int[] curtans = {0,0,0};
            curtans[ran.nextInt(3)] = 1;

            int choice = ran.nextInt(3);
            int revealed;

            do
            {
                revealed = ran.nextInt(3);
            }
            while(curtans[revealed] == 1 || revealed == choice);

            firstChoice += curtans[choice];
            switchChoice += curtans[3 - choice - revealed];
        }
    }
}


/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args) {
        int[] samples1 = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
        int[] samples2 = {0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};
        int[] samples3 = {20, 50, 50, 80};
        
        Sound s1 = new Sound(samples1);
        Sound s2 = new Sound(samples2);
        Sound s3 = new Sound(samples3);
        
        System.out.println(s1.limitAmplitude(2000));
        s2.trimSilenceFromBeginning();
    }
}

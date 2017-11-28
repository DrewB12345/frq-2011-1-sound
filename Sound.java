
/**
 * Write a description of class Sound here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sound {
    int[] samples;
    
    public Sound(int[] samples) {
        this.samples = samples;
    }

    /**
     * Finds each value in the array that surpasses the limit and changes them
     *
     * @param limit The point at which each value may not surpass
     * @return How many numbers were changed
     */
    public int limitAmplitude(int limit) {
       int count = 0;
       
       for (int i=0;i<samples.length;i++) {
           if (samples[i] > limit) {
               count++;
               samples[i] = limit;
           }
           else if (samples[i] < (0-limit)) {
               count++;
               samples[i] = (0-limit);
           }
       }
              
       return count;
    }
    
    /**
     * Removes the zeros at the beginning of the array
     *
     */
    public void trimSilenceFromBeginning() {
        boolean isSilent = true;
        int count = 0;
        
        while(isSilent) {
            if (samples[count] == 0) {
                count++;
            }
            else {
                isSilent = false;
            }
        }
        
        int[] result = new int[samples.length - count];
        for (int i=count;i<samples.length;i++) {
            result[i - count] = samples[i];
        }
        samples = result;
    }
    
    /**
     * Prints an array
     */
    public void printArray() {
        for (int i = 0; i < samples.length; i++) {
            if (i > 0) {
               System.out.print(", ");
            }
            System.out.print(samples[i]);
        }
        System.out.println();
    }
}

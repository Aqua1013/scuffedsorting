import java.util.Random;

public class Sorts {

    public static int[] bogo(int[] arr) {
      
        Random random = new Random();
        boolean sorted = false;
        int randIndex = 0;
        int temp = 0;
      
        while(!sorted){
          
          // randomize arr
            for(int i = 0; i < arr.length; i++){
                randIndex = random.nextInt(arr.length - 1);
                temp = arr[randIndex];
                arr[randIndex] = arr[i];
                arr[i] = temp;
            }
          
          //check if sorted
            boolean yes = true;
            for(int n = 1; n < arr.length; n++) {
                if(arr[n] < arr[n-1]){yes = false; break;}
            }
            if(yes) sorted = true;
          
        }
      
        return arr;
    }

}

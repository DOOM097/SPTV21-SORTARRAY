
package sptv21task4yevheniinemchenko;

import java.util.Arrays;

public class SPTV21Task4YevheniiNemchenko {

    public static void main(String[] args) {
        int sum = 0;
        int[] number = new int[100];
        for(int i = 0; i < number.length; i++){
            while(true){
                int random = (int)Math.round(Math.random() * 100);
                if(random%2 != 0){
                    number[i] = random;
                    sum += random;
                    break;
                }

            }
        }
        Arrays.sort(number);
        for (int s = 0; s < 10; s++){
            for (int v =0; v < 10; v++){
                System.out.print(number[s * 10 + v]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("Среднее арифметическое: " + sum/100);
        }
       
    }
    
}

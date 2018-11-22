
import org.apache.commons.lang.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String args[])
    {
        System.out.println(createTime(0,1,3,3,5,4));
    }
    public static String createTime(int A, int B, int C, int D, int E, int F) {
        // write your code in Java SE 8
        int[] numbers = {A, B, C, D, E, F};
        String time="";
        int _H = 0;
        int H_ = 0;
        int _M = 0,M_=0;
        int S_ = 0,_S = 0;
        Arrays.sort(numbers);
        /*
        * HH
        * _H denotes unit place
        * H_ denotes tens place
        * */
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0 && numbers[i] < 3) {
                System.out.println(numbers[i]);
                _H = numbers[i];
                numbers = ArrayUtils.removeElement(numbers, numbers[i]);
                break;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if(_H>=0 && _H<2)
            {
                if (numbers[i] >= 0 && numbers[i] < 9) {
                    H_ = numbers[i];
                    numbers = ArrayUtils.removeElement(numbers, numbers[i]);
                    break;
                }
            }
            else if (_H>1){
                if (numbers[i] >= 0 && numbers[i] <=4) {
                    H_ = numbers[i];
                    numbers = ArrayUtils.removeElement(numbers, numbers[i]);
                    break;
                }
            }
        }
        /*
        * MM
        * _M denotes unit place
        * M_ denotes tens place
        * */
        for(int i=0; i < numbers.length; i++) {
                if (numbers[i] >= 0 && numbers[i] <=5) {
                    _M = numbers[i];
                    numbers = ArrayUtils.removeElement(numbers, numbers[i]);
                    break;
                }
        }
        for(int i=0; i < numbers.length; i++) {
            if( _M>=0 && _M<=5){
                if (numbers[i] >= 0 && numbers[i] <=9) {
                    M_ = numbers[i];
                    numbers = ArrayUtils.removeElement(numbers, numbers[i]);
                    break;
                }
            }
        }

        /*
        * SS
        * _S denotes unit place
        * S_ denotes tens place
        * */
        for(int i=0; i < numbers.length; i++) {
            if (numbers[i] >= 0 && numbers[i] <=5) {
                _S = numbers[i];
                numbers = ArrayUtils.removeElement(numbers, numbers[i]);
                break;
            }
        }
        for(int i=0; i < numbers.length; i++) {
            if( _S>=0 && _S<=5){
                if (numbers[i] >= 0 && numbers[i] <=9) {
                    S_ = numbers[i];
                    numbers = ArrayUtils.removeElement(numbers, numbers[i]);
                    break;
                }
            }
        }
        String finalTime = String.valueOf(_H) + String.valueOf(H_)+ ":" + String.valueOf(_M) + String.valueOf(M_)+":"+ String.valueOf(_S) + String.valueOf(S_);
        return finalTime;
    }
}

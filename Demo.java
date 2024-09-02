
/**
 * Math.random demo
 *
 * @author (Rachit)
 * @version (10/2/23)
 */
public class Demo
{
    public static int randomNumberInRange(int min, int max){
        int answer=(int) (Math.random()*((max-min)+1))+min;
        return answer;
    }
    public static void main(String[]args){
        for(int i=0; i<10; i++){
            System.out.println(randomNumberInRange(1, 6));   
        }
        for(int i=0; i<10; i++){
            System.out.println(randomNumberInRange(5, 9));   
        }
        for(int i=0; i<10; i++){
            System.out.println(randomNumberInRange(-7, 3));   
        }
    }
}

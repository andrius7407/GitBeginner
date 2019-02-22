import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ArrOfPersons {
	
	public static void main(String[] args) {
		
		Person1[] person1 = new Person1[10];
		
		for(int i = 0; i < 10; i++){
			int randomNum = ThreadLocalRandom.current().nextInt(13, 79);
			String randomName = generateRandomString();
			person1[i] = new Person1(randomNum, randomName);
			
			System.out.println(randomNum + " " + randomName);
		}
	}
	
	public static String generateRandomString() {
  
		
	}
}
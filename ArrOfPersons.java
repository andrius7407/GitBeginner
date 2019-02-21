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
  
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 5;
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++) {
			int randomLimitedInt = leftLimit + (int) 
			  (random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomLimitedInt);
		}
		String generatedString = buffer.toString();
		return generatedString;
		//System.out.println(generatedString);
	}
}
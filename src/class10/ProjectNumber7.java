package class10;

public class ProjectNumber7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenNumber=3;
		boolean isPrime=true;
		if(givenNumber>1) {
			for(int i=2; i<givenNumber; i++) {
				if (givenNumber%i==0) {
					isPrime=false;
				}
			}
		}else {
			isPrime=false;
		}
		System.out.println("Is "+givenNumber+" is prime :"+isPrime);

	}

}

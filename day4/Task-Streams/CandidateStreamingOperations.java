package StreamAPI.casestudy;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CandidateStreamingOperations {


	private static List<Candidate> candidateList;
	
	static {
		candidateList = new ArrayList<>();
		candidateList.add(new Candidate("Ramesh","Java","Pune",5));
		candidateList.add(new Candidate("Raman","Java","Banglore",4));
		candidateList.add(new Candidate("Soumya","C#","Pune",11));
		candidateList.add(new Candidate("Raghu","Java","Chennai",3));
		candidateList.add(new Candidate("Pramod","Java","Mumbai",1));
		candidateList.add(new Candidate("Trisha","C#","Pune",0));
		candidateList.add(new Candidate("Nandan","C++","Chennai",0));
		candidateList.add(new Candidate("Jeevan","Java","Mumbai",1));
		candidateList.add(new Candidate("Priya","Java","Banglore",11));
		candidateList.add(new Candidate("Priyanka","C++","Chennai",4));
	}
	public static void main(String[] args) {
	
		//list candidate names from Pune city
		System.out.println("List of Pune Candidates:");
		
		//list fresher candidates
		System.out.println("Fresher Candidate list");
		
		
		//listing candidates with highest experience
		//first find out the highest years of experience value
	
		//sort the candidates by their years of experience
	
		System.out.println("Sorted List of Candidates by Experience");
		//create a comparable lambda which we will use for sorting
		
		System.out.println("Sorted List of Candidates by tech ");
		
		System.out.println("Sorted List of Candidates by City Name");
				
	}

	
}

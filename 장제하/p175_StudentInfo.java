package ¿Â¡¶«œ;

public class p175_StudentInfo {
	
	public static void main(String[] args) {
		
		int korSum=0, engSum=0, mathSum=0;
		
		double totalSum = 0.0, korAvg, engAvg, mathAvg, totalAvg;
		
		
		Student [] students = new Student[3];
		students[0]=new Student();
		students[0].setInfo("bmkim1",2016001,70,80,90);
		students[1]=new Student();
		students[1].setInfo("bmkim2",2016002,60,70,80);
		students[2]=new Student();
		students[2].setInfo("bmkim3",2016003,50,60,70);
			
		for(int i=0; i<3; i++) {
			System.out.println(students[i].getInfo());
			korSum += students[i].kor;
			engSum += students[i].eng;
			mathSum += students[i].math;
			totalSum += students[i].getAverage();
		}
		
		korAvg = korSum/3.0;
		engAvg = engSum/3.0;
		mathAvg = mathSum/3.0;
		
		totalAvg = totalSum/3.0;
		
		System.out.println("±πæÓ ∆Ú±’ : "+korAvg);
		System.out.println("øµæÓ ∆Ú±’ : "+engAvg);
		System.out.println("ºˆ«– ∆Ú±’ : "+mathAvg);
		System.out.println("¿¸√º ∆Ú±’ : "+totalAvg);
		
		}
	
}

class Student {
	String sname;
	int sid, kor, eng, math;
	
	void setInfo(String name, int id, int k, int e, int m) {
		sname = name; sid =id; kor=k; eng=e; math =m;
	}
	
	double getAverage() { return(kor+eng+math)/3.0;}
	String getInfo() {return sname+","+sid+","+kor+","+eng+","+math;}
}

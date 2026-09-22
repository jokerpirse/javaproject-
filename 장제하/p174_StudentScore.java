package 장제하;

public class p174_StudentScore {
	String sname;
	int sid, kor, eng, math;
	
	void setInfo(String name, int id, int k, int e, int m) {
		sname = name; sid = id; kor = k; eng=e; math=m;
	}
	double getAverage() { return (kor+eng+math)/3.0;}
	// /는 적어도 한 쪽이 실수의 형태를 가지고 있어야 return값이 실수로 나온다.
	String getInfo() {return sname + ","+sid+","+kor+","+eng+","+math;}
	
	
	
	public static void main(String[] args) {
	int korSum=0, engSum=0, mathSum=0;
	
	double totalSum = 0.0, korAvg, engAvg, mathAvg, totalAvg;
	
	
	p174_StudentScore [] students = new p174_StudentScore[3];
	students[0]=new p174_StudentScore();
	students[0].setInfo("bmkim1",2016001,70,80,90);
	students[1]=new p174_StudentScore();
	students[1].setInfo("bmkim2",2016002,60,70,80);
	students[2]=new p174_StudentScore();
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
	System.out.println("국어 평균 : "+korAvg);
	System.out.println("영어 평균 : "+engAvg);
	System.out.println("수학 평균 : "+mathAvg);
	System.out.println("전체 평균 : "+totalAvg);
	
	}
}

package jax.stream;

import java.util.ArrayList;
import java.util.List;

public class DoubleStreamTest {

	public static void main(String[] args) {
		List<Person> people=createPeople();
		double avg=people.stream().
				filter(p->p.getName().contains("X")).
				mapToDouble(p->p.getHeight()).
				average().
				getAsDouble();
		System.out.println("包涵X字的所有人身高平均值："+avg);
	}

	//集合初始化
	static List<Person> createPeople(){
		List<Person> people=new ArrayList();
		Person p =new Person("XXX",Person.Gender.MAN,22,170);
		people.add(p);
		 p =new Person("YYY",Person.Gender.WOMAN,20,167);
		people.add(p);
		 p =new Person("ZZX",Person.Gender.MAN,25,179);
		people.add(p);
		 p =new Person("WWW",Person.Gender.WOMAN,23,186);
		people.add(p);
		return people;
	}
}

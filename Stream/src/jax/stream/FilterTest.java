package jax.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterTest {
	public static void main(String[] args) {
		List<Person> people=createPeople();
		Stream<Person> stream=people.stream().filter(p->p.getGender()==Person.Gender.MAN);;
		stream.forEach(
				p->System.out.println(p.toString())
				);
	}

	//集合初始化
	static List<Person> createPeople(){
		List<Person> people=new ArrayList();
		Person p =new Person("xxx",Person.Gender.MAN,22,170);
		people.add(p);
		 p =new Person("YYY",Person.Gender.WOMAN,20,167);
		people.add(p);
		 p =new Person("ZZZ",Person.Gender.MAN,25,179);
		people.add(p);
		 p =new Person("WWW",Person.Gender.WOMAN,23,186);
		people.add(p);
		return people;
	}
}

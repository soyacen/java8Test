package jax.lambda;

public class CustomLambdaTest {
	
	static interface Action{
		void execute(String content);
	}
	
	public static void main(String[] args) {
		new Action(){
			@Override
			public void execute(String content) {
				System.out.println(content);		
			}}.execute("匿名内部类实现方式，执行登陆操作");
			
		Action login=(String content)->{
			System.out.println(content);
		};
		login.execute("lambda实现方式，执行登陆操作");
			
	}
}

package jax.lambda;

public class LambdaTest {

	public static void main(String[] args) {
		int i=0;
		new Runnable(){
			@Override
			public void run() {
				//i++; //不能直接修改外部的值,i必须为final才能编译通过
				System.out.println("匿名内部类实现Runnable接口,i="+i);	

			}}.run();
			
		int j=0;
		Runnable r=()->{
			//j++; //不能直接修改外部的值,j必须为final才能编译通过
			System.out.println("使用Lambda实现Runnable接口,j="+j);
		};
		r.run();
	}

}

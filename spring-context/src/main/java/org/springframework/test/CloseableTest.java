package org.springframework.test;

/**
 * <p></p>
 *
 * @author mazhenhua
 * @version $ CloseableTest.java 2023/2/23 10:08 mazhenhua $
 **/
public class CloseableTest implements AutoCloseable{

	public void haha(){
		System.out.println("haha");
	}
	public static void main(String[] args) {

		try (CloseableTest t = new CloseableTest()){
			t.haha();
			System.out.println("正常逻辑");
		} catch (Exception e){
			System.out.println("异常");
		}

	}

	@Override
	public void close() throws Exception {
		System.out.println("测试关闭了");
	}
}

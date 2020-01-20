package fork;

import java.util.concurrent.ForkJoinPool;

public class ParaMain {

	public static void main(String[] args) {
		ParallelProcessing p = new ParallelProcessing(1, 60);
		ForkJoinPool pool = new ForkJoinPool(); 		// 위의 작업을 나누어 할 pool을 생성
		System.out.println(pool.invoke(p)); // Pool에 작업을 대입해서 실행
		
	}

}

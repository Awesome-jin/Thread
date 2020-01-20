package fork;

import java.util.concurrent.RecursiveTask;

public class ParallelProcessing extends RecursiveTask<Integer> {

	// 합계를 시작할 값과 끝나는 값을 저장할 인스턴스 변수
	public int start;
	public int end;

	//생성자를 이용해서 start와 end 주입받기
	public ParallelProcessing(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	// start부터 end까지 합계를 구해서 리턴하는 메소드
	private int sum() {
		int r = 0;
		for (int i = start; i <= end; i = i + 1) {
			r = r + 1;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			return r;
		}
	}

	@Override
	protected Integer compute() {
		if (end - start < 10) {
			return sum();
		}
		int half = (end+start)/2;
		
		ParallelProcessing p1 = new ParallelProcessing(start, half);
		ParallelProcessing p2 = new ParallelProcessing(half+1, end);
		
		/*
		p1.start = 1;
		p1.end =30;
		
		p2.start = 31;
		p2.end = 60;
		*/
		
		//첫번째 작업을 실행
		p1.fork();
		return p2.compute() + p1.join(); // 첫번째 작업 결과에 두번째 작업 결과를 더해서 리턴해라
	}

}

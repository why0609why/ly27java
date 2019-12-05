import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    int start;
    int end;

    public MyCallable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    //计算从start到end的和并且返回该和
    @Override
    public Object call() throws Exception {
        Integer sum = 0;

        for (int i=start; i<=end; i++){
            sum+=i;
        }
        return sum;
    }
}

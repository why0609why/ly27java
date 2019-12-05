package 动态代理初体验;

public class StudentDaoImpl implements StudentDao {
    @Override
    public void add() {
        System.out.println("增加");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }

    @Override
    public void update() {
        System.out.println("更新");
    }

    @Override
    public void find() {
        System.out.println("查询");
    }
}

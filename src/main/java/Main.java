import dao.ParentDao;
import dao.ParentDaoSimpleJdbcImpl;
import models.Parent;
import service.ParentService;
import service.ParentServiceImpl;

/**
 * Created by Роберт on 03.04.2017.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ParentDao parentDao = new ParentDaoSimpleJdbcImpl();
        ParentService service = new ParentServiceImpl(parentDao);

        System.out.println(service.isRegistered("Anya"));


    }
}

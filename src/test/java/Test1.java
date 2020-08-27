import org.junit.Test;
import org.springframework.util.DigestUtils;

public class Test1 {
    @Test
    public  void test(){
        String md5Password = DigestUtils.md5DigestAsHex("123456".getBytes());
        System.out.println(md5Password);
    }
}

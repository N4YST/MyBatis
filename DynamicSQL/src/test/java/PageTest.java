import com.github.pagehelper.PageHelper;
import com.nayst.mapper.DynamicMapper;
import com.nayst.pojo.Emp;
import com.nayst.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Date: 2023/4/16
 * Author: Administrator
 * Description:
 */
public class PageTest {
    @Test
    public void page() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);

        PageHelper.startPage(1,4);
        List<Emp> list = mapper.getEmp();
        list.forEach(System.out::println);
    }
}

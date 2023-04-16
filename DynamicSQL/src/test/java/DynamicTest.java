import com.nayst.mapper.DynamicMapper;
import com.nayst.pojo.Emp;
import com.nayst.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Date: 2023/4/16
 * Author: Administrator
 * Description:
 */
public class DynamicTest {
    @Test
    public void getEmyByCondition() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);

        Emp emp = new Emp(null, "", null, "male");
        List<Emp> list = mapper.getEmpByCondition(emp);
        list.forEach(System.out::println);
    }
    @Test
    public void getEmpByChoose() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);

        Emp emp = new Emp(null, "", null, "male");
        List<Emp> list = mapper.getEmpByChoose(emp);
        list.forEach(System.out::println);
    }
    @Test
    public void insertMoreEmp() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);

        Emp emp1 = new Emp(null, "test1", null, "male");
        Emp emp2 = new Emp(null, "test2", null, "male");
        Emp emp3 = new Emp(null, "test3", null, "male");
        List<Emp> empList = Arrays.asList(emp1, emp2, emp3);
        mapper.insertMoreEmp(empList);
    }
    @Test
    public void deleteMoreEmp() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);

        Integer[] empIds = new Integer[]{5, 6, 7};
        mapper.deleteMoreEmp(empIds);
    }

}

import com.nayst.mapper.DeptMapper;
import com.nayst.mapper.EmpMapper;
import com.nayst.pojo.Dept;
import com.nayst.pojo.Emp;
import com.nayst.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


/**
 * Date: 2023/4/15
 * Author: Administrator
 * Description:
 */
public class ResultMapTest {
    @Test
    public void getEmpByEmpId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        Emp emp = mapper.getEmpByEmpId(1);
        System.out.println(emp);
    }
    @Test
    public void getEmpAndDeptByEmpId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        Emp emp = mapper.getEmpAndDeptByEmpId(1);
        System.out.println(emp);
    }

    @Test
    public void getEmpAndDeptByStep() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        Emp emp = mapper.getEmpAndDeptByEmpIdByStepOne(2);
        System.out.println(emp.getEmpName());
    }

    @Test
    public void getDeptAndEmpByDeptId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);

        Dept dept = mapper.getDeptAndEmpByDeptId(1);
        System.out.println(dept);
    }

    @Test
    public void getDeptAndEmpByStep() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);

        Dept dept = mapper.getDeptAndEmpByDeptIdByStepOne(1);
        System.out.println(dept);
    }
}

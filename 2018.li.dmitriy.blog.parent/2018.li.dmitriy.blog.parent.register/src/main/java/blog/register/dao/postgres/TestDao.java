package blog.register.dao.postgres;

import org.apache.ibatis.annotations.Select;

public interface TestDao {
    @Select("select text from test_table")
    String getAuthText();
}

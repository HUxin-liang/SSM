package mapper;

import annotation.MyBatisDao;
import pojo.Category;

import java.util.List;

@MyBatisDao
public interface CategoryMapper {

    public int add(Category category);

    public void delete(int id);

    public Category get(int id);

    public int update(Category category);

    public List<Category> list();

    public int count();
}

package demo.dao.impl;

import demo.dao.StudentDao;
import demo.model.Student;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 7/14/17 10:47
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public void create(Student student) {
        sqlSession.insert("student.create", student);
    }

    @Override
    public Student query(Student student) {
        return null;
    }

    @Override
    public List<Student> queryAll() {
        return sqlSession.selectList("student.queryAll");
    }

    @Override
    public Student queryById(int id) {
        return sqlSession.selectOne("student.queryById", id);
    }

    @Override
    public void modify(Student student) {
        sqlSession.update("student.modify", student);
    }

    @Override
    public void remove(int id) {
        sqlSession.delete("student.remove", id);
    }
}

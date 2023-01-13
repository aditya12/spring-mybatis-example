package cn.itcast.ssm.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import cn.itcast.ssm.po.User;

/**
 * 
 * <p>Title: UserDaoImpl</p>
 * <p>Description:dao接口实现类</p>
 * <p>Company: www.itcast.com</p>
 * 
 * @author 传智.燕青
 * @date 2015-4-22下午2:47:17
 * @version 1.0
 */
@Component
public class UserDaoImpl  implements UserDao {
	 private final SqlSession sqlSession;

	  public UserDaoImpl(SqlSession sqlSession) {
	    this.sqlSession = sqlSession;
	  }
	@Override
	public User findUserById(int id) throws Exception {
		//继承SqlSessionDaoSupport，通过this.getSqlSession()得到sqlSessoin
		//SqlSession sqlSession = this.getSqlSession();

		User user = this.sqlSession.selectOne("findUserById", id);

		return user;

	}
	
	


}

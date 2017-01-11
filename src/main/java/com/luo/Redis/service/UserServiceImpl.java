package com.luo.Redis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.luo.Redis.dao.UserDao;
import com.luo.Redis.model.Article;
import com.luo.Redis.model.User;

@Service("userService")

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao UserDao;
	@Override
	public List<User> selectAllUsers() {
		return UserDao.selectAllUsers();
	}
	@Cacheable(value="User",key="'selectUserByID_'+#id")
	@Override
	public User selectUserByID(int id) {
		System.out.println("进入数据库查询数据");
		return UserDao.selectUserByID(id);
	}
   
	@Override
	public List<User> selectUsers(String userName) {
		return UserDao.selectUsers(userName);
	}

	@Override
	public void addUser(User user) {
		UserDao.addUser(user);

	}
    
	@Override
	public void updateUser(User user) {
		UserDao.updateUser(user);
	}
	@Override
	public void deleteUser(int id) {
		UserDao.deleteUser(id);
	}

	@Override
	public List<Article> getUserArticles(int id) {
		return UserDao.getUserArticles(id);
	}

}

package com.luo.Redis.service;

import java.util.List;

import com.luo.Redis.model.Article;
import com.luo.Redis.model.User;

/**
 * User数据库操作服务类
 * 
 * @author admin
 *
 */
public interface UserService {
	public List<User> selectAllUsers();

	public User selectUserByID(int id);

	public List<User> selectUsers(String userName);

	public void addUser(User user);

	public void updateUser(User user);

	public void deleteUser(int id);

	public List<Article> getUserArticles(int id);
}

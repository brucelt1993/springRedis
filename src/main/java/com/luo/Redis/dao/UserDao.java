package com.luo.Redis.dao;

import java.util.List;

import com.luo.Redis.model.Article;
import com.luo.Redis.model.User;

public interface UserDao {
	public List<User> selectAllUsers();

	public User selectUserByID(int id);

	public List<User> selectUsers(String userName);

	public void addUser(User user);

	public void updateUser(User user);

	public void deleteUser(int id);

	public List<Article> getUserArticles(int id);
}

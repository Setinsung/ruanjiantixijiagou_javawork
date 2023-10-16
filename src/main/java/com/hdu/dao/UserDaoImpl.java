package com.hdu.dao;

import java.sql.*;

import com.hdu.common.DbUtil;
import com.hdu.pojo.User;

public class UserDaoImpl implements UserDao {
    private Connection conn;

    public UserDaoImpl() {
    }

    @Override
    public boolean addUser(User user) {
        this.conn = DbUtil.getConnection("root", "1q2w3e4r", "db1");
        String sql = "insert into user(id,username,password) values(?,?,?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, user.getId());
            pstmt.setString(2, user.getUsername());
            pstmt.setString(3, user.getPassword());
            int rs = pstmt.executeUpdate();
            return rs > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            closeConn();
        }
    }

    @Override
    public User findUserByUsername(String username) {
        this.conn = DbUtil.getConnection("root", "1q2w3e4r", "db1");
        String sql = "select * from user where username = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String uname = rs.getString("username");
                String pwd = rs.getString("password");
                return new User(id, uname, pwd);
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            closeConn();
        }
    }

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        this.conn = DbUtil.getConnection("root", "1q2w3e4r", "db1");
        String sql = "select * from user where username = ? and password = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String uname = rs.getString("username");
                String pwd = rs.getString("password");
                return new User(id, uname, pwd);
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            closeConn();
        }
    }

    private void closeConn() {
        DbUtil.closeConnection(conn);
    }

}

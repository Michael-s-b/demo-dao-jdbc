package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class DepartmentDaoJDBC implements DepartmentDao {
    private Connection conn;

    public DepartmentDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Department obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public void update(Department obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void deleteById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public Department findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * from Department " +
                    "WHERE Id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Department dep = instantiateDepartment(rs);
                return dep;
            }
        } catch (Exception e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }
        return null;
    }

    private Department instantiateDepartment(ResultSet rs) throws SQLException {
        Department dep = new Department();
        dep.setId(rs.getInt("Id"));
        dep.setName(rs.getString("Name"));
        return dep;
    }

    @Override
    public List<Department> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        ArrayList<Department> list = new ArrayList<>();
        try {
            st = conn.prepareStatement("select * from Department");
            rs = st.executeQuery();
            while (rs.next()) {
                list.add(instantiateDepartment(rs));
            }
            return list;
        } catch (Exception e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }
    }

}

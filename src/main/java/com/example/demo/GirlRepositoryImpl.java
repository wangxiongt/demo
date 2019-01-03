package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class GirlRepositoryImpl implements GirlRepository{

	@Autowired private JdbcTemplate jdbc;
	
	@Override
	public List<Emp> findOne(Integer id){
		List<Emp> row =  jdbc.query("select sal,rownum from emp", new RowMapper(){
			@Override
			public Emp mapRow(ResultSet resultset,int i) throws SQLException{
				Emp emp = new Emp();
//				emp.setComm(resultset.getInt("comm"));
//				emp.setEmpno(resultset.getInt("empno"));
//				emp.setEname(resultset.getString("ename"));
//				emp.setJob(resultset.getString("job"));
//				emp.setEgr(resultset.getInt("mgr"));
//				emp.setHiredate(resultset.getDate("hiredate"));
				emp.setSal(resultset.getInt("sal"));
//				emp.setDeptno(resultset.getInt("deptno"));
				emp.setRownum(resultset.getInt("rownum"));
				return emp;
			}
		});
		return row;
	}
	
//	@Override
//	public Emp findOne(Integer id){
//		return (Emp) jdbc.queryForObject("select * from emp where empno = ? ", new RowMapper(){
//			@Override
//			public Emp mapRow(ResultSet resultset,int i) throws SQLException{
//				Emp emp = new Emp();
//				emp.setComm(resultset.getInt("comm"));
//				emp.setEmpno(resultset.getInt("empno"));
//				emp.setEname(resultset.getString("ename"));
//				emp.setJob(resultset.getString("job"));
//				emp.setEgr(resultset.getInt("mgr"));
//				emp.setHiredate(resultset.getDate("hiredate"));
//				emp.setSal(resultset.getInt("sal"));
//				emp.setDeptno(resultset.getInt("deptno"));
//				return emp;
//			}
//		},id);
//	}

}

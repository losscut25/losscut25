package db2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmpDAO {
	Connection conn = null;
	PreparedStatement stmt = null;
	
	public void insertDept(Connection conn, String ename, String job, int sal, int comm) {
		String sql = "insert into emp(empno,ename,job,sal,comm) "
				+ "values(sequence_empno.NEXTVAL,?,?,?,?)";
		//3.객체준비
				try {
					stmt = conn.prepareStatement(sql);
				} catch (SQLException e1) {
					System.out.println("객체관련 에러발생="+e1);
					e1.printStackTrace();
				}
				
				//4.쿼리실행
				try {
					stmt.setString(1,ename);
					stmt.setString(2,job);
					stmt.setInt(3,sal);
					stmt.setInt(4,comm);
					int cnt = stmt.executeUpdate();
					if(cnt>0) {
						System.out.println("쿼리실행성공="+cnt);
					}
				} catch (SQLException e1) {
					System.out.println("executeUpdate()실행관련 에러발생");
					e1.printStackTrace();
				}
				finally {
					
					JDBCUtil.close(stmt);				
				}	
	}
	//수정
	public void updateDept(Connection conn, String ename, String job, int sal, int comm, int empno) {
		String sql = "update dept " 
				+ "set ename=?, job=?, sal=?, comm=? "
				+ "where empno=?";
		try {
			stmt= conn.prepareStatement(sql);
		} catch (SQLException e1) {
			System.out.println("객체관련 에러발생");
			e1.printStackTrace();
		}
		try {
			stmt.setString(1, ename);
			stmt.setString(2, job);
			stmt.setInt(3, sal);
			stmt.setInt(4, comm);
			int cnt = stmt.executeUpdate();
			if(cnt>0) {
				System.out.println("4. 쿼리실행성공");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}finally {
			
			JDBCUtil.close(stmt);				
		}

	}
	//삭제
	public void deleteDept(Connection conn, int empno) {
		String sql = "delete from emp " 
				+ "where deptno=?";
		try {
			stmt= conn.prepareStatement(sql);
		} catch (SQLException e1) {
			System.out.println("객체관련 에러발생");
			e1.printStackTrace();
		}
		try {
			stmt.setInt(1, empno);
			int cnt = stmt.executeUpdate();
			if(cnt>0) {
				System.out.println("4. 쿼리실행성공");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		JDBCUtil.close(stmt);				
	}
	//상세조회
	//부서번호에 따른 상세조회
	// connection conn : 커넥션 객체
	// int dno : 조회하고 싶은 부서번호
	// 리턴유형 DeptDTO : 부서정보
	
	public EmpDTO getEmpno(Connection conn, int empno) {
		ResultSet rs = null;
		EmpDTO empDTO = null; // select 결과를 행 단위로 출력
		String sql = "select empno, ename, job, mgr, hiredate, sal, comm, deptno "
				   + "from emp "
				   + "where empno=?";
		//3.객체준비
		try {
			stmt = conn.prepareStatement(sql);
		} catch (SQLException e1) {
			System.out.println("객체관련 에러발생="+e1);
			e1.printStackTrace();
		}
		
		//4.쿼리실행
		try {
			stmt.setInt(1, empno);
			rs = stmt.executeQuery();
			System.out.println("직원번호\t\t직원명\t\t직업\t\tmgr\t\t날짜\t\t임금\t\t보너스\t\t부서번호");
			System.out.println("-----------------------------");
			if(rs.next()==false) {
				System.out.println(empno + "번 사원이 존재하지 않습니다.");
			//select결과가 존재하면
				//컬럼에 접근해 값을 가져와 변수에 저장
			    int e_no = rs.getInt("empno");
			    String e_name = rs.getString("ename");
			    String work = rs.getString("job");
			    int mgr = rs.getInt("mgr");
			    Date hd = rs.getDate("hiredate");
			    int sale = rs.getInt("sal");
			    int com = rs.getInt("comm");
			    int dno = rs.getInt("deptno");
			    empDTO = new EmpDTO(e_no, e_name, work, mgr, hd, sale, com, dno);
			    System.out.printf("%5d\t %14s\t %13s\t %5d\t %10s\t %5d\t %5d\t %5d\r\n",
			            e_no, e_name, work, mgr, hd, sale, com, dno);
			}
		} catch (SQLException e1) {
			System.out.println("executeUpdate()실행관련 에러발생");
			e1.printStackTrace();
		}finally {
			
			JDBCUtil.close(rs);				
			JDBCUtil.close(stmt);				
		}

		return empDTO;
	}
	//부서명 목록조회
//		public List<String> getDeptNameList(Connection conn) {
//			List<String> list = new ArrayList<String>(); //부서목록을 저장할 변수선언 및 초기화
// 			PreparedStatement stmt = null;
//			ResultSet rs = null;
//			String sql = "select dname "
//					+ "from dept "
//					+ "order by dname asc";
//					try {
//						stmt = conn.prepareStatement(sql);
//					} catch (SQLException e1) {
//						System.out.println("객체관련 에러발생="+e1);
//						e1.printStackTrace();
//					}
//			try {
//				rs = stmt.executeQuery();
//				//select결과가 존재하는 동안
//				while(rs.next()) {
//					//컬럼에 접근해 값을 가져와 변수에 저장
//					list.add(rs.getString("dname"));
//				} 
//			} catch (SQLException e1) {
//				System.out.println("executeUpdate()실행관련 에러발생");
//				e1.printStackTrace();
//			}
//			finally {
//				JDBCUtil.close(rs);				
//				JDBCUtil.close(stmt);				
//			}
//			return list;
//		}
//		
//		//부서명 목록조회
//		public List<DeptDTO> getDeptList(Connection conn) {
//			List<DeptDTO> list = new ArrayList<DeptDTO>(); //부서목록을 저장할 변수선언 및 초기화
// 			PreparedStatement stmt = null;
//			ResultSet rs = null;
//			String sql = "select * "
//					+ "from dept "
//					+ "order by deptno asc";
//					try {
//						stmt = conn.prepareStatement(sql);
//					} catch (SQLException e1) {
//						System.out.println("객체관련 에러발생="+e1);
//						e1.printStackTrace();
//					}
//			try {
//				rs = stmt.executeQuery();
//				
//				while(rs.next()) { //select결과가 있으면
//					//컬럼에 접근해 값을 가져와 DeptDTO 객체를 생성하여-> 목록에 추가
//					//칼럼에 접근하여 값을 가져와 변수에 저장
//					int deptno = rs.getInt("deptno");
//					String dname = rs.getString("dname");
//					String loc = rs.getString("loc");
//					
//					//변수에 저장된 값을 이용하여 DeptDTO 객체를 생성
//					DeptDTO deptDTO = new DeptDTO(deptno, dname, loc);
//					list.add(deptDTO);
//				} 
//			} catch (SQLException e1) {
//				System.out.println("executeUpdate()실행관련 에러발생");
//				e1.printStackTrace();
//			}finally {
//				JDBCUtil.close(rs);				
//				JDBCUtil.close(stmt);				
//			}
//			return list;
//		}
}

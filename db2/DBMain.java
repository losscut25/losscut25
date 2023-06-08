package db2;

import java.sql.Connection;
import java.util.List;

public class DBMain {

	public static void main(String[] args) {
		//1. JDBC driver등록, 연결
		JDBCUtil jd = new JDBCUtil();
		Connection conn = jd.getConnection();
		//DAO생성자 불러오기 -> 각 기능사용
		EmpDAO empdao = new EmpDAO();
		//입력
//		empdao.insertDept(conn, "hong", "thief", 2000, 100);
		//수정
//		empdao.updateDept(conn, "홍자단", "도적", 3000, 10, 9001);
		//삭제
//		empdao.deleteDept(conn, 9001); 
		//상세조회
		empdao.getEmpno(conn, 9001);
		
		
//		//사원번호 상세조회
//		System.out.println("상세조회");
//		EmpDTO empDTO = empdao.getEmpno(conn, 9001);
//		if(empDTO!=null) {
//			empDTO.getEmpno();
//			empDTO.getEname();
//			empDTO.getJob();
//			empDTO.getMgr();
//			empDTO.getHiredate();
//			empDTO.getSal();
//			empDTO.getComm();
//			empDTO.getDeptno();
//		} else {
//			System.out.println("직원이 존재하지 않습니다.");
//		}
		//부서명목록조회
//		System.out.println();
//		System.out.println("----------부서명 목록조회 결과-------------");
//		List<String> list = empdao.getDeptNameList(conn);
//		for(String dname : list) {
//			System.out.println(dname);
//		}		
//		for(int i = 0; i<list.size(); i++) {
//			String dname = list.get(i);
//			System.out.println(dname);
//		}
		//모든부서조회
//		System.out.println();
//		System.out.println("----------모든부서조회-------------");
//		List<DeptDTO> list2 = deptdao.getDeptList(conn);
//		if(list2.size()>0) {
//			System.out.println("부서번호\t\t부서명\t\t위치");
//			System.out.println("-----------------------------");
//		for(DeptDTO dto : list2) {
//			System.out.println(dto.toString()); // 오버라이딩 된 toStirng()호출
//			System.out.println(dto); // 주소출력
//				System.out.printf("%5d\t %14s\t %13s\r\n",
//				dto.getDeptno(),
//				dto.getDname(),
//				dto.getLoc());
//				}
//		} else {
//			System.out.println("부서가 존재하지 않습니다.");	
//		}
		//5. conn자원반납
		JDBCUtil.close(conn);
	}

}

package Chapter08.study02;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("Orcale DB에서 검색"); 
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Orcale DB에서 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Orcale DB에서 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Orcale DB에서 삭제");
	}

}

package bookapp;

public class BookDAo {

	Details det = new Details();

	public void add(Details det) {
		String query = "insert into bookdetails (price,name) Values(?,?)";
		Object[] params = { det.getPrice(), det.getName() };
		ConnitionUtil.getJdbcTemplate().update(query, params);

	}

}

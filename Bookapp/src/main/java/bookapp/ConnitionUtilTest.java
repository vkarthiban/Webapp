package bookapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConnitionUtilTest {
	
	 ConnitionUtil con=new ConnitionUtil();
	
@Test
	public void testGetJdbcTemplate()
	{
		System.out.println(con.getJdbcTemplate());
	}

}

import java.sql.*;

class DatabaseDemo {
	public static final String DB_NAME = "test_java.db";
	public static final String TABLE_CONTACTS = "contacts";
	public static final String COLUMN_NAME = "name";
	public static final String COLUMN_PHONE = "phone";
	public static final String COLUMN_EMAIL = "email";

	public static final String CONNECTION_STRING = "jdbc:sqlite:" + DB_NAME;

	public static void main(String[] args) {
		try(Connection conn = DriverManager.getConnection(CONNECTION_STRING)) {

			Statement stmt = conn.createStatement();

			//Create TABLE table_name(COLUMN1 DATATYPE,.. )

			stmt.execute("CREATE TABLE IF NOT EXISTS " +
							TABLE_CONTACTS + "(" + 
							COLUMN_NAME + " TEXT, " +
							COLUMN_EMAIL + " TEXT, " + 
							COLUMN_PHONE + " TEXT )" 
						 );

			insertContact(stmt, "John Doe", "john@gmail.com", "9820098200");

			ResultSet results = stmt.executeQuery("SELECT * FROM " + TABLE_CONTACTS);

			while(results.next()) {
				System.out.println("=========================================");
				System.out.println(COLUMN_NAME + " : " + results.getString(1));
				System.out.println(COLUMN_EMAIL + " : " + results.getString(COLUMN_EMAIL));
				System.out.println(COLUMN_PHONE + " : " + results.getString(COLUMN_PHONE));
			}

			//conn.close();  //Closeable
		} catch(SQLException e) {
			System.out.println("Caught : " + e);
		}
	}

	private static void insertContact(Statement stmt, String name, String email, String phone) throws SQLException {
		stmt.execute("INSERT INTO " + TABLE_CONTACTS + 
						"(" + COLUMN_NAME + ", " +
							COLUMN_PHONE + ", " + 
							COLUMN_EMAIL + ") VALUES" + 
							"('" + name + "', '" + phone + "', '" + email + "')"
					);
	}
}
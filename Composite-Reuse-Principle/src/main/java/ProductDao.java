public class ProductDao {
    private DBConnection dbConnection;

    public ProductDao(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String connection = dbConnection.getConnection();
        System.out.println("使用" + connection + "增加产品");
    }
}

package jdbcpack;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface ItemMasterDao {
    public void addItem(Item item);
    public void updateItem(Item item);
    public Item getItemById(int itemId);
    public void deleteItem(int itemId);
    public List<Item> getAllItems();
}

class ItemMasterDaoImpl implements ItemMasterDao {

    private Connection connection;

    public ItemMasterDaoImpl(Connection connection) {
        this.connection = connection;
    }

/**
 * insert value into table
 * @param type Item
 */
    @Override
    public void addItem(Item item) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO invoice (item_name, price) VALUES (?, ?)"
            );
            statement.setString(1, item.getItemName());
            statement.setDouble(2, item.getPrice());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
/**
 *update the existing item
 * @param type Item
 */
    @Override
    public void updateItem(Item item) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE invoice SET item_name=?, price=? WHERE item_id=?"
            );
            statement.setString(1, item.getItemName());
            statement.setDouble(2, item.getPrice());
            statement.setInt(3, item.getItemId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
/**
 * Select particular row with @param
 *  @param type int (IitemId)
 */
    @Override
    public Item getItemById(int itemId) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM invoice WHERE item_id=?"
            );
            statement.setInt(1, itemId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Item item = new Item();
                item.setItemId(resultSet.getInt("item_id"));
                item.setItemName(resultSet.getString("item_name"));
                item.setPrice(resultSet.getDouble("price"));
                return item;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * Delete particular row with @param
     *  @param type int (IitemId)
     */
    @Override
    public void deleteItem(int itemId) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "DELETE FROM invoice WHERE item_id=?"
            );
            statement.setInt(1, itemId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    /**
     * return all existing items in table
     */
    public List<Item> getAllItems() {
        List<Item> items = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM invoice"
            );
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Item item = new Item();
                item.setItemId(resultSet.getInt("item_id"));
                item.setItemName(resultSet.getString("item_name"));
                item.setPrice(resultSet.getDouble("price"));
                items.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }
}

class Item {
    private int itemId;
    private String itemName;
    private double price;

    public Item() {
    }

    public Item(int itemId, String itemName, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

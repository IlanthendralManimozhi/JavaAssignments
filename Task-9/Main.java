package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
/**
 * 
 * @author ilanthendralmanimozhi
 *
 */
public class Main {
/**
 * Establish connection ,add item and update item and remove item
 * @param args not used
 */
    public static void main(String[] args)  {
       

        try  {
        	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/acedb","root","ThendralM");
        	//connection.getAutoCommit(false);
            ItemMasterDao itemMasterDao = new ItemMasterDaoImpl(connection);

            // Add a new item
            Item newItem = new Item(1, "Item 5", 10.0);
            itemMasterDao.addItem(newItem);

            // Update an existing item
            Item existingItem = itemMasterDao.getItemById(2);
            existingItem.setItemName("Updated Item");
            existingItem.setPrice(20.0);
            itemMasterDao.updateItem(existingItem);

            // Get an item by ID
            Item itemById = itemMasterDao.getItemById(2);
            System.out.println("Item by ID: " + itemById.getItemId() + ", " + itemById.getItemName() + ", " + itemById.getPrice());

            // Delete an item
            itemMasterDao.deleteItem(1);

            // Get all items
            List<Item> allItems = itemMasterDao.getAllItems();
            for (Item item : allItems) {
                System.out.println("All items: " + item.getItemId() + ", " + item.getItemName() + ", " + item.getPrice());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
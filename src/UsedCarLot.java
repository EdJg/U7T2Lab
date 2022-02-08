import java.util.ArrayList;

/**
 * This class represents a Used Car Lot
 *
 * @author Edison Jiang
 */
public class UsedCarLot
{
    /** The Cars included in the car lot */
    private ArrayList<Car> inventory;

    /**
     * Creates a UsedCarLot object and
     * initializes the inventory to an empty ArrayList
     */
    public UsedCarLot()
    {
        inventory = new ArrayList<>();
    }

    /**
     * Returns the inventory of the used car lot(the cars)
     * @return The inventory
     */
    public ArrayList getInventory()
    {
        return inventory;
    }

    /**
     * Adds a Car object to the end of the inventory
     * @param add the added Car
     */
    public void addCar(Car add)
    {
        inventory.add(add);
    }

    /**
     * Swaps the Car at num1 and the Car at num2 in inventory and returns true
     * however, if either num1 or num2 is more than the bounds of the inventory or is negative,
     * nothing changes in the inventory and returns false
     * @param num1 The index of the first Car to swap
     * @param num2 The index of the second Car to swap
     * @return True if the swap was successful, false if the swap was unsuccessful
     */
    public boolean swap(int num1, int num2)
    {
        if (num1 > inventory.size() - 1 || num2 > inventory.size() - 1 || num1 < 0 || num2 < 0)
        {
            return false;
        }
        Car temp = inventory.set(num1, inventory.get(num2));
        inventory.set(num2, temp);
        return true;
    }

    /**
     * Adds a Car, carToAdd, to the index, indexToAdd and increases the size of the inventory by 1
     * <p>
     * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     * @param indexToAdd The index in the inventory to add the new Car
     * @param carToAdd The Car to add
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /**
     * Sells the Car located at the index, indexOfCarToSell, in the inventory,
     * removing it from the inventory, shifting the remaining Cars in the list to the left
     * to fill the gap;
     * the method returns the Car that is sold
     * and reduces the size of inventory by 1
     * @param indexOfCarToSell The index of the Car to sell
     * @return the Car that is sold
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        return inventory.remove(indexOfCarToSell);
    }

    /**
     * Sells the Car located at indexOfCarToSell,
     * but doesn't shift the inventory to the left, instead,
     * it replaces the Car at indexOfCarToSell with NULL,
     * creating an empty parking spot on the lot;
     * this method returns the Car that is being sold,
     * yet it doesn't reduce the size of the inventory
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell The index of the Car to sell
     * @return the Car that is sold
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car temp = inventory.remove(indexOfCarToSell);
        inventory.add(indexOfCarToSell, null);
        return temp;
    }

    /**
     * Moves Car to index, indexOfCarToMove, to index, destinationIndex;
     * if destinationIndex > indexOfCarToMove, moves the Car to the right in
     * inventory; if destinationIndex &lt; indexOfCarToMove, moves the Car to the left
     * in the inventory. The cars in the inventory are shifted accordingly
     * <p>
     * PRECONDITIONS: indexOfCarToMove &lt; inventory.size()
     *                destinationIndex &lt; inventory.size()
     * @param indexOfCarToMove The index of the Car to move
     * @param destinationIndex The index where the Car should be moved
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car temp = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, temp);
    }

    /**
     * Im the best the very best
     */
}

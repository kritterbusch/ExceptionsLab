package lab2;

/**
 * This class provides various services relating to name manipulation. No output
 * should be performed here.
 *
 * @author Kerry Ritterbusch
 * @version 1.00
 */
public class NameService {

    private static final int FIRST_NAME_IDX = 0;
    
    private static final String ERROR_EMPTY_NAME = "The name is empty";
    private static final String ERROR_NULL_NAME = "The name is null";

    /**
     * Finds and returns the last name from within a full name. Caution: No
     * validation is performed.
     *
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     */
    public String extractLastName(String fullName) throws IllegalArgumentException {
        if (fullName == null) {
            throw new IllegalArgumentException(ERROR_NULL_NAME);
        } else if (fullName.isEmpty()) {
            throw new IllegalArgumentException(ERROR_EMPTY_NAME);
        }
        
        String[] nameParts = fullName.split(" ");
        if (nameParts.length == 1) {
            return "";
        }
        return nameParts[nameParts.length - 1];
    }

    /**
     * Finds and returns the first name from within a full name. Caution: No
     * validation is performed.
     *
     * @param fullName - a name containing a first name and a last name
     * @return the first name
     */
    public String extractFirstName(String fullName) {
        String[] nameParts = fullName.split(" ");
        return nameParts[FIRST_NAME_IDX];
    }

    /**
     * Gets the length of a name.
     *
     * @param name - any full name or part of a name.
     * @return the length of the name or part.
     */
    public int getNameLength(String name)throws IllegalArgumentException{
        if (name == null) {
            throw new IllegalArgumentException(ERROR_NULL_NAME);
        }
        return name.length();
    }

}
//throw exceptions back to the class that handles the problems (in this lab, InputOutputGui class)

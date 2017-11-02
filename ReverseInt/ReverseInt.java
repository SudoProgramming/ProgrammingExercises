/**
* Reverses the given 32-bit integer, and returns zero if there is an overflow
*
* @param intToReverse The integer to be reversed
* @return int The reversed 32-bit integer
*/
public static int ReverseInt() {
     // Initalizes the sign and accumulator
    int sign = 1;
    int accumulator = 0;
 
    // Checks if the given input is negative and sets the sign if it is
    if (intToReverse < 0)
    {
        sign = -1;
        intToReverse *= sign;
    }
 
    // Loops until the intToReverse is 0
    while (intToReverse != 0)
    {
        try
        {
            // Gets the last digit, shortens the intToRevere and accumulates the returned value, if the value overflow catches the error and returns
            int lastDigit = intToReverse % 10;
            intToReverse /= 10;
            accumulator = Math.addExact(accumulator * 10, lastDigit);
        }
        catch (ArithmeticException e)
        {
            return 0;
        }
    }
 
    // Returns the the accumulator signed correctly
    return sign * accumulator;
}
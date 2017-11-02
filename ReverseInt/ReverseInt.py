def reverseInt(intToReverse):
  # Initalizes the sign and accumulator
  sign = 1
  accumulator = 0
 
  # Checks if the given input is negative and sets the sign if it is
  if (intToReverse < 0):
    sign = -1
    intToReverse *= sign
 
  # Loops until the intToReverse is 0
  while (intToReverse != 0):
    # Gets the last digit, shortens the intToRevere and accumulates the returned value, if the value overflow catches the error and returns
    lastDigit = intToReverse % 10
    intToReverse //= 10
    accumulator = accumulator * 10 + lastDigit
    if (abs(accumulator) > (2**31 -1)):
      return 0
     
  # Returns the the accumulator signed correctly
  return sign * accumulator
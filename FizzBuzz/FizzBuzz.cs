public static void FizzBuzz(int numberToCheck)
{
    if (numberToCheck % 3 == 0)
    {
        Console.Write("Fizz");
    }

    if (numberToCheck % 5 == 0)
    {
        Console.Write("Buzz");
    }

    Console.WriteLine();
}
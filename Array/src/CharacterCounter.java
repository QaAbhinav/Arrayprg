import java.util.Scanner;


public class CharacterCounter{
	

public static void main(String[] args) {
}

  public static int countOccurrences(String find, String string)
  {
    int count = 0;
    int indexOf = 0;

    while (indexOf > -1)
    {
      indexOf = string.indexOf(find, indexOf + 1);
      if (indexOf > -1)
        count++;
    }

    return count;
  }
}


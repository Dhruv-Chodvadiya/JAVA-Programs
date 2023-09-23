import java.util.Arrays;

public class _015_Remove_duplicate {
    public static void main(String[] args) {
        String name="Dhruvvvu";
        char str[] = name.toCharArray();
        int len = str.length;
        removeDuplicate(str, len);
    }

    static void removeDuplicate(char str[], int length)
    {
        int index = 0;
        for (int i = 0; i < length; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));
    }

}

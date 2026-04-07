public class HollowDiamond
{
    public static void main(String[] args)
    {
        for(int line = 1; line <= 5; line++)
        {
            for(int space = 1; space <= 5 - line; space++)
            {
                System.out.print(" ");
            }

            int width = line + (line - 1);

            for(int ast = 1; ast <= width; ast++)
            {
                if(line == 1 || ast == 1 || ast == width)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for(int line = 4; line >= 1; line--)
        {
            for(int space = 1; space <= 5 - line; space++)
            {
                System.out.print(" ");
            }

            int width = line + (line - 1);

            for(int ast = 1; ast <= width; ast++)
            {
                if(line == 1 || ast == 1 || ast == width)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

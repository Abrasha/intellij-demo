public class Example
{
    public static void main(String[] args)
    {
        Object obj = null;
        obj.hashCode();
    }
}
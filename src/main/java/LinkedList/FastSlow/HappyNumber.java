package LinkedList.FastSlow;

public class HappyNumber {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do
        {
            slow = getNum(slow);
            fast = getNum(getNum(fast));
        }
        while(slow != fast);

        if (slow == 1) return true;

        return false;
    }


    private int getNum(int num)
    {
        int sum = 0;
        int digit = 0;

        while(num != 0)
        {
            digit = num%10;
            sum += digit * digit;
            num = num/10;
        }

        return sum;
    }
}

package PractiseExercise2;

public class PowerOfFour
    {
        public static String powerOfFour(long number)
            {
                long num=number;
                int flag=0;
                if(num>=4)
                {
                    while (num>=4)
                    {
                        if(num%4==0)
                        {
                            num=num/4;
                            flag=1;
                        }
                        else
                        {
                            flag=0;
                            break;
                        }
                    }
                }

                else if(num<4)
                {
                    if (num==1)
                    {
                        flag=1;
                    }
                    else
                    {
                        flag=0;
                    }
                }
                if(flag==0)
                {
                    return ("\n is not a power of 4 \n");
                }
                else
                {
                    return ("\n is a power of 4 \n");
                }



            }
    }

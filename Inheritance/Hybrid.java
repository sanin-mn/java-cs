class Students{
    int rollno;
    void getnumber(int n)
    {
        rollno=n;
    }
    void putnumber()
    {
        System.out.println("Roll number :"+rollno);
    }
}

class Test extends Students{
    float part1,part2;
    void getmarks(float m1,float m2)
    {
        part1=m1;
        part2=m2;
    }
    void putmarks()
    {
        System.out.println("Part 1 :"+part1);
        System.out.println("Part 2 :"+part2);
    }
}

interface Sports{
    float spt=6.0f;
    void putwt();
}

class Result extends Test implements Sports{
    float total;
    public void putwt()
    {
        System.out.println("Sports wt :"+spt);
    }
    void display()
    {
        total = part1+part2+spt;
        putnumber();
        putmarks();
        putwt();
        System.out.println("Total score :"+total);
    }
}

class Hybrid
{
    public static void main (String args[])
    {
        Result std1=new Result();
        std1.getnumber(1);
        std1.getmarks(27.5f,33.0f);
        std1.display();
    }
}
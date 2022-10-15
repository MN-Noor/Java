public class Box{
    double width;
    double height;
    double depth;
    Box(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    double volume()
    {
        return(height*width*depth);
    }
    boolean isequal(Box b)
    {
        if(volume()==b.volume())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean parameters_equal(Box b)
    {
        if((width==b.width)&&(depth==b.depth)&&(height==b.height))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
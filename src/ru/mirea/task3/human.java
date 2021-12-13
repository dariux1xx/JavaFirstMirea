package ru.mirea.task3;

class Human {

    private float Leg;
    private float Head;
    private float Hand;

    public Human( float L, float He, float Ha){
        Leg = L;
        Head = He;
        Hand = Ha;
    }

    public void setLeg ( float L)
    {
        Leg = L;


    }
    public float getLeg ()
    {
        return Leg;
    }

    public void setHead ( float He)
    {
        Head = He;

    }
    public float getHead ()
    {
        return Head;
    }

    public void setHand ( float Ha)
    {
        Hand = Ha;

    }
    public float getHand ()
    {
        return Hand;
    }
}

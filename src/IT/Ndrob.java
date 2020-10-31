package IT;

public class Ndrob {
    private int num ; // числитель
    private int denom;//знаменатель

    //служебные методы ( сеттеры , геттеры , констуркторы и прочие )
    //сеттеры код генерйте метод

    public void setNum(int num) {
        this.num = num;
    }

    public void setDenom(int denom) {
        if (denom!=0)
            this.denom = denom;
        else
            this.denom=1;
    }

    public int getNum() {
        return num;
    }

    public int getDenom() {
        return denom;
    }

    //вычислительные ( методы обработки класса)
    public Ndrob milti (Ndrob secondmn){
        Ndrob rez = new Ndrob();
        rez.num = this.num * secondmn.num;
        rez.denom= this.denom * secondmn.denom;
        return rez;


    }

    // деление
    public Ndrob del (Ndrob seconddel){
        Ndrob rez1 =new Ndrob();
        rez1.num= this.num * seconddel.denom;
        rez1.denom = this.denom* seconddel.num;
        return rez1;
    }

    //поддержка ( обеспечивающие красивую печать )
    public void print(){
        System.out.println(num + "/"+ denom);

    }

    @Override
    public String toString() {
        return num + "/"+ denom;
    }
}

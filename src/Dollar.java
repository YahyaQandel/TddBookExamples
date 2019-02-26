public class Dollar {

    int amount = 0;
    Dollar(int amount){
        this.amount = amount;
    }

    void times(int multiplier){
        this.amount*=multiplier;
    }

    int amount(){
        return amount;
    }
}

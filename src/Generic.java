public class Generic<T,U> {
    T objectT;
    U objectU;

    public Generic(T objectT,U objectU){
   this.objectT =objectT;
   this.objectU = objectU;
    }

    public T getObjectT(){
        return objectT;
    }

    public U getObjectU(){
        return  objectU;
    }
}

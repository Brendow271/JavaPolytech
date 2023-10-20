public class ObjectWrapper <ObjectType> {

    private ObjectType data;

    public ObjectWrapper(ObjectType data) {
        this.data = data;
    }

    public void swap(ObjectWrapper swapObject) {SwapObject(this, swapObject);
    }

    public static void SwapObject(ObjectWrapper firstObject, ObjectWrapper secondObject)
        throws ClassCastException{
        if (firstObject.getData().getClass() == secondObject.getData().getClass()){
            Object dataSaveObject = secondObject.data;
            secondObject.data = firstObject.data;
            firstObject.data = dataSaveObject;
        }
    }

    public ObjectType getData() {return data;}

    public void setData (ObjectType data) {this.data = data;}

}

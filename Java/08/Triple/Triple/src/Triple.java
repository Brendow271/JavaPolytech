public class Triple <DataType extends Comparable <DataType>> {
    private DataType left;
    private DataType middle;
    private DataType right;

    public Triple(DataType left, DataType middle, DataType right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    public DataType min() throws UndefinedComponentException {
        if (left.compareTo(right) == 0) {
            if (middle.compareTo(left) < 0) return middle;
            else throw new UndefinedComponentException("Impossible to determine the smallest Triple component");
        }
        if (left.compareTo(middle) == 0) {
            if (right.compareTo(left) < 0) return right;
            else throw new UndefinedComponentException("Impossible to determine the smallest Triple component");
        }
        if (middle.compareTo(right) == 0) {
            if (left.compareTo(middle) < 0) return left;
            else throw new UndefinedComponentException("Impossible to determine the smallest Triple component");
        }
        if (left.compareTo(middle) < 0) {
            if (left.compareTo(right) < 0) return left;
            else return right;
        } else {
            if (middle.compareTo(right) < 0) return middle;
            else return right;
        }
    }

    public DataType max() throws UndefinedComponentException {
        if (left.compareTo(right) == 0) {
            if (middle.compareTo(left) > 0) return middle;
            else throw new UndefinedComponentException("Impossible to determine the biggest Triple component");
        }
        if (left.compareTo(middle) == 0) {
            if (right.compareTo(left) > 0) return right;
            else throw new UndefinedComponentException("Impossible to determine the biggest Triple component");
        }
        if (middle.compareTo(right) == 0) {
            if (left.compareTo(middle) > 0) return left;
            else throw new UndefinedComponentException("Impossible to determine the biggest Triple component");
        }
        if (left.compareTo(middle) > 0) {
            if (left.compareTo(right) > 0) return left;
            else return right;
        } else {
            if (middle.compareTo(right) > 0) return middle;
            else return right;
        }
    }

    public DataType mean() throws UndefinedComponentException {
        if (left.compareTo(middle) == 0 || middle.compareTo(right) == 0 || left.compareTo(right) == 0)
            throw new UndefinedComponentException("Impossible to determine the mean Triple component");
        if (left.compareTo(middle) > 0) {
            if (left.compareTo(right) < 0) return left;
            else return (middle.compareTo(right) > 0 ? middle : right);
        } else {
            if (middle.compareTo(right) < 0) return middle;
            else return left.compareTo(right) > 0 ? left : right;
        }
    }

    @Override
    public String toString() { return "{ " + left + ", " + middle + ", " + right + '}'; }

    public DataType getLeft() { return left; }
    public DataType getMiddle() { return middle;}
    public DataType getRight() { return right; }

    public void setLeft(DataType left) { this.left = left; }
    public void setMiddle(DataType middle) { this.middle = middle; }
    public void setRight(DataType right) { this.right = right; }
}

class UndefinedComponentException extends Exception {
    public UndefinedComponentException (String message) {
        super(message);
    }
}

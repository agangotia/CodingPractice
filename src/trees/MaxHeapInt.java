package trees;

import java.util.ArrayList;

/**
 * Created by anupam on 6/20/16.
 */
public class MaxHeapInt {
    private ArrayList<Integer> data;

    public MaxHeapInt() {
        data = new ArrayList<>();
    }

    private int returnParentIndex(int a) {
        if (a>1)
            return (a-1)/2;
        else
            return 0;
    }

    private int returnLeftChild(int n) {
        int val = 2*n+1;
        if (val < data.size())
            return val;
        else
            return -1;
    }

    private int returnRightChild(int n) {
        int val = 2*n+2;
        if (val < data.size())
            return val;
        else
            return -1;
    }




    public void addInteger(int a) {
        data.add(a);
        //If no item exist
        if (data.size() == 1)
            return;
        else {
            //TO DO : ADD BALANCE
            int currentIndex = data.size() - 1;
            int childData = a;
            int childIndex = currentIndex;

            int parentIndex = returnParentIndex(childIndex);
            int parentData = data.get(parentIndex);

            while (parentData < childData) {
                data.set(childIndex, parentData);
                data.set(parentIndex, childData);

                if (parentIndex == 0)
                    break;

                childIndex = parentIndex;
                childData = data.get(parentIndex);

                parentIndex = returnParentIndex(childIndex);
                parentData = data.get(parentIndex);

            }

        }
    }

    private int removeInteger() {
        int returnInt = data.get(0);
        if (data.size() == 1 ) {
            data.remove(data.size()-1);
        } else {
            int last = data.get(data.size()-1);
            data.remove(data.size()-1);
            data.set(0,last);

            int current = 0;
            while (true) {
                int swapIndex = 0;
                int childLeft = returnLeftChild(current);
                int childRight = returnRightChild(current);
                if (childLeft!= -1 && childRight!= -1) {
                    int dataLeft = data.get(childLeft);
                    int dataRight = data.get(childRight);
                    swapIndex = (dataLeft > dataRight) ? childLeft : childRight;
                }else if (childLeft == -1 && childRight != -1) {
                    swapIndex = childRight;
                }else if (childRight == -1 && childLeft != -1) {
                    swapIndex = childLeft;
                }

                if(swapIndex!=0) {
                    if (data.get(current) < data.get(swapIndex)) {
                        int temp = data.get(current);
                        data.set(current, data.get(swapIndex));
                        data.set(swapIndex, temp);
                        current = swapIndex;
                    } else
                        break;
                }
                else
                    break;
            }
        }
        return returnInt;
    }

    public void show() {
        int i = 0;
        while (i<data.size()) {
            int leftVal = returnLeftChild(i);
            int rightVal = returnRightChild(i);

            if (leftVal != -1 && rightVal != -1) {
                for (int k=0; k<i;k++)
                    System.out.print("*");
            }

            System.out.print("N"+data.get(i));

            if (leftVal!= -1)
                System.out.print("L" +data.get(leftVal));

            if (rightVal!= -1)
                System.out.print("R" +data.get(rightVal));

            i++;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        MaxHeapInt obj = new MaxHeapInt();
        obj.addInteger(2);
        obj.addInteger(5);
        obj.addInteger(7);
        obj.addInteger(9);
        System.out.println(obj.removeInteger());
        System.out.println(obj.removeInteger());
        System.out.println(obj.removeInteger());
        System.out.println(obj.removeInteger());
        //obj.show();
    }

}

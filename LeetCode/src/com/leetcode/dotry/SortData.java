package com.leetcode.dotry;

/**
 * 排序算法相关
 */
public class SortData {
    public static void main(String[] args) {
        int[] array = new int[]{
                4,5,6,3,2,1
        };
//        bubbleSort(array);
//        insertSort1(array);
        selectedSort(array);
    }

    /**
     * 1.冒泡排序：只会操作两个相邻的数据元素，每次冒泡操作都会比较相邻的两个数据，看是否满足条件，不满足就交换。
     *  一次冒泡会至少让一个元素移动到指定位置，重复n次就完成了n个数据的排序工作。
     *
     * @param array
     */
    public static void bubbleSort(int [] array){
        if (array== null|| array.length==0){
            return;
        }
        int temp;
        for (int i =0;i<array.length;i++){
            for (int j = i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("冒泡排序之后顺序为===");
        for (int i: array) {
            System.out.println(i);
        }
    }

    public static void insertSort(int[] array){
        if (array==null || array.length==0){
            return;
        }
        for (int i = 0; i< array.length;i++){
            int value = array[i];
            int j = i -1;
            for ( ;j>=0; --j){
                if (array[j]>value){
                    array[j+1] =array[j];
                }else {
                    break;
                }
            }
            array[j+1] = value;
        }
        System.out.println("插入排序之后顺序为===");
        for (int i: array) {
            System.out.println(i);
        }
    }

    public  static  void insertSort1(int [] array){
        if (array==null || array.length==0){
            return;
        }
        for (int i =0;i<array.length;i++){
            int value = array[i];
            int j = i -1;
            for (;j>=0;j--){
                if (array[j]>value){
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = value;
        }
        System.out.println("插入排序之后顺序为===");
        for (int i: array) {
            System.out.println(i);
        }

    }

    /**
     * 选择排序
     * @param array
     */
    public static  void selectedSort(int[] array){
        if (array==null || array.length==0){
            return;
        }
        for (int i =0; i <array.length;i++){
            int minIndex = i;
            for (int j =i+1;j<array.length;j++){
                if (array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex!=i){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        System.out.println( "选择排序之后顺序为===");
        for (int i: array) {
            System.out.println(i);
        }

    }
}

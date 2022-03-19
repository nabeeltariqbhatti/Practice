package com.company.threads.executorservices;

import java.util.List;
import java.util.concurrent.RecursiveAction;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/13/2022
 * @Time at 9:19 PM
 */
class DoubleRecursiveAction extends RecursiveAction {

    private  final List<Integer> input;

    DoubleRecursiveAction(List<Integer> input) {
        this.input = input;


    }


    @Override
    protected void compute() {
        if(input.size()<=2){
            input.stream().map(a->2*a).forEach(System.out::println);
        }else{
            List<Integer> list = input.subList(0, input.size() / 2);
            List<Integer> list2 = input.subList(input.size()/ 2, input.size());
            DoubleRecursiveAction t1 = new DoubleRecursiveAction(list);
            DoubleRecursiveAction doubleRecursiveAction = new DoubleRecursiveAction(list2);
            invokeAll(t1,doubleRecursiveAction);

        }
    }
}
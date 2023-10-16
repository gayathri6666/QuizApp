package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO QUIZ APP");
        System.out.println("*********************");
        Question[] question = new Question[3];
        question[0] = new Question();
        question[1] = new Question();
        question[2] = new Question();
        question[0].setQuestion("who is the father of Java");
        question[0].getOptions()[0] = "James Gosling";
        question[0].getOptions()[1] = "James cameron";
        question[0].getOptions()[2] = "James bond";
        question[0].getOptions()[3] = "James clark";
        question[0].setAnswer("1");


        question[1].setQuestion("what is the default value boolean");
        question[1].getOptions()[0] = "true";
        question[1].getOptions()[1] = "false";
        question[1].getOptions()[2] = "null";
        question[1].getOptions()[3] = "";
        question[1].setAnswer("2");

        question[2].setQuestion("what is the default value for int array");
        question[2].getOptions()[0] = "0";
        question[2].getOptions()[1] = "";
        question[2].getOptions()[2] = "null";
        question[2].getOptions()[3] = "false";
        question[2].setAnswer("1");

       Result result = new Result();
        for(int i=0;i<question.length;i++){
            System.out.println(question[i].getQuestion());
            for(int j=0;j<question[i].getOptions().length;j++){
                System.out.println((j+1) +". "+question[i].getOptions()[j]);
            }
            System.out.print("Enter your answer:");
            String userAns = scanner.nextLine();

            if(userAns.equalsIgnoreCase(question[i].getAnswer())){
                result.setRightAns(result.getRightAns() +1);
            }else{
                result.setWrongAns(result.getWrongAns() +1);
            }
        }

        System.out.println("Qiz Result");
        System.out.println("*********************");
       if(result.getRightAns() >= 2){
           result.setQuizResult("pass");
       }else{
           result.setQuizResult("fail");
       }
       System.out.println("Result: "+result.getQuizResult()+" Right-Ans: "+result.getRightAns()+" Wrong: "+result.getWrongAns());

    }
}

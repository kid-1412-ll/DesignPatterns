package com.kindkidll.factorymethodpattern.simple2;

import java.util.Random;
import java.util.Scanner;

/**
 * @author leiliang
 * @description 随机采用一种方式记录日志
 * @create 2022-11-26 19:29
 */
class Client {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        FileLog fileLog = new FileLogFactory().createLog();
        DatabaseLog databaseLog = new DatabaseLogFactory().createLog();
        while (true) {
            System.out.println("请输入需要记录的日志:");
            String data = input.next();
            if (random.nextInt() % 2 == 0) {
                fileLog.writeLog(data);
            } else {
                databaseLog.writeLog(data);
            }
        }
    }

}

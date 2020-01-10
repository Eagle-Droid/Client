package com.cursmysql;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Socket s = new Socket("127.0.0.1", 9999);
        InputStream inputStream = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(outputStream));
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();

        out.write(line + "\n");
        out.write(line2 + "\n");
        out.write(line3+"\n");
        out.flush();
        outputStream.close();
    }
}

package org.example.baekjoon.sivler;

import java.io.*;
import java.util.*;

public class S3_11659 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];

        st = new StringTokenizer(br.readLine());

        // 배열에 값 저장
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열의 합 저장
        int[] sumArr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            sumArr[i] += sumArr[i - 1] + arr[i];
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int sum = sumArr[end] - sumArr[start - 1];

            bw.write(sum + "\n");
        }

        bw.flush();
    }
}

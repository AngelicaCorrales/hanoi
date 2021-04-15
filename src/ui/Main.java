package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	private BufferedReader br;	
	private BufferedWriter bw;
	private int[] a;
	private int[] b;
	private int[] c;
	public Main() {
		br = new BufferedReader(new InputStreamReader(System.in));	
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		a=new int[2];
		b=new int[2];
		c=new int[2];
	}
	public static void main(String[] args) throws IOException {
		Main m= new Main();
		/*int line= Integer.parseInt(m.br.readLine());

		if(line==1) {

		}else {
			line--;
		}*/

		int numb= Integer.parseInt(m.br.readLine());
		m.a[1]= numb;
		m.bw.write(m.a[1]+""+m.b[1]+""+m.c[1]+"\n");

		m.hanoi(numb, m.a, m.c, m.b);
		m.br.close();
		m.bw.close();
	}


	public void hanoi(int n, int[] from, int[] to, int[] aux) throws IOException {
		if(n==1) {
			from[1]--;
			to[1]++;
			bw.write(a[1]+""+b[1]+""+c[1]+"\n");
			return;
		}
		hanoi(n-1,from,aux, to);
		from[1]--;
		to[1]++;
		bw.write(a[1]+""+b[1]+""+c[1]+"\n");
		hanoi(n-1, aux, to, from);

	}



}

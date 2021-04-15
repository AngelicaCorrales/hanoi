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
		int line= Integer.parseInt(m.br.readLine());
		
		
		m.cycle(line);

		
		m.br.close();
		m.bw.close();
	}

	public void cycle(int line) throws IOException {
		if(line==0) {
			return;
		}else {
			int numb= Integer.parseInt(br.readLine());
			a[1]= numb;
			bw.write(a[1]+""+b[1]+""+c[1]+"\n");

			hanoi(numb, a, c, b);
			bw.write("\n");
			a[1]=0;
			b[1]=0;
			c[1]=0;

			line--;
			cycle(line);
		}
	}
	
	public void hanoi(int n, int[] from, int[] to, int[] aux) throws IOException {
		if(n==1) {
			from[1]--;
			to[1]++;
			bw.write(a[1]+""+b[1]+""+c[1]+"\n");
			return;
		}else {
			hanoi(n-1,from,aux, to);
			from[1]--;
			to[1]++;
			bw.write(a[1]+""+b[1]+""+c[1]+"\n");
			hanoi(n-1, aux, to, from);
		}

	}



}

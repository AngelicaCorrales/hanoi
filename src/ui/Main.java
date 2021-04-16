package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	private BufferedReader br;	
	private BufferedWriter bw;
	private int[] a;
	private int[] b;
	private int[] c;
	public Main() throws IOException {
		br = new BufferedReader(new FileReader("data/Hanoi_input.txt"));	
		bw = new BufferedWriter(new FileWriter("data/Hanoi_output.txt"));
		a=new int[1];
		b=new int[1];
		c=new int[1];
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
			a[0]= numb;
			bw.write(a[0]+" "+b[0]+" "+c[0]+"\n");

			hanoi(numb, a, c, b);
			bw.write("\n");
			a[0]=0;
			b[0]=0;
			c[0]=0;

			line--;
			cycle(line);
		}
	}
	
	public void hanoi(int n, int[] from, int[] to, int[] aux) throws IOException {
		if(n==1) {
			from[0]--;
			to[0]++;
			bw.write(a[0]+" "+b[0]+" "+c[0]+"\n");
			return;
		}else {
			hanoi(n-1,from,aux, to);
			from[0]--;
			to[0]++;
			bw.write(a[0]+" "+b[0]+" "+c[0]+"\n");
			hanoi(n-1, aux, to, from);
		}

	}



}

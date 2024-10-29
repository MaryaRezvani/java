package PCpackage;
import java.io.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FileBuffer 
{
	private File file;
	private int capacity;
	private Lock lock = new ReentrantLock();
	private Condition fullcondition = lock.newCondition();
	private Condition emptycondition = lock.newCondition();
	private int count;	
	
	public FileBuffer(String fileName , int capacity){
		this.file = new File(fileName);
		this.capacity = capacity;
		this.count = 0;
	}
	
	public void produce(){
		while(true){
			while(file.exists() &&  count >= capacity ){
				System.out.println("Buffer is full !! ");
				try{
					lock.lock();//**
						fullcondition.await();
					lock.unlock();//**
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			try{
				int item = (int) (Math.random()*100);
				lock.lock();//**
					FileWriter writer = new FileWriter(file,true);
					writer.write(item + "\n");
					writer.close();
					count++;
					System.out.println("Produced :  " + item);
					emptycondition.signal();
				lock.unlock();//**
//				try{
//					Thread.sleep(500);
//				}catch (InterruptedException e){
//					e.printStackTrace();
//				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	
	public void consume(){
		while(true){
			while(file.exists() &&  count == 0 ){
				System.out.println("Buffer is empty !! ");
				try{
					lock.lock();//**
						emptycondition.await();
					lock.unlock();//**
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			try{
				lock.lock();//**
					BufferedReader raf = new BufferedReader (new FileReader(file));
					int i = 0 ;
					int[] Datas = new int[this.capacity];
					String s;//**
					while((s=raf.readLine())!= null)//**
							Datas[i++] = Integer.parseInt(s);//**
					raf.close();
					System.out.println("Consumed :  " + Datas[0]);
					count--;
					FileWriter waf = new FileWriter(file,false);//**
					for(int j=1;j<i;j++)
						if(j==1)//**
							waf.write(Datas[j]+ "\n");//**
						else//**
							waf.append(Datas[j]+ "\n");
					waf.close();
					fullcondition.signal();
				lock.unlock();//**
//				try{
//					Thread.sleep(1000);
//				}catch (InterruptedException e){
//					e.printStackTrace();
//				}
			}catch (IOException e){
				e.printStackTrace();
			}
		}
	}
	
	
}

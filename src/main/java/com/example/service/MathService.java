package com.example.service;

import java.util.function.Supplier;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class MathService {
	public Stream<Long> factorialStream() {
		return Stream.generate(new Supplier<Long>() {
			private long f = 1;
			private long n = 1;
			@Override
			public Long get() {
				f *= n;
				n++;
				return f;
			}});
	}
	//斐波那契数列： 1,1,2,3,5,8,13,21,34,55....
	public Stream<Long> test() {
		return Stream.generate(new Supplier<Long>() {
			private long f = 0;
			private long n = 1;
			@Override
			public Long get() {
				f +=n;
				n=f-n;
				return f;
				
			}});
	}
	//实现台阶的算法
	public Stream<Long> test3() {
		return Stream.generate(new Supplier<Long>() {
			private long a = 0;
			private long b = 0;
			private long c = 1;
			@Override
			public Long get() {
				long s=a+b+c;
				a=b;
				b=c;
				c=s;
				return s;
				
			}});
	}
	//完成一个上台阶的问题，一个人每次可以上1、2或者3级太极，问10级台阶有多少种上法
	//1,2,4,7,13,24,44,
		public Stream<Long> test2() {
			return Stream.generate(new Supplier<Long>() {
				
				@Override
				public Long get() {
					return getStepNum(10);
					
				}});
		}
		
		public long getStepNum(int num) {
			if(num==1) {
				return 1;
			}else if(num==2) {
				return 2;
			}else if(num==3){
				return 4;
			}else{
				return getStepNum(num-1)+getStepNum(num-2)+getStepNum(num-3);
			}
		}
	
	
	
}

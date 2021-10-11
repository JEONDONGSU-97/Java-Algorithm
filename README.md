# 2021.10.09

```
    static int med3_1 (int a, int b, int c) {
        if (a >= b)
          if (b >= c)
            return b;
          else if (a <= c)
            return a;
          else
            return c;
        else if (a > c)
          return a;
        else if (b > c)
          return c;
        else
          return b;
      }
```
```
	static int med3_2 (int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}
```

med3_2 메서드가 효율성이 더 떨어지는데 그 이유는 if문에서 판단한 b>=a 와 b<=a 의 반대되는 판단을 
else if에서도 또 수행하기 때문이다.

(애초에 else if가 수행하는 이유는 b>=a 와 b<=a가 아니기 때문인데 그러면 a>b 와 a<b를 굳이 수행하지 않아도 되는데 수행하기 때문이다.)

# 2021.10.10

Q10, Q11, Q12, Q13 코드 최적화 시키기 반복되는 문장 최소화, 반복문과 조건문 최적화.

# 2021.10.11
Q5.  b[j--] => b[b.length-i-1]; 이렇게 하면 j라는 변수를 굳이 생성할 필요가 없다.

```
	static void rcopy(int[] a, int[] b) {
		int num = a.length>=b.length ? b.length	: a.length;
		int j = num-1;
		for(int i=0; i<num; i++) {
			a[i] = b[j--];
		}
	}
```

Q6.  for(int i=0; i<digits/2; i++)에서 digits 대신 d.length이걸로 찾으려 했는데
	  문제를 제대로 보니까 char[]였다. 보려고 하는 것만 보면 안되는 거같다. 좀 더 침착해지고 차분하게 해야겠다!

```
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";	
		do {
			d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지 저장
			x /= r; // r로 나눈 몫을 x에 다시 대입 => x = x/r 예) x = 26/2
		} while (x != 0);
		
		for(int i=0; i<digits/2; i++) {
			char t= d[i];
			d[i] = d[digits-i-1];
			d[digits-i-1] = t;
		}
		return digits;
	}
```

# Java-Algorithm

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

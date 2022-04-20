import java.util.*;

class PT{
	static ArrayList<PT> result;
	int a,b,c;
	static int Factors;
	PT(int a ,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	PT(){
		result =new ArrayList<PT>();
	}
	static PT makeList(){
		return new PT();
	}
	public PT factorsLessThanorEqualto(int num){
		Factors=num;
		return this;
	}
	public PT Sum(int sum){
		for(int i=1;i<=sum;i++){
			for(int j=i+1;j<=sum -i;j++){
				int k=sum - i - j;
				if(i+j+k==sum && (k*k==(i*i)+(j*j))){
					result.add(new PT(i,j,k));
				}
			}
		}
		return this;
	}
	public List<PT> build(){
		return result;
	}
	@Override
	public boolean equals(Object o){
	PT obj=(PT) o;
	if(this.a==obj.a&&this.b==obj.b&&this.c==obj.c)
		return true;
	return false;
	}


}

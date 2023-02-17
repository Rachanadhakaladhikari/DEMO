package zorba;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String name="ramkrishna";
int count=0;
int r=name.indexOf('a');
System.out.println(r);
int r1=name.indexOf('a',2);
System.out.println(r1);
for(int i=0;i<name.length();i++) {
	if(name.charAt(i)=='r') {
		count=count+1;
		
	}
}
System.out.println(count);

//array

String names[]=new String[4];
names[0]="rachana";
names[1]="ram";
names[2]="kriraj";
names [3]="kripal";
System.out.println(names[0]);
System.out.println(names[1]);
System.out.println(names[2]);
System.out.println(names[3]);

for(int i=0;i<names.length;i++) {
	System.out.println(names[i]);
}

int num[]= {11,76,76,843};
for(int i=0;i<num.length;i++) {
	System.out.println(num[i]);
}

String fruits[]= {"apple","banana","cherry", "plum"};
for(int i=0;i<fruits.length;i++) {
	System.out.println(fruits[i]);
}
 char rrr[]= {'a','e','i','o','u'};
 for(int i=0;i<rrr.length;i++) {
	 System.out.println(rrr[i]);
 }








String nam="Rachana is my name";
String result[] =nam.split(" ");
for(int i=0;i<result.length;i++) {
	System.out.println(result[i]);
}
String name2="Rachana";
char result3[]=name2.toCharArray();
for(int i=0;i<result3.length;i++) {
	System.out.println(result3[i]);
}



























	}

}

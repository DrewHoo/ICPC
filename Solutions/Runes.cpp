#include <bits/stdc++.h>

using namespace std;

int main() {
	int n, m, at, k;
	map <char, int> v;
	string s;
	cin >> s;
	for(int i=0; i<s.size(); i++)
		if(s[i]>='0' && s[i]<='9')
			v[s[i]] = 1;
	
	char number;
	for(number='0'; number<='9'; number++) {
		if(v[number])
			continue;
			
		string s2 = s;
		char c[100], a1, a3;
		long long a0, a2, a4;
		
		replace(s2.begin(), s2.end(), '?', number);
		strcpy(c, s2.c_str());
		
		sscanf(c, "%lld%c%lld%c%lld", &a0, &a1, &a2, &a3, &a4);
		
		sprintf(c, "%lld%c%lld%c%lld", a0, a1, a2, a3, a4);
		string s3(c);
		
		if(s3.size()!=s2.size())
			continue;
		
		if(a1=='+' && a0+a2==a4) {
			printf("%c", number);
			break;
		}
		else if(a1=='-' && a0-a2==a4) {
			printf("%c", number);
			break;
		}
		else if(a1=='*' && a0*a2==a4) {
			printf("%c", number);
			break;
		}
	}
	if(number > '9')
		printf("-1");
		
	return 0;
}


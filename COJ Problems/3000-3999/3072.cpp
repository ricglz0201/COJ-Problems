#include <iostream>

using namespace std;

int main(int argc, char const *argv[])
{
	int w;
	cin >> w;
	if (w>=4 && w%2==0){
		cout << "YES" << endl;
	}
	else{
		cout << "NO" << endl;
	}
}
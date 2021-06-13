#include <iostream>
#include <vector>

int main(){
  int even = 0;
  int odd = 1;

  std::vector<int> num = {2,4,3,6,1,9};

  for(int i = 0; i<num.size(); i++){
    if ( num[i]%2 == 0){
      even = even + num[i];
    }else{
      odd = odd * num[i];
      }
  }
    std::cout<<"total even number: " << even << "\n";
    std::cout <<"total odd number: " << odd << "\n";
  
}

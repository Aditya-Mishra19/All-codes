#include <iostream>
#include <vector>
#include <limits.h>

using namespace std;

int findSecondLargest(const vector<int>& nums) {
    int largest = INT_MIN, secondLargest = INT_MIN;
    for (int num : nums) {
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num > secondLargest && num < largest) {
            secondLargest = num;
        }
    }
    if(secondLargest ==INT_MIN){
        return 0;                    //base case , identical elements
    }
    return secondLargest;
}

int findOccurrenceOfSecondLargest(int k, const vector<int>& nums) {
    int count = 0;
    for (int num : nums) {
        if (num == k) {
            count++;
        }
    }
    return count;
}

int main() {
    int n;
    cin >> n;
    vector<int> nums(n);
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    // 1st step: find the second largest element
    int secondLargest = findSecondLargest(nums);
    // 1st step: find the second largest element occurences
    if(secondLargest==0){
        return 0;
    }
    int count = findOccurrenceOfSecondLargest(secondLargest, nums);
    cout << count << endl;

    return 0;
}

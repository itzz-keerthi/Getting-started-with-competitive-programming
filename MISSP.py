"""TASK
Problem
 

Chef is fan of pairs and he likes all things that come in pairs. He even has a doll collection in which the dolls come in pairs. One day while going through his collection he found that there are odd number of dolls. Someone had stolen a doll!!!

Help chef find which type of doll is missing..

Input
The first line contains an integer T, the number of test cases.
The first line of each test case contains an integer N, the number of dolls.
The next N lines are the types of dolls that are left.

Output
For each test case, display the type of doll that doesn't have a pair, in a new line.

Constraints
1<=T<=10
1<=N<=100000 (10^5)
0<=type<=100000

Sample 1:
Input
Output
1
3
1 
2
1
2
Sample 2:
Input
Output
1
5
1
1
2
2
3
3  """
t=int(input())
for i in range(t):
    n=int(input())
    c=0
    l=[]
    for j in range(n):
        doll_num=int(input())
        l.append(doll_num)
        
    for i in l:
        c=c^i 
    print(c)

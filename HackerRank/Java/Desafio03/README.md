In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

<div align="center">
    <img src="https://s3.amazonaws.com/hr-challenge-images/13689/1446563087-4ec019a919-332px-If-Then-Else-diagram.svg.png" style="background: white; padding: 10px">
</div>

## Task
Given an integer, <i>n</i>, perform the following conditional actions:

<ul> 
    <li>If <i>n</i> is odd, print <b>Weird</b></li>
    <li>If <i>n</i> is even and in the inclusive range of <b>2</b> to <b>5</b>, print <b>Not Weird</b></li>
    <li>If <i>n</i> is even and in the inclusive range of <b>6</b> to <b>20</b>, print <b>Weird</b></li>
    <li>If <i>n</i> is even and greater than <b>20</b>, print <b>Not Weird</b></li>
</ul>

Complete the stub code provided in your editor to print whether or not <i>n</i> is weird.

### Input Format

    A single line containing a positive integer, N

### Constraints
    1 ≤ N ≤ 100

### Output Format

    Print Weird if the number is weird; otherwise, print Not Weird.

### Sample Input 0

    3

### Sample Output 0

    Weird

### Sample Input 1

    24

### Sample Output 1

    Not Weird

## Explanation

### Sample Case 0:

    is odd and odd numbers are weird, so we print Weird.

### Sample Case 1:

    and is even, so it isn't weird. Thus, we print Not Weird.
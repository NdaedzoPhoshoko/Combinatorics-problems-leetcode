## Problem 3 description

The function BracketCombinations(num) takes the parameter num of type integer >= 0 and returns the number of valid cominations that can be formed with num pairs of paratheses. 

## Example

Input: 1         | ()
Output: 1        | ()

Input: 2         | ()()
Output: 2        | ()(), (())

Input: 3         |   ()()()
Output: 5        |   ()()(), ()(()), (())(), ((())) and (()())

## Problem approach
For n pairs we have 2n items of parantheses, if we have 3 pairs then number of parantheses are 2(3) = 6
Using Binomial Coefficient method, total number of r items chosen from k items, we have n!/r!(n-r)! without considering the order. Since we are looking for pairs () we will ensure balance [e.g ()(()) ] instead of those combinations such as [ ())(()], hence we devide the Binomisl Coefficient by n+1 to get only half.
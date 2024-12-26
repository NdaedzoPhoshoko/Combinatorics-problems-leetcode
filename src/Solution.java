public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(BracketCombinations(4));
    }

    public static int BracketCombinations(int num){
        int num_of_par = 2*num; //total number of items
        int n_fact = 1;
        int i=num_of_par;
        while(i>1){//for 2n!
            n_fact *= i;
            i--;
        }
        //chosing num number of pairs from num_of_par items.
        i=num; 
        int r_fact = 1;
        while (i>1) { //for r!
            r_fact *= i;
            i--;
        }
        i= num_of_par - num;
        int n_r_fact = 1;
        while (i>1) {//for (n-r)!
            n_r_fact *= i;
            i--;
        }
        return (n_fact / (r_fact * n_r_fact))/(num+1); // (n!/r!(n-r)!)/(n+1)

    }
}

/*
For n pairs we have 2n items of parantheses, if we have 3 pairs then number of parantheses are 2(3) = 6
Using Binomial Coefficient method, total number of r items chosen from k items, we have n!/r!(n-r)! without considering the order.
Since we are looking for pairs () we will ensure balance [e.g ()(()) ] instead of those combinations such as [ ())(()]
Hence we devide the Binomisl Coefficient by n+1 to get only half.
 */


package topInterview150;

/*
 * 637. Average of Levels in Binary Tree
Solved
Easy
Topics
Companies
Given the root of a binary tree, return the average value of the nodes on each level in the form of an array. Answers within 10-5 of the actual answer will be accepted.

 

Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: [3.00000,14.50000,11.00000]
Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5, and on level 2 is 11.
Hence return [3, 14.5, 11].

Example 2:

Input: root = [3,9,20,15,7]
Output: [3.00000,14.50000,11.00000]

 

Constraints:

    The number of nodes in the tree is in the range [1, 104].
    -231 <= Node.val <= 231 - 1


 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageofLevelsinBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        //use BFS Breadth first search
        List<Double> averages = new ArrayList<>(); //list that will hold our level averages

        if(root == null){ // edge case where og root is null
            return averages;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            double levelSum = 0;

            for (int i = 0; i < levelSize; i++){ //will cycle through a levels nodes
                TreeNode node = queue.poll();

                levelSum += node.val;

                // if statements add next levels nodes to the queue
                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            double levelAvg = levelSum / levelSize;
            averages.add(levelAvg);
        }

        return averages;
    }
}

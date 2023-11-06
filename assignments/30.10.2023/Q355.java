import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q355 {
    class Twitter {
    class Node {
        int tweetId;
        int userId;
     public Node(int tweetId, int userId) {
        this.userId = userId;
        this.tweetId = tweetId;
    }
}

/** Initialize your data structure here. */
Map<Integer, Set<Integer>> map ;
LinkedList<Node> q = new LinkedList<>();
    public Twitter() {
        map = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        q.add(new Node(tweetId, userId));
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = map.get(userId);
        for (int i = q.size() - 1; i >= 0; i--) {
            int usId = q.get(i).userId;
            if ((set != null && set.contains(usId)) || userId == usId) {
                result.add(q.get(i).tweetId);
        }
            if (result.size() == 10) break;
    }
        return result;
    }
    
    public void follow(int followerId, int followeeId) {
        if (map.get(followerId) == null) {
        map.put(followerId, new HashSet<>());
    }
        map.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if (map.get(followerId) != null) {
        map.get(followerId).remove(followeeId);
    }
    }
}


/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
}

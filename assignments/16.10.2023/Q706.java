public class Q706 {
    class MyHashMap {
        int [] hmap = new int[1000001];
        public MyHashMap() {
            
        }
        
        public void put(int key, int value) {
            hmap[key] = value + 1;
        }
        
        public int get(int key) {
           return hmap[key] - 1;
        }
        
        public void remove(int key) {
            hmap[key] = 0;
        }
    }
    
    /**
     * Your MyHashMap object will be instantiated and called as such:
     * MyHashMap obj = new MyHashMap();
     * obj.put(key,value);
     * int param_2 = obj.get(key);
     * obj.remove(key);
     */
}

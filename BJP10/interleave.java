public static void interleave(ArrayList<Integer> a1, ArrayList<Integer> a2){
   int maxSize = Math.max(a1.size(), a2.size());
   int minSize = Math.min(a1.size(), a2.size());
   for(int i = 0; i < maxSize; i++){
      if(i < minSize) {
         a1.add(2 * i + 1, a2.get(i));
      }
      if(minSize <= i && i < a2.size()){
         a1.add(a2.get(i));
      }
   }
}
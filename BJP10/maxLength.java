public static int maxLength(ArrayList<String> lst){
   if(lst.size() == 0){
      return 0;
   }
   int max = lst.get(0).length();
   for(String str : lst){
      max = Math.max(max, str.length());
   }
   return max;
}

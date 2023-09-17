public static void stripHtmlTags(String[] args) throws FileNotFoundException {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            line = line.replaceAll("<.*?>","");
            System.out.println(line);
        }
}

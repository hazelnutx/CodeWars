class Katap {
    public static String countingSheep(int num) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < num+1; i++) {
            sb.append(i).append(" sheep...");
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.print(countingSheep(3));
    }
}
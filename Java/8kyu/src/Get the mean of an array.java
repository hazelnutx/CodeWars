class School {

    public static int getAverage(int[] marks) {
        double sum = 0;
        for(int i = 0; i < marks.length; i++) {
            sum += marks[i];
            //double avarage = sum / marks.length;
        }
        return (int) (sum / marks.length);
    }
}

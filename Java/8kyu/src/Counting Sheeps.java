class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for(Boolean array : arrayOfSheeps) {
            if(array != null && array == true) {
                count++;
            }
        }
        return count;
    }
}

package develhope.java.finalcouse.finalweek;

enum Semaphores {
    RED(1),
    YELLOW(2),
    GREEN(3);

    private int value;

    Semaphores( int value ) {
        this.value = value;
    }

    public Semaphores getNextSemaphoresValue() {
        switch (value) {
            case 1:
                return Semaphores.YELLOW;
            case 2:
                return Semaphores.GREEN;
            case 3:
                return Semaphores.RED;
            default:
                return null;
        }
    }
}


class SemaphoresDemo {
    public static void main(String[] args) {
        Semaphores currentState = Semaphores.RED;
        Semaphores newState = currentState.getNextSemaphoresValue();

        System.out.println("Current: " + currentState);
        System.out.println("Now: " + newState);
    }
}

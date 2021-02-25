package turtle;

public class Turtle {

    private Pen pen;
    private CurrentDirection currentDirection;
    private Position currentPosition;
    //constructor Injection of pen in every turtle created

    public Turtle(Pen pen) {
        this.pen = pen;
        currentDirection = currentDirection.EAST;
    }


    public Pen getPen() {
        return pen;
    }


    public void setCurrentDirection(CurrentDirection currentDirection) {
        this.currentDirection = currentDirection;

    }


    public CurrentDirection getCurrentDirection(CurrentDirection east) {
        return currentDirection;
    }


    public void turnRight() {
        switch (currentDirection) {
            case EAST -> setCurrentDirection(CurrentDirection.SOUTH);
            case WEST -> setCurrentDirection(CurrentDirection.NORTH);
            case NORTH -> setCurrentDirection(CurrentDirection.EAST);
            case SOUTH -> setCurrentDirection(CurrentDirection.WEST);
        }

    }


    public void turnLeft() {
        switch (currentDirection) {
            case EAST -> setCurrentDirection(CurrentDirection.NORTH);
            case NORTH -> setCurrentDirection(CurrentDirection.WEST);
            case WEST -> setCurrentDirection(CurrentDirection.SOUTH);
            case SOUTH -> setCurrentDirection(CurrentDirection.EAST);
        }
    }


    public void move(SketchPad sketchPad, int numberOfSteps) {
        numberOfSteps -= 1;
        Position currentPosition = getCurrentPosition();
        int currentColumn = currentPosition.getColumnPosition();
        int currentRow = currentPosition.getRowPosition();
        PenOrientation currentPenPosition = getPen().getPenOrientation();

        switch (currentPenPosition) {
            case PEN_UP -> {
                switch (currentDirection) {
                    case EAST -> {
                        currentPosition.setColumnPosition(currentColumn + numberOfSteps);
                    }
                    case SOUTH -> {
                        currentPosition.setRowPosition(currentRow + numberOfSteps);
                    }
                    case WEST -> {
                        currentPosition.setColumnPosition(currentColumn - numberOfSteps);
                    }
                    case NORTH -> {
                        currentPosition.setRowPosition(currentRow - numberOfSteps);
                    }
                }
            }

            case PEN_DOWN -> {
                int[][] floor = sketchPad.getFloor();
                int positionAfterLoop = numberOfSteps + currentColumn;
                switch (currentDirection){
                    case EAST -> {
                        for (int start = currentColumn; start <= numberOfSteps + currentColumn; start++){
                        floor[currentRow][start] = 1;
                        }
                        currentPosition.setColumnPosition(positionAfterLoop++);
                    }
                }
            }

        }
    }

    private void moveWithPen(int numberOfMoves){
        Position currentPosition = getCurrentPosition();
        int currentColumn = currentPosition.getColumnPosition();
        int currentRow = currentPosition.getRowPosition();
        switch (currentDirection){
            case EAST -> currentPosition.setColumnPosition(currentColumn + numberOfMoves);
            case SOUTH -> currentPosition.setRowPosition(currentRow + numberOfMoves);
            case WEST -> currentPosition.setColumnPosition(currentColumn - numberOfMoves);
            case NORTH -> currentPosition.setRowPosition(currentRow - numberOfMoves);
        }
    }

    public Position getCurrentPosition(){
        return currentPosition;
    }
    public void setCurrentPosition(Position position) {
        currentPosition = position;
    }

}

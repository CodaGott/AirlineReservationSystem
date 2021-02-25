package turtle;

public class Position {
    private int rowPosition;
    private int columnPosition;

    public Position(int rowPosition, int columnPosition) {
        this.columnPosition = columnPosition;
        this.rowPosition = rowPosition;
    }


    @Override
    public boolean equals(Object obj) {
        boolean isEquals = false;
        if(obj.getClass()==this.getClass()){
            Position comparedObject = (Position) obj;
            boolean isSameCoordinate =
                    (comparedObject.getColumnPosition() == this.getColumnPosition()) &&
                            (comparedObject.getRowPosition() == this.getRowPosition());
            if(isSameCoordinate){
                isEquals = true;
            }
        }
        return isEquals;
    }



    public int getRowPosition() {
        return rowPosition;
    }

    public void setRowPosition(int rowPosition){
        this.rowPosition = rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }

}


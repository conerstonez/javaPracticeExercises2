package DietelChapter7.KnightTour;

public class Knight {
    private int currentColumn;
    private int currentRow;

    public Knight() {}
    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    public void move(int i) {
        switch (i) {
            case 1 -> {
                setCurrentRow(getCurrentRow() - 2);
                setCurrentColumn(getCurrentColumn() + 1);
            }
            case 2 -> {
                setCurrentRow(getCurrentRow() - 1);
                setCurrentColumn(getCurrentColumn() + 2);
            }
            case 3 -> {
                setCurrentRow(getCurrentRow() + 1);
                setCurrentColumn(getCurrentColumn() + 2);
            }
            case 4 -> {
                setCurrentRow(getCurrentRow() + 2);
                setCurrentColumn(getCurrentColumn() + 1);
            }
            case 5 -> {
                setCurrentRow(getCurrentRow() + 2);
                setCurrentColumn(getCurrentColumn() - 1);
            }
            case 6 -> {
                setCurrentRow(getCurrentRow() + 1);
                setCurrentColumn(getCurrentColumn() - 2);
            }
            case 7 -> {
                setCurrentRow(getCurrentRow() - 1);
                setCurrentColumn(getCurrentColumn() - 2);
            }
        }

    }
}

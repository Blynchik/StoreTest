package com.store.model.notebook;

import lombok.Getter;

@Getter
public enum NotebookSize {
    INCH_13(13),
    INCH_14(14),
    INCH_15(15),
    INCH_17(17);

    private final int size;
    NotebookSize(int size){
        this.size = size;
    }
}

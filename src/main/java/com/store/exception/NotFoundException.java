package com.store.exception;

public class NotFoundException extends RuntimeException{

    public NotFoundException(){
    }

    public NotFoundException(Class clazz, Long id){
        super(clazz.getName()
                .substring(clazz.getName().lastIndexOf(".")+1)
                + " id:" + id + " не найден");
    }
}

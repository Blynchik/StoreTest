package com.store.exception;

public class ItemNotFoundException extends RuntimeException{

    public ItemNotFoundException(){
    }

    public ItemNotFoundException(Class clazz, Long id){
        super(clazz.getName()
                .substring(clazz.getName().lastIndexOf(".")+1)
                + " id:" + id + " не найден");
    }
}

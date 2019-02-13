package PrototypePattern; 
 
 
public class CloneFactory { 
 
    public Man getClone(Man man) { 
        return man.makeCopy(); 
    } 
} 

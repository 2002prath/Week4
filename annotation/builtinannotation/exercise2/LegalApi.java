package org.example.annotation.builtinannotation.exercise2;

public class LegalApi {

    @Deprecated
    void oldFeature(){
        System.out.println("This is an old feature use newFeature()");
    }
    void newFeature(){
        System.out.println("This is new feature");
    }
}

 class main{
    public static void main(String[] args) {
        LegalApi api = new LegalApi();
        api.newFeature();
        api.oldFeature();
    }
}

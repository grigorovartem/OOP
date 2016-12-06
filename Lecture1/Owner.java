package Lecture1;

import Lecture1.Dog;

/**
 * Created by Артем on 03.12.16.
 */
public class Owner {

    private Dog dog;

    public Owner(Dog dog) {
        this.dog = dog;
    }

    public void giveCommand(int n){
        for (int i = 0; i<n; i++){
            dog.barck();
        }
    }
}

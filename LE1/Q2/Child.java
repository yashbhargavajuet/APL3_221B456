class Child extends Mother{
    void showChild(){// for overriding we use show() function
        System.out.println("This is chlid class.");
    }
 void show(){ //both child and mother class sholud have a static fuction than only the code will run and when we use static fun then polymorphism will not occur
	System.out.println("This is chlid class.");
}
}
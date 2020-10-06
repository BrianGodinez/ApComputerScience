public static void main(String[] args)
    {
        System.out.println("Enter the details for the second airplane (call-sign, distance, bearing and altitude):");


        Scanner input = new Scanner(System.in);


        String callSign = input.nextLine().toUpperCase();
        double distance = input.nextDouble();
        int direction = input.nextInt();
        int altitude = input.nextInt();


        Airplane plane1 = new Airplane();
        Airplane plane2 = new Airplane(callSign, distance, direction, altitude);


        int altDifference = Math.abs(plane1.getAlt() - plane2.getAlt());


        System.out.println();


        System.out.println("Initial Positions:");
        System.out.println("\"Airplane 1\": " + plane1.toString());
        System.out.println("\"Airplane 2\": " + plane2.toString());
        System.out.println("The distance between the planes is " + plane1.distTo(plane2) + " miles.");
        System.out.println("The difference in height between the planes is " + altDifference + " feet.");


        plane1.gainAlt();
        plane1.gainAlt();
        plane1.gainAlt();
        plane1.gainAlt();
        plane1.move(10.5, 50);


        plane2.loseAlt();
        plane2.loseAlt();
        plane2.move(8, 125);
        
        
        altDifference = Math.abs(plane1.getAlt() - plane2.getAlt());


        System.out.println();


        System.out.println("New Positions:");
        System.out.println("\"Airplane 1\": " + plane1.toString());
        System.out.println("\"Airplane 2\": " + plane2.toString());
        System.out.println("The distance between the planes is " + plane1.distTo(plane2) + " miles.");
        System.out.println("The difference in height between the planes is " + altDifference + " feet.e");
    }

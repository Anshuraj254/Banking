class Loading
 {
    public static void loading() throws InterruptedException
    {
        long startTime = System.currentTimeMillis();
        long duration = 5000; // 5000 milliseconds = 5 seconds
        
        while (System.currentTimeMillis() - startTime < duration)
        {
            System.out.print("Loading...");
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            
            // Clear the line
            System.out.print("\r");
            for (int i = 0; i < "Loading...".length(); i++) 
            {
                System.out.print(" ");
            }
            System.out.print("\r");
        }
        
        System.out.println("Loading complete!");
    }
}

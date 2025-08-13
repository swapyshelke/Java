class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter distance in inches");
        double inch = scanner.nextDouble();
        
        double meters = inch * 0.0254;
        
        System.out.print(meters);
        
        
        
    }
}

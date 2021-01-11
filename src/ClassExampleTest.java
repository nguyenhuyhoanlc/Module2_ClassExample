class ClassExampleTest {
    private static ClassExample classExample;
    public static final String[] validClass = new String[]{"C0318G"};
    public static final String[] invalidClass = new String[]{"M0318G","P0323A"};

    public static void main(String[] args) {
        classExample =new ClassExample();
        for (String room: validClass) {
            boolean isvalid = classExample.validate(room);
            System.out.println("Class is " + room + " is valid:" + isvalid);
        }
        for (String room: invalidClass) {
            boolean isvalid = classExample.validate(room);
            System.out.println("Class is " + room + " is valid:" + isvalid);
        }
    }

}
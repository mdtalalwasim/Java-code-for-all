public class EscapeSequenceDemo {
    public static void main(String[] args){
        String paragraph = "The roaring fans saw\n"
                +"their beloved \"Tigers\" create another\n"
                +"\tbit of history in their favorite\n"
                +"den last night.";

        System.out.println(paragraph);

        String anotherWayToPrintTheParagraph = """
               The roaring fans saw
               their beloved "Tigers" create another
                 \tbit of history in their favorite
                 den last night.""";
        System.out.println(anotherWayToPrintTheParagraph);
    }
}

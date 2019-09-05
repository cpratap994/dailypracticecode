package pattern.behavioralpattern.chainofresponsibility;

public class ChainOfRespDEMO {

    public static void main(String[] args) {
        Director director = new Director();
        VP vp = new VP();
        CEO ceo = new CEO();

        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request request = new Request(RequestType.PURCHASE, 1600);
        director.handleRequest(request);

        Request request1 = new Request(RequestType.PURCHASE, 11);
        director.handleRequest(request1);

        Request request2 = new Request(RequestType.CONFERENCE, 1600);
        director.handleRequest(request);
    }
}

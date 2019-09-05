package pattern.behavioralpattern.chainofresponsibility;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.CONFERENCE){
            System.out.println("Director has approved conference");
        }
        else {
            successor.handleRequest(request);
        }
    }
}

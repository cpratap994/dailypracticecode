package pattern.behavioralpattern.chainofresponsibility;

public class VP extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE){
            if(request.getAmount() < 1500){
                System.out.println("VP can approve amount upto 1500 only");
            }else {
                successor.handleRequest(request);
            }
        }
    }
}

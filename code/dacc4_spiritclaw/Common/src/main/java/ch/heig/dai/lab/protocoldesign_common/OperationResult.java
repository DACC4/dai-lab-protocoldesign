package ch.heig.dai.lab.protocoldesign_common;

public class OperationResult {
    private OperationError error;
    private String result;

    public OperationResult(String result) {
        this.error = null;
        this.result = result;
    }

    public OperationResult(OperationError error) {
        this.error = error;
        this.result = null;
    }

    public OperationError getError() {
        return error;
    }

    public String getResult() {
        if(error != null){
            return "ERROR " + error.toString(); 
        }
        else if (result != null) {
            return "RSLT " + result;
        }
        else {
            return "BOTH NULL";
        }
    }
}

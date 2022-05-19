package br.com.zup.edu.personmanager.error;

public class ErrorResponse {
    private String timeStamp;
    private int status;
    private String error;
    private String message;
    private String path;

    public ErrorResponse(String timeStamp, int status,
                         String error, String message, String path) {
        this.timeStamp = timeStamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public int getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public String getPath() {
        return path;
    }
}

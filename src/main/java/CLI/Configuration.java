package CLI;

public class Configuration {
    int Total_Tickets;
    int TicketReleaseDate;
    int CustomerRetrievalRate;
    int MaxTicketCapacity;

    public Configuration(int Total_Tickets, int TicketReleaseDate, int CustomerRetrievalRate, int MaxTicketCapacity){
        this.Total_Tickets=Total_Tickets;
        this.TicketReleaseDate=TicketReleaseDate;
        this.CustomerRetrievalRate=CustomerRetrievalRate;
        this.MaxTicketCapacity=MaxTicketCapacity;
    }
    private void setTotal_Tickets(int Total_Tickets){
        this.Total_Tickets=Total_Tickets;
    }
    private void setTicketReleaseDate(int TicketReleaseDate){
        this.TicketReleaseDate=TicketReleaseDate;
    }

    public void setCustomerRetrievalRate(int customerRetrievalRate) {
        CustomerRetrievalRate = customerRetrievalRate;
    }

    public void setMaxTicketCapacity(int maxTicketCapacity) {
        MaxTicketCapacity = maxTicketCapacity;
    }

    public int getTotal_Tickets() {
        return Total_Tickets;
    }
    public int TicketReleaseDate(){
        return TicketReleaseDate;
    }
    public int CustomerRetrievalRate(){
        return CustomerRetrievalRate;
    }
    public int MaxTicketCapacity(){
        return MaxTicketCapacity;
    }
}

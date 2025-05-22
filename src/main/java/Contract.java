public class Contract {
  // will hold information common to all contacts, it should be an abstract class as you cant create
  // a generic contract

  String contactName;
  String contactEmail;
  String dateOfContract;
  String vehicleSold;
  double totalPrice;
  double monthlyPayment;

  public Contract(
      String contactName,
      String contactEmail,
      String dateOfContract,
      String vehicleSold,
      double totalPrice,
      double monthlyPayment) {
    this.contactName = contactName;
    this.contactEmail = contactEmail;
    this.dateOfContract = dateOfContract;
    this.vehicleSold = vehicleSold;
    this.totalPrice = totalPrice;
    this.monthlyPayment = monthlyPayment;
  }

  public String getVehicleSold() {
    return vehicleSold;
  }

  public void setVehicleSold(String vehicleSold) {
    this.vehicleSold = vehicleSold;
  }

  public String getDateOfContract() {
    return dateOfContract;
  }

  public void setDateOfContract(String dateOfContract) {
    this.dateOfContract = dateOfContract;
  }

  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public abstract double getTotalPrice();

  public abstract double getMonthlyPayment();
}

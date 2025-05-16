class SalesContract extends Contract {

    double salesTaxAmount;
    double recordingFee;
    double processingFee;
    boolean isFinancing;
    double monthlyPayment;


    public SalesContract(String contactName, String contactEmail, String dateOfContract, String vehicleSold, double totalPrice, double monthlyPayment, double salesTaxAmount, double recordingFee, double processingFee, boolean isFinancing) {
        super(contactName, contactEmail, dateOfContract, vehicleSold, totalPrice, monthlyPayment);
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.isFinancing = isFinancing;
    }

    public boolean isFinancing() {
        return isFinancing;
    }

    public void setFinancing(boolean financing) {
        isFinancing = financing;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    @Override
    public double getTotalPrice(){
        if (!isFinancing) {
            totalPrice = (vehicleSold * salesTaxAmount) + recordingFee + processingFee;
                if (vehicleSold > 10000) {
                    processingFee = 495;
                } else {
                    processingFee = 295;
                }
        } else {
            if (vehicleSold > 10000) {
                totalPrice = ((vehicleSold * salesTaxAmount) + recordingFee + processingFee) * 1.425;
            } else {
                totalPrice = ((vehicleSold * salesTaxAmount) + recordingFee + processingFee) * 1.525;
            }

        }

    }

    @Override
    public double getMonthlyPayment(){
        if (isFinancing) {
            if (vehicleSold > 10000) {
                monthlyPayment = (((vehicleSold * salesTaxAmount) + recordingFee + processingFee) * 1.425) / 48;
            } else {
                monthlyPayment = (((vehicleSold * salesTaxAmount) + recordingFee + processingFee) * 1.525) / 24;
            }
        }
        return monthlyPayment;
    }

}

package javachallenges.solutions;

public class WaterBillSolved {

	public static double calculateWaterBill(double gallonsUsage) {
		double minimumCharge = 18.84;
		double numberOfGallonsInCCF = 748;
		double includedGallons = 2 * numberOfGallonsInCCF;
		
		if (gallonsUsage <= includedGallons) {
			return minimumCharge;
		}
		
		double extraGallonsUsed = gallonsUsage - includedGallons;
		double extraAmountOwed = Math.ceil(extraGallonsUsed/numberOfGallonsInCCF) * 3.90;
		return minimumCharge + extraAmountOwed;
	}

}

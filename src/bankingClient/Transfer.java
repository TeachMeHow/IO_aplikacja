package bankingClient;

import java.util.Currency;

public class Transfer {
	public String getSourceAccount() {
		return sourceAccount;
	}

	public String getDestinationAccount() {
		return destinationAccount;
	}

	public String getTitle() {
		return title;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public int getAmount() {
		return amount;
	}

	public int getType() {
		switch (type)
		{
		case OWN: return 0;
		case EXTERNAL: return 1;
		case INTERNATIONAL: return 2;
		}
		// no error - default:
		return 1;
	}

	private String sourceAccount;
	private String destinationAccount;
	private String title;
	private String recipientName;
	private int amount;
	private TransferType type;

	private enum TransferType {
		OWN, EXTERNAL, INTERNATIONAL
	}

	/** 
	 * @param sourceAccount
	 * @param destinationAccount
	 * @param amount
	 * @param title
	 * @param type (0 wlasny, 1 - zewnetrzyny, 2 miedzynarodowy)
	 * @param recipientName
	 */
	Transfer(String sourceAccount, String destinationAccount, int amount, String title, int type,
			String recipientName) {
		this.sourceAccount = sourceAccount;
		this.destinationAccount = destinationAccount;
		this.title = title;
		this.recipientName = recipientName;
		this.amount = amount;
		switch (type) {
		case 0:
			this.type = TransferType.OWN;
			break;
		case 1:
			this.type = TransferType.EXTERNAL;
			break;
		case 2:
			this.type = TransferType.INTERNATIONAL;
			break;
		default:
			this.type = TransferType.EXTERNAL;
		}
	}

}

package MathModule;

import org.junit.jupiter.api.Test;
import MathModule.BankAccount;
import MathModule.NotEnoughFundsException;
import static org.junit.jupiter.api.Assertions.*;


	public class NotEnoughFundsException extends RuntimeException {

	    public NotEnoughFundsException(Integer amount, Integer balance) {
	        super("Attempted to withdraw " + amount + " with a balance of " + balance);
	    }

	}


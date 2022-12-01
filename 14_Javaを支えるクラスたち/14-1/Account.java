public class Account {
	public static void main(String[] args) { 
		String accountNumber;
		int balance;
		
		public String toString() {
		    return "\\" + this.balance + "(口座番号:" + this.accountNumber + ")";
		}
		
		public boolean equals(Object o) {
		    if (this == o) {
		        return true;
		    }
		    if (o instanceof Account) {
		        Account a = (Account)o;
		        String a1 = this.accountNumber.trim();
		        String a2 = a.accountNumber.trim();
		        if (a1.equals(a2)) {
		            return true;
		        }
		    }
		    return false;
		}
	}
}

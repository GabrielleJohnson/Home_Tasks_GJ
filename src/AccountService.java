interface AccountService {
    /**
     * It finds an account by owner id
     *
     * @param id owner unique identifier
     * @return account or null
     */
    Account findAccountByOwnerId(long id);
    /**
     * It count the number of account with balance > the given value
     *
     * @param value
     * @return the number of accounts
     */
    long countAccountsWithBalanceGreaterThan(long value);
}

class AccountServiceImpl implements AccountService {
    private Account[] accounts;

    AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }

    //returns the user account or null if no  case account is found
    @Override
    public Account findAccountByOwnerId(long id) {
        for (Account account: accounts) {
            if (account.getOwner().getId() == id){
                return account;
            }
        }
        return null;
    }

    //returns the number of accounts with a balance exceeding the provided number
    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        long count = 0;
        for (Account account: accounts){
            if (account.getBalance() > value){
                count++;
            }
        }

        return count;
    }
}

class Account {

    private long id;
    private long balance;
    private User owner;

    public Account(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }
}

class User {

    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Main{
    public static void main(String[] args) {
        User user1 = new User(10L, "Gabrielle", "Johnson");
        User user2 = new User(30L, "Haley", "Whittle");

        Account[] accounts ={
                new Account(3L, 3455L, user1),
                new Account(4L, 87473L, user2)
        };

        AccountService service = new AccountServiceImpl(accounts);

        Account found = service.findAccountByOwnerId(10L);
        System.out.println(found !=null ? "Found account " + found.getBalance() : "Account not found");

        long count = service.countAccountsWithBalanceGreaterThan(9000L);
        System.out.println("Accounts with balance > 9000L : " + count);
    }
}
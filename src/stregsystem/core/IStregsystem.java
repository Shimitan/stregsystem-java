package stregsystem.core;

public interface IStregsystem {
    IEnumerable<Product> ActiveProducts { get; } // IDK how getters/setters work in Java
    InsertCashTransaction AddCreditsToAccount(User user, double amount);
    BuyTransaction BuyProduct(User user, Product product, int amount);
    Product GetProductByID(int id);
    IEnumerable<Transaction> GetTransactions(User user, int count);
    List<User> GetUsers(Func<User, Boolean> predicate);
    User GetUserByUsername(String username);
    public void AddTransaction(Transaction transaction);
    event UserBalanceNotification UserBalanceWarning; // IDK how events work in Java
}

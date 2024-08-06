package org.example;

public interface AccountRepository {
    void insert(Account account);
    void update(Account account);
    Account find(long accountId);
}
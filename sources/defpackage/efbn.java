package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbn {
    public static final Account a = new Account("shared", "mobstore");

    public static Account a(String str) {
        if (d(str)) {
            return a;
        }
        int indexOf = str.indexOf(58);
        efdh.a(indexOf >= 0, "Malformed account", new Object[0]);
        return new Account(str.substring(indexOf + 1), str.substring(0, indexOf));
    }

    public static String b(Account account) {
        efdh.a(account.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        efdh.a(account.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        efdh.a(account.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (c(account)) {
            return "shared";
        }
        return account.type + ":" + account.name;
    }

    static boolean c(Account account) {
        return a.equals(account);
    }

    static boolean d(String str) {
        return "shared".equals(str);
    }
}

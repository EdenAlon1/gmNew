package defpackage;

import android.accounts.Account;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhbb {
    public static String a(Account account) {
        if (account == null) {
            return "null";
        }
        if (Log.isLoggable("GCoreUlr", 2)) {
            return account.name;
        }
        return "account#" + (account.name.hashCode() % 20) + "#";
    }
}

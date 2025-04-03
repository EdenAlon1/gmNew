package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgwf {
    private final AccountManager a;

    private dgwf(AccountManager accountManager) {
        this.a = accountManager;
    }

    public static dgwf a(Context context) {
        return new dgwf(AccountManager.get(context));
    }

    public final Account[] b() {
        ekzz f = eleg.f("AccountManager.getAccounts");
        try {
            Account[] accounts = this.a.getAccounts();
            f.close();
            return accounts;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

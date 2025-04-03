package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efzv {
    private final AccountManager a;

    public efzv(Context context) {
        this.a = AccountManager.get(context);
    }

    public final Account[] a() {
        return this.a.getAccountsByType("com.google");
    }
}

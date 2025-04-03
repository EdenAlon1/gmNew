package defpackage;

import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebxh {
    public boolean a = false;
    public final OnAccountsUpdateListener b;
    public final AccountManager c;

    public ebxh(Context context, ebwg ebwgVar, OnAccountsUpdateListener onAccountsUpdateListener) {
        this.b = onAccountsUpdateListener;
        this.c = AccountManager.get(context.getApplicationContext());
        if (koa.c(context, "android.permission.GET_ACCOUNTS") != 0) {
            final ebwk ebwkVar = (ebwk) ebwgVar;
            elfr.l(elfr.h(new Callable() { // from class: ebwh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i = dezv.a;
                    Context context2 = ebwk.this.b;
                    dfwv.n(context2);
                    dfac.g(context2, 11400000);
                    return (Boolean) dfac.j(context2, dfac.d, new dfaa(context2.getApplicationInfo().packageName, context2));
                }
            }, ebwkVar.c), new ebxg(), erpp.a);
        }
    }
}

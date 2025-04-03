package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvbv implements dvbu {
    private static final entd a = entd.c("GnpSdk");
    private final Context b;
    private final eaku c;

    public dvbv(Context context, eaku eakuVar) {
        this.b = context;
        this.c = eakuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dvbu
    public final /* bridge */ /* synthetic */ List a() {
        engw engwVar;
        if (!fdoq.b()) {
            int i = engw.d;
            return enou.a;
        }
        ArrayList arrayList = new ArrayList();
        try {
            engwVar = engw.n(this.c.c());
        } catch (Exception e) {
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/accounts/impl/AccountManagerImpl", "getAccountsNames", '5', "AccountManagerImpl.java")).q("Failed to get accounts using GoogleAuthUtil");
            engwVar = null;
        }
        if (engwVar == null) {
            if (koa.c(this.b, "android.permission.GET_ACCOUNTS") == 0) {
                engwVar = engw.p(AccountManager.get(this.b).getAccountsByType("com.google"));
            } else {
                ((ensz) ((ensz) a.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/accounts/impl/AccountManagerImpl", "getAccountsNames", 64, "AccountManagerImpl.java")).q("Failed to get accounts using AccountManager, missing permission GET_ACCOUNTS");
            }
        }
        if (engwVar != null) {
            int size = engwVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((Account) engwVar.get(i2)).name);
            }
        }
        return engw.n(arrayList);
    }
}

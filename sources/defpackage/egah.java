package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egah implements duig {
    public final egcm a;
    public final SparseArray b = new SparseArray();
    public duif c;

    public egah(Context context, egcm egcmVar) {
        this.a = egcmVar;
        AccountManager.get(context).addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: egag
            @Override // android.accounts.OnAccountsUpdateListener
            public final void onAccountsUpdated(Account[] accountArr) {
                if (Log.isLoggable("FifeHeaderProvider", 3)) {
                    Log.d("FifeHeaderProvider", "Invalidate all cached tokens");
                }
                egah.this.b.clear();
            }
        }, null, false);
    }

    @Override // defpackage.duig
    public final synchronized rab a(duhq duhqVar) {
        final int a = duhqVar.a();
        if (a == -1) {
            return rab.b;
        }
        rad radVar = new rad();
        rac racVar = new rac() { // from class: egaf
            @Override // defpackage.rac
            public final String a() {
                egah egahVar = egah.this;
                SparseArray sparseArray = egahVar.b;
                int i = a;
                String str = (String) sparseArray.get(i);
                if (str == null) {
                    try {
                        egcm egcmVar = egahVar.a;
                        str = dfac.d(egcmVar.a, fdrm.a.get().r() ? dfac.k(egcmVar.a)[i] : AccountManager.get(egcmVar.a).getAccountsByType("com.google")[i], egcmVar.b);
                        egahVar.b.put(i, str);
                    } catch (RemoteException | dezu | dfqc | dfqd | IOException unused) {
                        str = "";
                    }
                }
                return "Bearer ".concat(String.valueOf(str));
            }
        };
        boolean z = radVar.a;
        radVar.b();
        radVar.c().add(racVar);
        return radVar.a();
    }

    @Override // defpackage.duig
    public final synchronized void b(duhq duhqVar) {
        String str = (String) this.b.get(duhqVar.a());
        if (str != null) {
            try {
                this.a.a(str);
            } catch (dezu | IOException unused) {
            }
        }
        this.b.remove(duhqVar.a());
        duif duifVar = this.c;
        if (duifVar != null) {
            ((duhy) duifVar).b.a.e();
        }
    }
}

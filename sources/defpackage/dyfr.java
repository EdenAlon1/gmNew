package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyfr extends BroadcastReceiver {
    final /* synthetic */ emyl a;
    final /* synthetic */ Account b;

    public dyfr(emyl emylVar, Account account) {
        this.a = emylVar;
        this.b = account;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dyfm, java.lang.Object] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ?? r0 = this.a.get();
        if (r0 != 0) {
            Account[] accounts = fdqo.b(context) ? AccountManager.get(context).getAccounts() : dgwf.a(context).b();
            int intExtra = intent.getIntExtra("account_index", -1);
            if (intExtra == -1 || intExtra >= accounts.length || !accounts[intExtra].equals(this.b)) {
                return;
            }
            r0.n();
        }
    }
}

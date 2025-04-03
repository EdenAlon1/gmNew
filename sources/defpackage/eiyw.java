package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiyw implements erqj {
    final /* synthetic */ eiyx a;

    public eiyw(eiyx eiyxVar) {
        this.a = eiyxVar;
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        Iterator it = ((Set) this.a.e.b()).iterator();
        while (it.hasNext()) {
            ejvp ejvpVar = ((eizr) it.next()).a;
            ListenableFuture i = erqt.i(null);
            ejvpVar.a(i, "com.google.apps.tiktok.account.data.AllAccounts");
            ejjz.c(i, "AvailableAccountsInvalidatedObserver failed", new Object[0]);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
    }
}

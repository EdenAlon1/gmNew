package defpackage;

import android.accounts.Account;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebxp implements erqj {
    final /* synthetic */ ebxq a;

    public ebxp(ebxq ebxqVar) {
        this.a = ebxqVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            this.a.i((Account) it.next());
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
    }
}

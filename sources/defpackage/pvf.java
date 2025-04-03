package defpackage;

import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pvf implements pvx {
    public final ConnectivityManager a;
    public final long b;

    public pvf(ConnectivityManager connectivityManager, long j) {
        this.a = connectivityManager;
        this.b = j;
    }

    @Override // defpackage.pvx
    public final ffxx a(poj pojVar) {
        pojVar.getClass();
        return new ffxn(new pve(pojVar, this, null));
    }

    @Override // defpackage.pvx
    public final boolean b(pyj pyjVar) {
        return pyjVar.l.a() != null;
    }

    @Override // defpackage.pvx
    public final boolean c(pyj pyjVar) {
        if (b(pyjVar)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }
}

package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class czgd implements czgz {
    public boolean q;
    protected final Context r;
    public final czgx s;
    protected final czgy t;
    protected final czha u;
    protected final fr v;

    public czgd(czgx czgxVar, czgy czgyVar, czha czhaVar, fr frVar, Context context, boolean z) {
        this.s = czgxVar;
        this.t = czgyVar;
        this.u = czhaVar;
        this.r = context;
        this.v = frVar;
        this.q = z;
    }

    @Override // defpackage.czgz
    public void q(Bundle bundle) {
        if (bundle.getBoolean(this.s.i(this))) {
            this.s.D(this, true, false);
        }
    }

    @Override // defpackage.czgz
    public boolean t(im imVar) {
        return false;
    }

    @Override // defpackage.czgz
    public final void w(boolean z) {
        if (this.q != z) {
            this.s.j();
            this.q = z;
            this.s.l();
        }
    }

    @Override // defpackage.czgz
    public final void x(Bundle bundle) {
        bundle.putBoolean(this.s.i(this), this.q);
    }

    @Override // defpackage.czgz
    public final boolean y() {
        return this.q;
    }
}

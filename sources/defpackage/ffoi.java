package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffoi implements ffnl {
    public final ffnl a;
    public final ffji b;

    public ffoi(ffnl ffnlVar, ffji ffjiVar) {
        this.a = ffnlVar;
        this.b = ffjiVar;
    }

    @Override // defpackage.ffnl
    public final Iterator a() {
        return new ffoh(this);
    }
}

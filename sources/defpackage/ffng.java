package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffng implements ffnl {
    public final ffnl a;
    public final boolean b;
    public final ffji c;

    public ffng(ffnl ffnlVar, boolean z, ffji ffjiVar) {
        this.a = ffnlVar;
        this.b = z;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffnl
    public final Iterator a() {
        return new ffnf(this);
    }
}

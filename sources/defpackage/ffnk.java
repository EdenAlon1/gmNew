package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffnk implements ffnl {
    public final ffix a;
    public final ffji b;

    public ffnk(ffix ffixVar, ffji ffjiVar) {
        this.a = ffixVar;
        this.b = ffjiVar;
    }

    @Override // defpackage.ffnl
    public final Iterator a() {
        return new ffnj(this);
    }
}

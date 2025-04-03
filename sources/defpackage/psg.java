package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class psg implements pse {
    private final pse a;
    private final Object b = new Object();

    public psg(pse pseVar) {
        this.a = pseVar;
    }

    @Override // defpackage.pse
    public final psb a(pxs pxsVar) {
        psb a;
        synchronized (this.b) {
            a = this.a.a(pxsVar);
        }
        return a;
    }

    @Override // defpackage.pse
    public final psb b(pxs pxsVar) {
        psb b;
        synchronized (this.b) {
            b = this.a.b(pxsVar);
        }
        return b;
    }

    @Override // defpackage.pse
    public final /* synthetic */ psb c(pyj pyjVar) {
        return psc.a(this, pyjVar);
    }

    @Override // defpackage.pse
    public final List d(String str) {
        List d;
        str.getClass();
        synchronized (this.b) {
            d = this.a.d(str);
        }
        return d;
    }

    @Override // defpackage.pse
    public final boolean e(pxs pxsVar) {
        boolean e;
        synchronized (this.b) {
            e = this.a.e(pxsVar);
        }
        return e;
    }
}

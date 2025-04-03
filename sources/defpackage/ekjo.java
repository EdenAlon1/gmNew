package defpackage;

import defpackage.ekjm;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekjo extends lml {
    public final llv a;
    public final ekjr b;
    public final eisx c;
    public final Object d = new Object();
    public volatile Object e;

    public ekjo(llv llvVar, ekjr ekjrVar, eisx eisxVar) {
        this.a = llvVar;
        this.b = ekjrVar;
        this.c = eisxVar;
    }

    @Override // defpackage.lml
    public final void fD() {
        fazv c;
        synchronized (this.d) {
            c = this.e != null ? ((ekjm.b) fazh.a(this.e, ekjm.b.class)).c() : null;
        }
        if (c != null) {
            c.b();
        }
    }
}

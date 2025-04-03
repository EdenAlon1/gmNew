package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enba extends enay {
    volatile long a;
    enbg b;
    enbg c;

    public enba(ReferenceQueue referenceQueue, Object obj, int i, enbg enbgVar) {
        super(referenceQueue, obj, i, enbgVar);
        this.a = Long.MAX_VALUE;
        int i2 = enbf.x;
        enak enakVar = enak.a;
        this.b = enakVar;
        this.c = enakVar;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final long c() {
        return this.a;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final enbg g() {
        return this.b;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final enbg i() {
        return this.c;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final void m(enbg enbgVar) {
        this.b = enbgVar;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final void o(enbg enbgVar) {
        this.c = enbgVar;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final void q(long j) {
        this.a = j;
    }
}

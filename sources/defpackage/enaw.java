package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enaw extends enay {
    volatile long a;
    enbg b;
    enbg c;

    public enaw(ReferenceQueue referenceQueue, Object obj, int i, enbg enbgVar) {
        super(referenceQueue, obj, i, enbgVar);
        this.a = Long.MAX_VALUE;
        int i2 = enbf.x;
        enak enakVar = enak.a;
        this.b = enakVar;
        this.c = enakVar;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final long b() {
        return this.a;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final enbg f() {
        return this.b;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final enbg h() {
        return this.c;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final void k(long j) {
        this.a = j;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final void l(enbg enbgVar) {
        this.b = enbgVar;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final void n(enbg enbgVar) {
        this.c = enbgVar;
    }
}

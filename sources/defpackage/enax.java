package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enax extends enay {
    volatile long a;
    enbg b;
    enbg c;
    volatile long d;
    enbg e;
    enbg f;

    public enax(ReferenceQueue referenceQueue, Object obj, int i, enbg enbgVar) {
        super(referenceQueue, obj, i, enbgVar);
        this.a = Long.MAX_VALUE;
        int i2 = enbf.x;
        enak enakVar = enak.a;
        this.b = enakVar;
        this.c = enakVar;
        this.d = Long.MAX_VALUE;
        enak enakVar2 = enak.a;
        this.e = enakVar2;
        this.f = enakVar2;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final long b() {
        return this.a;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final long c() {
        return this.d;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final enbg f() {
        return this.b;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final enbg g() {
        return this.e;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final enbg h() {
        return this.c;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final enbg i() {
        return this.f;
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
    public final void m(enbg enbgVar) {
        this.e = enbgVar;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final void n(enbg enbgVar) {
        this.c = enbgVar;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final void o(enbg enbgVar) {
        this.f = enbgVar;
    }

    @Override // defpackage.enay, defpackage.enbg
    public final void q(long j) {
        this.d = j;
    }
}

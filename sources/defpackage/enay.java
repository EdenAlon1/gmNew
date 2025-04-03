package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
class enay extends WeakReference implements enbg {
    final int g;
    final enbg h;
    volatile enau i;

    public enay(ReferenceQueue referenceQueue, Object obj, int i, enbg enbgVar) {
        super(obj, referenceQueue);
        this.i = enbf.b;
        this.g = i;
        this.h = enbgVar;
    }

    @Override // defpackage.enbg
    public final int a() {
        return this.g;
    }

    public long b() {
        throw new UnsupportedOperationException();
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.enbg
    public final enau d() {
        return this.i;
    }

    @Override // defpackage.enbg
    public final enbg e() {
        return this.h;
    }

    public enbg f() {
        throw new UnsupportedOperationException();
    }

    public enbg g() {
        throw new UnsupportedOperationException();
    }

    public enbg h() {
        throw new UnsupportedOperationException();
    }

    public enbg i() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.enbg
    public final Object j() {
        return get();
    }

    public void k(long j) {
        throw new UnsupportedOperationException();
    }

    public void l(enbg enbgVar) {
        throw new UnsupportedOperationException();
    }

    public void m(enbg enbgVar) {
        throw new UnsupportedOperationException();
    }

    public void n(enbg enbgVar) {
        throw new UnsupportedOperationException();
    }

    public void o(enbg enbgVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.enbg
    public final void p(enau enauVar) {
        this.i = enauVar;
    }

    public void q(long j) {
        throw new UnsupportedOperationException();
    }
}

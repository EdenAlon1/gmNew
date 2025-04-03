package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtzx implements dtzv {
    private final dttz a;
    private boolean b;
    private boolean c;
    private final dtvf d = new dtvf();
    private final dtuj e;
    private final AtomicReference f;

    public dtzx(dtve dtveVar, dttz dttzVar, dtui dtuiVar) {
        dtuj dtujVar = new dtuj() { // from class: dtzw
            @Override // defpackage.dtuj
            public final Object a() {
                throw new IllegalStateException("reentrant lock release callback not set or already completed");
            }
        };
        this.e = dtujVar;
        AtomicReference atomicReference = new AtomicReference(dtujVar);
        this.f = atomicReference;
        this.a = dttzVar;
        atomicReference.set(dtveVar.Q(dtuiVar));
    }

    @Override // defpackage.dtzv
    public final dttz a() {
        return this.a;
    }

    @Override // defpackage.dtzv
    public final dtvf b() {
        return this.d;
    }

    @Override // defpackage.dtzv
    public final void c() {
        ((dtuj) this.f.getAndSet(this.e)).a();
    }

    @Override // defpackage.dtzv
    public final void d(boolean z) {
        this.c = z;
    }

    @Override // defpackage.dtzv
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.dtzv
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.dtzv
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.dtzv
    public final void h() {
        this.b = true;
    }
}

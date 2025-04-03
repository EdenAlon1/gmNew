package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecde implements ecdd {
    private final ecdn a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ecgv i;

    public ecde(ecdn ecdnVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ecgv ecgvVar) {
        this.a = ecdnVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.h = ffbrVar4;
        this.e = ffbrVar5;
        this.f = ffbrVar6;
        this.g = ffbrVar7;
        this.i = ecgvVar;
        Boolean bool = Boolean.FALSE;
        bool.getClass();
        if (bool.booleanValue()) {
            return;
        }
        ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/PrimesApiImpl", "initializeMetricServices", 115, "PrimesApiImpl.java")).q("Primes instant initialization");
        try {
            eleg.d();
            Iterator it = ((Set) ffbrVar.b()).iterator();
            while (it.hasNext()) {
                ((ecje) it.next()).n();
            }
        } catch (RuntimeException e) {
            ((enrr) ((enrr) ((enrr) ecdj.a.j()).g(e)).h("com/google/android/libraries/performance/primes/PrimesApiImpl", "initializeMetricServices", '{', "PrimesApiImpl.java")).q("Primes failed to initialize");
            ecdn ecdnVar2 = this.a;
            if (ecdnVar2.a) {
                return;
            }
            ecdnVar2.a = true;
            ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/Shutdown", "shutdown", 33, "Shutdown.java")).q("Shutdown ...");
        }
    }

    @Override // defpackage.ecdd
    public final ecno a() {
        return (ecno) this.h.b();
    }

    @Override // defpackage.ecdd
    public final ecri b() {
        return ((ecrj) this.f.b()).d();
    }

    @Override // defpackage.ecdd
    public final void c(ecda ecdaVar) {
        ((ecrj) this.f.b()).c(ecdaVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ffbr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [ffbr, java.lang.Object] */
    @Override // defpackage.ecdd
    public final void d() {
        ecgv ecgvVar = this.i;
        if (ecgvVar.a.getAndSet(true)) {
            return;
        }
        ((eckt) ((emxn) ecgvVar.b).a.b()).k();
        ((ecnx) ((emxn) ecgvVar.c).a.b()).d();
    }

    @Override // defpackage.ecdd
    public final void e(ecda ecdaVar, fgmh fgmhVar) {
        ((ecnx) this.d.b()).e(ecdaVar, fgmhVar);
    }

    @Override // defpackage.ecdd
    public final void f(ecou ecouVar) {
        ((ecox) this.e.b()).a(ecouVar);
    }

    @Override // defpackage.ecdd
    public final void g(ecda ecdaVar) {
        ((ecrj) this.f.b()).e(ecdaVar);
    }

    @Override // defpackage.ecdd
    public final void h() {
        ((ecnx) this.d.b()).d();
    }

    @Override // defpackage.ecdd
    public final void i(ecri ecriVar, ecda ecdaVar, fgmh fgmhVar, ecrh ecrhVar) {
        ((ecrj) this.f.b()).f(ecriVar, ecdaVar, fgmhVar, ecrhVar);
    }

    @Override // defpackage.ecdd
    public final boolean j() {
        return ((ecot) this.c.b()).c();
    }

    @Override // defpackage.ecdd
    public final void k(ecda ecdaVar, long j, long j2) {
        ((ecre) this.g.b()).a(ecdaVar, j, j2, null);
    }

    @Override // defpackage.ecdd
    public final void l(ecda ecdaVar, ecrh ecrhVar) {
        ((ecrj) this.f.b()).g(ecdaVar, null, null, ecrhVar);
    }
}

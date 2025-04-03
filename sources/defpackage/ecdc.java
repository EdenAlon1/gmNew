package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecdc {
    private static final ecdc b;
    private static volatile boolean c;
    private static volatile ecdc d;
    public final ecdd a;

    static {
        ecdc ecdcVar = new ecdc(new ecdb());
        b = ecdcVar;
        c = true;
        d = ecdcVar;
    }

    public ecdc(ecdd ecddVar) {
        ecddVar.getClass();
        this.a = ecddVar;
    }

    public static ecdc a() {
        if (d == b && c) {
            c = false;
            enrr enrrVar = (enrr) ecdj.a.j();
            enrrVar.aa(Math.random() < 0.01d ? ensy.FULL : ensy.NONE);
            ((enrr) enrrVar.h("com/google/android/libraries/performance/primes/Primes", "get", 179, "Primes.java")).q("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.");
        }
        return d;
    }

    static synchronized void d(ecdc ecdcVar) {
        synchronized (ecdc.class) {
            if (d != b) {
                ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/Primes", "cache", 139, "Primes.java")).q("Primes cached more than once. This call will be ignored.");
            } else {
                d = ecdcVar;
            }
        }
    }

    public static boolean i() {
        return d != b;
    }

    public final ecno b() {
        return this.a.a();
    }

    public final ecri c() {
        return this.a.b();
    }

    public final void e(ecda ecdaVar) {
        f(ecdaVar, null);
    }

    public final void f(ecda ecdaVar, fgmh fgmhVar) {
        this.a.e(ecdaVar, fgmhVar);
    }

    public final void g(ecou ecouVar) {
        this.a.f(ecouVar);
    }

    public final void h(ecri ecriVar, ecda ecdaVar, ecrh ecrhVar) {
        this.a.i(ecriVar, ecdaVar, null, ecrhVar);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class ecgl {
    public int a = 1;

    public abstract void i(ecda ecdaVar);

    public abstract void j(ecda ecdaVar);

    public final void k(ecda ecdaVar) {
        if (this.a == 3) {
            ((enrr) ((enrr) ecdj.a.g()).h("com/google/android/libraries/performance/primes/foreground/AbstractForegroundSignalAdapter", "observeBackgroundSignal", 42, "AbstractForegroundSignalAdapter.java")).q("Already in the background, not transitioning");
        } else {
            this.a = 3;
            i(ecdaVar);
        }
    }

    public final void l(ecda ecdaVar) {
        if (this.a == 2) {
            ((enrr) ((enrr) ecdj.a.g()).h("com/google/android/libraries/performance/primes/foreground/AbstractForegroundSignalAdapter", "observeForegroundSignal", 31, "AbstractForegroundSignalAdapter.java")).q("Already in the foreground, not transitioning");
        } else {
            this.a = 2;
            j(ecdaVar);
        }
    }
}

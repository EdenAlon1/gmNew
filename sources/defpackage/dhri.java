package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhri<TResult> {
    public final dhrm a = new dhrm();

    public dhri() {
    }

    public final void a(Exception exc) {
        this.a.u(exc);
    }

    public final void b(Object obj) {
        this.a.v(obj);
    }

    public final boolean c(Exception exc) {
        dfwv.o(exc, "Exception must not be null");
        dhrm dhrmVar = this.a;
        synchronized (dhrmVar.a) {
            if (dhrmVar.c) {
                return false;
            }
            dhrmVar.c = true;
            dhrmVar.e = exc;
            dhrmVar.b.b(dhrmVar);
            return true;
        }
    }

    public final boolean d(Object obj) {
        return this.a.w(obj);
    }

    public dhri(dhqd dhqdVar) {
        dhqdVar.a(new dhrh(this));
    }
}

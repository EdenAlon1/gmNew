package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgge {
    public final ffqn a = new ffqn(null, ffqo.a);
    private final ffqn b;

    public fgge(fgge fggeVar) {
        this.b = new ffqn(fggeVar, ffqo.a);
    }

    public final Object m() {
        return this.a.a;
    }

    public final fgge n() {
        Object m = m();
        if (m == fggd.a) {
            return null;
        }
        return (fgge) m;
    }

    public final fgge o() {
        return (fgge) this.b.a;
    }

    public final void p() {
        this.b.b(null);
    }

    public final void q() {
        Object obj;
        fgge n;
        boolean z = ffso.a;
        if (s()) {
            return;
        }
        while (true) {
            fgge o = o();
            while (o != null && o.r()) {
                o = (fgge) o.b.a;
            }
            fgge n2 = n();
            n2.getClass();
            while (n2.r() && (n = n2.n()) != null) {
                n2 = n;
            }
            ffqn ffqnVar = n2.b;
            do {
                obj = ffqnVar.a;
            } while (!ffqnVar.d(obj, ((fgge) obj) == null ? null : o));
            if (o != null) {
                o.a.c(n2);
            }
            if (!n2.r() || n2.s()) {
                if (o == null || !o.r()) {
                    return;
                }
            }
        }
    }

    public abstract boolean r();

    public final boolean s() {
        return n() == null;
    }
}

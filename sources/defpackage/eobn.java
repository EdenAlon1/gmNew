package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eobn extends eobj implements eocp {
    private static Map h(final eocp eocpVar) {
        return new enmr(eocpVar.c(), new emwl() { // from class: eobm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eobs eobsVar = (eobs) obj;
                Object obj2 = eobsVar.a;
                Object obj3 = eobsVar.b;
                Object g = eocp.this.g(obj2);
                g.getClass();
                return g;
            }
        });
    }

    @Override // defpackage.eobj, defpackage.eoci
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eocp)) {
            return false;
        }
        eocp eocpVar = (eocp) obj;
        eocpVar.f();
        return d().equals(eocpVar.d()) && h(this).equals(h(eocpVar));
    }

    public final int hashCode() {
        return h(this).hashCode();
    }

    public final String toString() {
        return "isDirected: true, allowsSelfLoops: false, nodes: " + d().toString() + ", edges: " + h(this).toString();
    }
}

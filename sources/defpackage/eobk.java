package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eobk extends eobj implements eobw {
    @Override // defpackage.eobj, defpackage.eoci
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eobw)) {
            return false;
        }
        eobw eobwVar = (eobw) obj;
        eobwVar.g();
        return d().equals(eobwVar.d()) && new eobi(this).equals(eobwVar.c());
    }

    public final int hashCode() {
        return new eobi(this).hashCode();
    }

    public final String toString() {
        return "isDirected: true, allowsSelfLoops: false, nodes: " + d().toString() + ", edges: " + new eobi(this).toString();
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ita {
    private final ixq a = new ixq(itc.a);

    public final iui a() {
        iui iuiVar = (iui) this.a.first();
        e(iuiVar);
        return iuiVar;
    }

    public final void b(iui iuiVar) {
        if (!iuiVar.e()) {
            imn.c("DepthSortedSet.add called on an unattached node");
        }
        this.a.add(iuiVar);
    }

    public final boolean c(iui iuiVar) {
        return this.a.contains(iuiVar);
    }

    public final boolean d() {
        return this.a.isEmpty();
    }

    public final void e(iui iuiVar) {
        if (!iuiVar.e()) {
            imn.c("DepthSortedSet.remove called on an unattached node");
        }
        this.a.remove(iuiVar);
    }

    public final String toString() {
        return this.a.toString();
    }
}

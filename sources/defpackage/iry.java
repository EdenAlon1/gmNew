package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iry extends irr {
    private final irn a;
    private final hho b = new hic(null, hla.a);

    public iry(irn irnVar) {
        this.a = irnVar;
    }

    @Override // defpackage.irr
    public final Object a(irn irnVar) {
        if (irnVar != this.a) {
            imn.c("Check failed.");
        }
        Object a = this.b.a();
        if (a == null) {
            return null;
        }
        return a;
    }

    @Override // defpackage.irr
    public final void b(irn irnVar, Object obj) {
        if (irnVar != this.a) {
            imn.c("Check failed.");
        }
        this.b.b(obj);
    }

    @Override // defpackage.irr
    public final boolean c(irn irnVar) {
        return irnVar == this.a;
    }
}

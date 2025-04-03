package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class irl extends irr {
    public irv a;

    public irl(irv irvVar) {
        this.a = irvVar;
    }

    @Override // defpackage.irr
    public final Object a(irn irnVar) {
        if (irnVar != this.a.j()) {
            imn.c("Check failed.");
        }
        return this.a.k();
    }

    @Override // defpackage.irr
    public final void b(irn irnVar, Object obj) {
        throw null;
    }

    @Override // defpackage.irr
    public final boolean c(irn irnVar) {
        return irnVar == this.a.j();
    }
}

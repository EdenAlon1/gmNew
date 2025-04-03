package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgh {
    public static final ffix a(final iya iyaVar, lkk lkkVar) {
        if (lkkVar.a().compareTo(lkj.DESTROYED) <= 0) {
            throw new IllegalStateException(a.k(lkkVar, iyaVar, "Cannot configure ", " to disposeComposition at Lifecycle ON_DESTROY: ", "is already destroyed"));
        }
        lkp lkpVar = new lkp() { // from class: jgf
            @Override // defpackage.lkp
            public final void hg(lkr lkrVar, lki lkiVar) {
                if (lkiVar == lki.ON_DESTROY) {
                    iya.this.f();
                }
            }
        };
        lkkVar.c(lkpVar);
        return new jgg(lkkVar, lkpVar);
    }
}

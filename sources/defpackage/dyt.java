package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dyt implements iro {
    private final ffji a;
    private ecd b;

    public dyt(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.hvi
    public final /* synthetic */ hvi a(hvi hviVar) {
        return hvd.a(this, hviVar);
    }

    @Override // defpackage.hvi
    public final /* synthetic */ Object b(Object obj, ffjm ffjmVar) {
        return hvf.a(this, obj, ffjmVar);
    }

    @Override // defpackage.hvi
    public final /* synthetic */ boolean c(ffji ffjiVar) {
        return hvf.b(this, ffjiVar);
    }

    @Override // defpackage.iro
    public final void d(irw irwVar) {
        ecd ecdVar = (ecd) irwVar.r(ecm.a);
        if (ffkj.e(ecdVar, this.b)) {
            return;
        }
        this.b = ecdVar;
        this.a.invoke(ecdVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dyt) && ((dyt) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

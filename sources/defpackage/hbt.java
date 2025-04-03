package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbt implements ecd {
    public final hho a;

    public hbt() {
        this(new dzi());
    }

    @Override // defpackage.ecd
    public final int a(jzn jznVar) {
        return e().a(jznVar);
    }

    @Override // defpackage.ecd
    public final int b(jzn jznVar, kah kahVar) {
        return e().b(jznVar, kahVar);
    }

    @Override // defpackage.ecd
    public final int c(jzn jznVar, kah kahVar) {
        return e().c(jznVar, kahVar);
    }

    @Override // defpackage.ecd
    public final int d(jzn jznVar) {
        return e().d(jznVar);
    }

    public final ecd e() {
        return (ecd) this.a.a();
    }

    public hbt(ecd ecdVar) {
        this.a = new hic(ecdVar, hla.a);
    }
}

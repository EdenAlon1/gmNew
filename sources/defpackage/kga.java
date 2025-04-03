package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kga extends jeu implements iqg {
    private final kfr a;
    private final ffji b;

    public kga(kfr kfrVar, ffji ffjiVar) {
        this.a = kfrVar;
        this.b = ffjiVar;
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

    @Override // defpackage.iqg
    public final /* bridge */ /* synthetic */ Object d() {
        return new kfz(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        kga kgaVar = obj instanceof kga ? (kga) obj : null;
        return this.b == (kgaVar != null ? kgaVar.b : null);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}

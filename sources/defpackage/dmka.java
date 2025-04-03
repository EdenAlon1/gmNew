package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmka implements ffjm {
    final /* synthetic */ dmke a;

    public dmka(dmke dmkeVar) {
        this.a = dmkeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else if (this.a.b) {
            hfdVar.v(-1552236985);
            dmkb.a(this.a.d, hfdVar, 0);
            hfdVar.o();
        } else {
            hfdVar.v(-1552150619);
            dmkb.c(this.a.d, hfdVar, 0);
            hfdVar.o();
        }
        return ffcu.a;
    }
}

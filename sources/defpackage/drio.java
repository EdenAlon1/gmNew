package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drio implements ffjm {
    final /* synthetic */ fgdj a;
    final /* synthetic */ ffjm b;

    public drio(fgdj fgdjVar, ffjm ffjmVar) {
        this.a = fgdjVar;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hkx a = hkf.a(this.a, hfdVar);
            int ordinal = ((drhu) hkf.a(((drja) a.a()).l, hfdVar).a()).ordinal();
            if (ordinal == 0) {
                hfdVar.v(1710749138);
                hfdVar.o();
            } else if (ordinal == 1) {
                hfdVar.v(55189256);
                drip.g(a, hfdVar, 0);
                hfdVar.o();
            } else {
                if (ordinal != 2) {
                    hfdVar.v(55183279);
                    hfdVar.o();
                    throw new ffcd();
                }
                hfdVar.v(55187198);
                this.b.a(hfdVar, 0);
                hfdVar.o();
            }
        }
        return ffcu.a;
    }
}

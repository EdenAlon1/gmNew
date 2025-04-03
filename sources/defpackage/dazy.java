package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dazy implements ffjm {
    final /* synthetic */ dbac a;
    final /* synthetic */ hjz b;

    public dazy(dbac dbacVar, hjz hjzVar) {
        this.a = dbacVar;
        this.b = hjzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dbac dbacVar = this.a;
            hjz hjzVar = this.b;
            int i = 0;
            for (Object obj3 : dbacVar.b) {
                int i2 = i + 1;
                if (i < 0) {
                    ffdx.l();
                }
                dbacVar.a(hjzVar, i, (dazo) obj3, hfdVar, 0);
                i = i2;
            }
        }
        return ffcu.a;
    }
}

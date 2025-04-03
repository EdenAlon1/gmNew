package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbfc implements ffjm {
    final /* synthetic */ dbfg a;
    final /* synthetic */ hho b;

    public dbfc(dbfg dbfgVar, hho hhoVar) {
        this.a = dbfgVar;
        this.b = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dbfg dbfgVar = this.a;
            hho hhoVar = this.b;
            int i = 0;
            for (Object obj3 : dbfgVar.c) {
                int i2 = i + 1;
                if (i < 0) {
                    ffdx.l();
                }
                dbfgVar.a(hhoVar, i, (dbhe) obj3, hfdVar, 0);
                i = i2;
            }
        }
        return ffcu.a;
    }
}

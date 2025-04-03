package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pvl extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public pvl(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        pvl pvlVar = new pvl((ffgu) obj3);
        pvlVar.c = (ffxy) obj;
        pvlVar.b = (Object[]) obj2;
        return pvlVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        pva pvaVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r7 = this.c;
            pva[] pvaVarArr = (pva[]) this.b;
            int length = pvaVarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    pvaVar = null;
                    break;
                }
                pvaVar = pvaVarArr[i2];
                if (!ffkj.e(pvaVar, puy.a)) {
                    break;
                }
                i2++;
            }
            if (pvaVar == null) {
                pvaVar = puy.a;
            }
            this.a = 1;
            if (r7.fQ(pvaVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}

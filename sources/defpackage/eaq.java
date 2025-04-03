package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class eaq extends hvh implements itu {
    public abstract boolean a();

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        long i = i(iplVar, j);
        if (a()) {
            i = jzl.f(j, i);
        }
        iqk e = iplVar.e(i);
        ei = ipqVar.ei(e.a, e.b, ffem.a, new eap(e));
        return ei;
    }

    public int e(iny inyVar, inx inxVar, int i) {
        return inxVar.a(i);
    }

    @Override // defpackage.itu
    public int f(iny inyVar, inx inxVar, int i) {
        return inxVar.b(i);
    }

    public int g(iny inyVar, inx inxVar, int i) {
        return inxVar.c(i);
    }

    @Override // defpackage.itu
    public int h(iny inyVar, inx inxVar, int i) {
        return inxVar.d(i);
    }

    public abstract long i(ipl iplVar, long j);
}

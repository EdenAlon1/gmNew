package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flm extends hvh implements isu, itu {
    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        boolean z = false;
        if (this.z && ((Boolean) isv.a(this, fky.a)).booleanValue()) {
            z = true;
        }
        long j2 = fky.b;
        iqk e = iplVar.e(j);
        int max = z ? Math.max(e.a, ipqVar.eo(jzv.b(j2))) : e.a;
        int max2 = z ? Math.max(e.b, ipqVar.eo(jzv.a(j2))) : e.b;
        ei = ipqVar.ei(max, max2, ffem.a, new fll(max, e, max2));
        return ei;
    }

    @Override // defpackage.itu
    public final /* synthetic */ int e(iny inyVar, inx inxVar, int i) {
        return itt.a(this, inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final /* synthetic */ int f(iny inyVar, inx inxVar, int i) {
        return itt.b(this, inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final /* synthetic */ int g(iny inyVar, inx inxVar, int i) {
        return itt.c(this, inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final /* synthetic */ int h(iny inyVar, inx inxVar, int i) {
        return itt.d(this, inyVar, inxVar, i);
    }
}

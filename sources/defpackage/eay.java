package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eay extends hvh implements itu {
    public ffji a;
    public boolean b;

    public eay(ffji ffjiVar, boolean z) {
        this.a = ffjiVar;
        this.b = z;
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        iqk e = iplVar.e(j);
        ei = ipqVar.ei(e.a, e.b, ffem.a, new eax(this, ipqVar, e));
        return ei;
    }

    @Override // defpackage.hvh
    public final boolean dM() {
        return false;
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

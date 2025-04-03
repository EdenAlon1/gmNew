package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbb<T> extends hvh implements itu {
    public gzl a;
    public ffjm b;
    public dqs c;
    private boolean d;

    public hbb(gzl gzlVar, ffjm ffjmVar, dqs dqsVar) {
        this.a = gzlVar;
        this.b = ffjmVar;
        this.c = dqsVar;
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        boolean d;
        ipo ei;
        iqk e = iplVar.e(j);
        if (!ipqVar.eu() || !this.d) {
            ffcf ffcfVar = (ffcf) this.b.a(new kaf(kag.a(e.a, e.b)), new jzk(j));
            gzl gzlVar = this.a;
            hbq hbqVar = (hbq) ffcfVar.a;
            Object obj = ffcfVar.b;
            if (!ffkj.e(gzlVar.p(), hbqVar)) {
                gzlVar.f.b(hbqVar);
                hbl hblVar = gzlVar.c;
                gzk gzkVar = new gzk(gzlVar, obj);
                d = hblVar.b.d(null);
                if (d) {
                    try {
                        gzkVar.invoke();
                    } finally {
                        hblVar.b.b(null);
                    }
                } else {
                    gzlVar.m(obj);
                }
            }
        }
        boolean z = true;
        if (!ipqVar.eu() && !this.d) {
            z = false;
        }
        this.d = z;
        ei = ipqVar.ei(e.a, e.b, ffem.a, new hba(ipqVar, this, e));
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

    @Override // defpackage.hvh
    public final void t() {
        this.d = false;
    }
}

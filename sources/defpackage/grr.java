package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grr extends hvh implements itu {
    public boolean a;
    public cyq b;
    public boolean c;
    public cxj d;
    public cxj e;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public dwn h;

    public grr(dwn dwnVar, boolean z, cyq cyqVar) {
        this.h = dwnVar;
        this.a = z;
        this.b = cyqVar;
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        boolean z = false;
        if (iplVar.a(jzk.b(j)) != 0 && iplVar.b(jzk.a(j)) != 0) {
            z = true;
        }
        float em = ipqVar.em(this.c ? 28.0f : (z || this.a) ? 24.0f : 16.0f);
        cxj cxjVar = this.e;
        int floatValue = (int) (cxjVar != null ? ((Number) cxjVar.d()).floatValue() : em);
        iqk e = iplVar.e(jzj.c(floatValue, floatValue));
        float em2 = ipqVar.em((32.0f - ipqVar.eg(em)) / 2.0f);
        float em3 = ipqVar.em(24.0f);
        if (this.c) {
            em2 = this.a ? em3 - ipqVar.em(2.0f) : ipqVar.em(2.0f);
        } else if (this.a) {
            em2 = em3;
        }
        cxj cxjVar2 = this.e;
        if (!ffkj.d(cxjVar2 != null ? (Float) cxjVar2.c() : null, em)) {
            ffqy.d(D(), null, null, new grm(this, em, null), 3);
        }
        cxj cxjVar3 = this.d;
        if (!ffkj.d(cxjVar3 != null ? (Float) cxjVar3.c() : null, em2)) {
            ffqy.d(D(), null, null, new grn(this, em2, null), 3);
        }
        if (Float.isNaN(this.g) && Float.isNaN(this.f)) {
            this.g = em;
            this.f = em2;
        }
        ei = ipqVar.ei(floatValue, floatValue, ffem.a, new gro(e, this, em2));
        return ei;
    }

    @Override // defpackage.hvh
    public final boolean dM() {
        return false;
    }

    @Override // defpackage.hvh
    public final void dT() {
        ffqy.d(D(), null, null, new grq(this, null), 3);
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

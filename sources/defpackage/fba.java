package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fba extends isz implements itu, itg, iti {
    public fbe a;
    public final fbo b;

    public fba(jlm jlmVar, jpo jpoVar, jse jseVar, ffji ffjiVar, int i, boolean z, int i2, int i3, List list, ffji ffjiVar2, fbe fbeVar, ibz ibzVar) {
        this.a = fbeVar;
        fbo fboVar = new fbo(jlmVar, jpoVar, jseVar, ffjiVar, i, z, i2, i3, list, ffjiVar2, this.a, ibzVar, null);
        M(fboVar);
        this.b = fboVar;
        if (this.a != null) {
            return;
        }
        dwv.a("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new ffbx();
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        return this.b.b(ipqVar, iplVar, j);
    }

    @Override // defpackage.hvh
    public final boolean dM() {
        return false;
    }

    @Override // defpackage.iti
    public final void dQ(ioc iocVar) {
        fbe fbeVar = this.a;
        if (fbeVar != null) {
            fbeVar.d = fbh.a(fbeVar.d, iocVar, null, 2);
            fbeVar.b.c(fbeVar.a);
        }
    }

    @Override // defpackage.itu
    public final int e(iny inyVar, inx inxVar, int i) {
        return this.b.e(inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final int f(iny inyVar, inx inxVar, int i) {
        return this.b.f(inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final int g(iny inyVar, inx inxVar, int i) {
        return this.b.g(inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final int h(iny inyVar, inx inxVar, int i) {
        return this.b.h(inyVar, inxVar, i);
    }

    @Override // defpackage.itg
    public final void s(ifo ifoVar) {
        this.b.s(ifoVar);
    }

    @Override // defpackage.itg
    public final /* synthetic */ void u() {
    }
}

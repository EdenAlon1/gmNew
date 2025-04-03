package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ito extends iwi {
    private static final ict h;
    public final ixr f;
    public iuw g;

    static {
        iba ibaVar = new iba();
        ibaVar.k(ibw.e);
        ibaVar.r(1.0f);
        ibaVar.s(1);
        h = ibaVar;
    }

    public ito(iui iuiVar) {
        super(iuiVar);
        ixr ixrVar = new ixr();
        this.f = ixrVar;
        ixrVar.v = this;
        this.g = iuiVar.k != null ? new itn(this) : null;
    }

    private final void G() {
        if (this.j) {
            return;
        }
        this.r.x().A();
    }

    @Override // defpackage.iwi
    public final /* synthetic */ hvh B() {
        return this.f;
    }

    @Override // defpackage.iwi
    public final iuw C() {
        return this.g;
    }

    @Override // defpackage.iwi
    public final void D() {
        if (this.g == null) {
            this.g = new itn(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [hne] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [hne] */
    @Override // defpackage.iwi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(defpackage.iwc r18, long r19, defpackage.itl r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ito.E(iwc, long, itl, int, boolean):void");
    }

    @Override // defpackage.iwi
    public final void F(ibt ibtVar, iga igaVar) {
        iui iuiVar = this.r;
        iwx a = ium.a(iuiVar);
        hne r = iuiVar.r();
        Object[] objArr = r.a;
        int i = r.b;
        for (int i2 = 0; i2 < i; i2++) {
            iui iuiVar2 = (iui) objArr[i2];
            if (iuiVar2.g()) {
                iuiVar2.N(ibtVar, igaVar);
            }
        }
        if (((AndroidComposeView) a).w) {
            ae(ibtVar, h);
        }
    }

    @Override // defpackage.inx
    public final int a(int i) {
        itq t = this.r.t();
        ipn a = t.a();
        iui iuiVar = t.a;
        return a.a(iuiVar.z(), iuiVar.F(), i);
    }

    @Override // defpackage.inx
    public final int b(int i) {
        itq t = this.r.t();
        ipn a = t.a();
        iui iuiVar = t.a;
        return a.b(iuiVar.z(), iuiVar.F(), i);
    }

    @Override // defpackage.inx
    public final int c(int i) {
        itq t = this.r.t();
        ipn a = t.a();
        iui iuiVar = t.a;
        return a.c(iuiVar.z(), iuiVar.F(), i);
    }

    @Override // defpackage.inx
    public final int d(int i) {
        itq t = this.r.t();
        ipn a = t.a();
        iui iuiVar = t.a;
        return a.d(iuiVar.z(), iuiVar.F(), i);
    }

    @Override // defpackage.ipl
    public final iqk e(long j) {
        if (this.t) {
            iuw iuwVar = this.g;
            iuwVar.getClass();
            j = iuwVar.d;
        }
        z(j);
        hne s = this.r.s();
        Object[] objArr = s.a;
        int i = s.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((iui) objArr[i2]).x().G = 3;
        }
        iui iuiVar = this.r;
        at(iuiVar.r.e(this, iuiVar.F(), j));
        am();
        return this;
    }

    @Override // defpackage.iwi, defpackage.iqk
    protected final void ee(long j, float f, ffji ffjiVar) {
        super.ee(j, f, ffjiVar);
        G();
    }

    @Override // defpackage.iuv
    public final int s(imq imqVar) {
        iuw iuwVar = this.g;
        if (iuwVar != null) {
            return iuwVar.s(imqVar);
        }
        ivm ivmVar = (ivm) aa();
        if (!ivmVar.l) {
            if (ivmVar.D() == 1) {
                isa isaVar = ivmVar.w;
                isaVar.f = true;
                if (isaVar.b) {
                    ivmVar.r();
                }
            } else {
                ivmVar.w.g = true;
            }
        }
        ivmVar.i().k = true;
        ivmVar.k();
        ivmVar.i().k = false;
        Integer num = (Integer) ivmVar.w.h.get(imqVar);
        if (num == null) {
            return Integer.MIN_VALUE;
        }
        return num.intValue();
    }

    @Override // defpackage.iwi, defpackage.iqk
    public final void x(long j, float f, iga igaVar) {
        super.x(j, f, igaVar);
        G();
    }
}

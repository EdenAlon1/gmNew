package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auo extends axv {
    public static final /* synthetic */ int c = 0;
    aup a;
    bgc b;
    private final Object d;
    private Rect e;
    private Matrix f;
    private bdy g;
    private bgd h;

    static {
        ben benVar = aum.a;
    }

    public auo(ben benVar) {
        super(benVar);
        this.d = new Object();
    }

    public final int a() {
        return ((ben) this.k).G();
    }

    public final int b() {
        return ((Integer) bfy.c((ben) this.k, ben.b, 6)).intValue();
    }

    public final int c() {
        return ((Integer) bfy.c((ben) this.k, ben.d, 1)).intValue();
    }

    @Override // defpackage.axv
    public final bgr d(bdp bdpVar) {
        this.b.h(bdpVar);
        Q(auh.a(new Object[]{this.b.b()}));
        bgq f = this.l.f();
        ((bbp) f).b = bdpVar;
        return f.a();
    }

    @Override // defpackage.axv
    public final bhg e(bdp bdpVar) {
        return aul.a(bdpVar);
    }

    @Override // defpackage.axv
    public final bhh f(boolean z, bhl bhlVar) {
        bdp a = bhlVar.a(bhe.f(aum.a), 1);
        if (z) {
            a = bdm.a(a, aum.a);
        }
        if (a == null) {
            return null;
        }
        return aul.a(a).c();
    }

    @Override // defpackage.axv
    protected final bhh g(bcq bcqVar, bhg bhgVar) {
        synchronized (this.d) {
        }
        return bhgVar.c();
    }

    public final Boolean h() {
        return (Boolean) bfy.c((ben) this.k, ben.e, null);
    }

    final void i() {
        biw.b();
        bgd bgdVar = this.h;
        if (bgdVar != null) {
            bgdVar.b();
            this.h = null;
        }
        bdy bdyVar = this.g;
        if (bdyVar != null) {
            bdyVar.d();
            this.g = null;
        }
    }

    @Override // defpackage.axv
    public final void j() {
        i();
        synchronized (this.d) {
            aup aupVar = this.a;
            aupVar.m = false;
            aupVar.d();
            this.a = null;
        }
    }

    @Override // defpackage.axv
    public final void k(Matrix matrix) {
        super.k(matrix);
        synchronized (this.d) {
            aup aupVar = this.a;
            if (aupVar != null) {
                aupVar.f(matrix);
            }
            this.f = matrix;
        }
    }

    @Override // defpackage.axv
    public final void l(Rect rect) {
        this.m = rect;
        synchronized (this.d) {
            aup aupVar = this.a;
            if (aupVar != null) {
                aupVar.g(rect);
            }
            this.e = rect;
        }
    }

    public final void m() {
        synchronized (this.d) {
            bct F = F();
            if (F != null) {
                this.a.a = A(F);
            }
        }
    }

    public final boolean n() {
        return ((Boolean) bfy.c((ben) this.k, ben.f, false)).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0153, code lost:
    
        if (r11 == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.bgc o(defpackage.ben r14, defpackage.bgr r15) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auo.o(ben, bgr):bgc");
    }

    @Override // defpackage.axv
    protected final void p(bgr bgrVar, bgr bgrVar2) {
        ben benVar = (ben) this.k;
        H();
        bgc o = o(benVar, bgrVar);
        this.b = o;
        Q(auh.a(new Object[]{o.b()}));
    }

    public final String toString() {
        return "ImageAnalysis:".concat(I());
    }
}

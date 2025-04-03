package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxa extends TextPaint {
    public int a;
    private ict b;
    private jyk c;
    private idg d;
    private ibw e;
    private ibq f;
    private hkx g;
    private iar h;
    private ifs i;

    public jxa(float f) {
        super(1);
        this.density = f;
        this.c = jyk.a;
        this.a = 3;
        this.d = idg.a;
    }

    private final ict g() {
        ict ictVar = this.b;
        if (ictVar != null) {
            return ictVar;
        }
        iba ibaVar = new iba(this);
        this.b = ibaVar;
        return ibaVar;
    }

    private final void h() {
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void a(int i) {
        if (ibk.b(i, this.a)) {
            return;
        }
        g().j(i);
        this.a = i;
    }

    public final void b(ibq ibqVar, long j, float f) {
        iar iarVar;
        if (ibqVar == null) {
            h();
            return;
        }
        if ((!ffkj.e(this.f, ibqVar) || (iarVar = this.h) == null || !iar.f(iarVar.a, j)) && j != 9205357640488583168L) {
            this.f = ibqVar;
            this.h = new iar(j);
            jwz jwzVar = new jwz(ibqVar, j);
            hqg hqgVar = hkg.a;
            this.g = new hgk(jwzVar, null);
        }
        ict g = g();
        hkx hkxVar = this.g;
        g.n(hkxVar != null ? (Shader) hkxVar.a() : null);
        this.e = null;
        jxb.a(this, f);
    }

    public final void c(long j) {
        ibw ibwVar = this.e;
        if ((ibwVar != null && ffcp.a(ibwVar.i, j)) || j == 16) {
            return;
        }
        this.e = new ibw(j);
        setColor(iby.b(j));
        h();
    }

    public final void d(ifs ifsVar) {
        if (ifsVar == null || ffkj.e(this.i, ifsVar)) {
            return;
        }
        this.i = ifsVar;
        if (ffkj.e(ifsVar, ifu.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (ifsVar instanceof ifv) {
            g().s(1);
            ifv ifvVar = (ifv) ifsVar;
            g().r(ifvVar.a);
            g().q(ifvVar.b);
            g().p(ifvVar.d);
            g().o(ifvVar.c);
            g().t();
        }
    }

    public final void e(idg idgVar) {
        if (idgVar == null || ffkj.e(this.d, idgVar)) {
            return;
        }
        this.d = idgVar;
        if (ffkj.e(idgVar, idg.a)) {
            clearShadowLayer();
        } else {
            idg idgVar2 = this.d;
            setShadowLayer(jxr.a(idgVar2.d), Float.intBitsToFloat((int) (idgVar2.c >> 32)), Float.intBitsToFloat((int) (this.d.c & 4294967295L)), iby.b(this.d.b));
        }
    }

    public final void f(jyk jykVar) {
        if (jykVar == null || ffkj.e(this.c, jykVar)) {
            return;
        }
        this.c = jykVar;
        setUnderlineText(jykVar.a(jyk.b));
        setStrikeThruText(this.c.a(jyk.c));
    }
}

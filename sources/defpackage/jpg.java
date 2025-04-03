package defpackage;

import android.graphics.RectF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpg {
    public final jpf a;
    public final jlz b;
    public final long c;
    public final float d;
    public final float e;
    public final List f;

    public jpg(jpf jpfVar, jlz jlzVar, long j) {
        this.a = jpfVar;
        this.b = jlzVar;
        this.c = j;
        float f = 0.0f;
        this.d = jlzVar.h.isEmpty() ? 0.0f : ((jmg) jlzVar.h.get(0)).a.a();
        if (!jlzVar.h.isEmpty()) {
            jmg jmgVar = (jmg) ffdx.P(jlzVar.h);
            f = jmgVar.a(jmgVar.a.d());
        }
        this.e = f;
        this.f = jlzVar.g;
    }

    public final float a(int i, boolean z) {
        jlz jlzVar = this.b;
        jlzVar.l(i);
        jmg jmgVar = (jmg) jlzVar.h.get(i == jlzVar.j().a() ? ffdx.e(jlzVar.h) : jme.a(jlzVar.h, i));
        return jmgVar.a.c(jmgVar.e(i), z);
    }

    public final float b(int i) {
        return this.b.a(i);
    }

    public final float c(int i) {
        jlz jlzVar = this.b;
        jlzVar.m(i);
        List list = jlzVar.h;
        jmg jmgVar = (jmg) list.get(jme.b(list, i));
        jmf jmfVar = jmgVar.a;
        int f = jmgVar.f(i);
        jqh jqhVar = ((jlf) jmfVar).b;
        return jqhVar.e.getLineLeft(f) + (f == jqhVar.f + (-1) ? jqhVar.h : 0.0f);
    }

    public final float d(int i) {
        jlz jlzVar = this.b;
        jlzVar.m(i);
        List list = jlzVar.h;
        jmg jmgVar = (jmg) list.get(jme.b(list, i));
        jmf jmfVar = jmgVar.a;
        int f = jmgVar.f(i);
        jqh jqhVar = ((jlf) jmfVar).b;
        return jqhVar.e.getLineRight(f) + (f == jqhVar.f + (-1) ? jqhVar.i : 0.0f);
    }

    public final float e(int i) {
        return this.b.c(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpg)) {
            return false;
        }
        jpg jpgVar = (jpg) obj;
        return ffkj.e(this.a, jpgVar.a) && ffkj.e(this.b, jpgVar.b) && kaf.e(this.c, jpgVar.c) && this.d == jpgVar.d && this.e == jpgVar.e && ffkj.e(this.f, jpgVar.f);
    }

    public final int f() {
        return this.b.f;
    }

    public final int g(int i, boolean z) {
        return this.b.e(i, z);
    }

    public final int h(int i) {
        return this.b.f(i);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + kae.a(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f.hashCode();
    }

    public final int i(float f) {
        return this.b.g(f);
    }

    public final int j(int i) {
        jlz jlzVar = this.b;
        jlzVar.m(i);
        List list = jlzVar.h;
        jmg jmgVar = (jmg) list.get(jme.b(list, i));
        jmf jmfVar = jmgVar.a;
        return jmgVar.c(((jlf) jmfVar).b.n(jmgVar.f(i)));
    }

    public final int k(long j) {
        return this.b.h(j);
    }

    public final long l(int i) {
        int b;
        int a;
        jlz jlzVar = this.b;
        jlzVar.l(i);
        jmg jmgVar = (jmg) jlzVar.h.get(i == jlzVar.j().a() ? ffdx.e(jlzVar.h) : jme.a(jlzVar.h, i));
        jmf jmfVar = jmgVar.a;
        int e = jmgVar.e(i);
        jqr q = ((jlf) jmfVar).b.q();
        if (q.h(q.b(e))) {
            q.c(e);
            b = e;
            while (b != -1) {
                if (q.h(b) && !q.e(b)) {
                    break;
                }
                b = q.b(b);
            }
            b = -1;
        } else {
            q.c(e);
            if (q.g(e)) {
                b = (!q.f(e) || q.d(e)) ? q.b(e) : e;
            } else {
                if (q.d(e)) {
                    b = q.b(e);
                }
                b = -1;
            }
        }
        if (b == -1) {
            b = e;
        }
        if (q.e(q.a(e))) {
            q.c(e);
            a = e;
            while (a != -1) {
                if (!q.h(a) && q.e(a)) {
                    break;
                }
                a = q.a(a);
            }
            a = -1;
        } else {
            q.c(e);
            if (q.d(e)) {
                a = (!q.f(e) || q.g(e)) ? q.a(e) : e;
            } else {
                if (q.g(e)) {
                    a = q.a(e);
                }
                a = -1;
            }
        }
        if (a != -1) {
            e = a;
        }
        long a2 = jpn.a(b, e);
        long j = jpm.a;
        return jmgVar.g(a2, false);
    }

    public final iam m(int i) {
        float g;
        float g2;
        float f;
        float f2;
        jlz jlzVar = this.b;
        jlzVar.k(i);
        List list = jlzVar.h;
        jmg jmgVar = (jmg) list.get(jme.a(list, i));
        jmf jmfVar = jmgVar.a;
        int e = jmgVar.e(i);
        if (e < 0 || e >= ((jlf) jmfVar).c.length()) {
            jwo.b("offset(" + e + ") is out of bounds [0," + ((jlf) jmfVar).c.length() + ')');
        }
        jqh jqhVar = ((jlf) jmfVar).b;
        int i2 = e + 1;
        int l = jqhVar.l(e);
        float e2 = jqhVar.e(l);
        float c = jqhVar.c(l);
        boolean z = jqhVar.o(l) == 1;
        boolean isRtlCharAt = jqhVar.e.isRtlCharAt(e);
        if (!z || isRtlCharAt) {
            if (z) {
                f = jqhVar.g(e, false);
                f2 = jqhVar.g(i2, true);
            } else if (isRtlCharAt) {
                f = jqhVar.f(e, false);
                f2 = jqhVar.f(i2, true);
            } else {
                g = jqhVar.g(e, false);
                g2 = jqhVar.g(i2, true);
            }
            float f3 = f2;
            g2 = f;
            g = f3;
        } else {
            g = jqhVar.f(e, false);
            g2 = jqhVar.f(i2, true);
        }
        RectF rectF = new RectF(g, e2, g2, c);
        return jmgVar.h(new iam(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final iam n(int i) {
        float f;
        jlz jlzVar = this.b;
        jlzVar.l(i);
        jmg jmgVar = (jmg) jlzVar.h.get(i == jlzVar.j().a() ? ffdx.e(jlzVar.h) : jme.a(jlzVar.h, i));
        jmf jmfVar = jmgVar.a;
        int e = jmgVar.e(i);
        if (e < 0 || e > ((jlf) jmfVar).c.length()) {
            jwo.b("offset(" + e + ") is out of bounds [0," + ((jlf) jmfVar).c.length() + ']');
        }
        jlf jlfVar = (jlf) jmfVar;
        jqh jqhVar = jlfVar.b;
        f = jqhVar.f(e, false);
        int l = jqhVar.l(e);
        return jmgVar.h(new iam(f, jqhVar.e(l), f, jlfVar.b.c(l)));
    }

    public final icv o(int i, int i2) {
        jlz jlzVar = this.b;
        if (i < 0 || i > i2 || i2 > jlzVar.j().b.length()) {
            jwo.b("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + jlzVar.j().b.length() + "), or start > end!");
        }
        byte[] bArr = null;
        if (i == i2) {
            return new ibc(bArr);
        }
        ibc ibcVar = new ibc(bArr);
        List list = jlzVar.h;
        long a = jpn.a(i, i2);
        long j = jpm.a;
        jme.d(list, a, new jly(ibcVar, i, i2));
        return ibcVar;
    }

    public final jpg p(jpf jpfVar, long j) {
        return new jpg(jpfVar, this.b, j);
    }

    public final jyi q(int i) {
        jlz jlzVar = this.b;
        jlzVar.l(i);
        jmg jmgVar = (jmg) jlzVar.h.get(i == jlzVar.j().a() ? ffdx.e(jlzVar.h) : jme.a(jlzVar.h, i));
        return jmgVar.a.j(jmgVar.e(i));
    }

    public final jyi r(int i) {
        jlz jlzVar = this.b;
        jlzVar.l(i);
        jmg jmgVar = (jmg) jlzVar.h.get(i == jlzVar.j().a() ? ffdx.e(jlzVar.h) : jme.a(jlzVar.h, i));
        jmf jmfVar = jmgVar.a;
        int e = jmgVar.e(i);
        jqh jqhVar = ((jlf) jmfVar).b;
        return jqhVar.o(jqhVar.l(e)) == 1 ? jyi.a : jyi.b;
    }

    public final boolean s() {
        jlz jlzVar = this.b;
        if (jlzVar.c) {
            return true;
        }
        return ((float) ((int) (this.c & 4294967295L))) < jlzVar.e;
    }

    public final boolean t() {
        return ((float) ((int) (this.c >> 32))) < this.b.d || s();
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) kaf.c(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}

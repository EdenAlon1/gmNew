package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jlz {
    public final jmc a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final List g;
    public final List h;

    public jlz(jmc jmcVar, long j, int i, int i2) {
        boolean z;
        this.a = jmcVar;
        this.b = i;
        if (jzk.d(j) != 0 || jzk.c(j) != 0) {
            jwo.b("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List list = jmcVar.d;
        int size = list.size();
        int i3 = 0;
        float f = 0.0f;
        int i4 = 0;
        while (i4 < size) {
            jmh jmhVar = (jmh) list.get(i4);
            jlf jlfVar = new jlf((jwx) jmhVar.a, this.b - i3, i2, jzl.k(0, jzk.b(j), jzk.h(j) ? ffmk.f(jzk.a(j) - jmj.a(f), 0) : jzk.a(j), 5));
            float b = jlfVar.b() + f;
            int g = i3 + jlfVar.g();
            arrayList.add(new jmg(jlfVar, jmhVar.b, jmhVar.c, i3, g, f, b));
            z = true;
            if (jlfVar.k() || (g == this.b && i4 != ffdx.e(this.a.d))) {
                i3 = g;
                f = b;
                break;
            } else {
                i4++;
                i3 = g;
                f = b;
            }
        }
        z = false;
        this.e = f;
        this.f = i3;
        this.c = z;
        this.h = arrayList;
        this.d = jzk.b(j);
        List arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            jmg jmgVar = (jmg) arrayList.get(i5);
            List list2 = ((jlf) jmgVar.a).d;
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size3 = list2.size();
            for (int i6 = 0; i6 < size3; i6++) {
                iam iamVar = (iam) list2.get(i6);
                arrayList3.add(iamVar != null ? jmgVar.h(iamVar) : null);
            }
            ffdx.w(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.a.b.size()) {
            int size4 = this.a.b.size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i7 = 0; i7 < size4; i7++) {
                arrayList4.add(null);
            }
            arrayList2 = ffdx.ad(arrayList2, arrayList4);
        }
        this.g = arrayList2;
    }

    public static /* synthetic */ void o(jlz jlzVar, ibt ibtVar, long j, idg idgVar, jyk jykVar, ifs ifsVar) {
        ibtVar.l();
        List list = jlzVar.h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jmg jmgVar = (jmg) list.get(i);
            jmgVar.a.m(ibtVar, j, idgVar, jykVar, ifsVar);
            ibtVar.o(0.0f, jmgVar.a.b());
        }
        ibtVar.j();
    }

    public static /* synthetic */ void p(jlz jlzVar, ibt ibtVar, ibq ibqVar, float f, idg idgVar, jyk jykVar, ifs ifsVar) {
        ibtVar.l();
        int i = 0;
        if (jlzVar.h.size() <= 1) {
            List list = jlzVar.h;
            int size = list.size();
            while (i < size) {
                jmg jmgVar = (jmg) list.get(i);
                jmgVar.a.n(ibtVar, ibqVar, f, idgVar, jykVar, ifsVar);
                ibtVar.o(0.0f, jmgVar.a.b());
                i++;
            }
        } else {
            List list2 = jlzVar.h;
            int size2 = list2.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i2 = 0; i2 < size2; i2++) {
                jmg jmgVar2 = (jmg) list2.get(i2);
                f3 += jmgVar2.a.b();
                f2 = Math.max(f2, jmgVar2.a.f());
            }
            Shader b = ((ide) ibqVar).b((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
            Matrix matrix = new Matrix();
            b.getLocalMatrix(matrix);
            List list3 = jlzVar.h;
            int size3 = list3.size();
            while (i < size3) {
                jmg jmgVar3 = (jmg) list3.get(i);
                jmgVar3.a.n(ibtVar, new ibr(b), f, idgVar, jykVar, ifsVar);
                ibtVar.o(0.0f, jmgVar3.a.b());
                matrix.setTranslate(0.0f, -jmgVar3.a.b());
                b.setLocalMatrix(matrix);
                i++;
            }
        }
        ibtVar.j();
    }

    public final float a(int i) {
        m(i);
        List list = this.h;
        jmg jmgVar = (jmg) list.get(jme.b(list, i));
        jmf jmfVar = jmgVar.a;
        return jmgVar.a(((jlf) jmfVar).b.c(jmgVar.f(i)));
    }

    public final float b(int i) {
        m(i);
        List list = this.h;
        jmg jmgVar = (jmg) list.get(jme.b(list, i));
        jmf jmfVar = jmgVar.a;
        return ((jlf) jmfVar).b.d(jmgVar.f(i));
    }

    public final float c(int i) {
        m(i);
        List list = this.h;
        jmg jmgVar = (jmg) list.get(jme.b(list, i));
        jmf jmfVar = jmgVar.a;
        return jmgVar.a(((jlf) jmfVar).b.e(jmgVar.f(i)));
    }

    public final float d(int i) {
        m(i);
        List list = this.h;
        jmg jmgVar = (jmg) list.get(jme.b(list, i));
        jmf jmfVar = jmgVar.a;
        return ((jlf) jmfVar).b.e.getLineWidth(jmgVar.f(i));
    }

    public final int e(int i, boolean z) {
        int k;
        m(i);
        List list = this.h;
        jmg jmgVar = (jmg) list.get(jme.b(list, i));
        jmf jmfVar = jmgVar.a;
        int f = jmgVar.f(i);
        if (z) {
            jqh jqhVar = ((jlf) jmfVar).b;
            if (jqj.c(jqhVar.e, f) && jqhVar.b == TextUtils.TruncateAt.END) {
                k = jqhVar.e.getLineStart(f) + jqhVar.e.getEllipsisStart(f);
            } else {
                jpz p = jqhVar.p();
                k = p.d(p.a.getLineEnd(f), p.a.getLineStart(f));
            }
        } else {
            k = ((jlf) jmfVar).b.k(f);
        }
        return jmgVar.c(k);
    }

    public final int f(int i) {
        jmg jmgVar = (jmg) this.h.get(i >= j().a() ? ffdx.e(this.h) : i < 0 ? 0 : jme.a(this.h, i));
        return jmgVar.d(((jlf) jmgVar.a).b.l(jmgVar.e(i)));
    }

    public final int g(float f) {
        List list = this.h;
        jmg jmgVar = (jmg) list.get(jme.c(list, f));
        if (jmgVar.b() == 0) {
            return jmgVar.d;
        }
        return jmgVar.d(((jlf) jmgVar.a).b.m((int) (f - jmgVar.f)));
    }

    public final int h(long j) {
        jmg jmgVar = (jmg) this.h.get(jme.c(this.h, Float.intBitsToFloat((int) (j & 4294967295L))));
        if (jmgVar.b() == 0) {
            return jmgVar.b;
        }
        jmf jmfVar = jmgVar.a;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat(r3) - jmgVar.f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        int intBitsToFloat2 = (int) Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits));
        jqh jqhVar = ((jlf) jmfVar).b;
        int m = jqhVar.m(intBitsToFloat2);
        return jmgVar.c(jqhVar.e.getOffsetForHorizontal(m, Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) + (-jqhVar.a(m))));
    }

    public final long i(iam iamVar, int i, jpd jpdVar) {
        long g;
        long j;
        long j2;
        List list = this.h;
        int c = jme.c(list, iamVar.c);
        if (((jmg) list.get(c)).g >= iamVar.e || c == ffdx.e(this.h)) {
            jmg jmgVar = (jmg) this.h.get(c);
            g = jmgVar.g(jmgVar.a.h(jmgVar.i(iamVar), i, jpdVar), true);
            return g;
        }
        int c2 = jme.c(this.h, iamVar.e);
        long j3 = jpm.a;
        while (true) {
            j = jpm.a;
            if (!jpm.h(j3, j) || c > c2) {
                break;
            }
            jmg jmgVar2 = (jmg) this.h.get(c);
            j3 = jmgVar2.g(jmgVar2.a.h(jmgVar2.i(iamVar), i, jpdVar), true);
            c++;
        }
        if (jpm.h(j3, j)) {
            return j;
        }
        while (true) {
            j2 = jpm.a;
            if (!jpm.h(j, j2) || c > c2) {
                break;
            }
            jmg jmgVar3 = (jmg) this.h.get(c2);
            j = jmgVar3.g(jmgVar3.a.h(jmgVar3.i(iamVar), i, jpdVar), true);
            c2--;
        }
        return jpm.h(j, j2) ? j3 : jpn.a(jpm.e(j3), jpm.a(j));
    }

    public final jlm j() {
        return this.a.a;
    }

    public final void k(int i) {
        if (i < 0 || i >= j().b.length()) {
            jwo.b("offset(" + i + ") is out of bounds [0, " + j().a() + ')');
        }
    }

    public final void l(int i) {
        if (i < 0 || i > j().b.length()) {
            jwo.b("offset(" + i + ") is out of bounds [0, " + j().a() + ']');
        }
    }

    public final void m(int i) {
        if (i < 0 || i >= this.f) {
            jwo.b("lineIndex(" + i + ") is out of bounds [0, " + this.f + ')');
        }
    }

    public final void n(long j, float[] fArr) {
        k(jpm.d(j));
        l(jpm.c(j));
        ffkz ffkzVar = new ffkz();
        ffkzVar.a = 0;
        jme.d(this.h, j, new jlx(j, fArr, ffkzVar, new ffky()));
    }
}

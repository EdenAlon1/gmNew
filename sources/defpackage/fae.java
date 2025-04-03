package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fae {
    public static final int a(jlz jlzVar, long j, jgi jgiVar) {
        float a = jgiVar != null ? jgiVar.a() : 0.0f;
        int i = (int) (4294967295L & j);
        int g = jlzVar.g(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) >= jlzVar.c(g) - a && Float.intBitsToFloat(i) <= jlzVar.a(g) + a) {
            int i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) >= (-a)) {
                if (Float.intBitsToFloat(i2) <= jlzVar.d + a) {
                    return g;
                }
            }
        }
        return -1;
    }

    public static final int b(eva evaVar, long j, jgi jgiVar) {
        jpg jpgVar;
        ioc e;
        long l;
        jlz jlzVar;
        int a;
        exq d = evaVar.d();
        if (d == null || (jpgVar = d.a) == null || (e = evaVar.e()) == null || (a = a((jlzVar = jpgVar.b), (l = e.l(j)), jgiVar)) == -1) {
            return -1;
        }
        return jlzVar.h(iak.k(l, (jlzVar.c(a) + jlzVar.a(a)) / 2.0f, 1));
    }

    public static final long c(eva evaVar, iam iamVar, int i, jpd jpdVar) {
        jpg jpgVar;
        exq d = evaVar.d();
        jlz jlzVar = null;
        if (d != null && (jpgVar = d.a) != null) {
            jlzVar = jpgVar.b;
        }
        ioc e = evaVar.e();
        return (jlzVar == null || e == null) ? jpm.a : jlzVar.i(iamVar.f(e.l(0L)), i, jpdVar);
    }

    public static final long d(eva evaVar, iam iamVar, iam iamVar2, int i, jpd jpdVar) {
        long c = c(evaVar, iamVar, i, jpdVar);
        if (jpm.i(c)) {
            return jpm.a;
        }
        long c2 = c(evaVar, iamVar2, i, jpdVar);
        if (jpm.i(c2)) {
            return jpm.a;
        }
        return jpn.a(Math.min(jpm.e(c), jpm.e(c)), Math.max(jpm.a(c2), jpm.a(c2)));
    }

    public static final long e(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static final boolean f(jpg jpgVar, int i) {
        int g;
        int h = jpgVar.h(i);
        if (i != jpgVar.j(h)) {
            g = jpgVar.g(h, false);
            if (i != g) {
                return jpgVar.q(i) != jpgVar.q(i + (-1));
            }
        }
        return jpgVar.r(i) != jpgVar.q(i);
    }

    public static final boolean g(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean h(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean i(int i) {
        int type;
        return (!h(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyd {
    public static final double a;
    public static final double b;

    static {
        double d = enxw.a * 9.0d * 2.220446049250313E-16d;
        a = d;
        b = d + (enxw.b * 3.0d * 2.220446049250313E-16d);
        double d2 = enxw.c.c;
    }

    public static final double a(enyr enyrVar, enyr enyrVar2) {
        double d = enyrVar.e - enyrVar2.e;
        double d2 = enyrVar.f - enyrVar2.f;
        double d3 = enyrVar.g - enyrVar2.g;
        return (d * d) + (d2 * d2) + (d3 * d3);
    }

    static double b(double d, double d2, double d3, double d4, double d5) {
        return Math.abs(d2 - d) <= Math.abs(d3 - d) ? d4 + ((d5 - d4) * ((d - d2) / (d3 - d2))) : d5 + ((d4 - d5) * ((d - d3) / (d2 - d3)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
    
        if ((((r29.e < defpackage.eobe.a) ^ (r29.f < defpackage.eobe.a)) ^ (r29.g < defpackage.eobe.a)) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        r18 = 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b8, code lost:
    
        r3 = r29.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        if (r3 >= defpackage.eobe.a) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00be, code lost:
    
        r5 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c2, code lost:
    
        r34.b = r5;
        r7 = r5;
        r5 = (((-r5) * r29.f) - r29.g) / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c1, code lost:
    
        r5 = -1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        r3 = r29.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
    
        if (r3 <= defpackage.eobe.a) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a7, code lost:
    
        r5 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
    
        r34.a = r5;
        r18 = 0.0d;
        r7 = (((-r5) * r29.e) - r29.g) / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        r5 = -1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007a, code lost:
    
        if (java.lang.Math.abs(r29.e) >= java.lang.Math.abs(r29.f)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int c(defpackage.enyr r27, defpackage.enyr r28, defpackage.enyr r29, defpackage.enyr r30, defpackage.enyr r31, double r32, defpackage.enxq r34) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enyd.c(enyr, enyr, enyr, enyr, enyr, double, enxq):int");
    }

    public static boolean d(enyr enyrVar, enyr enyrVar2, int i, double d, enxq enxqVar, enxq enxqVar2) {
        if (enzn.f(enyrVar) == i && enzn.f(enyrVar2) == i) {
            enzn.o(i, enyrVar, enxqVar);
            enzn.o(i, enyrVar2, enxqVar2);
            return true;
        }
        enyr j = enzn.j(i, enzw.b(enyrVar, enyrVar2));
        enyr j2 = enzn.j(i, enyrVar);
        enyr j3 = enzn.j(i, enyrVar2);
        double d2 = d + 1.0d;
        double d3 = j.e;
        enyr enyrVar3 = new enyr(d2 * d3, d2 * j.f, j.g);
        double d4 = enyrVar3.e;
        double d5 = enyrVar3.f;
        double d6 = enyrVar3.g;
        double abs = Math.abs(d4);
        double abs2 = Math.abs(d5);
        double abs3 = Math.abs(d6);
        if (abs2 >= abs3 - abs && abs >= abs3 - abs2) {
            enyr m = enyr.m(j);
            enyr j4 = enyr.j(m, j2);
            enyr j5 = enyr.j(j3, m);
            if (c(j3, j2, enyr.l(enyrVar3), j5, j4, d2, enxqVar) + c(j2, j3, enyrVar3, j4, j5, d2, enxqVar2) < 3) {
                return true;
            }
        }
        return false;
    }
}

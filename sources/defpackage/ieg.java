package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ieg {
    private static final ifh A;
    private static final ifh B;
    public static final float[] a;
    public static final float[] b;
    public static final ifh c;
    public static final ifh d;
    public static final iff e;
    public static final iff f;
    public static final iff g;
    public static final iff h;
    public static final iff i;
    public static final iff j;
    public static final iff k;
    public static final iff l;
    public static final iff m;
    public static final iff n;
    public static final iff o;
    public static final iff p;
    public static final iff q;
    public static final iff r;
    public static final idy s;
    public static final idy t;
    public static final iff u;
    public static final iff v;
    public static final iff w;
    public static final idy x;
    public static final idy[] y;
    private static final float[] z;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        z = fArr3;
        ifh ifhVar = new ifh(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        A = ifhVar;
        ifh ifhVar2 = new ifh(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        B = ifhVar2;
        ifh ifhVar3 = new ifh(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = ifhVar3;
        ifh ifhVar4 = new ifh(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = ifhVar4;
        ifi ifiVar = iem.a;
        iff iffVar = new iff("sRGB IEC61966-2.1", fArr, iem.d, ifhVar, 0);
        e = iffVar;
        iff iffVar2 = new iff("sRGB IEC61966-2.1 (Linear)", fArr, iem.d, 1.0d, 0.0f, 1.0f, 1);
        f = iffVar2;
        iff iffVar3 = new iff("scRGB-nl IEC 61966-2-2:2003", fArr, iem.d, null, new iel() { // from class: iea
            @Override // defpackage.iel
            public final double a(double d2) {
                float[] fArr4 = ieg.a;
                return Math.copySign(idz.a(d2 < eobe.a ? -d2 : d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d2);
            }
        }, new iel() { // from class: ieb
            @Override // defpackage.iel
            public final double a(double d2) {
                float[] fArr4 = ieg.a;
                return Math.copySign(idz.b(d2 < eobe.a ? -d2 : d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d2);
            }
        }, -0.799f, 2.399f, ifhVar, 2);
        g = iffVar3;
        iff iffVar4 = new iff("scRGB IEC 61966-2-2:2003", fArr, iem.d, 1.0d, -0.5f, 7.499f, 3);
        h = iffVar4;
        iff iffVar5 = new iff("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, iem.d, new ifh(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = iffVar5;
        iff iffVar6 = new iff("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, iem.d, new ifh(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = iffVar6;
        iff iffVar7 = new iff("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new ifi(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = iffVar7;
        iff iffVar8 = new iff("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, iem.d, ifhVar, 7);
        l = iffVar8;
        iff iffVar9 = new iff("NTSC (1953)", fArr2, iem.a, new ifh(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = iffVar9;
        iff iffVar10 = new iff("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, iem.d, new ifh(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        n = iffVar10;
        iff iffVar11 = new iff("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, iem.d, 2.2d, 0.0f, 1.0f, 10);
        o = iffVar11;
        iff iffVar12 = new iff("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, iem.b, new ifh(1.8d, 1.0d, eobe.a, 0.0625d, 0.031248d), 11);
        p = iffVar12;
        iff iffVar13 = new iff("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, iem.c, 1.0d, -65504.0f, 65504.0f, 12);
        q = iffVar13;
        iff iffVar14 = new iff("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, iem.c, 1.0d, -65504.0f, 65504.0f, 13);
        r = iffVar14;
        ifj ifjVar = new ifj();
        s = ifjVar;
        ien ienVar = new ien();
        t = ienVar;
        iff iffVar15 = new iff("None", fArr, iem.d, ifhVar2, 16);
        u = iffVar15;
        iff iffVar16 = new iff("Hybrid Log Gamma encoding", fArr3, iem.d, null, new iel() { // from class: iec
            @Override // defpackage.iel
            public final double a(double d2) {
                return ieg.b(ieg.c, d2);
            }
        }, new iel() { // from class: ied
            @Override // defpackage.iel
            public final double a(double d2) {
                return ieg.a(ieg.c, d2);
            }
        }, 0.0f, 1.0f, ifhVar3, 17);
        v = iffVar16;
        iff iffVar17 = new iff("Perceptual Quantizer encoding", fArr3, iem.d, null, new iel() { // from class: iee
            @Override // defpackage.iel
            public final double a(double d2) {
                return ieg.d(ieg.d, d2);
            }
        }, new iel() { // from class: ief
            @Override // defpackage.iel
            public final double a(double d2) {
                return ieg.c(ieg.d, d2);
            }
        }, 0.0f, 1.0f, ifhVar4, 18);
        w = iffVar17;
        ieo ieoVar = new ieo();
        x = ieoVar;
        y = new idy[]{iffVar, iffVar2, iffVar3, iffVar4, iffVar5, iffVar6, iffVar7, iffVar8, iffVar9, iffVar10, iffVar11, iffVar12, iffVar13, iffVar14, ifjVar, ienVar, iffVar15, iffVar16, iffVar17, ieoVar};
    }

    public static final double a(ifh ifhVar, double d2) {
        double exp;
        double d3 = ifhVar.g + 1.0d;
        double d4 = d2 < eobe.a ? -1.0d : 1.0d;
        double d5 = d2 * d4;
        double d6 = ifhVar.b * d5;
        if (d6 <= 1.0d) {
            exp = Math.pow(d6, ifhVar.c);
        } else {
            exp = Math.exp((d5 - ifhVar.f) * ifhVar.d) + ifhVar.e;
        }
        return d3 * d4 * exp;
    }

    public static final double b(ifh ifhVar, double d2) {
        double d3 = 1.0d / ifhVar.b;
        double d4 = 1.0d / ifhVar.c;
        double d5 = 1.0d / ifhVar.d;
        double d6 = ifhVar.g + 1.0d;
        double d7 = d2 < eobe.a ? -1.0d : 1.0d;
        double d8 = (d2 * d7) / d6;
        return d7 * (d8 <= 1.0d ? d3 * Math.pow(d8, d4) : ifhVar.f + (d5 * Math.log(d8 - ifhVar.e)));
    }

    public static final double c(ifh ifhVar, double d2) {
        double d3 = d2 < eobe.a ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        return d3 * Math.pow(ffmk.a(ifhVar.b + (ifhVar.c * Math.pow(d4, ifhVar.d)), eobe.a) / (ifhVar.e + (ifhVar.f * Math.pow(d4, ifhVar.d))), ifhVar.g);
    }

    public static final double d(ifh ifhVar, double d2) {
        double d3 = -ifhVar.b;
        double d4 = 1.0d / ifhVar.g;
        double d5 = -ifhVar.f;
        double d6 = 1.0d / ifhVar.d;
        double d7 = d2 < eobe.a ? -1.0d : 1.0d;
        double d8 = d2 * d7;
        return d7 * Math.pow(Math.max(d3 + (ifhVar.e * Math.pow(d8, d4)), eobe.a) / (ifhVar.c + (d5 * Math.pow(d8, d4))), d6);
    }
}

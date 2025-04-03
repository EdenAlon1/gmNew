package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iim {
    public static final void a(igv igvVar, iih iihVar) {
        int size = iihVar.j.size();
        for (int i = 0; i < size; i++) {
            iij iijVar = (iij) iihVar.j.get(i);
            if (iijVar instanceof iin) {
                ihc ihcVar = new ihc();
                iin iinVar = (iin) iijVar;
                ihcVar.c = iinVar.b;
                ihcVar.m = true;
                ihcVar.f();
                ihcVar.p.m(iinVar.c);
                ihcVar.f();
                String str = iinVar.a;
                ihcVar.f();
                ihcVar.a = iinVar.d;
                ihcVar.f();
                ihcVar.b = iinVar.e;
                ihcVar.f();
                ihcVar.f = iinVar.f;
                ihcVar.f();
                ihcVar.d = iinVar.g;
                ihcVar.f();
                ihcVar.e = iinVar.h;
                ihcVar.n = true;
                ihcVar.f();
                ihcVar.g = iinVar.i;
                ihcVar.n = true;
                ihcVar.f();
                ihcVar.h = iinVar.j;
                ihcVar.n = true;
                ihcVar.f();
                ihcVar.i = iinVar.k;
                ihcVar.n = true;
                ihcVar.f();
                ihcVar.j = iinVar.l;
                ihcVar.o = true;
                ihcVar.f();
                ihcVar.k = iinVar.m;
                ihcVar.o = true;
                ihcVar.f();
                ihcVar.l = iinVar.n;
                ihcVar.o = true;
                ihcVar.f();
                igvVar.c(i, ihcVar);
            } else if (iijVar instanceof iih) {
                igv igvVar2 = new igv();
                iih iihVar2 = (iih) iijVar;
                igvVar2.f = iihVar2.a;
                igvVar2.f();
                igvVar2.g = iihVar2.b;
                igvVar2.n = true;
                igvVar2.f();
                igvVar2.j = iihVar2.e;
                igvVar2.n = true;
                igvVar2.f();
                igvVar2.k = iihVar2.f;
                igvVar2.n = true;
                igvVar2.f();
                igvVar2.l = iihVar2.g;
                igvVar2.n = true;
                igvVar2.f();
                igvVar2.m = iihVar2.h;
                igvVar2.n = true;
                igvVar2.f();
                igvVar2.h = iihVar2.c;
                igvVar2.n = true;
                igvVar2.f();
                igvVar2.i = iihVar2.d;
                igvVar2.n = true;
                igvVar2.f();
                igvVar2.c = iihVar2.i;
                igvVar2.d = true;
                igvVar2.f();
                a(igvVar2, iihVar2);
                igvVar.c(i, igvVar2);
            }
        }
    }

    public static final iil b(igz igzVar, hfd hfdVar) {
        jzn jznVar = (jzn) hfdVar.e(jdr.e);
        float f = igzVar.m;
        boolean C = hfdVar.C((Float.floatToRawIntBits(jznVar.ec()) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        Object f2 = hfdVar.f();
        if (C || f2 == hfc.a) {
            igv igvVar = new igv();
            a(igvVar, igzVar.i);
            float f3 = igzVar.e;
            float f4 = igzVar.f;
            float em = jznVar.em(f3);
            float em2 = jznVar.em(f4);
            long floatToRawIntBits = Float.floatToRawIntBits(em);
            long floatToRawIntBits2 = Float.floatToRawIntBits(em2);
            float f5 = igzVar.g;
            float f6 = igzVar.h;
            long j = (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L);
            if (Float.isNaN(f5)) {
                f5 = Float.intBitsToFloat((int) (j >> 32));
            }
            if (Float.isNaN(f6)) {
                f6 = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            long floatToRawIntBits3 = Float.floatToRawIntBits(f5);
            long floatToRawIntBits4 = Float.floatToRawIntBits(f6);
            long j2 = floatToRawIntBits3 << 32;
            long j3 = 4294967295L & floatToRawIntBits4;
            iil iilVar = new iil(igvVar);
            String str = igzVar.d;
            long j4 = igzVar.j;
            ibl iblVar = j4 != 16 ? new ibl(j4, igzVar.k) : null;
            boolean z = igzVar.l;
            iilVar.a.b(new iar(j));
            iilVar.b.b(Boolean.valueOf(z));
            iilVar.c.e.b(iblVar);
            iilVar.c.f.b(new iar(j2 | j3));
            iilVar.c.b = str;
            hfdVar.y(iilVar);
            f2 = iilVar;
        }
        return (iil) f2;
    }
}

package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fct {
    public static final int a(long j, jpg jpgVar) {
        int i = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i) <= 0.0f) {
            return 0;
        }
        return Float.intBitsToFloat(i) >= jpgVar.b.e ? jpgVar.a.a.a() : jpgVar.k(j);
    }

    public static final int b(fcx fcxVar, Comparator comparator, long j, int i) {
        int compare = comparator.compare(Long.valueOf(fcxVar.c), Long.valueOf(j));
        if (compare < 0) {
            return 0;
        }
        return compare <= 0 ? fcxVar.b : i;
    }

    public static final int c(int i, int i2, feo feoVar, long j, fcx fcxVar) {
        if (fcxVar == null) {
            return feq.b(i, i2);
        }
        int compare = feoVar.f.compare(Long.valueOf(fcxVar.c), Long.valueOf(j));
        if (compare < 0) {
            return 1;
        }
        return compare > 0 ? 3 : 2;
    }
}

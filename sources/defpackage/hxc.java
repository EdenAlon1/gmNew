package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxc {
    public static final void a(ixv ixvVar, ffji ffjiVar) {
        if (ffjiVar.invoke(ixvVar) != ixu.a) {
            return;
        }
        ixw.d(ixvVar, ffjiVar);
    }

    public static final boolean b(hxb hxbVar, long j) {
        if (!hxbVar.p.z) {
            return false;
        }
        iwi y = isx.d(hxbVar).y();
        if (!y.t()) {
            return false;
        }
        long a = iod.a(y);
        float intBitsToFloat = Float.intBitsToFloat((int) (a >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (a & 4294967295L));
        long j2 = hxbVar.c;
        float f = ((int) (j2 >> 32)) + intBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat <= intBitsToFloat3 && intBitsToFloat3 <= f) {
            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
            if (intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f2) {
                return true;
            }
        }
        return false;
    }

    public static final void c(hxb hxbVar, hww hwwVar) {
        hxbVar.b(hwwVar);
    }
}

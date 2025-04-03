package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cms {
    public static final float[] a;

    static {
        long[] jArr;
        cmr cmrVar = new cmr();
        int d = cpg.d(0);
        int max = d > 0 ? Math.max(7, cpg.c(d)) : 0;
        cmrVar.c = max;
        if (max == 0) {
            jArr = cpg.a;
        } else {
            jArr = new long[(max + 15) >> 3];
            ffdo.s(jArr, -9187201950435737472L, jArr.length);
        }
        cmrVar.a = jArr;
        long[] jArr2 = cmrVar.a;
        int i = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr2[i] = (jArr2[i] & (~j)) | j;
        cmrVar.b = new float[max];
        a = new float[0];
    }
}

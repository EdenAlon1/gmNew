package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncw {
    public static lrb a(ncp ncpVar, boolean z) {
        lrb a = new nde().a(ncpVar, z ? null : ngc.a);
        if (a == null || a.a() == 0) {
            return null;
        }
        return a;
    }

    public static ncy b(luv luvVar) {
        luvVar.L(1);
        int l = luvVar.l();
        long j = luvVar.b;
        long j2 = l;
        int i = l / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long q = luvVar.q();
            if (q == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = q;
            jArr2[i2] = luvVar.q();
            luvVar.L(2);
            i2++;
        }
        luvVar.L((int) ((j + j2) - luvVar.b));
        return new ncy(jArr, jArr2);
    }
}

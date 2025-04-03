package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzl {
    public static final dzk a(boolean z, int i, long j, cmv cmvVar, int i2, int i3, int i4, boolean z2, boolean z3, int i5, dzy dzyVar, long j2, int i6, int i7) {
        boolean z4 = true;
        if (cmvVar != null) {
            int i8 = dzyVar.c;
            if (i2 < Integer.MAX_VALUE) {
                int b = cmv.b(j);
                long j3 = cmvVar.a;
                if (b - cmv.b(j3) >= 0) {
                    if (i == 0 || (i < i5 && cmv.a(j) - cmv.a(j3) >= 0)) {
                        Math.max(i4, cmv.b(j3));
                        z4 = false;
                    } else if (!z2) {
                        int b2 = jzk.b(j2);
                        int b3 = (cmv.b(j) - i7) - i4;
                        cmv cmvVar2 = new cmv(cmv.c(cmv.a(j3) - i6, cmv.b(j3)));
                        return new dzk(true, a(z, 0, cmv.c(b2, b3), cmvVar2, i2 + 1, i3 + i4, 0, true, false, i5, dzyVar, j2, i6, i7).b);
                    }
                }
            }
        }
        return new dzk(z4, z4);
    }

    public static final dzj b(dzk dzkVar, dzy dzyVar) {
        if (!dzkVar.b) {
            return null;
        }
        int i = dzyVar.c;
        return null;
    }
}

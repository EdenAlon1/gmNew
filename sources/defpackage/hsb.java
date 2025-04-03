package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsb {
    public final coa a;

    public hsb(long[] jArr) {
        coa coaVar;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            int length = copyOf.length;
            coaVar = new coa(length);
            int i = coaVar.b;
            copyOf.getClass();
            if (i < 0) {
                cpx.c("");
            }
            if (length != 0) {
                coaVar.a(coaVar.b + length);
                long[] jArr2 = coaVar.a;
                int i2 = coaVar.b;
                if (i != i2) {
                    ffdo.m(jArr2, jArr2, i + length, i, i2);
                }
                ffdo.m(copyOf, jArr2, i, 0, copyOf.length);
                coaVar.b += length;
            }
        } else {
            coaVar = new coa((byte[]) null);
        }
        this.a = coaVar;
    }
}

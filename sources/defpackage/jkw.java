package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jkw {
    public long[] a = new long[192];
    public long[] b = new long[192];
    public int c;

    public static /* synthetic */ void a(jkw jkwVar, int i, int i2, int i3, int i4, int i5, int i6) {
        long[] jArr = jkwVar.a;
        int i7 = jkwVar.c;
        int i8 = i7 + 3;
        jkwVar.c = i8;
        int length = jArr.length;
        if (length <= i8) {
            int max = Math.max(length + length, i8);
            long[] copyOf = Arrays.copyOf(jArr, max);
            copyOf.getClass();
            jkwVar.a = copyOf;
            long[] copyOf2 = Arrays.copyOf(jkwVar.b, max);
            copyOf2.getClass();
            jkwVar.b = copyOf2;
        }
        long[] jArr2 = jkwVar.a;
        jArr2[i7] = (i3 & 4294967295L) | (i2 << 32);
        jArr2[i7 + 1] = (i4 << 32) | (i5 & 4294967295L);
        int i9 = i6 & 67108863;
        jArr2[i7 + 2] = (i9 << 26) | 2305843009213693952L | (i & 67108863);
        if (i6 < 0) {
            return;
        }
        for (int i10 = i7 - 3; i10 >= 0; i10 -= 3) {
            int i11 = i10 + 2;
            long j = jArr2[i11];
            if ((((int) j) & 67108863) == i9) {
                jArr2[i11] = ((-2301339409586323457L) & j) | (((i7 - i10) & 511) << 52);
                return;
            }
        }
    }

    public final void b(int i, ffjo ffjoVar) {
        long[] jArr = this.a;
        int i2 = this.c;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((67108863 & ((int) jArr[i3 + 2])) == (i & 67108863)) {
                long j = jArr[i3];
                long j2 = jArr[i3 + 1];
                ffjoVar.a(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }
}

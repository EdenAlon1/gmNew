package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehcc {
    final int a;
    public float b;
    public int c;
    public int d;
    public float e;
    public float f;
    public final int g;
    final float h;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ehcc(int r3, float r4, float r5, float r6, int r7, float r8, int r9, float r10, int r11, float r12) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehcc.<init>(int, float, float, float, int, float, int, float, int, float):void");
    }

    public static ehcc b(float f, float f2, float f3, float f4, int[] iArr, float f5, int[] iArr2, float f6, int[] iArr3) {
        int i = 1;
        ehcc ehccVar = null;
        for (int i2 : iArr3) {
            int length = iArr2.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = iArr2[i3];
                int length2 = iArr.length;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = i3;
                    int i7 = length2;
                    int i8 = i5;
                    int i9 = i;
                    ehcc ehccVar2 = new ehcc(i9, f2, f3, f4, iArr[i5], f5, i4, f6, i2, f);
                    if (ehccVar == null || ehccVar2.h < ehccVar.h) {
                        if (ehccVar2.h == 0.0f) {
                            return ehccVar2;
                        }
                        ehccVar = ehccVar2;
                    }
                    i5 = i8 + 1;
                    i3 = i6;
                    i = i9 + 1;
                    length2 = i7;
                }
                i3++;
                i = i;
            }
        }
        return ehccVar;
    }

    public final int a() {
        return this.c + this.d + this.g;
    }

    public final String toString() {
        return "Arrangement [priority=" + this.a + ", smallCount=" + this.c + ", smallSize=" + this.b + ", mediumCount=" + this.d + ", mediumSize=" + this.e + ", largeCount=" + this.g + ", largeSize=" + this.f + ", cost=" + this.h + "]";
    }
}

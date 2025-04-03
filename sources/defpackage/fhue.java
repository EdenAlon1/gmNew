package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhue {
    public static int a(int i, int i2, int i3) {
        int i4 = 1;
        while (i3 >= 32) {
            i4 = (int) ((((4294967295L & (i4 * i2)) * i) + i4) >>> 32);
            i3 -= 32;
        }
        if (i3 <= 0) {
            return i4;
        }
        return (int) (((((((-1) >>> (-i3)) & (i2 * i4)) & 4294967295L) * i) + i4) >>> i3);
    }
}

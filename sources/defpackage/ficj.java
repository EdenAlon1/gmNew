package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ficj {
    public static boolean a(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        if (length != iArr2.length) {
            return false;
        }
        boolean z = true;
        for (int i = length - 1; i >= 0; i--) {
            z &= iArr[i] == iArr2[i];
        }
        return z;
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }
}

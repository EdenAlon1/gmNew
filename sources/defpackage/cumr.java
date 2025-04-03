package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cumr {
    public static final cumm a(String str, String str2) {
        str2.getClass();
        if (str.length() == 0) {
            str = str2;
        } else if (str2.length() != 0) {
            return str.length() > str2.length() ? new cumm(b(str, str2), str.length()) : new cumm(b(str2, str), str2.length());
        }
        return new cumm(str.length(), str.length());
    }

    private static final int b(String str, String str2) {
        int i;
        int length = str.length() + 1;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = i2;
        }
        int length2 = str.length() + 1;
        int length3 = str2.length();
        int[] iArr2 = new int[length2];
        int i3 = 0;
        while (i3 < length3) {
            int i4 = i3 + 1;
            iArr2[0] = i4;
            int length4 = str.length();
            if (length4 > 0) {
                while (true) {
                    int i5 = i - 1;
                    iArr2[i] = str.charAt(i5) == str2.charAt(i3) ? iArr[i5] : Math.min(Math.min(iArr[i5], iArr[i]), iArr2[i5]) + 1;
                    i = i != length4 ? i + 1 : 1;
                }
            }
            int[] iArr3 = iArr;
            iArr = iArr2;
            iArr2 = iArr3;
            i3 = i4;
        }
        return iArr[str.length()];
    }
}

package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erme {
    public static int a(byte[] bArr, byte b, int i, int i2) {
        while (i < i2) {
            if (bArr[i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static byte[] b(byte[]... bArr) {
        long j = 0;
        int i = 0;
        while (true) {
            if (i >= bArr.length) {
                break;
            }
            j += bArr[i].length;
            i++;
        }
        int i2 = (int) j;
        emxf.e(j == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int", j);
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr3 : bArr) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i3, length);
            i3 += length;
        }
        return bArr2;
    }

    public static byte[] c(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            bArr[i] = ((Number) obj).byteValue();
        }
        return bArr;
    }
}

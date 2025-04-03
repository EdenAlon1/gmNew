package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlla {
    public static final eodc a;

    static {
        int i = eodh.a;
        eodc eodcVar = eodf.a;
        eodcVar.getClass();
        a = eodcVar;
    }

    public static final byte[] a(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        eodc eodcVar = a;
        ffjx ffjxVar = new ffjx();
        byte[] bArr3 = ffjxVar.a;
        int i = ffjxVar.b;
        ffjxVar.b = i + 1;
        bArr3[i] = 1;
        ffjxVar.b(bArr);
        ffjxVar.b(bArr2);
        byte[] bArr4 = ffjxVar.a;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            Object obj = ffjxVar.c[i2];
            i3 += obj != null ? ffjxVar.a(obj) : 1;
            if (i2 == 2) {
                break;
            }
            i2++;
        }
        byte[] bArr5 = new byte[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            Object obj2 = ffjxVar.c[i4];
            if (obj2 != null) {
                if (i5 < i4) {
                    int i7 = i4 - i5;
                    System.arraycopy(bArr4, i5, bArr5, i6, i7);
                    i6 += i7;
                }
                int a2 = ffjxVar.a(obj2);
                System.arraycopy(obj2, 0, bArr5, i6, a2);
                i6 += a2;
                i5 = i4 + 1;
            }
            if (i4 == 2) {
                break;
            }
            i4++;
        }
        if (i5 < 3) {
            System.arraycopy(bArr4, i5, bArr5, i6, 3 - i5);
        }
        byte[] e = eodcVar.b(bArr5).e();
        e.getClass();
        return e;
    }
}

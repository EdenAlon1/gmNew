package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhmw {
    public static final fhmx a(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            bArr[i] = (byte) ((fhoa.a(str.charAt(i2)) << 4) + fhoa.a(str.charAt(i2 + 1)));
        }
        return new fhmx(bArr);
    }

    public static final fhmx b(String str) {
        str.getClass();
        fhmx fhmxVar = new fhmx(fhny.b(str));
        fhmxVar.d = str;
        return fhmxVar;
    }
}

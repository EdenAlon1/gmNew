package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eoeg {
    public static final eoeg e = new eoed("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final eoeg f = new eoed("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    public static final eoeg g = new eoef("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    public static final eoeg h;

    static {
        new eoef("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        h = new eoec(new eoeb("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract void c(Appendable appendable, byte[] bArr, int i);

    public abstract int d(int i);

    public abstract int e(int i);

    public abstract eoeg f();

    public abstract eoeg g();

    public CharSequence h(CharSequence charSequence) {
        throw null;
    }

    public final String j(byte[] bArr) {
        int length = bArr.length;
        emxf.k(0, length, length);
        StringBuilder sb = new StringBuilder(e(length));
        try {
            c(sb, bArr, length);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] k(CharSequence charSequence) {
        try {
            CharSequence h2 = h(charSequence);
            int d = d(h2.length());
            byte[] bArr = new byte[d];
            int a = a(bArr, h2);
            if (a == d) {
                return bArr;
            }
            byte[] bArr2 = new byte[a];
            System.arraycopy(bArr, 0, bArr2, 0, a);
            return bArr2;
        } catch (eoee e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}

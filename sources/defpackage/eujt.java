package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eujt {
    private final byte[] a;

    private eujt(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static eujt b(byte[] bArr) {
        if (bArr != null) {
            return d(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static eujt d(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (i > length) {
            i = length;
        }
        return new eujt(bArr, i);
    }

    public final int a() {
        return this.a.length;
    }

    public final byte[] c() {
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eujt) {
            return Arrays.equals(((eujt) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "Bytes(" + euiv.a(this.a) + ")";
    }
}

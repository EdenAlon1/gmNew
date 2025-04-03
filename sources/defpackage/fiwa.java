package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiwa implements Comparable {
    public final byte[] a;

    public fiwa(byte[] bArr) {
        this.a = bArr;
    }

    public final byte[] a() {
        byte[][] bArr = {new byte[]{5}, this.a};
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i = 0; i < 2; i++) {
                byteArrayOutputStream.write(bArr[i]);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return new BigInteger(this.a).compareTo(new BigInteger(((fiwa) obj).a));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof fiwa)) {
            return Arrays.equals(this.a, ((fiwa) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}

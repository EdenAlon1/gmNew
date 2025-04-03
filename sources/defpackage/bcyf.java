package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcyf {
    private final byte[] a;

    public bcyf(byte[] bArr) {
        this.a = bArr;
    }

    public static bcyf a() {
        byte[] bArr = new byte[32];
        emxr.a.nextBytes(bArr);
        return new bcyf(bArr);
    }

    public static boolean c(byte[] bArr) {
        return bArr != null && bArr.length == 32;
    }

    public final boolean b() {
        return c(this.a);
    }

    public final byte[] d() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}

package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfyk {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    public static String c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static byte[] d(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }
}

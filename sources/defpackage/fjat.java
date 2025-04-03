package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fjat {
    public static String a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (byte b : bArr) {
            byteArrayOutputStream.write("0123456789ABCDEF".charAt((b & 255) >> 4));
            byteArrayOutputStream.write("0123456789ABCDEF".charAt(b & 15));
        }
        return new String(byteArrayOutputStream.toByteArray());
    }
}

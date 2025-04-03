package defpackage;

import j$.util.Optional;
import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class covc {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/sms/DatabaseMessages");

    public static Optional a(Optional optional) {
        return (auxd.a() && optional != null && optional.isPresent() && ((ckex) optional.get()).c().isPresent()) ? ((ckex) optional.get()).c() : Optional.empty();
    }

    public static String b(byte[] bArr, int i) {
        if (i != 0) {
            try {
                try {
                    return new String(bArr, ld.a(i));
                } catch (UnsupportedEncodingException unused) {
                }
            } catch (UnsupportedEncodingException unused2) {
                return new String(bArr, "iso-8859-1");
            }
        }
        return new String(bArr);
    }

    public static byte[] c(String str, int i) {
        if (i == 0) {
            return str.getBytes();
        }
        try {
            return str.getBytes(ld.a(i));
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }
}

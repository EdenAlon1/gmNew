package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etmh extends ThreadLocal {
    protected static final Cipher a() {
        try {
            Cipher cipher = (Cipher) euil.a.a("AES/GCM-SIV/NoPadding");
            if (etmi.c(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}

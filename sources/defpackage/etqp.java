package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etqp implements etgc {
    public static final Object a = new Object();

    @Override // defpackage.etgc
    public final etfk a(String str) {
        etqo etqoVar;
        try {
            synchronized (a) {
                etqoVar = new etqo(eujq.e(str));
                byte[] b = ettg.b(10);
                byte[] bArr = new byte[0];
                if (!Arrays.equals(b, etqoVar.a(etqoVar.b(b, bArr), bArr))) {
                    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return etqoVar;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }

    @Override // defpackage.etgc
    public final boolean b(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }
}

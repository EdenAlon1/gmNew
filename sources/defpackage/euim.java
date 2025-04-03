package defpackage;

import java.security.Provider;
import javax.crypto.Cipher;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euim implements euit {
    @Override // defpackage.euit
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}

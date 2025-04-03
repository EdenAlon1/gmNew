package defpackage;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euip implements euit {
    @Override // defpackage.euit
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}

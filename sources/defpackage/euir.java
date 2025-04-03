package defpackage;

import java.security.MessageDigest;
import java.security.Provider;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euir implements euit {
    @Override // defpackage.euit
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}

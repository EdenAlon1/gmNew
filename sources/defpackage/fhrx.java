package defpackage;

import java.security.Provider;
import java.security.Signature;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhrx implements fhrm {
    final /* synthetic */ Provider a;

    public fhrx(Provider provider) {
        this.a = provider;
    }

    @Override // defpackage.fhrm
    public final Signature a(String str) {
        Provider provider = this.a;
        return provider != null ? Signature.getInstance(str, provider) : Signature.getInstance(str);
    }
}

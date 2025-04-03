package defpackage;

import java.security.Provider;
import java.security.Signature;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhrq implements fhrm {
    final /* synthetic */ Provider a;
    final /* synthetic */ fhrr b;

    public fhrq(fhrr fhrrVar, Provider provider) {
        this.a = provider;
        this.b = fhrrVar;
    }

    @Override // defpackage.fhrm
    public final Signature a(String str) {
        Provider provider = this.a;
        return provider != null ? Signature.getInstance(this.b.b, provider) : Signature.getInstance(this.b.b);
    }
}

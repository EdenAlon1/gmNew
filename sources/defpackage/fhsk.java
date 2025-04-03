package defpackage;

import java.security.Provider;
import java.security.Signature;
import java.security.cert.CertificateFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhsk {
    protected final Provider a;

    public fhsk(Provider provider) {
        this.a = provider;
    }

    public final Signature a(String str) {
        return Signature.getInstance(str, this.a);
    }

    public final CertificateFactory b() {
        return CertificateFactory.getInstance("X.509", this.a);
    }
}

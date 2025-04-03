package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhgd {
    public static final fhge a(SSLSession sSLSession) {
        final List list;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (ffkj.e(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || ffkj.e(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        fhfk a = fhfk.a.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if (ffkj.e("NONE", protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        fhhh fhhhVar = fhhh.a;
        fhhh a2 = fhhg.a(protocol);
        try {
            list = b(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            list = ffel.a;
        }
        return new fhge(a2, a, b(sSLSession.getLocalCertificates()), new ffix() { // from class: fhgc
            @Override // defpackage.ffix
            public final Object invoke() {
                return list;
            }
        });
    }

    private static final List b(Certificate[] certificateArr) {
        return certificateArr != null ? fhhl.n(Arrays.copyOf(certificateArr, certificateArr.length)) : ffel.a;
    }
}

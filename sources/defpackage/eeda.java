package defpackage;

import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeda extends BrowserCompatHostnameVerifier implements HandshakeCompletedListener {
    private static final dktn a = new dktn("SipProxyHostVerifier");
    private final String b;
    private final eecz c;

    public eeda(String str, eecz eeczVar) {
        this.b = str;
        this.c = eeczVar;
    }

    private static X509Certificate a(HandshakeCompletedEvent handshakeCompletedEvent) {
        try {
            Certificate[] peerCertificates = handshakeCompletedEvent.getPeerCertificates();
            if (peerCertificates != null && peerCertificates.length != 0) {
                Certificate certificate = peerCertificates[0];
                if (certificate instanceof X509Certificate) {
                    return (X509Certificate) certificate;
                }
            }
        } catch (SSLPeerUnverifiedException unused) {
        }
        return null;
    }

    @Override // javax.net.ssl.HandshakeCompletedListener
    public final void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent) {
        Principal subjectDN;
        dktn dktnVar = a;
        dkty.d(dktnVar, "TLS handshake completed: %s", handshakeCompletedEvent);
        X509Certificate a2 = a(handshakeCompletedEvent);
        String str = null;
        if (a2 != null && (subjectDN = a2.getSubjectDN()) != null) {
            str = subjectDN.getName();
        }
        dkty.d(dktnVar, "Verifying SIP proxy host %s against certificate for %s.", this.b, str);
        if (verify(this.b, handshakeCompletedEvent.getSession())) {
            dkty.c("SIP host verification succeeded for host %s", this.b);
            return;
        }
        eecz eeczVar = this.c;
        dkty.q("SIP host verification failed for host %s! Terminating transport!", this.b);
        eeny eenyVar = (eeny) eeczVar;
        eenyVar.q(ezbe.SOCKET_FAILURE_HOST_VERIFICATION_FAILED);
        if (((Boolean) eeny.a.a()).booleanValue()) {
            eenyVar.l();
        } else {
            dkty.q("Not terminating SIP transport even though host verification failed.", new Object[0]);
        }
    }
}

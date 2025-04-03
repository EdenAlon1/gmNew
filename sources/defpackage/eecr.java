package defpackage;

import android.text.TextUtils;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eecr implements X509TrustManager {
    private final String a;
    private final String b;

    public eecr(String str) {
        if (TextUtils.isEmpty(str)) {
            dkty.q("Expected fingerprint is empty. Will not be able to validate against certificate", new Object[0]);
            this.a = null;
            this.b = null;
            return;
        }
        List i = emye.b(' ').i(str.toUpperCase(Locale.US));
        if (i.size() < 2) {
            throw new SSLException("Unexpected fingerprint format.");
        }
        String str2 = (String) i.get(0);
        this.b = str2;
        this.a = (String) i.get(1);
        if (eect.c(str2)) {
            return;
        }
        throw new SSLException("Unsupported fingerprint type " + str2 + ". Needs to be SHA-1 or SHA-256.");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        dkty.c("checkClientTrusted for auth type %s", str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        dkty.c("checkServerTrusted for auth type %s", str);
        if (x509CertificateArr == null) {
            throw new IllegalArgumentException("checkServerTrusted: X509Certificate array is null");
        }
        if (x509CertificateArr.length <= 0) {
            throw new IllegalArgumentException("checkServerTrusted: X509Certificate is empty");
        }
        if (TextUtils.isEmpty(this.a)) {
            dkty.q("Expected fingerprint has not been set. Skipping validation", new Object[0]);
            return;
        }
        String a = eect.a(x509CertificateArr[0], this.b);
        if (!TextUtils.isEmpty(a) && this.a.equalsIgnoreCase(a)) {
            dkty.c("Fingerprint verification has passed", new Object[0]);
            return;
        }
        throw new CertificateException("Fingerprint mismatch. Expected: " + this.b + " " + this.a + " - read from certificate: " + a);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        dkty.c("getAcceptIssuers", new Object[0]);
        return null;
    }
}

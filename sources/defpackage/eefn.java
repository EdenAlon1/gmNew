package defpackage;

import android.content.Context;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eefn implements eefo {
    private static final dktn a = new dktn("LocalMsrpCertificateManager");
    private String b;
    private KeyStore c;
    private final Context d;
    private boolean e = false;

    public eefn(Context context) {
        this.d = context.getApplicationContext();
    }

    private final X509Certificate c(String str) {
        dkty.d(a, "Generating a new certificate.", new Object[0]);
        eect.d(this.d, str);
        KeyStore e = eect.e(this.d);
        this.c = e;
        return eect.b(e);
    }

    private final synchronized void d() {
        KeyStore e;
        if (this.e) {
            throw new IllegalStateException("expected to be not initialized");
        }
        dkty.d(a, "Creating local MSRP certificate", new Object[0]);
        String c = djak.c();
        if (!eect.c(c)) {
            throw new IllegalArgumentException("Not supported digest algorithm ".concat(String.valueOf(c)));
        }
        String str = "SHA-1".equalsIgnoreCase(c) ? "SHA1withRSA" : "SHA-256".equalsIgnoreCase(c) ? "SHA256withRSA" : "";
        try {
            e = eect.e(this.d);
        } catch (IOException unused) {
            dkty.l(a, "Generating keystore due to uninitialized keystore file.", new Object[0]);
            eect.d(this.d, str);
            e = eect.e(this.d);
        }
        X509Certificate b = eect.b(e);
        b.getClass();
        if (!f(b, c)) {
            dkty.l(a, "Generating new local SSL certificate as the old one has expired", new Object[0]);
            b = c(str);
        } else if (b.getSigAlgName().equalsIgnoreCase(str)) {
            this.c = e;
        } else {
            dkty.l(a, "Generating new local SSL certificate as signature algorithm changed. old:%s new:%s", b.getSigAlgName(), str);
            b = c(str);
        }
        if (b == null) {
            throw new IllegalStateException("expected non-null certificate");
        }
        String a2 = eect.a(b, c);
        a2.getClass();
        this.b = a2;
        dkty.d(a, "Using fingerprint: %s", a2);
    }

    private final synchronized void e() {
        if (this.e) {
            return;
        }
        try {
            d();
            this.e = true;
        } catch (IOException e) {
            e = e;
            dkty.j(e, a, "Error while initializing the certificate provider", new Object[0]);
        } catch (IllegalStateException e2) {
            dkty.j(e2, a, "Illegal state while initialize the certificate provider", new Object[0]);
        } catch (InvalidKeyException e3) {
            e = e3;
            dkty.j(e, a, "Error while initializing the certificate provider", new Object[0]);
        } catch (KeyStoreException e4) {
            e = e4;
            dkty.j(e, a, "Error while initializing the certificate provider", new Object[0]);
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            dkty.j(e, a, "Error while initializing the certificate provider", new Object[0]);
        } catch (SignatureException e6) {
            e = e6;
            dkty.j(e, a, "Error while initializing the certificate provider", new Object[0]);
        } catch (CertificateException e7) {
            e = e7;
            dkty.j(e, a, "Error while initializing the certificate provider", new Object[0]);
        }
    }

    private static boolean f(X509Certificate x509Certificate, String str) {
        dkty.d(a, "(%s) certificate valid from: %s to: %s", eect.a(x509Certificate, str), x509Certificate.getNotBefore().toString(), x509Certificate.getNotAfter().toString());
        try {
            x509Certificate.checkValidity(new Date(dkvj.a().longValue()));
            return true;
        } catch (CertificateExpiredException | CertificateNotYetValidException unused) {
            return false;
        }
    }

    @Override // defpackage.eefo
    public final String a() {
        e();
        return this.b;
    }

    @Override // defpackage.eefo
    public final KeyStore b() {
        e();
        KeyStore keyStore = this.c;
        if (keyStore != null) {
            return keyStore;
        }
        throw new IllegalStateException("Keystore could not be created.");
    }
}

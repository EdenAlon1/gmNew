package defpackage;

import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.Date;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1BitString;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhsb extends fhry {
    private final Object g;
    private fhrz h;
    private X500Principal i;
    private PublicKey j;
    private X500Principal k;
    private long[] l;
    private volatile boolean m;
    private volatile int n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fhsb(defpackage.fhsk r11, org.bouncycastle.asn1.x509.Certificate r12) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhsb.<init>(fhsk, org.bouncycastle.asn1.x509.Certificate):void");
    }

    private final fhrz c() {
        byte[] bArr;
        fhsa fhsaVar;
        fhrz fhrzVar;
        synchronized (this.g) {
            fhrz fhrzVar2 = this.h;
            if (fhrzVar2 != null) {
                return fhrzVar2;
            }
            try {
                bArr = this.a.u();
                fhsaVar = null;
            } catch (IOException e) {
                bArr = null;
                fhsaVar = new fhsa(e);
            }
            fhrz fhrzVar3 = new fhrz(this.f, this.a, this.b, this.c, this.d, this.e, bArr, fhsaVar);
            synchronized (this.g) {
                if (this.h == null) {
                    this.h = fhrzVar3;
                }
                fhrzVar = this.h;
            }
            return fhrzVar;
        }
    }

    @Override // defpackage.fhry, java.security.cert.X509Certificate
    public final void checkValidity(Date date) {
        long[] jArr;
        Object obj = this.g;
        long time = date.getTime();
        synchronized (obj) {
            jArr = this.l;
            if (jArr == null) {
                long[] jArr2 = {super.getNotBefore().getTime(), super.getNotAfter().getTime()};
                synchronized (this.g) {
                    if (this.l == null) {
                        this.l = jArr2;
                    }
                    jArr = this.l;
                }
            }
        }
        if (time > jArr[1]) {
            throw new CertificateExpiredException("certificate expired on ".concat(this.a.d().a()));
        }
        if (time < jArr[0]) {
            throw new CertificateNotYetValidException("certificate not valid till ".concat(this.a.e().a()));
        }
    }

    @Override // java.security.cert.Certificate
    public final boolean equals(Object obj) {
        ASN1BitString aSN1BitString;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fhsb)) {
            return c().equals(obj);
        }
        fhsb fhsbVar = (fhsb) obj;
        if (this.m && fhsbVar.m) {
            if (this.n != fhsbVar.n) {
                return false;
            }
        } else if ((this.h == null || fhsbVar.h == null) && (aSN1BitString = this.a.d) != null && !aSN1BitString.w(fhsbVar.a.d)) {
            return false;
        }
        return c().equals(fhsbVar.c());
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return fics.c(c().getEncoded());
    }

    @Override // defpackage.fhry, java.security.cert.X509Certificate
    public final X500Principal getIssuerX500Principal() {
        X500Principal x500Principal;
        synchronized (this.g) {
            X500Principal x500Principal2 = this.i;
            if (x500Principal2 != null) {
                return x500Principal2;
            }
            X500Principal issuerX500Principal = super.getIssuerX500Principal();
            synchronized (this.g) {
                if (this.i == null) {
                    this.i = issuerX500Principal;
                }
                x500Principal = this.i;
            }
            return x500Principal;
        }
    }

    @Override // defpackage.fhry, java.security.cert.Certificate
    public final PublicKey getPublicKey() {
        PublicKey publicKey;
        synchronized (this.g) {
            PublicKey publicKey2 = this.j;
            if (publicKey2 != null) {
                return publicKey2;
            }
            PublicKey publicKey3 = super.getPublicKey();
            if (publicKey3 == null) {
                return null;
            }
            synchronized (this.g) {
                if (this.j == null) {
                    this.j = publicKey3;
                }
                publicKey = this.j;
            }
            return publicKey;
        }
    }

    @Override // defpackage.fhry, java.security.cert.X509Certificate
    public final X500Principal getSubjectX500Principal() {
        X500Principal x500Principal;
        synchronized (this.g) {
            X500Principal x500Principal2 = this.k;
            if (x500Principal2 != null) {
                return x500Principal2;
            }
            X500Principal subjectX500Principal = super.getSubjectX500Principal();
            synchronized (this.g) {
                if (this.k == null) {
                    this.k = subjectX500Principal;
                }
                x500Principal = this.k;
            }
            return x500Principal;
        }
    }

    @Override // java.security.cert.Certificate
    public final int hashCode() {
        if (!this.m) {
            this.n = c().hashCode();
            this.m = true;
        }
        return this.n;
    }
}

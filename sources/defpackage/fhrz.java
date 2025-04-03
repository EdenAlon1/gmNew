package defpackage;

import java.security.cert.CertificateEncodingException;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.Certificate;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhrz extends fhry {
    private final byte[] g;
    private final CertificateEncodingException h;

    public fhrz(fhsk fhskVar, Certificate certificate, BasicConstraints basicConstraints, boolean[] zArr, String str, byte[] bArr, byte[] bArr2, CertificateEncodingException certificateEncodingException) {
        super(fhskVar, certificate, basicConstraints, zArr, str, bArr);
        this.g = bArr2;
        this.h = certificateEncodingException;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        CertificateEncodingException certificateEncodingException = this.h;
        if (certificateEncodingException != null) {
            throw certificateEncodingException;
        }
        byte[] bArr = this.g;
        if (bArr != null) {
            return bArr;
        }
        throw new CertificateEncodingException();
    }
}

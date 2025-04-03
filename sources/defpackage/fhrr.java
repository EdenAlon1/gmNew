package defpackage;

import j$.util.DesugarCollections;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.CRLNumber;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.Time;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fhrr extends X509CRL {
    protected final CertificateList a;
    protected final String b;
    protected final byte[] c;
    protected final boolean d;
    protected final fhsk e;

    public fhrr(fhsk fhskVar, CertificateList certificateList, String str, byte[] bArr, boolean z) {
        this.e = fhskVar;
        this.a = certificateList;
        this.b = str;
        this.c = bArr;
        this.d = z;
    }

    protected static ASN1OctetString a(CertificateList certificateList, String str) {
        Extension b;
        Extensions extensions = certificateList.a.g;
        if (extensions == null || (b = extensions.b(new ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        return b.u;
    }

    private final Set b(boolean z) {
        Extensions extensions;
        if (getVersion() != 2 || (extensions = this.a.a.g) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration a = extensions.a();
        while (a.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) a.nextElement();
            if (z == extensions.b(aSN1ObjectIdentifier).t) {
                hashSet.add(aSN1ObjectIdentifier.e());
            }
        }
        return hashSet;
    }

    private final void c(PublicKey publicKey, Signature signature, ASN1Encodable aSN1Encodable, byte[] bArr) {
        CertificateList certificateList = this.a;
        if (!fhsc.d(certificateList.b, certificateList.a.b)) {
            throw new CRLException("Signature algorithm on CertificateList does not match TbsCertList.");
        }
        fhsc.c(signature, aSN1Encodable);
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new fhrf(signature), 512);
            this.a.a.t(bufferedOutputStream);
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    private final void d(PublicKey publicKey, fhrm fhrmVar) {
        CertificateList certificateList = this.a;
        if (!certificateList.b.equals(certificateList.a.b)) {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        if ((publicKey instanceof fhre) && fhsc.e(this.a.b)) {
            throw null;
        }
        if (!fhsc.e(this.a.b)) {
            Signature a = fhrmVar.a(this.b);
            byte[] bArr = this.c;
            if (bArr == null) {
                c(publicKey, a, null, getSignature());
                return;
            }
            try {
                c(publicKey, a, ASN1Primitive.v(bArr), getSignature());
                return;
            } catch (IOException e) {
                throw new SignatureException("cannot decode signature parameters: ".concat(String.valueOf(e.getMessage())));
            }
        }
        ASN1Sequence j = ASN1Sequence.j(this.a.b.b);
        ASN1Sequence j2 = ASN1Sequence.j(this.a.c.n());
        boolean z = false;
        for (int i = 0; i != j2.e(); i++) {
            AlgorithmIdentifier a2 = AlgorithmIdentifier.a(j.h(i));
            try {
                c(publicKey, fhrmVar.a(fhsc.a(a2)), a2.b, ASN1BitString.i(j2.h(i)).n());
                z = true;
            } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            } catch (SignatureException e2) {
                e = e2;
            }
            e = null;
            if (e != null) {
                throw e;
            }
        }
        if (!z) {
            throw new InvalidKeyException("no matching key found");
        }
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        return b(true);
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        ASN1OctetString a = a(this.a, str);
        if (a == null) {
            return null;
        }
        try {
            return a.s();
        } catch (Exception e) {
            throw new IllegalStateException("error parsing ".concat(String.valueOf(e.toString())));
        }
    }

    @Override // java.security.cert.X509CRL
    public final Principal getIssuerDN() {
        return new fhsl(X500Name.b(this.a.b().a));
    }

    @Override // java.security.cert.X509CRL
    public final X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.a.b().s());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public final Date getNextUpdate() {
        Time time = this.a.a.e;
        if (time == null) {
            return null;
        }
        return time.b();
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return b(false);
    }

    @Override // java.security.cert.X509CRL
    public final X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        Extension b;
        Enumeration a = this.a.a();
        X500Name x500Name = null;
        while (a.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) a.nextElement();
            if (cRLEntry.a().q(bigInteger)) {
                return new fhrn(cRLEntry, this.d, x500Name);
            }
            if (this.d && cRLEntry.d() && (b = cRLEntry.b().b(Extension.j)) != null) {
                x500Name = X500Name.b(GeneralNames.a(Extension.a(b)).b()[0].a);
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public final Set getRevokedCertificates() {
        Extension b;
        HashSet hashSet = new HashSet();
        Enumeration a = this.a.a();
        X500Name x500Name = null;
        while (a.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) a.nextElement();
            hashSet.add(new fhrn(cRLEntry, this.d, x500Name));
            if (this.d && cRLEntry.d() && (b = cRLEntry.b().b(Extension.j)) != null) {
                x500Name = X500Name.b(GeneralNames.a(Extension.a(b)).b()[0].a);
            }
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // java.security.cert.X509CRL
    public final String getSigAlgName() {
        return this.b;
    }

    @Override // java.security.cert.X509CRL
    public final String getSigAlgOID() {
        return this.a.b.a.e();
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getSigAlgParams() {
        return fics.c(this.c);
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getSignature() {
        return this.a.c.n();
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getTBSCertList() {
        try {
            return this.a.a.u();
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public final Date getThisUpdate() {
        return this.a.a.d.b();
    }

    @Override // java.security.cert.X509CRL
    public final int getVersion() {
        ASN1Integer aSN1Integer = this.a.a.a;
        if (aSN1Integer == null) {
            return 1;
        }
        return aSN1Integer.f() + 1;
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(Extension.i.e());
        criticalExtensionOIDs.remove(Extension.h.e());
        return !criticalExtensionOIDs.isEmpty();
    }

    @Override // java.security.cert.CRL
    public final boolean isRevoked(Certificate certificate) {
        X500Name a;
        Extension b;
        if (!certificate.getType().equals("X.509")) {
            throw new IllegalArgumentException("X.509 CRL used with non X.509 Cert");
        }
        CertificateList certificateList = this.a;
        Enumeration a2 = certificateList.a();
        X500Name b2 = certificateList.b();
        if (a2.hasMoreElements()) {
            X509Certificate x509Certificate = (X509Certificate) certificate;
            BigInteger serialNumber = x509Certificate.getSerialNumber();
            while (a2.hasMoreElements()) {
                TBSCertList.CRLEntry c = TBSCertList.CRLEntry.c(a2.nextElement());
                if (this.d && c.d() && (b = c.b().b(Extension.j)) != null) {
                    b2 = X500Name.b(GeneralNames.a(Extension.a(b)).b()[0].a);
                }
                if (c.a().q(serialNumber)) {
                    if (certificate instanceof X509Certificate) {
                        a = X500Name.b(x509Certificate.getIssuerX500Principal().getEncoded());
                    } else {
                        try {
                            a = org.bouncycastle.asn1.x509.Certificate.c(certificate.getEncoded()).a();
                        } catch (CertificateEncodingException e) {
                            throw new IllegalArgumentException("Cannot process certificate: ".concat(String.valueOf(e.getMessage())));
                        }
                    }
                    return b2.equals(a);
                }
            }
        }
        return false;
    }

    @Override // java.security.cert.CRL
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = fidb.a;
        stringBuffer.append("              Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(str);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(str);
        stringBuffer.append("          This update: ");
        stringBuffer.append(getThisUpdate());
        stringBuffer.append(str);
        stringBuffer.append("          Next update: ");
        stringBuffer.append(getNextUpdate());
        stringBuffer.append(str);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(this.b);
        stringBuffer.append(str);
        fhsc.b(getSignature(), stringBuffer, str);
        Extensions extensions = this.a.a.g;
        if (extensions != null) {
            Enumeration a = extensions.a();
            if (a.hasMoreElements()) {
                stringBuffer.append("           Extensions: ");
                stringBuffer.append(str);
            }
            while (a.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) a.nextElement();
                Extension b = extensions.b(aSN1ObjectIdentifier);
                ASN1OctetString aSN1OctetString = b.u;
                if (aSN1OctetString != null) {
                    ASN1InputStream aSN1InputStream = new ASN1InputStream(aSN1OctetString.c);
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(b.t);
                    stringBuffer.append(") ");
                    try {
                        if (aSN1ObjectIdentifier.w(Extension.f)) {
                            stringBuffer.append(new CRLNumber(ASN1Integer.m(aSN1InputStream.f()).i()));
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.w(Extension.h)) {
                            stringBuffer.append("Base CRL: " + new CRLNumber(ASN1Integer.m(aSN1InputStream.f()).i()).toString());
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.w(Extension.i)) {
                            stringBuffer.append(IssuingDistributionPoint.a(aSN1InputStream.f()));
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.w(Extension.l)) {
                            stringBuffer.append(CRLDistPoint.a(aSN1InputStream.f()));
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.w(Extension.q)) {
                            stringBuffer.append(CRLDistPoint.a(aSN1InputStream.f()));
                            stringBuffer.append(str);
                        } else {
                            stringBuffer.append(aSN1ObjectIdentifier.e());
                            stringBuffer.append(" value = ");
                            stringBuffer.append(ASN1Dump.a(aSN1InputStream.f()));
                            stringBuffer.append(str);
                        }
                    } catch (Exception unused) {
                        stringBuffer.append(aSN1ObjectIdentifier.e());
                        stringBuffer.append(" value = ");
                        stringBuffer.append("*****");
                        stringBuffer.append(str);
                    }
                } else {
                    stringBuffer.append(str);
                }
            }
        }
        Set revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            Iterator it = revokedCertificates.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next());
                stringBuffer.append(str);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey) {
        d(publicKey, new fhro(this));
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey, String str) {
        d(publicKey, new fhrp(str));
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey, Provider provider) {
        try {
            d(publicKey, new fhrq(this, provider));
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException("provider issue: ".concat(String.valueOf(e.getMessage())));
        }
    }
}

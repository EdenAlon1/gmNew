package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1BitString;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhru extends fhrr {
    private final Object f;
    private fhrs g;
    private volatile boolean h;
    private volatile int i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fhru(defpackage.fhsk r9, org.bouncycastle.asn1.x509.CertificateList r10) {
        /*
            r8 = this;
            java.lang.String r1 = "CRL contents invalid: "
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r0 = r10.b     // Catch: java.lang.Exception -> L61
            java.lang.String r5 = defpackage.fhsc.a(r0)     // Catch: java.lang.Exception -> L61
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r0 = r10.b     // Catch: java.lang.Exception -> L50
            org.bouncycastle.asn1.ASN1Encodable r0 = r0.b     // Catch: java.lang.Exception -> L50
            r2 = 0
            if (r0 != 0) goto L11
            r6 = r2
            goto L1a
        L11:
            org.bouncycastle.asn1.ASN1Primitive r0 = r0.p()     // Catch: java.lang.Exception -> L50
            byte[] r0 = r0.u()     // Catch: java.lang.Exception -> L50
            r6 = r0
        L1a:
            org.bouncycastle.asn1.ASN1ObjectIdentifier r0 = org.bouncycastle.asn1.x509.Extension.i     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = r0.e()     // Catch: java.lang.Exception -> L47
            org.bouncycastle.asn1.ASN1OctetString r0 = defpackage.fhrr.a(r10, r0)     // Catch: java.lang.Exception -> L47
            if (r0 == 0) goto L2d
            byte[] r2 = r0.c     // Catch: java.lang.Exception -> L29
            goto L2d
        L29:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L4a
        L2d:
            if (r2 != 0) goto L35
            r0 = 0
        L30:
            r2 = r8
            r3 = r9
            r4 = r10
            r7 = r0
            goto L3c
        L35:
            org.bouncycastle.asn1.x509.IssuingDistributionPoint r0 = org.bouncycastle.asn1.x509.IssuingDistributionPoint.a(r2)     // Catch: java.lang.Exception -> L47
            boolean r0 = r0.a     // Catch: java.lang.Exception -> L47
            goto L30
        L3c:
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r9 = new java.lang.Object
            r9.<init>()
            r2.f = r9
            return
        L47:
            r0 = move-exception
            r2 = r8
            r9 = r0
        L4a:
            fhri r10 = new fhri
            r10.<init>(r9)
            throw r10
        L50:
            r0 = move-exception
            r2 = r8
            r9 = r0
            java.security.cert.CRLException r10 = new java.security.cert.CRLException
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r1.concat(r9)
            r10.<init>(r9)
            throw r10
        L61:
            r0 = move-exception
            r2 = r8
            r9 = r0
            fhrt r10 = new fhrt
            java.lang.String r0 = r9.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            r10.<init>(r0, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhru.<init>(fhsk, org.bouncycastle.asn1.x509.CertificateList):void");
    }

    private final fhrs b() {
        byte[] bArr;
        fhrt fhrtVar;
        fhrs fhrsVar;
        synchronized (this.f) {
            fhrs fhrsVar2 = this.g;
            if (fhrsVar2 != null) {
                return fhrsVar2;
            }
            try {
                bArr = this.a.u();
                fhrtVar = null;
            } catch (IOException e) {
                bArr = null;
                fhrtVar = new fhrt(e);
            }
            fhrs fhrsVar3 = new fhrs(this.e, this.a, this.b, this.c, this.d, bArr, fhrtVar);
            synchronized (this.f) {
                if (this.g == null) {
                    this.g = fhrsVar3;
                }
                fhrsVar = this.g;
            }
            return fhrsVar;
        }
    }

    @Override // java.security.cert.X509CRL
    public final boolean equals(Object obj) {
        ASN1BitString aSN1BitString;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhru)) {
            return b().equals(obj);
        }
        fhru fhruVar = (fhru) obj;
        if (this.h && fhruVar.h) {
            if (this.i != fhruVar.i) {
                return false;
            }
        } else if ((this.g == null || fhruVar.g == null) && (aSN1BitString = this.a.c) != null && !aSN1BitString.w(fhruVar.a.c)) {
            return false;
        }
        return b().equals(fhruVar.b());
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getEncoded() {
        return fics.c(b().getEncoded());
    }

    @Override // java.security.cert.X509CRL
    public final int hashCode() {
        if (!this.h) {
            this.i = b().hashCode();
            this.h = true;
        }
        return this.i;
    }
}

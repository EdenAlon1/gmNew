package org.bouncycastle.asn1.x509;

import defpackage.fidb;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class CRLDistPoint extends ASN1Object {
    final ASN1Sequence a;

    private CRLDistPoint(ASN1Sequence aSN1Sequence) {
        this.a = aSN1Sequence;
    }

    public static CRLDistPoint a(Object obj) {
        if (obj != null) {
            return new CRLDistPoint(ASN1Sequence.j(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return this.a;
    }

    public final String toString() {
        DistributionPoint distributionPoint;
        StringBuffer stringBuffer = new StringBuffer("CRLDistPoint:");
        String str = fidb.a;
        stringBuffer.append(str);
        int e = this.a.e();
        DistributionPoint[] distributionPointArr = new DistributionPoint[e];
        for (int i = 0; i != this.a.e(); i++) {
            ASN1Encodable h = this.a.h(i);
            if (h == null || (h instanceof DistributionPoint)) {
                distributionPoint = (DistributionPoint) h;
            } else {
                if (!(h instanceof ASN1Sequence)) {
                    throw new IllegalArgumentException("Invalid DistributionPoint: ".concat(String.valueOf(h.getClass().getName())));
                }
                distributionPoint = new DistributionPoint((ASN1Sequence) h);
            }
            distributionPointArr[i] = distributionPoint;
        }
        for (int i2 = 0; i2 != e; i2++) {
            stringBuffer.append("    ");
            stringBuffer.append(distributionPointArr[i2]);
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }
}

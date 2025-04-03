package org.bouncycastle.asn1.x509;

import defpackage.a;
import defpackage.fidb;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class DistributionPoint extends ASN1Object {
    DistributionPointName a;
    ReasonFlags b;
    GeneralNames c;

    public DistributionPoint(ASN1Sequence aSN1Sequence) {
        for (int i = 0; i != aSN1Sequence.e(); i++) {
            ASN1TaggedObject m = ASN1TaggedObject.m(aSN1Sequence.h(i));
            int i2 = m.c;
            if (i2 == 0) {
                this.a = DistributionPointName.a(m);
            } else if (i2 == 1) {
                this.b = new ReasonFlags(ASN1BitString.o(m));
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException(a.h(i2, "Unknown tag encountered in structure: "));
                }
                this.c = GeneralNames.c(m);
            }
        }
    }

    private static final void a(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        DistributionPointName distributionPointName = this.a;
        if (distributionPointName != null) {
            aSN1EncodableVector.b(new DERTaggedObject(distributionPointName));
        }
        ReasonFlags reasonFlags = this.b;
        if (reasonFlags != null) {
            aSN1EncodableVector.b(new DERTaggedObject(false, 1, reasonFlags));
        }
        GeneralNames generalNames = this.c;
        if (generalNames != null) {
            aSN1EncodableVector.b(new DERTaggedObject(false, 2, generalNames));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public final String toString() {
        String str = fidb.a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPoint: [");
        stringBuffer.append(str);
        DistributionPointName distributionPointName = this.a;
        if (distributionPointName != null) {
            a(stringBuffer, str, "distributionPoint", distributionPointName.toString());
        }
        ReasonFlags reasonFlags = this.b;
        if (reasonFlags != null) {
            a(stringBuffer, str, "reasons", reasonFlags.e());
        }
        GeneralNames generalNames = this.c;
        if (generalNames != null) {
            a(stringBuffer, str, "cRLIssuer", generalNames.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}

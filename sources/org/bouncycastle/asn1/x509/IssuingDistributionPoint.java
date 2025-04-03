package org.bouncycastle.asn1.x509;

import defpackage.fidb;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class IssuingDistributionPoint extends ASN1Object {
    public boolean a;
    private DistributionPointName b;
    private boolean c;
    private boolean d;
    private ReasonFlags e;
    private boolean f;
    private ASN1Sequence g;

    private IssuingDistributionPoint(ASN1Sequence aSN1Sequence) {
        this.g = aSN1Sequence;
        for (int i = 0; i != aSN1Sequence.e(); i++) {
            ASN1TaggedObject m = ASN1TaggedObject.m(aSN1Sequence.h(i));
            int i2 = m.c;
            if (i2 == 0) {
                this.b = DistributionPointName.a(m);
            } else if (i2 == 1) {
                this.c = ASN1Boolean.i(m).h();
            } else if (i2 == 2) {
                this.d = ASN1Boolean.i(m).h();
            } else if (i2 == 3) {
                this.e = new ReasonFlags(ASN1BitString.o(m));
            } else if (i2 == 4) {
                this.a = ASN1Boolean.i(m).h();
            } else {
                if (i2 != 5) {
                    throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
                }
                this.f = ASN1Boolean.i(m).h();
            }
        }
    }

    public static IssuingDistributionPoint a(Object obj) {
        if (obj instanceof IssuingDistributionPoint) {
            return (IssuingDistributionPoint) obj;
        }
        if (obj != null) {
            return new IssuingDistributionPoint(ASN1Sequence.j(obj));
        }
        return null;
    }

    private static final void b(StringBuffer stringBuffer, String str, String str2, String str3) {
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
        return this.g;
    }

    public final String toString() {
        String str = fidb.a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IssuingDistributionPoint: [");
        stringBuffer.append(str);
        DistributionPointName distributionPointName = this.b;
        if (distributionPointName != null) {
            b(stringBuffer, str, "distributionPoint", distributionPointName.toString());
        }
        if (this.c) {
            b(stringBuffer, str, "onlyContainsUserCerts", "true");
        }
        if (this.d) {
            b(stringBuffer, str, "onlyContainsCACerts", "true");
        }
        ReasonFlags reasonFlags = this.e;
        if (reasonFlags != null) {
            b(stringBuffer, str, "onlySomeReasons", reasonFlags.e());
        }
        if (this.f) {
            b(stringBuffer, str, "onlyContainsAttributeCerts", "true");
        }
        if (this.a) {
            b(stringBuffer, str, "indirectCRL", "true");
        }
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}

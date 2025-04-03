package org.bouncycastle.asn1.x509;

import defpackage.fidb;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.DERTaggedObject;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class DistributionPointName extends ASN1Object implements ASN1Choice {
    final ASN1Encodable a;
    final int b;

    public DistributionPointName(ASN1TaggedObject aSN1TaggedObject) {
        int i = aSN1TaggedObject.c;
        this.b = i;
        if (i == 0) {
            this.a = GeneralNames.c(aSN1TaggedObject);
        } else {
            this.a = ASN1Set.h(aSN1TaggedObject);
        }
    }

    public static DistributionPointName a(ASN1TaggedObject aSN1TaggedObject) {
        if (aSN1TaggedObject == null) {
            throw new NullPointerException("'taggedObject' cannot be null");
        }
        ASN1Util.c(aSN1TaggedObject);
        if (!aSN1TaggedObject.n()) {
            throw new IllegalStateException("object implicit - explicit expected.");
        }
        ASN1Primitive p = aSN1TaggedObject.d.p();
        if (!(p instanceof ASN1TaggedObject)) {
            throw new IllegalStateException("unexpected object: ".concat(String.valueOf(p.getClass().getName())));
        }
        ASN1TaggedObject aSN1TaggedObject2 = (ASN1TaggedObject) p;
        if (aSN1TaggedObject2 != null) {
            return new DistributionPointName(aSN1TaggedObject2);
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
        return new DERTaggedObject(false, this.b, this.a);
    }

    public final String toString() {
        String str = fidb.a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(str);
        if (this.b == 0) {
            b(stringBuffer, str, "fullName", this.a.toString());
        } else {
            b(stringBuffer, str, "nameRelativeToCRLIssuer", this.a.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}

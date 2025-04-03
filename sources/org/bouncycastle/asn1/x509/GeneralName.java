package org.bouncycastle.asn1.x509;

import defpackage.a;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UniversalType;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class GeneralName extends ASN1Object implements ASN1Choice {
    public final ASN1Encodable a;
    public final int b;

    public GeneralName(int i, ASN1Encodable aSN1Encodable) {
        this.a = aSN1Encodable;
        this.b = i;
    }

    public static GeneralName a(Object obj) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        if (obj == null || (obj instanceof GeneralName)) {
            return (GeneralName) obj;
        }
        if (!(obj instanceof ASN1TaggedObject)) {
            if (!(obj instanceof byte[])) {
                throw new IllegalArgumentException("unknown object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
            }
            try {
                return a(ASN1Primitive.v((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException("unable to parse encoded general name");
            }
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
        int i = aSN1TaggedObject.c;
        switch (i) {
            case 0:
            case 3:
            case 5:
                return new GeneralName(i, ASN1Sequence.m(aSN1TaggedObject, false));
            case 1:
            case 2:
            case 6:
                return new GeneralName(i, (ASN1IA5String) ASN1IA5String.a.d(aSN1TaggedObject, false));
            case 4:
                int i2 = X500Name.b;
                return new GeneralName(i, X500Name.b(ASN1Sequence.m(aSN1TaggedObject, true)));
            case 7:
                return new GeneralName(i, ASN1OctetString.g(aSN1TaggedObject, false));
            case 8:
                int i3 = aSN1TaggedObject.a;
                ASN1UniversalType aSN1UniversalType = ASN1ObjectIdentifier.a;
                if (i3 != 3 && i3 != 4 && aSN1TaggedObject.b == 128) {
                    ASN1Primitive p = aSN1TaggedObject.e().p();
                    if (!(p instanceof ASN1ObjectIdentifier)) {
                        byte[] bArr = ASN1OctetString.f(p).c;
                        if (bArr == null) {
                            throw new NullPointerException("'contents' cannot be null");
                        }
                        aSN1ObjectIdentifier = ASN1ObjectIdentifier.g(bArr, true);
                        return new GeneralName(i, aSN1ObjectIdentifier);
                    }
                }
                aSN1ObjectIdentifier = (ASN1ObjectIdentifier) ASN1ObjectIdentifier.a.d(aSN1TaggedObject, false);
                return new GeneralName(i, aSN1ObjectIdentifier);
            default:
                throw new IllegalArgumentException(a.h(i, "unknown tag: "));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        int i = this.b;
        return new DERTaggedObject(i == 4, i, this.a);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.b);
        stringBuffer.append(": ");
        int i = this.b;
        if (i != 1 && i != 2) {
            if (i == 4) {
                stringBuffer.append(X500Name.b(this.a).toString());
            } else if (i != 6) {
                stringBuffer.append(this.a.toString());
            }
            return stringBuffer.toString();
        }
        stringBuffer.append(ASN1IA5String.f(this.a).e());
        return stringBuffer.toString();
    }
}

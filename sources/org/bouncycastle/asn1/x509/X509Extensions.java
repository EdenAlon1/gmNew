package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class X509Extensions extends ASN1Object {
    private Hashtable a = new Hashtable();
    private Vector b = new Vector();

    static {
        new ASN1ObjectIdentifier("2.5.29.9");
        new ASN1ObjectIdentifier("2.5.29.14");
        new ASN1ObjectIdentifier("2.5.29.15");
        new ASN1ObjectIdentifier("2.5.29.16");
        new ASN1ObjectIdentifier("2.5.29.17");
        new ASN1ObjectIdentifier("2.5.29.18");
        new ASN1ObjectIdentifier("2.5.29.19");
        new ASN1ObjectIdentifier("2.5.29.20");
        new ASN1ObjectIdentifier("2.5.29.21");
        new ASN1ObjectIdentifier("2.5.29.23");
        new ASN1ObjectIdentifier("2.5.29.24");
        new ASN1ObjectIdentifier("2.5.29.27");
        new ASN1ObjectIdentifier("2.5.29.28");
        new ASN1ObjectIdentifier("2.5.29.29");
        new ASN1ObjectIdentifier("2.5.29.30");
        new ASN1ObjectIdentifier("2.5.29.31");
        new ASN1ObjectIdentifier("2.5.29.32");
        new ASN1ObjectIdentifier("2.5.29.33");
        new ASN1ObjectIdentifier("2.5.29.35");
        new ASN1ObjectIdentifier("2.5.29.36");
        new ASN1ObjectIdentifier("2.5.29.37");
        new ASN1ObjectIdentifier("2.5.29.46");
        new ASN1ObjectIdentifier("2.5.29.54");
        new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.1");
        new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.11");
        new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.12");
        new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.2");
        new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.3");
        new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.4");
        new ASN1ObjectIdentifier("2.5.29.56");
        new ASN1ObjectIdentifier("2.5.29.55");
    }

    public X509Extensions(Vector vector, Hashtable hashtable) {
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            this.b.addElement(ASN1ObjectIdentifier.h(elements.nextElement()));
        }
        Enumeration elements2 = this.b.elements();
        while (elements2.hasMoreElements()) {
            ASN1ObjectIdentifier h = ASN1ObjectIdentifier.h(elements2.nextElement());
            this.a.put(h, (X509Extension) hashtable.get(h));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(this.b.size());
        Enumeration elements = this.b.elements();
        if (!elements.hasMoreElements()) {
            return new DERSequence(aSN1EncodableVector);
        }
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) elements.nextElement();
        aSN1EncodableVector2.b(aSN1ObjectIdentifier);
        throw null;
    }
}

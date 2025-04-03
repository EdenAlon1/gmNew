package org.bouncycastle.asn1.x509;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class Extension extends ASN1Object {
    public static final ASN1ObjectIdentifier a = new ASN1ObjectIdentifier("2.5.29.9").i();
    public static final ASN1ObjectIdentifier b;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier d;
    public static final ASN1ObjectIdentifier e;
    public static final ASN1ObjectIdentifier f;
    public static final ASN1ObjectIdentifier g;
    public static final ASN1ObjectIdentifier h;
    public static final ASN1ObjectIdentifier i;
    public static final ASN1ObjectIdentifier j;
    public static final ASN1ObjectIdentifier k;
    public static final ASN1ObjectIdentifier l;
    public static final ASN1ObjectIdentifier m;
    public static final ASN1ObjectIdentifier n;
    public static final ASN1ObjectIdentifier o;
    public static final ASN1ObjectIdentifier p;
    public static final ASN1ObjectIdentifier q;
    public static final ASN1ObjectIdentifier r;
    public ASN1ObjectIdentifier s;
    public boolean t;
    public ASN1OctetString u;

    static {
        new ASN1ObjectIdentifier("2.5.29.14").i();
        b = new ASN1ObjectIdentifier("2.5.29.15").i();
        new ASN1ObjectIdentifier("2.5.29.16").i();
        c = new ASN1ObjectIdentifier("2.5.29.17").i();
        d = new ASN1ObjectIdentifier("2.5.29.18").i();
        e = new ASN1ObjectIdentifier("2.5.29.19").i();
        f = new ASN1ObjectIdentifier("2.5.29.20").i();
        g = new ASN1ObjectIdentifier("2.5.29.21").i();
        new ASN1ObjectIdentifier("2.5.29.23").i();
        new ASN1ObjectIdentifier("2.5.29.24").i();
        h = new ASN1ObjectIdentifier("2.5.29.27").i();
        i = new ASN1ObjectIdentifier("2.5.29.28").i();
        j = new ASN1ObjectIdentifier("2.5.29.29").i();
        k = new ASN1ObjectIdentifier("2.5.29.30").i();
        l = new ASN1ObjectIdentifier("2.5.29.31").i();
        m = new ASN1ObjectIdentifier("2.5.29.32").i();
        n = new ASN1ObjectIdentifier("2.5.29.33").i();
        new ASN1ObjectIdentifier("2.5.29.35").i();
        o = new ASN1ObjectIdentifier("2.5.29.36").i();
        p = new ASN1ObjectIdentifier("2.5.29.37").i();
        q = new ASN1ObjectIdentifier("2.5.29.46").i();
        r = new ASN1ObjectIdentifier("2.5.29.54").i();
        new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.1").i();
        new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.11").i();
        new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.12").i();
        new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.2").i();
        new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.3").i();
        new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.4").i();
        new ASN1ObjectIdentifier("2.5.29.56").i();
        new ASN1ObjectIdentifier("2.5.29.55").i();
        new ASN1ObjectIdentifier("2.5.29.60").i();
        new ASN1ObjectIdentifier("2.5.29.72").i();
        new ASN1ObjectIdentifier("2.5.29.73").i();
        new ASN1ObjectIdentifier("2.5.29.74").i();
        new ASN1ObjectIdentifier("2.16.840.1.114027.80.6.1");
    }

    public Extension(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.e() == 2) {
            this.s = ASN1ObjectIdentifier.h(aSN1Sequence.h(0));
            this.t = false;
            this.u = ASN1OctetString.f(aSN1Sequence.h(1));
        } else if (aSN1Sequence.e() == 3) {
            this.s = ASN1ObjectIdentifier.h(aSN1Sequence.h(0));
            this.t = ASN1Boolean.f(aSN1Sequence.h(1)).h();
            this.u = ASN1OctetString.f(aSN1Sequence.h(2));
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + aSN1Sequence.e());
        }
    }

    public static ASN1Primitive a(Extension extension) {
        try {
            return ASN1Primitive.v(extension.u.c);
        } catch (IOException e2) {
            throw new IllegalArgumentException("can't convert extension: ".concat(e2.toString()));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final boolean equals(Object obj) {
        if (!(obj instanceof Extension)) {
            return false;
        }
        Extension extension = (Extension) obj;
        return extension.s.w(this.s) && extension.u.w(this.u) && extension.t == this.t;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return this.t ? this.u.hashCode() ^ this.s.hashCode() : ~(this.u.hashCode() ^ this.s.hashCode());
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.b(this.s);
        if (this.t) {
            aSN1EncodableVector.b(ASN1Boolean.g(true));
        }
        aSN1EncodableVector.b(this.u);
        return new DERSequence(aSN1EncodableVector);
    }
}

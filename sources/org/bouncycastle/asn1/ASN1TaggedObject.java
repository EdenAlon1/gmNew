package org.bouncycastle.asn1;

import defpackage.a;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ASN1TaggedObject extends ASN1Primitive implements ASN1TaggedObjectParser {
    public final int a;
    public final int b;
    public final int c;
    public final ASN1Encodable d;

    public ASN1TaggedObject(int i, int i2, int i3, ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        if ((i2 & 192) != i2) {
            throw new IllegalArgumentException(a.h(i2, "invalid tag class: "));
        }
        this.a = true == (aSN1Encodable instanceof ASN1Choice) ? 1 : i;
        this.b = i2;
        this.c = i3;
        this.d = aSN1Encodable;
    }

    static ASN1Primitive g(int i, int i2, ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.c == 1 ? new DLTaggedObject(3, i, i2, aSN1EncodableVector.a(0)) : new DLTaggedObject(4, i, i2, DLFactory.a(aSN1EncodableVector));
    }

    static ASN1Primitive h(int i, int i2, byte[] bArr) {
        return new DLTaggedObject(4, i, i2, new DEROctetString(bArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ASN1TaggedObject m(Object obj) {
        if (obj == 0 || (obj instanceof ASN1TaggedObject)) {
            return (ASN1TaggedObject) obj;
        }
        ASN1Primitive p = obj.p();
        if (p instanceof ASN1TaggedObject) {
            return (ASN1TaggedObject) p;
        }
        throw new IllegalArgumentException("unknown object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1TaggedObject)) {
            return false;
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
        if (this.c != aSN1TaggedObject.c || this.b != aSN1TaggedObject.b) {
            return false;
        }
        if (this.a != aSN1TaggedObject.a && n() != aSN1TaggedObject.n()) {
            return false;
        }
        ASN1Primitive p = this.d.p();
        ASN1Primitive p2 = aSN1TaggedObject.d.p();
        if (p == p2) {
            return true;
        }
        if (n()) {
            return p.c(p2);
        }
        try {
            return Arrays.equals(s(), aSN1TaggedObject.s());
        } catch (IOException unused) {
            return false;
        }
    }

    public final ASN1Object e() {
        ASN1Encodable aSN1Encodable = this.d;
        return aSN1Encodable instanceof ASN1Object ? (ASN1Object) aSN1Encodable : aSN1Encodable.p();
    }

    public final ASN1Object f() {
        if (!n()) {
            throw new IllegalStateException("object implicit - explicit expected.");
        }
        ASN1Encodable aSN1Encodable = this.d;
        return aSN1Encodable instanceof ASN1Object ? (ASN1Object) aSN1Encodable : aSN1Encodable.p();
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return ((true != n() ? 240 : 15) ^ ((this.b * 7919) ^ this.c)) ^ this.d.p().hashCode();
    }

    public abstract ASN1Sequence i(ASN1Primitive aSN1Primitive);

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive k() {
        return new DERTaggedObject(this.a, this.b, this.c, this.d);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive l() {
        return new DLTaggedObject(this.a, this.b, this.c, this.d);
    }

    public final boolean n() {
        int i = this.a;
        return i == 1 || i == 3;
    }

    public final String toString() {
        return ASN1Util.b(this.b, this.c).concat(this.d.toString());
    }

    protected ASN1TaggedObject(boolean z, int i, ASN1Encodable aSN1Encodable) {
        this(true != z ? 2 : 1, 128, i, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public final ASN1Primitive j() {
        return this;
    }
}

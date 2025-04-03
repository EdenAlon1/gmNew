package org.bouncycastle.asn1;

import defpackage.fics;
import defpackage.fidb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ASN1IA5String extends ASN1Primitive implements ASN1String {
    public static final ASN1UniversalType a = new ASN1UniversalType(ASN1IA5String.class) { // from class: org.bouncycastle.asn1.ASN1IA5String.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            return new DERIA5String(dEROctetString.c);
        }
    };
    final byte[] b;

    public ASN1IA5String(byte[] bArr) {
        this.b = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ASN1IA5String f(Object obj) {
        if (obj == 0 || (obj instanceof ASN1IA5String)) {
            return (ASN1IA5String) obj;
        }
        ASN1Primitive p = obj.p();
        if (p instanceof ASN1IA5String) {
            return (ASN1IA5String) p;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
        try {
            return (ASN1IA5String) a.c((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: ".concat(String.valueOf(e.toString())));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, this.b.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.j(z, 22, this.b);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1IA5String) {
            return Arrays.equals(this.b, ((ASN1IA5String) aSN1Primitive).b);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final String e() {
        return fidb.a(this.b);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return fics.a(this.b);
    }

    public String toString() {
        return e();
    }

    public ASN1IA5String(String str) {
        this.b = fidb.d(str);
    }
}

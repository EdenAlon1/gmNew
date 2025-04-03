package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ASN1Primitive extends ASN1Object {
    public static ASN1Primitive v(byte[] bArr) {
        ASN1InputStream aSN1InputStream = new ASN1InputStream(bArr);
        try {
            ASN1Primitive f = aSN1InputStream.f();
            if (aSN1InputStream.available() == 0) {
                return f;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    public abstract int a(boolean z);

    public abstract void b(ASN1OutputStream aSN1OutputStream, boolean z);

    public abstract boolean c(ASN1Primitive aSN1Primitive);

    public abstract boolean d();

    @Override // org.bouncycastle.asn1.ASN1Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ASN1Encodable) && c(((ASN1Encodable) obj).p());
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final void t(OutputStream outputStream) {
        new DEROutputStream(outputStream).p(this);
    }

    public final boolean w(ASN1Primitive aSN1Primitive) {
        return this == aSN1Primitive || c(aSN1Primitive);
    }

    public ASN1Primitive k() {
        return this;
    }

    public ASN1Primitive l() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return this;
    }
}

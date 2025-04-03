package org.bouncycastle.asn1;

import defpackage.ficu;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ASN1Object implements ASN1Encodable, ficu {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ASN1Encodable) {
            return p().w(((ASN1Encodable) obj).p());
        }
        return false;
    }

    public int hashCode() {
        return p().hashCode();
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public abstract ASN1Primitive p();

    public byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        p().b(new ASN1OutputStream(byteArrayOutputStream), true);
        return byteArrayOutputStream.toByteArray();
    }

    public void t(OutputStream outputStream) {
        p().t(outputStream);
    }

    public final byte[] u() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        p().t(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}

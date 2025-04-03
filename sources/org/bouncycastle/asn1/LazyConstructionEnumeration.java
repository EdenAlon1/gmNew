package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
class LazyConstructionEnumeration implements Enumeration {
    private final ASN1InputStream a;
    private Object b = a();

    public LazyConstructionEnumeration(byte[] bArr) {
        this.a = new ASN1InputStream(bArr, (byte[]) null);
    }

    private final Object a() {
        try {
            return this.a.f();
        } catch (IOException e) {
            throw new ASN1ParsingException("malformed ASN.1: ".concat(e.toString()), e);
        }
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.b != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        Object obj = this.b;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.b = a();
        return obj;
    }
}

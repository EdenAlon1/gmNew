package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class ASN1Type {
    final Class a;

    public ASN1Type(Class cls) {
        this.a = cls;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }
}

package org.bouncycastle.asn1;

import defpackage.a;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ASN1Util {
    public static String a(ASN1TaggedObject aSN1TaggedObject) {
        return b(aSN1TaggedObject.b, aSN1TaggedObject.c);
    }

    public static String b(int i, int i2) {
        return i != 64 ? i != 128 ? i != 192 ? a.f(i2, "[UNIVERSAL ", "]") : a.f(i2, "[PRIVATE ", "]") : a.f(i2, "[CONTEXT ", "]") : a.f(i2, "[APPLICATION ", "]");
    }

    public static void c(ASN1TaggedObject aSN1TaggedObject) {
        int i = aSN1TaggedObject.b;
        if (i != 128) {
            throw new IllegalStateException("Expected CONTEXT tag but found ".concat(i != 64 ? i != 128 ? i != 192 ? "UNIVERSAL" : "PRIVATE" : "CONTEXT" : "APPLICATION"));
        }
    }
}

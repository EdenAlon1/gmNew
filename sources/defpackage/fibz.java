package defpackage;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fibz {
    static ASN1ObjectIdentifier a(String str) {
        if (str.equals("SHA-256")) {
            return NISTObjectIdentifiers.c;
        }
        if (str.equals("SHA-512")) {
            return NISTObjectIdentifiers.e;
        }
        if (str.equals("SHAKE128")) {
            return NISTObjectIdentifiers.m;
        }
        if (str.equals("SHAKE256")) {
            return NISTObjectIdentifiers.n;
        }
        throw new IllegalArgumentException("unrecognized digest: ".concat(str));
    }
}

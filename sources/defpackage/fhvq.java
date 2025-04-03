package defpackage;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhvq {
    public static fhqa a(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) {
        fhqa fhqkVar;
        if (aSN1ObjectIdentifier.w(NISTObjectIdentifiers.c)) {
            fhqkVar = new fhqg();
        } else {
            if (!aSN1ObjectIdentifier.w(NISTObjectIdentifiers.o)) {
                throw new IllegalArgumentException("unrecognized digest OID: ".concat(String.valueOf(String.valueOf(aSN1ObjectIdentifier))));
            }
            fhqkVar = new fhqk(256);
        }
        return (NISTObjectIdentifiers.o.w(aSN1ObjectIdentifier) || fhqkVar.b() != i) ? new fhvp(fhqkVar, i) : fhqkVar;
    }

    static fhqa b(fhvu fhvuVar) {
        return a(fhvuVar.u, fhvuVar.r);
    }
}

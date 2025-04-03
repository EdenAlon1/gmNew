package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhze {
    public static final Map a;
    private static final Map b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        HashMap hashMap2 = new HashMap();
        a = hashMap2;
        hashMap.put("SHA-256", NISTObjectIdentifiers.c);
        hashMap.put("SHA-512", NISTObjectIdentifiers.e);
        hashMap.put("SHAKE128", NISTObjectIdentifiers.m);
        hashMap.put("SHAKE256", NISTObjectIdentifiers.n);
        hashMap2.put(NISTObjectIdentifiers.c, "SHA-256");
        hashMap2.put(NISTObjectIdentifiers.e, "SHA-512");
        hashMap2.put(NISTObjectIdentifiers.m, "SHAKE128");
        hashMap2.put(NISTObjectIdentifiers.n, "SHAKE256");
    }

    static ASN1ObjectIdentifier a(String str) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) b.get(str);
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        throw new IllegalArgumentException("unrecognized digest name: ".concat(str));
    }

    static fhqa b(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.w(NISTObjectIdentifiers.c)) {
            return new fhqg();
        }
        if (aSN1ObjectIdentifier.w(NISTObjectIdentifiers.e)) {
            return new fhqj();
        }
        if (aSN1ObjectIdentifier.w(NISTObjectIdentifiers.m)) {
            return new fhqk(128);
        }
        if (aSN1ObjectIdentifier.w(NISTObjectIdentifiers.n)) {
            return new fhqk(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: ".concat(aSN1ObjectIdentifier.toString()));
    }
}

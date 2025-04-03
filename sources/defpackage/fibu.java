package defpackage;

import org.bouncycastle.asn1.ASN1Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fibu {
    public static byte[] a(fhqo fhqoVar, ASN1Set aSN1Set) {
        if (!fhqoVar.a) {
            throw new IllegalArgumentException("public key found");
        }
        try {
            return fhxz.a(fhqoVar, aSN1Set).u();
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(fhqo fhqoVar) {
        if (fhqoVar.a) {
            throw new IllegalArgumentException("private key found");
        }
        try {
            return fhyx.a(fhqoVar).u();
        } catch (Exception unused) {
            return null;
        }
    }
}

package defpackage;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhzo {
    public final int a;
    public final int b;
    public final ASN1ObjectIdentifier c;
    private final fiab d;
    private final int e;

    protected fhzo(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier == null) {
            throw new NullPointerException("treeDigest == null");
        }
        this.c = aSN1ObjectIdentifier;
        fhqa b = fhze.b(aSN1ObjectIdentifier);
        String c = b.c();
        int b2 = c.equals("SHAKE128") ? 32 : c.equals("SHAKE256") ? 64 : b.b();
        this.a = b2;
        int ceil = (int) Math.ceil((b2 * 8) / fiai.b(16));
        this.e = ceil;
        int floor = ceil + ((int) Math.floor(fiai.b(ceil * 15) / fiai.b(16))) + 1;
        this.b = floor;
        fhzn fhznVar = (fhzn) fhzn.a.get(fhzn.a(b.c(), b2, floor));
        this.d = fhznVar;
        if (fhznVar == null) {
            throw new IllegalArgumentException("cannot find OID for digest algorithm: ".concat(b.c()));
        }
    }
}

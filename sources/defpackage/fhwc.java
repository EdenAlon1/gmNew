package defpackage;

import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhwc {
    public static final fhwc a = new fhwc(5, 32, 5, NISTObjectIdentifiers.c);
    public static final fhwc b;
    public static final fhwc c;
    public static final fhwc d;
    public static final fhwc e;
    public static final fhwc f;
    public static final fhwc g;
    public static final fhwc h;
    public static final fhwc i;
    public static final fhwc j;
    public static final fhwc k;
    public static final fhwc l;
    public static final fhwc m;
    public static final fhwc n;
    public static final fhwc o;
    public static final fhwc p;
    public static final fhwc q;
    public static final fhwc r;
    public static final fhwc s;
    public static final fhwc t;
    private static final Map y;
    public final int u;
    public final int v;
    public final int w;
    public final ASN1ObjectIdentifier x;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.c;
        b = new fhwc(6, 32, 10, aSN1ObjectIdentifier);
        c = new fhwc(7, 32, 15, aSN1ObjectIdentifier);
        d = new fhwc(8, 32, 20, aSN1ObjectIdentifier);
        e = new fhwc(9, 32, 25, aSN1ObjectIdentifier);
        f = new fhwc(10, 24, 5, aSN1ObjectIdentifier);
        g = new fhwc(11, 24, 10, aSN1ObjectIdentifier);
        h = new fhwc(12, 24, 15, aSN1ObjectIdentifier);
        i = new fhwc(13, 24, 20, aSN1ObjectIdentifier);
        j = new fhwc(14, 24, 25, aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.o;
        k = new fhwc(15, 32, 5, aSN1ObjectIdentifier2);
        l = new fhwc(16, 32, 10, aSN1ObjectIdentifier2);
        m = new fhwc(17, 32, 15, aSN1ObjectIdentifier2);
        n = new fhwc(18, 32, 20, aSN1ObjectIdentifier2);
        o = new fhwc(19, 32, 25, aSN1ObjectIdentifier2);
        p = new fhwc(20, 24, 5, aSN1ObjectIdentifier2);
        q = new fhwc(21, 24, 10, aSN1ObjectIdentifier2);
        r = new fhwc(22, 24, 15, aSN1ObjectIdentifier2);
        s = new fhwc(23, 24, 20, aSN1ObjectIdentifier2);
        t = new fhwc(24, 24, 25, aSN1ObjectIdentifier2);
        y = new fhwb();
    }

    protected fhwc(int i2, int i3, int i4, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.u = i2;
        this.v = i3;
        this.w = i4;
        this.x = aSN1ObjectIdentifier;
    }

    static fhwc a(int i2) {
        return (fhwc) y.get(Integer.valueOf(i2));
    }
}

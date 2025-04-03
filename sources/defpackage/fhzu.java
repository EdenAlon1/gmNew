package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhzu {
    public static final Map a;
    public final fiab b;
    public final fiac c;
    public final int d;
    public final int e;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(1, new fhzu(20, 2, NISTObjectIdentifiers.c));
        hashMap.put(2, new fhzu(20, 4, NISTObjectIdentifiers.c));
        hashMap.put(3, new fhzu(40, 2, NISTObjectIdentifiers.c));
        hashMap.put(4, new fhzu(40, 4, NISTObjectIdentifiers.c));
        hashMap.put(5, new fhzu(40, 8, NISTObjectIdentifiers.c));
        hashMap.put(6, new fhzu(60, 3, NISTObjectIdentifiers.c));
        hashMap.put(7, new fhzu(60, 6, NISTObjectIdentifiers.c));
        hashMap.put(8, new fhzu(60, 12, NISTObjectIdentifiers.c));
        hashMap.put(9, new fhzu(20, 2, NISTObjectIdentifiers.e));
        hashMap.put(10, new fhzu(20, 4, NISTObjectIdentifiers.e));
        hashMap.put(11, new fhzu(40, 2, NISTObjectIdentifiers.e));
        hashMap.put(12, new fhzu(40, 4, NISTObjectIdentifiers.e));
        hashMap.put(13, new fhzu(40, 8, NISTObjectIdentifiers.e));
        hashMap.put(14, new fhzu(60, 3, NISTObjectIdentifiers.e));
        hashMap.put(15, new fhzu(60, 6, NISTObjectIdentifiers.e));
        hashMap.put(16, new fhzu(60, 12, NISTObjectIdentifiers.e));
        hashMap.put(17, new fhzu(20, 2, NISTObjectIdentifiers.m));
        hashMap.put(18, new fhzu(20, 4, NISTObjectIdentifiers.m));
        hashMap.put(19, new fhzu(40, 2, NISTObjectIdentifiers.m));
        hashMap.put(20, new fhzu(40, 4, NISTObjectIdentifiers.m));
        hashMap.put(21, new fhzu(40, 8, NISTObjectIdentifiers.m));
        hashMap.put(22, new fhzu(60, 3, NISTObjectIdentifiers.m));
        hashMap.put(23, new fhzu(60, 6, NISTObjectIdentifiers.m));
        hashMap.put(24, new fhzu(60, 12, NISTObjectIdentifiers.m));
        hashMap.put(25, new fhzu(20, 2, NISTObjectIdentifiers.n));
        hashMap.put(26, new fhzu(20, 4, NISTObjectIdentifiers.n));
        hashMap.put(27, new fhzu(40, 2, NISTObjectIdentifiers.n));
        hashMap.put(28, new fhzu(40, 4, NISTObjectIdentifiers.n));
        hashMap.put(29, new fhzu(40, 8, NISTObjectIdentifiers.n));
        hashMap.put(30, new fhzu(60, 3, NISTObjectIdentifiers.n));
        hashMap.put(31, new fhzu(60, 6, NISTObjectIdentifiers.n));
        hashMap.put(32, new fhzu(60, 12, NISTObjectIdentifiers.n));
        a = DesugarCollections.unmodifiableMap(hashMap);
    }

    public fhzu(int i, int i2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.d = i;
        this.e = i2;
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (i % i2 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        int i3 = i / i2;
        if (i3 == 1) {
            throw new IllegalArgumentException("height / layers must be greater than 1");
        }
        fiac fiacVar = new fiac(i3, aSN1ObjectIdentifier);
        this.c = fiacVar;
        this.b = (fhzc) fhzc.a.get(fhzc.a(b(), a(), fiacVar.g.b, i, i2));
    }

    public final int a() {
        return this.c.f;
    }

    protected final String b() {
        return this.c.e;
    }

    public fhzu(int i, int i2, fhqa fhqaVar) {
        this(i, i2, fhze.a(fhqaVar.c()));
    }
}

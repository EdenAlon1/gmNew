package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiac {
    public static final Map a;
    public final fiab b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final fhzo g;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(1, new fiac(10, NISTObjectIdentifiers.c));
        hashMap.put(2, new fiac(16, NISTObjectIdentifiers.c));
        hashMap.put(3, new fiac(20, NISTObjectIdentifiers.c));
        hashMap.put(4, new fiac(10, NISTObjectIdentifiers.e));
        hashMap.put(5, new fiac(16, NISTObjectIdentifiers.e));
        hashMap.put(6, new fiac(20, NISTObjectIdentifiers.e));
        hashMap.put(7, new fiac(10, NISTObjectIdentifiers.m));
        hashMap.put(8, new fiac(16, NISTObjectIdentifiers.m));
        hashMap.put(9, new fiac(20, NISTObjectIdentifiers.m));
        hashMap.put(10, new fiac(10, NISTObjectIdentifiers.n));
        hashMap.put(11, new fiac(16, NISTObjectIdentifiers.n));
        hashMap.put(12, new fiac(20, NISTObjectIdentifiers.n));
        a = DesugarCollections.unmodifiableMap(hashMap);
    }

    public fiac(int i, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (i < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (aSN1ObjectIdentifier == null) {
            throw new NullPointerException("digest == null");
        }
        this.c = i;
        int i2 = 2;
        while (true) {
            int i3 = this.c;
            if (i2 > i3) {
                throw new IllegalStateException("should never happen...");
            }
            if ((i3 - i2) % 2 == 0) {
                this.d = i2;
                String str = (String) fhze.a.get(aSN1ObjectIdentifier);
                if (str == null) {
                    throw new IllegalArgumentException("unrecognized digest oid: ".concat(aSN1ObjectIdentifier.toString()));
                }
                this.e = str;
                fhzo fhzoVar = new fhzo(aSN1ObjectIdentifier);
                this.g = fhzoVar;
                int i4 = fhzoVar.a;
                this.f = i4;
                this.b = (fhzd) fhzd.a.get(fhzd.a(str, i4, fhzoVar.b, i));
                return;
            }
            i2++;
        }
    }

    final fhzm a() {
        return new fhzm(this.g);
    }

    public fiac(int i, fhqa fhqaVar) {
        this(i, fhze.a(fhqaVar.c()));
    }
}

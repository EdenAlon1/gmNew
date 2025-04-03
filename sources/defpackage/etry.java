package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etry {
    private final Map c = new HashMap();
    private static final etrx b = new etrx() { // from class: etrw
        @Override // defpackage.etrx
        public final etfs a(etgf etgfVar, Integer num) {
            etzp etzpVar = ((etrs) etgfVar).a.b;
            etry etryVar = etry.a;
            etft a2 = etri.a.a(etzpVar.b);
            etri etriVar = etri.a;
            if (!((Boolean) etriVar.b.get(etzpVar.b)).booleanValue()) {
                throw new GeneralSecurityException("Creating new keys is not allowed.");
            }
            etzm a3 = a2.a(etzpVar.c);
            String str = a3.b;
            eyee eyeeVar = a3.c;
            int b2 = etzl.b(a3.d);
            if (b2 == 0) {
                b2 = 1;
            }
            euag b3 = euag.b(etzpVar.d);
            if (b3 == null) {
                b3 = euag.UNRECOGNIZED;
            }
            return new etrr(ettd.a(str, eyeeVar, b2, b3, num));
        }
    };
    public static final etry a = c();

    private static etry c() {
        etry etryVar = new etry();
        try {
            etryVar.b(b, etrs.class);
            return etryVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final synchronized etfs a(etgf etgfVar, Integer num) {
        etrx etrxVar;
        etrxVar = (etrx) this.c.get(etgfVar.getClass());
        if (etrxVar == null) {
            throw new GeneralSecurityException(a.F(etgfVar, "Cannot create a new key for parameters ", ": no key creator for this class was registered."));
        }
        return etrxVar.a(etgfVar, num);
    }

    public final synchronized void b(etrx etrxVar, Class cls) {
        etrx etrxVar2 = (etrx) this.c.get(cls);
        if (etrxVar2 != null && !etrxVar2.equals(etrxVar)) {
            throw new GeneralSecurityException(a.b(cls, "Different key creator for parameters class ", " already inserted"));
        }
        this.c.put(cls, etrxVar);
    }
}

package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhqt implements fhsr {
    private fhsu e;
    private fhta f;
    private BigInteger g;
    private BigInteger h;

    public fhqt(fhsu fhsuVar, fhta fhtaVar, BigInteger bigInteger, BigInteger bigInteger2) {
        Hashtable hashtable;
        fhtc fhtcVar;
        if (fhsuVar == null) {
            throw new NullPointerException("curve");
        }
        if (bigInteger == null) {
            throw new NullPointerException("n");
        }
        this.e = fhsuVar;
        if (fhtaVar == null) {
            throw new IllegalArgumentException("Point has null value");
        }
        if (!fhsuVar.g(fhtaVar.b)) {
            throw new IllegalArgumentException("Point must be on the same curve");
        }
        fhta j = fhsuVar.f(fhtaVar).j();
        if (j.n()) {
            throw new IllegalArgumentException("Point at infinity");
        }
        if (!j.n()) {
            synchronized (j) {
                hashtable = j.f;
                if (hashtable == null) {
                    hashtable = new Hashtable(4);
                    j.f = hashtable;
                }
            }
            synchronized (hashtable) {
                fhtc fhtcVar2 = (fhtc) hashtable.get("bc_validity");
                fhtcVar = true != (fhtcVar2 instanceof fhtc) ? null : fhtcVar2;
                fhtcVar = fhtcVar == null ? new fhtc() : fhtcVar;
                if (!fhtcVar.a) {
                    if (!fhtcVar.b) {
                        if (j.a()) {
                            fhtcVar.b = true;
                        } else {
                            fhtcVar.a();
                        }
                    }
                    if (!fhtcVar.c) {
                        if (j.b()) {
                            fhtcVar.c = true;
                        } else {
                            fhtcVar.a();
                        }
                    }
                }
                if (fhtcVar != fhtcVar2) {
                    hashtable.put("bc_validity", fhtcVar);
                }
            }
            if (fhtcVar.a) {
                throw new IllegalArgumentException("Point not on curve");
            }
        }
        this.f = j;
        this.g = bigInteger;
        this.h = bigInteger2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fhqt) {
            fhqt fhqtVar = (fhqt) obj;
            if (this.e.g(fhqtVar.e) && this.f.m(fhqtVar.f) && this.g.equals(fhqtVar.g) && this.h.equals(fhqtVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.e.hashCode() * 37) ^ this.f.hashCode()) * 37) ^ this.g.hashCode()) * 37) ^ this.h.hashCode();
    }
}

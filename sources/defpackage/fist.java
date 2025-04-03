package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fist extends fisa {
    public static final fist o;
    private static final ConcurrentHashMap p;
    private static final long serialVersionUID = -6212696554273812441L;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        p = concurrentHashMap;
        fist fistVar = new fist(fisr.H);
        o = fistVar;
        concurrentHashMap.put(firk.a, fistVar);
    }

    private fist(firb firbVar) {
        super(firbVar, null);
    }

    public static fist N() {
        return O(firk.j());
    }

    public static fist O(firk firkVar) {
        if (firkVar == null) {
            firkVar = firk.j();
        }
        ConcurrentHashMap concurrentHashMap = p;
        fist fistVar = (fist) concurrentHashMap.get(firkVar);
        if (fistVar != null) {
            return fistVar;
        }
        fist fistVar2 = new fist(fisx.N(o, firkVar));
        fist fistVar3 = (fist) concurrentHashMap.putIfAbsent(firkVar, fistVar2);
        return fistVar3 == null ? fistVar2 : fistVar3;
    }

    private Object writeReplace() {
        return new fiss(z());
    }

    @Override // defpackage.fisa
    protected final void M(firz firzVar) {
        if (this.a.z() == firk.a) {
            firzVar.H = new fitd(fisu.a, firf.d);
            firzVar.k = firzVar.H.q();
            firzVar.G = new fitm((fitd) firzVar.H, firf.e);
            firzVar.C = new fitm((fitd) firzVar.H, firzVar.h, firf.j);
        }
    }

    @Override // defpackage.firb
    public final firb a() {
        return o;
    }

    @Override // defpackage.firb
    public final firb b(firk firkVar) {
        return firkVar == z() ? this : O(firkVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fist) {
            return z().equals(((fist) obj).z());
        }
        return false;
    }

    public final int hashCode() {
        return z().hashCode() + 800855;
    }

    public final String toString() {
        firk z = z();
        if (z == null) {
            return "ISOChronology";
        }
        return "ISOChronology[" + z.c + "]";
    }
}

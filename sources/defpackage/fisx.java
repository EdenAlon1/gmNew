package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fisx extends fisa {
    private static final long serialVersionUID = -1079258847191166848L;

    private fisx(firb firbVar, firk firkVar) {
        super(firbVar, firkVar);
    }

    public static fisx N(firb firbVar, firk firkVar) {
        if (firbVar == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        firb a = firbVar.a();
        if (a == null) {
            throw new IllegalArgumentException("UTC chronology must not be null");
        }
        if (firkVar != null) {
            return new fisx(a, firkVar);
        }
        throw new IllegalArgumentException("DateTimeZone must not be null");
    }

    static boolean O(firl firlVar) {
        return firlVar != null && firlVar.c() < 43200000;
    }

    private final fird P(fird firdVar, HashMap hashMap) {
        if (firdVar == null || !firdVar.u()) {
            return firdVar;
        }
        if (hashMap.containsKey(firdVar)) {
            return (fird) hashMap.get(firdVar);
        }
        fisv fisvVar = new fisv(firdVar, (firk) this.b, Q(firdVar.q(), hashMap), Q(firdVar.s(), hashMap), Q(firdVar.r(), hashMap));
        hashMap.put(firdVar, fisvVar);
        return fisvVar;
    }

    private final firl Q(firl firlVar, HashMap hashMap) {
        if (firlVar == null || !firlVar.f()) {
            return firlVar;
        }
        if (hashMap.containsKey(firlVar)) {
            return (firl) hashMap.get(firlVar);
        }
        fisw fiswVar = new fisw(firlVar, (firk) this.b);
        hashMap.put(firlVar, fiswVar);
        return fiswVar;
    }

    @Override // defpackage.fisa
    protected final void M(firz firzVar) {
        HashMap hashMap = new HashMap();
        firzVar.l = Q(firzVar.l, hashMap);
        firzVar.k = Q(firzVar.k, hashMap);
        firzVar.j = Q(firzVar.j, hashMap);
        firzVar.i = Q(firzVar.i, hashMap);
        firzVar.h = Q(firzVar.h, hashMap);
        firzVar.g = Q(firzVar.g, hashMap);
        firzVar.f = Q(firzVar.f, hashMap);
        firzVar.e = Q(firzVar.e, hashMap);
        firzVar.d = Q(firzVar.d, hashMap);
        firzVar.c = Q(firzVar.c, hashMap);
        firzVar.b = Q(firzVar.b, hashMap);
        firzVar.a = Q(firzVar.a, hashMap);
        firzVar.E = P(firzVar.E, hashMap);
        firzVar.F = P(firzVar.F, hashMap);
        firzVar.G = P(firzVar.G, hashMap);
        firzVar.H = P(firzVar.H, hashMap);
        firzVar.I = P(firzVar.I, hashMap);
        firzVar.x = P(firzVar.x, hashMap);
        firzVar.y = P(firzVar.y, hashMap);
        firzVar.z = P(firzVar.z, hashMap);
        firzVar.D = P(firzVar.D, hashMap);
        firzVar.A = P(firzVar.A, hashMap);
        firzVar.B = P(firzVar.B, hashMap);
        firzVar.C = P(firzVar.C, hashMap);
        firzVar.m = P(firzVar.m, hashMap);
        firzVar.n = P(firzVar.n, hashMap);
        firzVar.o = P(firzVar.o, hashMap);
        firzVar.p = P(firzVar.p, hashMap);
        firzVar.q = P(firzVar.q, hashMap);
        firzVar.r = P(firzVar.r, hashMap);
        firzVar.s = P(firzVar.s, hashMap);
        firzVar.u = P(firzVar.u, hashMap);
        firzVar.t = P(firzVar.t, hashMap);
        firzVar.v = P(firzVar.v, hashMap);
        firzVar.w = P(firzVar.w, hashMap);
    }

    @Override // defpackage.firb
    public final firb a() {
        return this.a;
    }

    @Override // defpackage.firb
    public final firb b(firk firkVar) {
        return firkVar == this.b ? this : firkVar == firk.a ? this.a : new fisx(this.a, firkVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fisx)) {
            return false;
        }
        fisx fisxVar = (fisx) obj;
        if (this.a.equals(fisxVar.a)) {
            if (((firk) this.b).equals(fisxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((firk) this.b).hashCode() * 11) + 326565 + (this.a.hashCode() * 7);
    }

    public final String toString() {
        return "ZonedChronology[" + String.valueOf(this.a) + ", " + ((firk) this.b).c + "]";
    }

    @Override // defpackage.fisa, defpackage.firb
    public final firk z() {
        return (firk) this.b;
    }
}

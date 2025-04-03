package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fisr extends fish {
    private static final long serialVersionUID = -861407383323710522L;
    private static final ConcurrentHashMap I = new ConcurrentHashMap();
    public static final fisr H = ah(firk.a);

    private fisr(firb firbVar, int i) {
        super(firbVar, i);
    }

    public static fisr ah(firk firkVar) {
        return ai(firkVar, 4);
    }

    public static fisr ai(firk firkVar, int i) {
        fisr fisrVar;
        if (firkVar == null) {
            firkVar = firk.j();
        }
        ConcurrentHashMap concurrentHashMap = I;
        fisr[] fisrVarArr = (fisr[]) concurrentHashMap.get(firkVar);
        if (fisrVarArr == null) {
            fisrVarArr = new fisr[7];
            fisr[] fisrVarArr2 = (fisr[]) concurrentHashMap.putIfAbsent(firkVar, fisrVarArr);
            if (fisrVarArr2 != null) {
                fisrVarArr = fisrVarArr2;
            }
        }
        int i2 = i - 1;
        try {
            fisr fisrVar2 = fisrVarArr[i2];
            if (fisrVar2 != null) {
                return fisrVar2;
            }
            synchronized (fisrVarArr) {
                fisrVar = fisrVarArr[i2];
                if (fisrVar == null) {
                    firk firkVar2 = firk.a;
                    fisrVar = firkVar == firkVar2 ? new fisr(null, i) : new fisr(fisx.N(ai(firkVar2, i), firkVar), i);
                    fisrVarArr[i2] = fisrVar;
                }
            }
            return fisrVar;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException(a.h(i, "Invalid min days in first week: "));
        }
    }

    private Object readResolve() {
        int i = ((fise) this).G;
        if (i == 0) {
            i = 4;
        }
        firb firbVar = this.a;
        return firbVar == null ? ai(firk.a, i) : ai(firbVar.z(), i);
    }

    @Override // defpackage.fise, defpackage.fisa
    protected final void M(firz firzVar) {
        if (this.a == null) {
            firzVar.a = fise.o;
            firzVar.b = fise.p;
            firzVar.c = fise.q;
            firzVar.d = fise.r;
            firzVar.e = fise.s;
            firzVar.f = fise.t;
            firzVar.g = fise.u;
            firzVar.m = fise.v;
            firzVar.n = fise.w;
            firzVar.o = fise.x;
            firzVar.p = fise.y;
            firzVar.q = fise.z;
            firzVar.r = fise.A;
            firzVar.s = fise.B;
            firzVar.u = fise.C;
            firzVar.t = fise.D;
            firzVar.v = fise.E;
            firzVar.w = fise.F;
            firzVar.E = new fisl(this);
            firzVar.F = new fisq(firzVar.E, this);
            fird firdVar = firzVar.F;
            firzVar.H = new fitd(new fiti(firdVar, firdVar == null ? null : firdVar.p(), 99), firf.d);
            firzVar.k = firzVar.H.q();
            fitd fitdVar = (fitd) firzVar.H;
            firzVar.G = new fiti(new fitm(fitdVar, fitdVar.g), firf.e);
            firzVar.I = new fisn(this);
            firzVar.x = new fism(this, firzVar.f);
            firzVar.y = new fisf(this, firzVar.f);
            firzVar.z = new fisg(this, firzVar.f);
            firzVar.D = new fisp(this);
            firzVar.B = new fisk(this);
            firzVar.A = new fisj(this, firzVar.g);
            firzVar.C = new fiti(new fitm(firzVar.B, firzVar.k, firf.j), firf.j);
            firzVar.j = firzVar.E.q();
            firzVar.i = firzVar.D.q();
            firzVar.h = firzVar.B.q();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (ag(r7) != false) goto L5;
     */
    @Override // defpackage.fise
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Z(int r7) {
        /*
            r6 = this;
            int r0 = r7 / 100
            if (r7 >= 0) goto L11
            int r1 = r7 + 3
            int r1 = r1 >> 2
            int r1 = r1 - r0
            int r0 = r0 + 3
            int r0 = r0 >> 2
            int r1 = r1 + r0
        Le:
            int r1 = r1 + (-1)
            goto L1e
        L11:
            int r1 = r7 >> 2
            int r1 = r1 - r0
            int r0 = r0 >> 2
            boolean r2 = r6.ag(r7)
            int r1 = r1 + r0
            if (r2 == 0) goto L1e
            goto Le
        L1e:
            long r2 = (long) r7
            r7 = -719527(0xfffffffffff50559, float:NaN)
            int r1 = r1 + r7
            r4 = 365(0x16d, double:1.803E-321)
            long r2 = r2 * r4
            long r0 = (long) r1
            long r2 = r2 + r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fisr.Z(int):long");
    }

    @Override // defpackage.firb
    public final firb a() {
        return H;
    }

    @Override // defpackage.fise
    public final boolean ag(int i) {
        if ((i & 3) == 0) {
            return i % 100 != 0 || i % 400 == 0;
        }
        return false;
    }

    @Override // defpackage.firb
    public final firb b(firk firkVar) {
        return firkVar == z() ? this : ah(firkVar);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fghc {
    public final ffqn e = new ffqn(this, ffqo.a);
    public final ffqn f;
    public final ffqn g;

    public fghc() {
        ffqo ffqoVar = ffqo.a;
        this.f = new ffqn(this, ffqoVar);
        this.g = new ffqn(null, ffqoVar);
    }

    public final Object f() {
        return this.e.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r3.e.d(r2, ((defpackage.fghi) r4).a) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x001a, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fghc g() {
        /*
            r7 = this;
        L0:
            ffqn r0 = r7.f
            java.lang.Object r0 = r0.a
            fghc r0 = (defpackage.fghc) r0
            r1 = 0
            r2 = r0
        L8:
            r3 = r1
        L9:
            ffqn r4 = r2.e
            java.lang.Object r4 = r4.a
            if (r4 != r7) goto L1b
            if (r0 != r2) goto L12
            goto L1a
        L12:
            ffqn r1 = r7.f
            boolean r0 = r1.d(r0, r2)
            if (r0 == 0) goto L0
        L1a:
            return r2
        L1b:
            boolean r5 = r7.hQ()
            if (r5 == 0) goto L22
            return r1
        L22:
            boolean r5 = r4 instanceof defpackage.fghi
            if (r5 == 0) goto L3d
            if (r3 == 0) goto L36
            fghi r4 = (defpackage.fghi) r4
            fghc r4 = r4.a
            ffqn r5 = r3.e
            boolean r2 = r5.d(r2, r4)
            if (r2 == 0) goto L0
            r2 = r3
            goto L8
        L36:
            ffqn r2 = r2.f
            java.lang.Object r2 = r2.a
            fghc r2 = (defpackage.fghc) r2
            goto L9
        L3d:
            r4.getClass()
            r3 = r4
            fghc r3 = (defpackage.fghc) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fghc.g():fghc");
    }

    public final fghc h() {
        Object f = f();
        fghi fghiVar = f instanceof fghi ? (fghi) f : null;
        if (fghiVar != null) {
            return fghiVar.a;
        }
        f.getClass();
        return (fghc) f;
    }

    public boolean hQ() {
        return f() instanceof fghi;
    }

    public final fghc i() {
        fghc g = g();
        if (g != null) {
            return g;
        }
        Object obj = this.f.a;
        while (true) {
            fghc fghcVar = (fghc) obj;
            if (!fghcVar.hQ()) {
                return fghcVar;
            }
            obj = fghcVar.f.a;
        }
    }

    public final void j(int i) {
        l(new fggz(i), i);
    }

    public final void k(fghc fghcVar) {
        fghc fghcVar2;
        do {
            fghcVar2 = (fghc) fghcVar.f.a;
            if (f() != fghcVar) {
                return;
            }
        } while (!fghcVar.f.d(fghcVar2, this));
        if (hQ()) {
            fghcVar.g();
        }
    }

    public final boolean l(fghc fghcVar, int i) {
        fghc i2;
        do {
            i2 = i();
            if (i2 instanceof fggz) {
                return (((fggz) i2).a & i) == 0 && i2.l(fghcVar, i);
            }
            fghcVar.f.b(i2);
            fghcVar.e.b(this);
        } while (!i2.e.d(this, fghcVar));
        fghcVar.k(this);
        return true;
    }

    public String toString() {
        return new ffkt(this) { // from class: fghb
            @Override // defpackage.ffkt, defpackage.ffmu
            public final Object a() {
                return ffsp.a(this.g);
            }
        } + "@" + ffsp.b(this);
    }
}

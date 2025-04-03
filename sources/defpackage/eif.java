package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eif extends hvh implements irt, ind, itu {
    private static final eic e = new eic();
    public eig a;
    public eia b;
    public boolean c;
    public dqs d;

    public eif(eig eigVar, eia eiaVar, boolean z, dqs dqsVar) {
        this.a = eigVar;
        this.b = eiaVar;
        this.c = z;
        this.d = dqsVar;
    }

    private final boolean j(int i) {
        if (inc.a(i, 1)) {
            return false;
        }
        if (inc.a(i, 2)) {
            return true;
        }
        if (inc.a(i, 5)) {
            return this.c;
        }
        if (inc.a(i, 6)) {
            return !this.c;
        }
        if (inc.a(i, 3)) {
            int ordinal = isx.h(this).ordinal();
            if (ordinal == 0) {
                return this.c;
            }
            if (ordinal == 1) {
                return !this.c;
            }
            throw new ffcd();
        }
        if (!inc.a(i, 4)) {
            eib.a();
            throw new ffbx();
        }
        int ordinal2 = isx.h(this).ordinal();
        if (ordinal2 == 0) {
            return !this.c;
        }
        if (ordinal2 == 1) {
            return this.c;
        }
        throw new ffcd();
    }

    @Override // defpackage.ind
    public final Object a(int i, ffji ffjiVar) {
        if (this.a.b() <= 0 || !this.a.e() || !this.z) {
            return ffjiVar.invoke(e);
        }
        int c = j(i) ? this.a.c() : this.a.a();
        fflb fflbVar = new fflb();
        fflbVar.a = this.b.a(c, c);
        int d = this.a.d();
        int g = ffmk.g(d + d, this.a.b());
        Object obj = null;
        for (int i2 = 0; obj == null && i((ehz) fflbVar.a, i) && i2 < g; i2++) {
            ehz ehzVar = (ehz) fflbVar.a;
            int i3 = ehzVar.a;
            int i4 = ehzVar.b;
            if (j(i)) {
                i4++;
            } else {
                i3--;
            }
            ehz a = this.b.a(i3, i4);
            this.b.b((ehz) fflbVar.a);
            fflbVar.a = a;
            itz.d(this);
            obj = ffjiVar.invoke(new eid(this, fflbVar, i));
        }
        this.b.b((ehz) fflbVar.a);
        itz.d(this);
        return obj;
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        iqk e2 = iplVar.e(j);
        ei = ipqVar.ei(e2.a, e2.b, ffem.a, new eie(e2));
        return ei;
    }

    @Override // defpackage.itu
    public final /* synthetic */ int e(iny inyVar, inx inxVar, int i) {
        return itt.a(this, inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final /* synthetic */ int f(iny inyVar, inx inxVar, int i) {
        return itt.b(this, inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final /* synthetic */ int g(iny inyVar, inx inxVar, int i) {
        return itt.c(this, inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final /* synthetic */ int h(iny inyVar, inx inxVar, int i) {
        return itt.d(this, inyVar, inxVar, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        if (r4.d == defpackage.dqs.a) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
    
        if (r4.d != defpackage.dqs.b) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(defpackage.ehz r5, int r6) {
        /*
            r4 = this;
            r0 = 5
            boolean r0 = defpackage.inc.a(r6, r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            goto L3f
        La:
            r0 = 6
            boolean r0 = defpackage.inc.a(r6, r0)
            if (r0 != 0) goto L3f
            r0 = 3
            boolean r0 = defpackage.inc.a(r6, r0)
            if (r0 == 0) goto L19
            goto L38
        L19:
            r0 = 4
            boolean r0 = defpackage.inc.a(r6, r0)
            if (r0 != 0) goto L38
            boolean r0 = defpackage.inc.a(r6, r2)
            if (r0 == 0) goto L27
            goto L45
        L27:
            r0 = 2
            boolean r0 = defpackage.inc.a(r6, r0)
            if (r0 == 0) goto L2f
            goto L45
        L2f:
            defpackage.eib.a()
            ffbx r5 = new ffbx
            r5.<init>()
            throw r5
        L38:
            dqs r0 = r4.d
            dqs r3 = defpackage.dqs.a
            if (r0 != r3) goto L45
            goto L5d
        L3f:
            dqs r0 = r4.d
            dqs r3 = defpackage.dqs.b
            if (r0 == r3) goto L5d
        L45:
            boolean r6 = r4.j(r6)
            if (r6 == 0) goto L58
            int r5 = r5.b
            eig r6 = r4.a
            int r6 = r6.b()
            int r6 = r6 + (-1)
            if (r5 >= r6) goto L5d
            return r2
        L58:
            int r5 = r5.a
            if (r5 <= 0) goto L5d
            return r2
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eif.i(ehz, int):boolean");
    }

    @Override // defpackage.irt
    public final irr q() {
        return iru.a(new ffcf(inf.a, this));
    }

    @Override // defpackage.irw
    public final /* synthetic */ Object r(irn irnVar) {
        return irs.a(this, irnVar);
    }
}

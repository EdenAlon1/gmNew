package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cww extends hvh implements itu {
    public final hho a;
    public final hho b;
    public long c = -9223372034707292160L;
    private jzk d;

    public cww(cuq cuqVar, ffix ffixVar) {
        this.a = new hic(cuqVar, hla.a);
        this.b = new hic(ffixVar, hla.a);
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        if (ipqVar.eu()) {
            this.d = new jzk(j);
        }
        jzk jzkVar = this.d;
        jzkVar.getClass();
        iqk e = iplVar.e(jzkVar.a);
        long j2 = (e.a << 32) | (e.b & 4294967295L);
        this.c = j2;
        long e2 = jzl.e(j, j2);
        ei = ipqVar.ei((int) (e2 >> 32), (int) (e2 & 4294967295L), ffem.a, new cwv(this, e, e2, ipqVar));
        return ei;
    }

    @Override // defpackage.itu
    public final int e(iny inyVar, inx inxVar, int i) {
        if (!inyVar.eu()) {
            long j = this.c;
            if (cry.a(j)) {
                return (int) (4294967295L & j);
            }
        }
        return inxVar.a(i);
    }

    @Override // defpackage.itu
    public final int f(iny inyVar, inx inxVar, int i) {
        if (!inyVar.eu()) {
            long j = this.c;
            if (cry.a(j)) {
                return (int) (j >> 32);
            }
        }
        return inxVar.b(i);
    }

    @Override // defpackage.itu
    public final int g(iny inyVar, inx inxVar, int i) {
        if (!inyVar.eu()) {
            long j = this.c;
            if (cry.a(j)) {
                return (int) (4294967295L & j);
            }
        }
        return inxVar.c(i);
    }

    @Override // defpackage.itu
    public final int h(iny inyVar, inx inxVar, int i) {
        if (!inyVar.eu()) {
            long j = this.c;
            if (cry.a(j)) {
                return (int) (j >> 32);
            }
        }
        return inxVar.d(i);
    }
}

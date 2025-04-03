package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtrl extends dual {
    public dtui a;
    public String b;
    public duam c;
    private boolean d;
    private boolean e;
    private boolean f;
    private enin g;
    private enip h;
    private int i;
    private byte j;

    public dtrl() {
    }

    @Override // defpackage.dual
    public final duan a() {
        dtui dtuiVar;
        enin eninVar = this.g;
        if (eninVar != null) {
            this.h = eninVar.g();
        } else if (this.h == null) {
            this.h = enpd.a;
        }
        if (this.j == 15 && (dtuiVar = this.a) != null) {
            return new dtrm(this.d, this.e, this.f, dtuiVar, this.b, this.h, this.i, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" disableTableFilters");
        }
        if ((this.j & 2) == 0) {
            sb.append(" omitUnchangedRows");
        }
        if ((this.j & 4) == 0) {
            sb.append(" exemptFromQueryPlanChecking");
        }
        if (this.a == null) {
            sb.append(" loggingTag");
        }
        if ((this.j & 8) == 0) {
            sb.append(" conflictAlgorithm");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dual
    public final enin b() {
        if (this.g == null) {
            if (this.h == null) {
                this.g = new enin();
            } else {
                enin eninVar = new enin();
                this.g = eninVar;
                eninVar.j(this.h);
                this.h = null;
            }
        }
        return this.g;
    }

    @Override // defpackage.dual
    public final void c(int i) {
        this.i = i;
        this.j = (byte) (this.j | 8);
    }

    @Override // defpackage.dual
    public final void d(boolean z) {
        this.d = z;
        this.j = (byte) (this.j | 1);
    }

    @Override // defpackage.dual
    public final void e(boolean z) {
        this.f = z;
        this.j = (byte) (this.j | 4);
    }

    @Override // defpackage.dual
    public final void f(boolean z) {
        this.e = z;
        this.j = (byte) (this.j | 2);
    }

    public dtrl(duan duanVar) {
        dtrm dtrmVar = (dtrm) duanVar;
        this.d = dtrmVar.a;
        this.e = dtrmVar.b;
        this.f = dtrmVar.c;
        this.a = dtrmVar.d;
        this.b = dtrmVar.e;
        this.h = dtrmVar.f;
        this.i = dtrmVar.g;
        this.c = dtrmVar.h;
        this.j = (byte) 15;
    }
}

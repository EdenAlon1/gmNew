package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtri extends dtyz {
    private engr A;
    private engw B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    public String a;
    public engw b;
    public String c;
    public engr d;
    public engw e;
    public String f;
    public engr g;
    public engw h;
    public dtzj i;
    public String j;
    public String k;
    public dtzj l;
    public String m;
    public String n;
    public Boolean o;
    public engr p;
    public engw q;
    public enhd r;
    public enhk s;
    public dtui t;
    public String u;
    public emyl v;
    public String w;
    public byte x;
    private boolean y;
    private engw z;

    public dtri() {
    }

    @Override // defpackage.dtyz
    public final dtza a() {
        String str;
        engw engwVar;
        engr engrVar = this.d;
        if (engrVar != null) {
            this.e = engrVar.g();
        } else if (this.e == null) {
            int i = engw.d;
            this.e = enou.a;
        }
        engr engrVar2 = this.g;
        if (engrVar2 != null) {
            this.h = engrVar2.g();
        } else if (this.h == null) {
            int i2 = engw.d;
            this.h = enou.a;
        }
        engr engrVar3 = this.p;
        if (engrVar3 != null) {
            this.q = engrVar3.g();
        } else if (this.q == null) {
            int i3 = engw.d;
            this.q = enou.a;
        }
        enhd enhdVar = this.r;
        if (enhdVar != null) {
            this.s = enhdVar.c();
        } else if (this.s == null) {
            this.s = enoz.a;
        }
        engr engrVar4 = this.A;
        if (engrVar4 != null) {
            this.B = engrVar4.g();
        } else if (this.B == null) {
            int i4 = engw.d;
            this.B = enou.a;
        }
        if (this.x == 63 && (str = this.a) != null && (engwVar = this.z) != null) {
            return new dtrj(str, this.y, engwVar, this.b, this.c, this.e, this.f, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.s, this.B, this.C, this.t, this.D, this.u, this.v, this.w, this.E, this.F);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" table");
        }
        if ((this.x & 1) == 0) {
            sb.append(" distinct");
        }
        if (this.z == null) {
            sb.append(" defaultColumns");
        }
        if ((this.x & 2) == 0) {
            sb.append(" exemptFromQueryPlanChecking");
        }
        if ((this.x & 4) == 0) {
            sb.append(" isEmptyProjection");
        }
        if ((this.x & 8) == 0) {
            sb.append(" queryForColumnSizes");
        }
        if ((this.x & 16) == 0) {
            sb.append(" disableCaching");
        }
        if ((this.x & 32) == 0) {
            sb.append(" deliverForeignKeyChangesToObservers");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dtyz
    protected final engr b() {
        if (this.A == null) {
            if (this.B == null) {
                int i = engw.d;
                this.A = new engr();
            } else {
                int i2 = engw.d;
                engr engrVar = new engr();
                this.A = engrVar;
                engrVar.j(this.B);
                this.B = null;
            }
        }
        return this.A;
    }

    @Override // defpackage.dtyz
    public final void c(List list) {
        this.z = engw.n(list);
    }

    @Override // defpackage.dtyz
    public final void d(boolean z) {
        this.F = z;
        this.x = (byte) (this.x | 32);
    }

    @Override // defpackage.dtyz
    public final void e(boolean z) {
        this.y = z;
        this.x = (byte) (this.x | 1);
    }

    @Override // defpackage.dtyz
    public final void f(boolean z) {
        this.C = z;
        this.x = (byte) (this.x | 2);
    }

    @Override // defpackage.dtyz
    public final void g(boolean z) {
        this.D = z;
        this.x = (byte) (this.x | 4);
    }

    @Override // defpackage.dtyz
    public final void h(boolean z) {
        this.E = z;
        this.x = (byte) (this.x | 8);
    }

    public dtri(dtza dtzaVar) {
        dtrj dtrjVar = (dtrj) dtzaVar;
        this.a = dtrjVar.a;
        this.y = dtrjVar.b;
        this.z = dtrjVar.c;
        this.b = dtrjVar.d;
        this.c = dtrjVar.e;
        this.e = dtrjVar.f;
        this.f = dtrjVar.g;
        this.h = dtrjVar.h;
        this.i = dtrjVar.i;
        this.j = dtrjVar.j;
        this.k = dtrjVar.k;
        this.l = dtrjVar.l;
        this.m = dtrjVar.m;
        this.n = dtrjVar.n;
        this.o = dtrjVar.o;
        this.q = dtrjVar.p;
        this.s = dtrjVar.q;
        this.B = dtrjVar.r;
        this.C = dtrjVar.s;
        this.t = dtrjVar.t;
        this.D = dtrjVar.u;
        this.u = dtrjVar.v;
        this.v = dtrjVar.w;
        this.w = dtrjVar.x;
        this.E = dtrjVar.y;
        this.F = dtrjVar.z;
        this.x = (byte) 63;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzhj extends dzhl {
    public emxc a;
    private int b;
    private emxc c;
    private emxc d;
    private emxc e;
    private emxc f;
    private emxc g;
    private emxc h;
    private emxc i;
    private emxc j;
    private emxc k;
    private engw l;
    private final emxc m;
    private emxc n;
    private emxc o;
    private emxc p;
    private emxc q;
    private byte r;

    public dzhj() {
        emux emuxVar = emux.a;
        this.c = emuxVar;
        this.d = emuxVar;
        this.e = emuxVar;
        this.f = emuxVar;
        this.g = emuxVar;
        this.h = emuxVar;
        this.i = emuxVar;
        this.j = emuxVar;
        this.k = emuxVar;
        this.a = emuxVar;
        this.m = emuxVar;
        this.n = emuxVar;
        this.o = emuxVar;
        this.p = emuxVar;
        this.q = emuxVar;
    }

    @Override // defpackage.dzhl
    public final dzhm a() {
        engw engwVar;
        if (this.r == 1 && (engwVar = this.l) != null) {
            return new dzhk(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.a, engwVar, this.m, this.n, this.o, this.p, this.q);
        }
        StringBuilder sb = new StringBuilder();
        if (this.r == 0) {
            sb.append(" eventType");
        }
        if (this.l == null) {
            sb.append(" experimentIds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzhl
    public final void b(dzic dzicVar) {
        this.q = emxc.j(dzicVar);
    }

    @Override // defpackage.dzhl
    public final void c(dzpg dzpgVar) {
        this.f = emxc.j(dzpgVar);
    }

    @Override // defpackage.dzhl
    public final void d(dzpt dzptVar) {
        this.g = emxc.j(dzptVar);
    }

    @Override // defpackage.dzhl
    public final void e(long j) {
        this.o = emxc.j(Long.valueOf(j));
    }

    @Override // defpackage.dzhl
    public final void f(int i) {
        this.i = emxc.j(Integer.valueOf(i));
    }

    @Override // defpackage.dzhl
    public final void g(int i) {
        this.b = i;
        this.r = (byte) 1;
    }

    @Override // defpackage.dzhl
    public final void h(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null experimentIds");
        }
        this.l = engwVar;
    }

    @Override // defpackage.dzhl
    public final void i(dzig dzigVar) {
        this.p = emxc.j(dzigVar);
    }

    @Override // defpackage.dzhl
    public final void j(int i) {
        this.h = emxc.j(Integer.valueOf(i));
    }

    @Override // defpackage.dzhl
    public final void k(int i) {
        this.n = emxc.j(Integer.valueOf(i));
    }

    @Override // defpackage.dzhl
    public final void l(int i) {
        this.k = emxc.j(Integer.valueOf(i));
    }

    @Override // defpackage.dzhl
    public final void m(Integer num) {
        this.j = emxc.j(num);
    }

    @Override // defpackage.dzhl
    public final void n(dzpg dzpgVar) {
        this.c = emxc.j(dzpgVar);
    }

    @Override // defpackage.dzhl
    public final void o(String str) {
        this.d = emxc.j(str);
    }

    @Override // defpackage.dzhl
    public final void p(String str) {
        this.e = emxc.j(str);
    }
}

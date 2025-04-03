package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgje implements ffrf, ffvq {
    public final ffrh a;
    public final Object b;
    final /* synthetic */ fgjf c;

    public fgje(fgjf fgjfVar, ffrh ffrhVar, Object obj) {
        this.c = fgjfVar;
        this.a = ffrhVar;
        this.b = obj;
    }

    @Override // defpackage.ffvq
    public final void C(fghl fghlVar, int i) {
        this.a.C(fghlVar, i);
    }

    @Override // defpackage.ffrf
    public final void a(Object obj) {
        this.a.a(obj);
    }

    @Override // defpackage.ffrf
    public final void d(ffji ffjiVar) {
        throw null;
    }

    @Override // defpackage.ffrf
    public final /* bridge */ /* synthetic */ void e(Object obj, ffji ffjiVar) {
        throw null;
    }

    @Override // defpackage.ffrf
    public final /* bridge */ /* synthetic */ void f(Object obj, ffjn ffjnVar) {
        boolean z = ffso.a;
        this.c.a.c(this.b);
        final fgjf fgjfVar = this.c;
        this.a.e(obj, new ffji() { // from class: fgjd
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                fgjf.this.b(this.b);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.ffrf
    public final /* bridge */ /* synthetic */ void g(ffsd ffsdVar, Object obj) {
        throw null;
    }

    @Override // defpackage.ffrf
    public final boolean h(Throwable th) {
        return this.a.h(th);
    }

    @Override // defpackage.ffrf
    public final boolean i() {
        throw null;
    }

    @Override // defpackage.ffrf
    public final boolean j() {
        throw null;
    }

    @Override // defpackage.ffrf
    public final boolean k() {
        throw null;
    }

    @Override // defpackage.ffrf
    public final /* synthetic */ Object l(Object obj, ffjn ffjnVar) {
        boolean z = ffso.a;
        final fgjf fgjfVar = this.c;
        ffjn ffjnVar2 = new ffjn() { // from class: fgjc
            @Override // defpackage.ffjn
            public final Object a(Object obj2, Object obj3, Object obj4) {
                boolean z2 = ffso.a;
                fgjf fgjfVar2 = fgjf.this;
                ffqn ffqnVar = fgjfVar2.a;
                fgje fgjeVar = this;
                ffqnVar.c(fgjeVar.b);
                fgjfVar2.b(fgjeVar.b);
                return ffcu.a;
            }
        };
        fgho J = this.a.J((ffcu) obj, ffjnVar2);
        if (J != null) {
            fgjf fgjfVar2 = this.c;
            fgjfVar2.a.c(this.b);
        }
        return J;
    }

    @Override // defpackage.ffgu
    public final ffhd u() {
        return this.a.b;
    }

    @Override // defpackage.ffgu
    public final void w(Object obj) {
        this.a.w(obj);
    }
}

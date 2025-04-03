package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdi extends ffkk implements ffix {
    final /* synthetic */ fcw a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ fen d;
    final /* synthetic */ ffbz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdi(fcw fcwVar, int i, int i2, fen fenVar, ffbz ffbzVar) {
        super(0);
        this.a = fcwVar;
        this.b = i;
        this.c = i2;
        this.d = fenVar;
        this.e = ffbzVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        int j;
        int g;
        fcw fcwVar = this.a;
        jpg jpgVar = fcwVar.f;
        int i = this.b;
        int a = fdk.a(this.e);
        fen fenVar = this.d;
        boolean l = fenVar.l();
        int o = fenVar.o();
        long l2 = jpgVar.l(i);
        if (fcwVar.f.h(jpm.e(l2)) == a) {
            j = jpm.e(l2);
        } else if (a >= fcwVar.f.f()) {
            j = fcwVar.f.j(r1.f() - 1);
        } else {
            j = fcwVar.f.j(a);
        }
        if (fcwVar.f.h(jpm.a(l2)) == a) {
            g = jpm.a(l2);
        } else if (a >= fcwVar.f.f()) {
            g = fcwVar.f.g(r3.f() - 1, false);
        } else {
            g = fcwVar.f.g(a, false);
        }
        int i2 = this.c;
        if (j == i2) {
            return fcwVar.b(g);
        }
        if (g == i2) {
            return fcwVar.b(j);
        }
        if (!(l ^ (o == 1)) ? i >= j : i > g) {
            j = g;
        }
        return fcwVar.b(j);
    }
}

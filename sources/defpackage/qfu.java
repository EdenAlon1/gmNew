package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qfu extends ffhv implements ffji {
    int a;
    final /* synthetic */ qfw b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ boolean e;
    final /* synthetic */ float f;
    final /* synthetic */ qgk g;
    final /* synthetic */ qci h;
    final /* synthetic */ float i;
    final /* synthetic */ qgh j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfu(qfw qfwVar, int i, int i2, boolean z, float f, qgk qgkVar, qci qciVar, float f2, qgh qghVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = qfwVar;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = f;
        this.g = qgkVar;
        this.h = qciVar;
        this.i = f2;
        this.j = qghVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhd ffhdVar;
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                this.b.m(this.c);
                this.b.a.b(Integer.valueOf(this.d));
                this.b.b.b(Boolean.valueOf(this.e));
                this.b.d.b(Float.valueOf(this.f));
                qfw qfwVar = this.b;
                qfwVar.c.b(this.g);
                this.b.l(this.h);
                this.b.o(this.i);
                this.b.e.b(false);
                this.b.u(Long.MIN_VALUE);
                if (this.h == null) {
                    this.b.n(false);
                    return ffcu.a;
                }
                if (Float.isInfinite(this.f)) {
                    qfw qfwVar2 = this.b;
                    qfwVar2.o(qfwVar2.d());
                    this.b.n(false);
                    this.b.m(this.d);
                    return ffcu.a;
                }
                this.b.n(true);
                int ordinal = this.j.ordinal();
                if (ordinal == 0) {
                    ffhdVar = ffhe.a;
                } else {
                    if (ordinal != 1) {
                        throw new ffcd();
                    }
                    ffhdVar = ffuw.a;
                }
                qft qftVar = new qft(this.j, ffui.c(u()), this.d, this.c, this.b, null);
                this.a = 1;
                if (ffra.a(ffhdVar, qftVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            ffui.f(u());
            this.b.n(false);
            return ffcu.a;
        } catch (Throwable th) {
            this.b.n(false);
            throw th;
        }
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new qfu(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (ffgu) obj).b(ffcu.a);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoae extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aoai b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoae(aoai aoaiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aoaiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aoae) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl b = this.b.b.b();
            b.getClass();
            this.a = 1;
            obj = fgfz.c(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        final aoai aoaiVar = this.b;
        alxj alxjVar = (alxj) obj;
        synchronized (aoaiVar.e) {
            if (!aoaiVar.f.get()) {
                return ffcu.a;
            }
            aoaiVar.c = alxjVar.b().equals(alxi.RBM) ? ctbt.b(aoaiVar.h.a(new aqgd() { // from class: aoab
                @Override // defpackage.aqgd
                public final elfl a() {
                    return aoai.this.d();
                }
            }), aoaiVar.i.a(new aqgd() { // from class: aoac
                @Override // defpackage.aqgd
                public final elfl a() {
                    return aoai.this.d();
                }
            })) : aoaiVar.g.a(new aqgd() { // from class: aoad
                @Override // defpackage.aqgd
                public final elfl a() {
                    return aoai.this.d();
                }
            });
            return ffcu.a;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aoae(this.b, ffguVar);
    }
}

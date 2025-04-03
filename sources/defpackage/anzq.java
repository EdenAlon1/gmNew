package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anzq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ anzu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anzq(anzu anzuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = anzuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anzq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        final anzu anzuVar = this.b;
        alxj alxjVar = (alxj) obj;
        synchronized (anzuVar.e) {
            if (!anzuVar.f.get()) {
                return ffcu.a;
            }
            anzuVar.c = alxjVar.b().equals(alxi.RBM) ? ctbt.b(anzuVar.h.a(new aqgd() { // from class: anzn
                @Override // defpackage.aqgd
                public final elfl a() {
                    return anzu.this.d();
                }
            }), anzuVar.i.a(new aqgd() { // from class: anzo
                @Override // defpackage.aqgd
                public final elfl a() {
                    return anzu.this.d();
                }
            })) : anzuVar.g.a(new aqgd() { // from class: anzp
                @Override // defpackage.aqgd
                public final elfl a() {
                    return anzu.this.d();
                }
            });
            return ffcu.a;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new anzq(this.b, ffguVar);
    }
}

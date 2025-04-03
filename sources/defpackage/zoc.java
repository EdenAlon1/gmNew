package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zoc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eey b;
    final /* synthetic */ zmz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoc(eey eeyVar, zmz zmzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eeyVar;
        this.c = zmzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zoc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final eey eeyVar = this.b;
            ffxx a = hkt.a(new ffix() { // from class: zoa
                @Override // defpackage.ffix
                public final Object invoke() {
                    return Boolean.valueOf(eey.this.i());
                }
            });
            zob zobVar = new zob(this.c);
            this.a = 1;
            if (a.a(zobVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zoc(this.b, this.c, ffguVar);
    }
}

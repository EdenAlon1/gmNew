package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class swi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eey b;
    final /* synthetic */ sxf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swi(eey eeyVar, sxf sxfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eeyVar;
        this.c = sxfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((swi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final eey eeyVar = this.b;
            swe sweVar = new swe(ffyy.a(new swh(hkt.a(new ffix() { // from class: swa
                @Override // defpackage.ffix
                public final Object invoke() {
                    return eey.this.d().i();
                }
            }))));
            swb swbVar = new swb(this.c);
            this.a = 1;
            if (sweVar.a(swbVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new swi(this.b, this.c, ffguVar);
    }
}

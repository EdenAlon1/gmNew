package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdze extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cdzf b;
    final /* synthetic */ ceal c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdze(cdzf cdzfVar, ceal cealVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cdzfVar;
        this.c = cealVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdze) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cdzf cdzfVar = this.b;
            ffhd a = ekxi.a(cdzfVar.b);
            cdzd cdzdVar = new cdzd(null, cdzfVar);
            this.a = 1;
            if (ffra.a(a, cdzdVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        ceaf ceafVar = (ceaf) this.c.toBuilder();
        ceafVar.copyOnWrite();
        ceal cealVar = (ceal) ceafVar.instance;
        cealVar.f = 2;
        cealVar.c |= 4;
        eyfy build = ceafVar.build();
        build.getClass();
        return build;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cdze(this.b, this.c, ffguVar);
    }
}

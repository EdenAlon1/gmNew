package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wkf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ wkp b;
    final /* synthetic */ esgx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkf(wkp wkpVar, esgx esgxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = wkpVar;
        this.c = esgxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wkf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            wkp wkpVar = this.b;
            esgx esgxVar = this.c;
            dqgm dqgmVar = dslv.aI;
            this.a = 1;
            if (dqiy.e(wkpVar.o, esgxVar, dqgmVar, null, this, 12) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wkf(this.b, this.c, ffguVar);
    }
}

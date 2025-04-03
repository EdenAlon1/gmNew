package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgdl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cgdm b;
    final /* synthetic */ cdvx c;
    final /* synthetic */ ceuw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgdl(cgdm cgdmVar, cdvx cdvxVar, ceuw ceuwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cgdmVar;
        this.c = cdvxVar;
        this.d = ceuwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgdl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        if (this.b.b.isEmpty()) {
            return ceyt.k();
        }
        cdvx cdvxVar = this.c;
        if ((cdvxVar.b & 1) == 0) {
            cgdm.a.r("Get GaiaAuthCheckResult not performed because accountId is not present");
            return ceyt.k();
        }
        cgdm cgdmVar = this.b;
        int i2 = cdvxVar.c;
        ceuw ceuwVar = this.d;
        this.a = 1;
        Object k = cgdmVar.k(i2, ceuwVar, this);
        return k == ffhhVar ? ffhhVar : k;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cgdl(this.b, this.c, this.d, ffguVar);
    }
}

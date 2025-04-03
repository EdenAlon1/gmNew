package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drfy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drgb b;
    final /* synthetic */ drfa c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drfy(drgb drgbVar, drfa drfaVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = drgbVar;
        this.c = drfaVar;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drfy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            drgb drgbVar = this.b;
            drfa drfaVar = this.c;
            String str = this.d;
            dqiy aU = drgbVar.aU();
            dqgm dqgmVar = dslv.aI;
            this.a = 1;
            if (dqiy.e(aU, drfaVar, dqgmVar, str, this, 4) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drfy(this.b, this.c, this.d, ffguVar);
    }
}

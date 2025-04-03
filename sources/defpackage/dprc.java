package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dprc extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dprt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dprc(dprt dprtVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = dprtVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dprc dprcVar = new dprc(this.c, (ffgu) obj3);
        dprcVar.b = (Throwable) obj2;
        return dprcVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Object obj2 = this.b;
            dprt dprtVar = this.c;
            enru enruVar = dprt.a;
            fgcl fgclVar = dprtVar.j;
            dpqg dpqgVar = new dpqg((Throwable) obj2);
            this.a = 1;
            if (fgclVar.fQ(dpqgVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}

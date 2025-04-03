package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsup extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsuq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsup(dsuq dsuqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dsuqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsup) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dsuq dsuqVar = this.b;
            dsuo dsuoVar = new dsuo(dsuqVar, null);
            this.a = 1;
            if (ffyk.b(dsuqVar.c, dsuoVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsup(this.b, ffguVar);
    }
}

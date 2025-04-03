package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpre extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dprt b;
    final /* synthetic */ drlx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpre(dprt dprtVar, drlx drlxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dprtVar;
        this.c = drlxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpre) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dprt dprtVar = this.b;
            drlx drlxVar = this.c;
            this.a = 1;
            obj = dprtVar.i.a.a(drlxVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException("Error getting output URI for image capture.");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpre(this.b, this.c, ffguVar);
    }
}

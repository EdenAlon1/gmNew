package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cypd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cypg b;
    final /* synthetic */ aqux c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cypd(cypg cypgVar, aqux aquxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cypgVar;
        this.c = aquxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cypd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cypg cypgVar = this.b;
            elfl t = cypgVar.d.t(cypgVar.c, this.c);
            t.getClass();
            this.a = 1;
            if (fgfz.c(t, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cypd(this.b, this.c, ffguVar);
    }
}

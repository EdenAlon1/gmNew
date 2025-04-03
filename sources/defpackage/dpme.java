package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpme extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffji b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpme(ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpme) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffji ffjiVar = this.b;
            this.a = 1;
            if (ffjiVar.invoke(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpme(this.b, ffguVar);
    }
}

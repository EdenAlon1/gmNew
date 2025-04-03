package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbg extends ffhv implements ffji {
    int a;
    final /* synthetic */ ffji b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbg(ffji ffjiVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = ffjiVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ffji ffjiVar = this.b;
        this.a = 1;
        Object invoke = ffjiVar.invoke(this);
        return invoke == ffhhVar ? ffhhVar : invoke;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new lbg(this.b, (ffgu) obj).b(ffcu.a);
    }
}

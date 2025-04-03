package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbbh extends ffhv implements ffji {
    int a;
    final /* synthetic */ ffji b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbbh(ffji ffjiVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = ffjiVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffji ffjiVar = this.b;
            this.a = 1;
            obj = ffjiVar.invoke(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return String.valueOf(((Number) obj).intValue());
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dbbh(this.b, (ffgu) obj).b(ffcu.a);
    }
}

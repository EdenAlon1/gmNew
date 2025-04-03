package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqkv extends ffhv implements ffji {
    int a;
    final /* synthetic */ fflb b;
    final /* synthetic */ ffji c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqkv(fflb fflbVar, ffji ffjiVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = fflbVar;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            obj = this.b.a;
            if (obj == null) {
                ffji ffjiVar = this.c;
                this.a = 1;
                obj = ffjiVar.invoke(this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            return obj;
        }
        this.b.a = obj;
        return obj;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dqkv(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}

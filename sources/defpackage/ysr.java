package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ysr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ysz b;
    final /* synthetic */ aiir c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysr(ysz yszVar, aiir aiirVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yszVar;
        this.c = aiirVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ysr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ysz yszVar = this.b;
            aiir aiirVar = this.c;
            this.a = 1;
            obj = yszVar.g(aiirVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ysr(this.b, this.c, ffguVar);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqdo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cqdr b;
    final /* synthetic */ eqqh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqdo(cqdr cqdrVar, eqqh eqqhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cqdrVar;
        this.c = eqqhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqdo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cqdr cqdrVar = this.b;
            eqqh eqqhVar = this.c;
            this.a = 1;
            if (cqdrVar.z(eqqhVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cqdo(this.b, this.c, ffguVar);
    }
}

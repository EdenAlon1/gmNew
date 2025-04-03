package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfjw extends ffhv implements ffji {
    int a;
    final /* synthetic */ cfir b;
    final /* synthetic */ cfjt c;
    final /* synthetic */ cfki d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfjw(cfir cfirVar, cfjt cfjtVar, cfki cfkiVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = cfirVar;
        this.c = cfjtVar;
        this.d = cfkiVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cfir cfirVar = this.b;
            cfjt cfjtVar = this.c;
            cfjv cfjvVar = new cfjv(cfjtVar, this.d, null);
            this.a = 1;
            if (cfirVar.b(cfjtVar.c, cfjvVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cfjw(this.b, this.c, this.d, (ffgu) obj).b(ffcu.a);
    }
}

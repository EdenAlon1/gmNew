package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffyq extends ffhv implements ffji {
    int a;
    final /* synthetic */ ffxy b;
    final /* synthetic */ fflb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffyq(ffxy ffxyVar, fflb fflbVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = ffxyVar;
        this.c = fflbVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxy ffxyVar = this.b;
            fflb fflbVar = this.c;
            fgho fghoVar = fgfg.a;
            Object obj2 = fflbVar.a;
            if (obj2 == fghoVar) {
                obj2 = null;
            }
            this.a = 1;
            if (ffxyVar.fQ(obj2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.c.a = null;
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ffyq(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtlz extends ffhv implements ffji {
    int a;
    final /* synthetic */ dtma b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtlz(dtma dtmaVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dtmaVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dtma dtmaVar = this.b;
            ffhd hT = dtmaVar.b.hT();
            dtly dtlyVar = new dtly(dtmaVar, null);
            this.a = 1;
            if (ffra.a(hT, dtlyVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dtlz(this.b, (ffgu) obj).b(ffcu.a);
    }
}

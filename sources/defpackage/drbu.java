package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drbu extends ffhv implements ffjm {
    final /* synthetic */ drcf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drbu(drcf drcfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = drcfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drbu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dqza dqzaVar = this.a.ai;
        if (dqzaVar == null) {
            ffkj.c("emotifyController");
            dqzaVar = null;
        }
        dqzaVar.c();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drbu(this.a, ffguVar);
    }
}

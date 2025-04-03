package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqup extends ffhv implements ffjm {
    final /* synthetic */ dqur a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqup(dqur dqurVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dqurVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqup) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dqur dqurVar = this.a;
        dqurVar.v(0, dqurVar.i.size(), dqun.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqup(this.a, ffguVar);
    }
}

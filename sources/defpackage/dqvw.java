package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqvw extends ffhv implements ffjm {
    final /* synthetic */ dqwa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqvw(dqwa dqwaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dqwaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqvw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dqwa dqwaVar = this.a;
        dqwaVar.b.P().c(new dqvv(dqwaVar));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqvw(this.a, ffguVar);
    }
}

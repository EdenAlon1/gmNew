package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqyr extends ffhv implements ffjm {
    final /* synthetic */ hho a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqyr(hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqyr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.b(true);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqyr(this.a, ffguVar);
    }
}

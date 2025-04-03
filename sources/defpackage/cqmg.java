package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqmg extends ffhv implements ffjm {
    final /* synthetic */ cqmi a;
    final /* synthetic */ ezgn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqmg(cqmi cqmiVar, ezgn ezgnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cqmiVar;
        this.b = ezgnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqmg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.b.a(ceyr.g("TelephonyDatabaseUpdateWorkItemHandler", this.b));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cqmg(this.a, this.b, ffguVar);
    }
}

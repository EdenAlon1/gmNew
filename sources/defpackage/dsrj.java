package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsrj extends ffhv implements ffjm {
    final /* synthetic */ kxp a;
    final /* synthetic */ hkx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsrj(kxp kxpVar, hkx hkxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = kxpVar;
        this.b = hkxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsrj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (dsrl.b(this.b)) {
            this.a.a.e();
        } else {
            this.a.e();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsrj(this.a, this.b, ffguVar);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dprj extends ffhv implements ffjm {
    final /* synthetic */ dprt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dprj(dprt dprtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dprtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dprj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.e.b();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dprj(this.a, ffguVar);
    }
}

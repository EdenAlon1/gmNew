package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dphg extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ dpif b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dphg(dpif dpifVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpifVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dphg) c((Duration) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(!ffkj.e((Duration) this.a, this.b.e.a));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dphg dphgVar = new dphg(this.b, ffguVar);
        dphgVar.a = obj;
        return dphgVar;
    }
}

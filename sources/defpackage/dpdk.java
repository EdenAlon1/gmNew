package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpdk extends ffhv implements ffjm {
    final /* synthetic */ dpds a;
    final /* synthetic */ detn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpdk(dpds dpdsVar, detn detnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dpdsVar;
        this.b = detnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((dpdk) c(bool, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        detn detnVar = this.b;
        dpdv dpdvVar = this.a.c;
        Map map = detnVar.d.c;
        map.getClass();
        dpdvVar.a(map);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpdk(this.a, this.b, ffguVar);
    }
}

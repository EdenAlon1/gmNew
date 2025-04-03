package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccyu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ ffdn c;
    final /* synthetic */ ffjn d;
    final /* synthetic */ Map e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccyu(ffgu ffguVar, int i, ffdn ffdnVar, ffjn ffjnVar, Map map) {
        super(2, ffguVar);
        this.b = i;
        this.c = ffdnVar;
        this.d = ffjnVar;
        this.e = map;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccyu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ffhd a = ekxi.a(new ffsj("OperateResultsIndividuallyAsync-" + this.b));
        ccyv ccyvVar = new ccyv(null, this.c, this.d, this.e);
        this.a = 1;
        Object a2 = ffra.a(a, ccyvVar, this);
        return a2 == ffhhVar ? ffhhVar : a2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ccyu ccyuVar = new ccyu(ffguVar, this.b, this.c, this.d, this.e);
        ccyuVar.f = obj;
        return ccyuVar;
    }
}

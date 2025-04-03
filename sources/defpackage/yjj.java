package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yjj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ List c;
    final /* synthetic */ yjn d;
    final /* synthetic */ Long e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjj(String str, List list, yjn yjnVar, Long l, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = str;
        this.c = list;
        this.d = yjnVar;
        this.e = l;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yjj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ffsk ffskVar = (ffsk) this.f;
        if (this.b != null && this.c.size() != 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        xyj b = xyi.b(this.d.f, this.e, true);
        List<xho> list = this.c;
        yjn yjnVar = this.d;
        String str = this.b;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        for (xho xhoVar : list) {
            arrayList.add(ffra.b(ffskVar, ekxi.a(ffhe.a), ffsm.a, new yji(null, yjnVar, xhoVar, b, str)));
        }
        this.a = 1;
        Object a = ffqv.a(arrayList, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yjj yjjVar = new yjj(this.b, this.c, this.d, this.e, ffguVar);
        yjjVar.f = obj;
        return yjjVar;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eamn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ eamp c;
    final /* synthetic */ String d;
    final /* synthetic */ exuk e;
    final /* synthetic */ Map f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eamn(List list, eamp eampVar, String str, exuk exukVar, Map map, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = list;
        this.c = eampVar;
        this.d = str;
        this.e = exukVar;
        this.f = map;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eamn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        List<easy> list = this.b;
        Map map = this.f;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        for (easy easyVar : list) {
            if (!map.containsKey(easyVar)) {
                return new eafi(new IllegalStateException("Account to register not found in accounts storage"));
            }
            Object obj2 = map.get(easyVar);
            if (obj2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add((eagt) obj2);
        }
        List ak = ffdx.ak(arrayList);
        eamp eampVar = this.c;
        String str = this.d;
        exuk exukVar = this.e;
        this.a = 1;
        Object b = eampVar.a.b(ak, str, exukVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eamn(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}

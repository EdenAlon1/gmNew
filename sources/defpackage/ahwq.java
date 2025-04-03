package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwq extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ahwz c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahwq(ffgu ffguVar, ahwz ahwzVar) {
        super(3, ffguVar);
        this.c = ahwzVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ahwq ahwqVar = new ahwq((ffgu) obj3, this.c);
        ahwqVar.d = (ffxy) obj;
        ahwqVar.b = obj2;
        return ahwqVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffxx ahwyVar;
        ffxx a;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r10 = this.d;
            List<xhp> list = (List) this.b;
            if (list.isEmpty()) {
                ahwyVar = new ffyg(ahwz.b);
            } else {
                ArrayList arrayList = new ArrayList();
                for (xhp xhpVar : list) {
                    ahwz ahwzVar = this.c;
                    doxx doxxVar = xhpVar instanceof xho ? ((xho) xhpVar).a : xhpVar instanceof xhk ? ((xhk) xhpVar).b : null;
                    if (doxxVar instanceof doyd) {
                        doyd doydVar = (doyd) doxxVar;
                        if (le.z(doydVar.a.a())) {
                            Map map = ahwzVar.f;
                            String str = doydVar.b;
                            Object obj2 = map.get(str);
                            if (obj2 == null) {
                                obj2 = ahwzVar.e.a(xhpVar);
                                map.put(str, obj2);
                            }
                            a = (ffxx) obj2;
                            arrayList.add(a);
                        }
                    }
                    a = ahwzVar.e.a(xhpVar);
                    arrayList.add(a);
                }
                ahwyVar = new ahwy((ffxx[]) ffdx.ak(arrayList).toArray(new ffxx[0]), this.c, list);
            }
            this.a = 1;
            if (ffyk.c(r10, ahwyVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}

package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqos extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqow b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqos(dqow dqowVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqowVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqos) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final dqow dqowVar = this.b;
            ffji ffjiVar = new ffji() { // from class: dqor
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = ((List) obj2).iterator();
                    while (it.hasNext()) {
                        for (dqqj dqqjVar : ((dqog) it.next()).b) {
                            linkedHashMap.put(dqqjVar.a().a(), dqqjVar);
                            Iterator it2 = dqqjVar.i().iterator();
                            while (it2.hasNext()) {
                                linkedHashMap.put(((dqoe) it2.next()).a(), dqqjVar);
                            }
                        }
                    }
                    dqow.this.c = linkedHashMap;
                    return ffcu.a;
                }
            };
            this.a = 1;
            if (dqowVar.f(ffjiVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqos(this.b, ffguVar);
    }
}

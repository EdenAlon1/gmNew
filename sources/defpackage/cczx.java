package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cczx extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cdaf c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cczx(cdaf cdafVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cdafVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cczx) c((Map) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        final Map map = (Map) this.b;
        final cdaf cdafVar = this.c;
        final int i2 = this.d;
        ffix ffixVar = new ffix() { // from class: cczw
            @Override // defpackage.ffix
            public final Object invoke() {
                Map map2;
                Object a;
                Map map3 = map;
                final cdaf cdafVar2 = cdaf.this;
                if (cdafVar2.c.a()) {
                    ccuq ccuqVar = cdafVar2.f;
                    Set keySet = map3.keySet();
                    int i3 = ccuo.a;
                    map2 = ccyx.b(ccuqVar.e(keySet, ccup.a), new ffjm() { // from class: cczv
                        @Override // defpackage.ffjm
                        public final Object a(Object obj2, Object obj3) {
                            cdaf.this.e(obj3, (String) obj2);
                            return obj3;
                        }
                    });
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(map3.size()));
                    for (Map.Entry entry : map3.entrySet()) {
                        Object key = entry.getKey();
                        try {
                            a = cdafVar2.f.c((String) entry.getKey(), ccup.a);
                            cdafVar2.e(a, (String) entry.getKey());
                        } catch (Throwable th) {
                            a = ffci.a(th);
                        }
                        linkedHashMap.put(key, new ffch(a));
                    }
                    map2 = linkedHashMap;
                }
                Set entrySet = map2.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : entrySet) {
                    if (ffch.d(((ffch) ((Map.Entry) obj2).getValue()).a)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it.next()).getKey());
                }
                if (ffdx.at(arrayList2)) {
                    cdafVar2.i(arrayList2, i2, 2);
                }
                return map2;
            }
        };
        this.a = 1;
        Object d = cdafVar.d("Collecting data for CMS Insert", ffixVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cczx cczxVar = new cczx(this.c, this.d, ffguVar);
        cczxVar.b = obj;
        return cczxVar;
    }
}

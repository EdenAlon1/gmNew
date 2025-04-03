package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccyo extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ccyq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccyo(ccyq ccyqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ccyqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccyo) c((Map) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Map map;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            map = (Map) this.b;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            Map map2 = (Map) this.b;
            ccyq ccyqVar = this.c;
            int i = ccyq.d;
            elfl N = ccyqVar.a.N(engq.a(map2.values()));
            this.b = map2;
            this.a = 1;
            Object c = fgfz.c(N, this);
            if (c == ffhhVar) {
                return ffhhVar;
            }
            map = map2;
            obj = c;
        }
        List<etah> ak = ffdx.ak(((csdq) obj).a);
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(ak, 10)), 16));
        for (etah etahVar : ak) {
            etam etamVar = etahVar.d;
            if (etamVar == null) {
                etamVar = etam.a;
            }
            eszs eszsVar = etamVar.c;
            if (eszsVar == null) {
                eszsVar = eszs.a;
            }
            ffcf ffcfVar = new ffcf(eszsVar.b, etahVar.c);
            linkedHashMap.put(ffcfVar.a, ffcfVar.b);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ffew.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap2.put(entry.getKey(), (String) linkedHashMap.get(entry.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (((String) entry2.getValue()) != null) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(ffew.a(linkedHashMap3.size()));
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            Object key = entry3.getKey();
            Object value = entry3.getValue();
            value.getClass();
            linkedHashMap4.put(key, new ffch(value));
        }
        return linkedHashMap4;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ccyo ccyoVar = new ccyo(this.c, ffguVar);
        ccyoVar.b = obj;
        return ccyoVar;
    }
}

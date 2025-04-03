package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfiv extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public cfiv(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cfiv cfivVar = new cfiv((ffgu) obj3);
        cfivVar.c = (ffxy) obj;
        cfivVar.b = obj2;
        return cfivVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r10 = this.c;
            Map map = (Map) this.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((cfir) entry.getValue()).a());
            }
            ffxx[] ffxxVarArr = new ffxx[2];
            ffxxVarArr[0] = new ffyg(linkedHashMap);
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry2 : map.entrySet()) {
                arrayList.add(new cfiz(new ffzr(((cfir) entry2.getValue()).a, 1), (String) entry2.getKey()));
            }
            int i2 = fgau.a;
            ffxxVarArr[1] = new fgbv(linkedHashMap, new fgep(arrayList), new cfiw(null));
            ffxx c = fgau.c(ffxxVarArr);
            this.a = 1;
            if (ffyk.c(r10, c, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}

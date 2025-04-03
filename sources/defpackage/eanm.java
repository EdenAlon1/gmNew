package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eanm extends ffhv implements ffjm {
    final /* synthetic */ Map a;
    final /* synthetic */ eami b;
    final /* synthetic */ eann c;
    final /* synthetic */ eagp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eanm(Map map, eami eamiVar, eann eannVar, eagp eagpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = map;
        this.b = eamiVar;
        this.c = eannVar;
        this.d = eagpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eanm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            eagt eagtVar = (eagt) entry.getValue();
            int a = this.b.a(eagtVar);
            if (eagtVar.b() != a) {
                eags h = eagtVar.h();
                h.i(a);
                eagtVar = h.a();
                arrayList.add(eagtVar);
            }
            hashMap.put(entry.getKey(), eagtVar);
        }
        eann eannVar = this.c;
        eannVar.a.a(this.d).i(arrayList);
        return hashMap;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eanm(this.a, this.b, this.c, this.d, ffguVar);
    }
}

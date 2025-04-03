package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqlo extends ffhv implements ffji {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ dqlp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqlo(List list, dqlp dqlpVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = list;
        this.c = dqlpVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        dqlf dqlfVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            List list = this.b;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ffdx.w(arrayList, ((dqlf) it.next()).k);
            }
            dqlp dqlpVar = this.c;
            String aA = ffdx.aA(arrayList, "_", null, null, null, 62);
            dqln dqlnVar = new dqln(this.c, arrayList, null);
            this.a = 1;
            obj = dqlpVar.f("compose_permission_".concat(aA), 0, dqlnVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        List<dqlf> list2 = this.b;
        Map map = (Map) obj;
        ffga ffgaVar = new ffga();
        if (map != null) {
            for (String str : map.keySet()) {
                dqlf dqlfVar2 = dqlf.a;
                str.getClass();
                dqlf[] values = dqlf.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        dqlfVar = null;
                        break;
                    }
                    dqlfVar = values[i2];
                    if (dqlfVar.k.contains(str)) {
                        break;
                    }
                    i2++;
                }
                Boolean bool = (Boolean) map.get(str);
                if (dqlfVar != null && bool != null) {
                    ffgaVar.put(dqlfVar, bool);
                }
            }
        }
        for (dqlf dqlfVar3 : list2) {
            if (!ffgaVar.containsKey(dqlfVar3)) {
                ffgaVar.put(dqlfVar3, false);
            }
        }
        return ffew.b(ffgaVar);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dqlo(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}

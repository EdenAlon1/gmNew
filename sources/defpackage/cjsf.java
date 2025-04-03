package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjsf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjsn b;
    final /* synthetic */ List c;
    final /* synthetic */ Map d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjsf(ffgu ffguVar, cjsn cjsnVar, List list, Map map) {
        super(2, ffguVar);
        this.b = cjsnVar;
        this.c = list;
        this.d = map;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjsf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            cjsn cjsnVar = this.b;
            List<ResolvedRecipient> list = this.c;
            cjua cjuaVar = cjsnVar.b;
            ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
            for (ResolvedRecipient resolvedRecipient : list) {
                cjwf cjwfVar = (cjwf) cjwg.a.createBuilder();
                cjwfVar.getClass();
                String str = ((cjvq) resolvedRecipient.k()).b;
                if (str == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                cjwh.c(str, cjwfVar);
                String h = ((cjvq) resolvedRecipient.k()).h();
                if (h == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                cjwfVar.copyOnWrite();
                cjwg cjwgVar = (cjwg) cjwfVar.instance;
                cjwgVar.b |= 16;
                cjwgVar.f = h;
                cjwh.b(((Number) cjsnVar.d.b()).longValue(), cjwfVar);
                arrayList.add(cjwh.a(cjwfVar));
            }
            this.a = 1;
            obj = cjuaVar.a(arrayList, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            Map map = this.d;
            cjwg cjwgVar2 = ((cjwc) obj2).f;
            if (cjwgVar2 == null) {
                cjwgVar2 = cjwg.a;
            }
            if (map.get(cjwgVar2.c) != null) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(arrayList2, 10)), 16));
        for (Object obj3 : arrayList2) {
            Map map2 = this.d;
            cjwg cjwgVar3 = ((cjwc) obj3).f;
            if (cjwgVar3 == null) {
                cjwgVar3 = cjwg.a;
            }
            Object obj4 = map2.get(cjwgVar3.c);
            obj4.getClass();
            linkedHashMap.put((aqkv) obj4, obj3);
        }
        return linkedHashMap;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjsf cjsfVar = new cjsf(ffguVar, this.b, this.c, this.d);
        cjsfVar.e = obj;
        return cjsfVar;
    }
}

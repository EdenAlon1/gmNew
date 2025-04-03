package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eanx {
    public static final int a(exuk exukVar, List list, Map map) {
        list.getClass();
        map.getClass();
        if (exukVar == null) {
            return 0;
        }
        exum a = exul.a((exuh) exukVar.toBuilder());
        exuh exuhVar = a.a;
        exuhVar.copyOnWrite();
        exuk exukVar2 = (exuk) exuhVar.instance;
        exukVar2.b &= -5;
        exukVar2.e = 0;
        exuh exuhVar2 = a.a;
        exuhVar2.copyOnWrite();
        exuk exukVar3 = (exuk) exuhVar2.instance;
        exukVar3.b &= -17;
        exukVar3.h = exuk.a.h;
        eyjx b = a.b();
        ArrayList arrayList = new ArrayList(ffdx.n(b, 10));
        Iterator<E> it = b.iterator();
        while (it.hasNext()) {
            exuo a2 = exun.a((exui) ((exuj) it.next()).toBuilder());
            exui exuiVar = a2.a;
            exuiVar.copyOnWrite();
            exuj exujVar = (exuj) exuiVar.instance;
            exujVar.b &= -2;
            exujVar.c = exuj.a.c;
            exui exuiVar2 = a2.a;
            exuiVar2.copyOnWrite();
            exuj exujVar2 = (exuj) exuiVar2.instance;
            exujVar2.d = null;
            exujVar2.b &= -3;
            exui exuiVar3 = a2.a;
            exuiVar3.copyOnWrite();
            exuj exujVar3 = (exuj) exuiVar3.instance;
            exujVar3.b &= -17;
            exujVar3.g = exuj.a.g;
            arrayList.add(a2.a());
        }
        List ah = ffdx.ah(arrayList, new eanw());
        a.b();
        exuh exuhVar3 = a.a;
        exuhVar3.copyOnWrite();
        ((exuk) exuhVar3.instance).f = exuk.emptyProtobufList();
        a.b();
        exuh exuhVar4 = a.a;
        exuhVar4.copyOnWrite();
        exuk exukVar4 = (exuk) exuhVar4.instance;
        exukVar4.a();
        eydl.addAll(ah, exukVar4.f);
        int hashCode = a.a().hashCode();
        ArrayList arrayList2 = new ArrayList(ffdx.n(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((easy) it2.next()).a().hashCode()));
        }
        Iterator it3 = ffdx.ag(arrayList2).iterator();
        while (it3.hasNext()) {
            hashCode = (hashCode * 53) + ((Number) it3.next()).intValue();
        }
        ArrayList<eatb> arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof eatb) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(ffdx.n(arrayList3, 10));
        for (eatb eatbVar : arrayList3) {
            int hashCode2 = eatbVar.a.hashCode() * 53;
            eagt eagtVar = (eagt) map.get(eatbVar);
            String k = eagtVar != null ? eagtVar.k() : null;
            arrayList4.add(Integer.valueOf(hashCode2 + (k != null ? k.hashCode() : 0)));
        }
        Iterator it4 = ffdx.ag(arrayList4).iterator();
        while (it4.hasNext()) {
            hashCode = (hashCode * 53) + ((Number) it4.next()).intValue();
        }
        return hashCode;
    }
}

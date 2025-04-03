package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Map;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crua {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/cloudstore/CmsAdditionalFieldsFetcher");
    private static final ecda b = new ecda("CmsBatchGetAdditionalFields");
    private final crud c;
    private final csds d;
    private final ecrj e;

    public crua(crud crudVar, csds csdsVar, ecrj ecrjVar) {
        crudVar.getClass();
        ecrjVar.getClass();
        this.c = crudVar;
        this.d = csdsVar;
        this.e = ecrjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final enhk a(Map map, engw engwVar) {
        Map map2;
        Iterator it;
        Map.Entry entry;
        engwVar.getClass();
        ecri d = this.e.d();
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                try {
                    map2 = ((csdr) entry2.getValue()).d(engwVar);
                } catch (Exception e) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(engwVar, 10)), 16));
                    for (Object obj : engwVar) {
                        linkedHashMap2.put(obj, new ffch(ffci.a(e)));
                    }
                    map2 = linkedHashMap2;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry3 : map2.entrySet()) {
                    if (ffch.d(((ffch) entry3.getValue()).a)) {
                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                    }
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(ffew.a(linkedHashMap3.size()));
                for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                    Object key = entry4.getKey();
                    Object obj2 = ((ffch) entry4.getValue()).a;
                    ffci.b(obj2);
                    linkedHashMap4.put(key, (eyee) obj2);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                for (Map.Entry entry5 : map2.entrySet()) {
                    if (((ffch) entry5.getValue()).a instanceof ffcg) {
                        linkedHashMap5.put(entry5.getKey(), entry5.getValue());
                    }
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(ffew.a(linkedHashMap5.size()));
                for (Map.Entry entry6 : linkedHashMap5.entrySet()) {
                    Object key2 = entry6.getKey();
                    Throwable c = ffch.c(((ffch) entry6.getValue()).a);
                    c.getClass();
                    linkedHashMap6.put(key2, c);
                }
                linkedHashMap.put(entry2.getKey(), linkedHashMap4);
                ensk h = a.h();
                h.Y(ente.a, "BugleCmsAddFields");
                enrr enrrVar = (enrr) h;
                enrrVar.Y(cdii.M, ((eshn) entry2.getKey()).name());
                enrr enrrVar2 = (enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsAdditionalFieldsFetcher", "getAdditionalFields", 62, "CmsAdditionalFieldsFetcher.kt");
                LinkedHashMap linkedHashMap7 = linkedHashMap;
                ArrayList arrayList = new ArrayList(linkedHashMap4.size());
                for (Iterator it3 = linkedHashMap4.entrySet().iterator(); it3.hasNext(); it3 = it3) {
                    arrayList.add((String) ((Map.Entry) it3.next()).getKey());
                }
                String aA = ffdx.aA(arrayList, ",", null, null, null, 62);
                ArrayList arrayList2 = new ArrayList();
                Iterator<E> it4 = engwVar.iterator();
                while (true) {
                    it = it2;
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    LinkedHashMap linkedHashMap8 = linkedHashMap4;
                    if (!map2.containsKey((String) next)) {
                        arrayList2.add(next);
                    }
                    it2 = it;
                    linkedHashMap4 = linkedHashMap8;
                }
                LinkedHashMap linkedHashMap9 = linkedHashMap4;
                String aA2 = ffdx.aA(arrayList2, ",", null, null, null, 62);
                ArrayList arrayList3 = new ArrayList(linkedHashMap6.size());
                Iterator it5 = linkedHashMap6.entrySet().iterator();
                while (it5.hasNext()) {
                    arrayList3.add((String) ((Map.Entry) it5.next()).getKey());
                }
                enrrVar2.J("Retrieved data from CmsDataProvider. Successful Ids = %s. No result Ids = %s. Failed Ids = %s.", aA, aA2, ffdx.aA(arrayList3, ",", null, null, null, 62));
                int size = linkedHashMap9.size();
                for (int i = 0; i < size; i++) {
                    this.d.a(3, (eshn) entry2.getKey());
                }
                for (Map.Entry entry7 : linkedHashMap6.entrySet()) {
                    String str = (String) entry7.getKey();
                    Throwable th = (Throwable) entry7.getValue();
                    if (th instanceof csgv) {
                        enqv it6 = ((csgv) th).a.iterator();
                        it6.getClass();
                        while (it6.hasNext()) {
                            csgq csgqVar = (csgq) it6.next();
                            crud crudVar = this.c;
                            MessageIdType b2 = bdhb.b(str);
                            MessageIdType b3 = bdhb.b(csgqVar.a());
                            efbd.b();
                            String[] strArr = bqhg.a;
                            bqgh bqghVar = new bqgh();
                            bqghVar.c(MessageIdType.a(b2));
                            bqghVar.b(MessageIdType.a(b3));
                            bqghVar.d(((cqoh) crudVar.a.b()).f().toEpochMilli());
                            final bqge a2 = bqghVar.a();
                            final dtve a3 = bqhg.a();
                            Long.valueOf(dtub.b(bqhg.a(), "cms_backup_dependency_cache_table", a2, new Function() { // from class: bqgc
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    return Long.valueOf(dtve.this.S("cms_backup_dependency_cache_table", (ContentValues) obj3));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Consumer() { // from class: bqgd
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj3) {
                                    Long l = (Long) obj3;
                                    if (l.longValue() >= 0) {
                                        bqge bqgeVar = bqge.this;
                                        bqgeVar.a = new bqgb(l).a.longValue();
                                        bqgeVar.fY(0);
                                    }
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            })).longValue();
                            entry2 = entry2;
                        }
                        entry = entry2;
                        ensk h2 = a.h();
                        h2.Y(ente.a, "BugleCmsAddFields");
                        enrr enrrVar3 = (enrr) h2;
                        enrrVar3.Y(cdii.M, ((eshn) entry.getKey()).name());
                        enrrVar3.Y(cdii.c, str);
                        ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsAdditionalFieldsFetcher", "getAdditionalFields", 87, "CmsAdditionalFieldsFetcher.kt")).q("Dependencies inserted into BackupDependencyCache.");
                        this.d.a(5, (eshn) entry.getKey());
                    } else {
                        entry = entry2;
                        ensk i2 = a.i();
                        i2.Y(ente.a, "BugleCmsAddFields");
                        enrr enrrVar4 = (enrr) ((enrr) i2).g(th);
                        enrrVar4.Y(cdii.M, ((eshn) entry.getKey()).name());
                        enrrVar4.Y(cdii.c, str);
                        ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsAdditionalFieldsFetcher", "getAdditionalFields", 99, "CmsAdditionalFieldsFetcher.kt")).q("Unable to get data from CmsDataProvider.");
                        this.d.a(6, (eshn) entry.getKey());
                    }
                    entry2 = entry;
                }
                it2 = it;
                linkedHashMap = linkedHashMap7;
            }
            LinkedHashMap linkedHashMap10 = linkedHashMap;
            LinkedHashMap linkedHashMap11 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(engwVar, 10)), 16));
            for (Object obj3 : engwVar) {
                String str2 = (String) obj3;
                LinkedHashMap linkedHashMap12 = new LinkedHashMap(ffew.a(linkedHashMap10.size()));
                for (Map.Entry entry8 : linkedHashMap10.entrySet()) {
                    linkedHashMap12.put(entry8.getKey(), (eyee) ((Map) entry8.getValue()).get(str2));
                }
                LinkedHashMap linkedHashMap13 = new LinkedHashMap();
                for (Map.Entry entry9 : linkedHashMap12.entrySet()) {
                    if (((eyee) entry9.getValue()) != null) {
                        linkedHashMap13.put(entry9.getKey(), entry9.getValue());
                    }
                }
                LinkedHashMap linkedHashMap14 = new LinkedHashMap(ffew.a(linkedHashMap13.size()));
                for (Map.Entry entry10 : linkedHashMap13.entrySet()) {
                    Object key3 = entry10.getKey();
                    Object value = entry10.getValue();
                    value.getClass();
                    linkedHashMap14.put(key3, (eyee) value);
                }
                linkedHashMap11.put(obj3, engq.e(linkedHashMap14));
            }
            return engq.e(linkedHashMap11);
        } finally {
            this.e.f(d, b, null, ecrh.SUCCESS);
        }
    }

    public final Map b(Map map, String str) {
        str.getClass();
        engw r = engw.r(str);
        r.getClass();
        return (Map) Map.EL.getOrDefault(a(map, r), str, ffem.a);
    }
}

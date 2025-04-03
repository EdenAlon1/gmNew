package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cefl {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/CmsRestoreAdditionalFieldsDelegate");
    private static final ecda d = new ecda("CmsBatchRestoreAdditionalFields");
    public final csct b;
    public final csds c;
    private final ffbr e;
    private final ffbr f;
    private final ecrj g;

    public cefl(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, csct csctVar, csds csdsVar, ecrj ecrjVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        csctVar.getClass();
        ecrjVar.getClass();
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.b = csctVar;
        this.c = csdsVar;
        this.g = ecrjVar;
    }

    public final void a(final List list, int i) {
        Optional optional;
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        int i2 = i - 1;
        ecri d2 = this.g.d();
        try {
            if (i2 != 1) {
                Object b = this.f.b();
                b.getClass();
                optional = (Optional) b;
            } else {
                Object b2 = this.e.b();
                b2.getClass();
                optional = (Optional) b2;
            }
            final ffji ffjiVar = new ffji() { // from class: cefi
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    cefl ceflVar;
                    Map map;
                    Map map2 = (Map) obj;
                    map2.getClass();
                    List list2 = list;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(list2, 10)), 16));
                    for (Object obj2 : list2) {
                        linkedHashMap.put(((cefk) obj2).a, obj2);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator it = list2.iterator();
                    while (true) {
                        ceflVar = this;
                        if (!it.hasNext()) {
                            break;
                        }
                        cefk cefkVar = (cefk) it.next();
                        Map unmodifiableMap = DesugarCollections.unmodifiableMap(cefkVar.c.b);
                        unmodifiableMap.getClass();
                        for (Map.Entry entry : unmodifiableMap.entrySet()) {
                            String str = (String) entry.getKey();
                            eyee eyeeVar = (eyee) entry.getValue();
                            str.getClass();
                            eshn eshnVar = (eshn) Enum.valueOf(eshn.class, str);
                            csdr csdrVar = (csdr) map2.get(eshnVar);
                            if (csdrVar != null) {
                                final ffji ffjiVar2 = new ffji() { // from class: cefg
                                    @Override // defpackage.ffji
                                    public final Object invoke(Object obj3) {
                                        ((csdr) obj3).getClass();
                                        return new LinkedHashMap();
                                    }
                                };
                                Object computeIfAbsent = Map.EL.computeIfAbsent(linkedHashMap2, csdrVar, new Function() { // from class: cefh
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        return ffji.this.invoke(obj3);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                computeIfAbsent.getClass();
                                ((java.util.Map) computeIfAbsent).put(cefkVar.a, eyeeVar);
                            } else {
                                ensk j = cefl.a.j();
                                j.Y(ente.a, "BugleCmsAddFields");
                                ((enrr) j.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/CmsRestoreAdditionalFieldsDelegate", "generateProviderToBatchesMap", 154, "CmsRestoreAdditionalFieldsDelegate.kt")).D("Unrecognized CmsDataProviderType. CmsDataProviderType=%s. CmsId=%s.", str, cefkVar.b);
                                ceflVar.c.b(4, eshnVar);
                                linkedHashMap2 = linkedHashMap2;
                            }
                        }
                    }
                    Iterator it2 = linkedHashMap2.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        csdr csdrVar2 = (csdr) entry2.getKey();
                        java.util.Map map3 = (java.util.Map) entry2.getValue();
                        try {
                            map = csdrVar2.e(map3);
                        } catch (Exception e) {
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(ffew.a(map3.size()));
                            Iterator it3 = map3.entrySet().iterator();
                            while (it3.hasNext()) {
                                linkedHashMap3.put(((Map.Entry) it3.next()).getKey(), e);
                            }
                            map = linkedHashMap3;
                        }
                        int size = linkedHashMap.size() - map.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            ceflVar.c.b(3, csdrVar2.a());
                        }
                        Iterator it4 = map.entrySet().iterator();
                        while (it4.hasNext()) {
                            Map.Entry entry3 = (Map.Entry) it4.next();
                            String str2 = (String) entry3.getKey();
                            Throwable th = (Throwable) entry3.getValue();
                            if (th instanceof csgo) {
                                cefk cefkVar2 = (cefk) linkedHashMap.get(str2);
                                if (cefkVar2 != null) {
                                    csgo csgoVar = (csgo) th;
                                    eshn a2 = csdrVar2.a();
                                    MessageIdType b3 = bdhb.b(str2);
                                    String name = csdrVar2.a().name();
                                    name.getClass();
                                    Iterator it5 = it4;
                                    eyhm eyhmVar = cefkVar2.c.b;
                                    eyee eyeeVar2 = eyhmVar.containsKey(name) ? (eyee) eyhmVar.get(name) : null;
                                    if (eyeeVar2 != null) {
                                        enqv it6 = csgoVar.a.iterator();
                                        it6.getClass();
                                        while (it6.hasNext()) {
                                            String str3 = cefkVar2.b;
                                            csgq csgqVar = (csgq) it6.next();
                                            eyee eyeeVar3 = eyeeVar2;
                                            csct csctVar = ceflVar.b;
                                            String a3 = csgqVar.a();
                                            a2.getClass();
                                            efbd.b();
                                            String[] strArr = bqth.a;
                                            java.util.Map map4 = map2;
                                            bqrz bqrzVar = new bqrz();
                                            bqrzVar.e(MessageIdType.a(b3));
                                            bqrzVar.d(str3);
                                            bqrzVar.c(a3);
                                            bqrzVar.b(a2);
                                            bqrzVar.g(eyeeVar3.I());
                                            bqrzVar.f(((cqoh) csctVar.a.b()).f().toEpochMilli());
                                            final bqrw a4 = bqrzVar.a();
                                            final dtve b4 = bqth.b();
                                            Long.valueOf(dtub.b(bqth.b(), "cms_restore_dependency_cache_table", a4, new Function() { // from class: bqrv
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo448andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj3) {
                                                    return Long.valueOf(dtve.this.S("cms_restore_dependency_cache_table", (ContentValues) obj3));
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            }, new Consumer() { // from class: bqrt
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void o(Object obj3) {
                                                    Long l = (Long) obj3;
                                                    if (l.longValue() >= 0) {
                                                        bqrw bqrwVar = bqrw.this;
                                                        bqrwVar.a = new bqru(l).a.longValue();
                                                        bqrwVar.fY(0);
                                                    }
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            })).longValue();
                                            ensk h = cefl.a.h();
                                            h.Y(ente.a, "BugleCmsAddFields");
                                            enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/CmsRestoreAdditionalFieldsDelegate", "handleBugleDependencyMissingException", 283, "CmsRestoreAdditionalFieldsDelegate.kt");
                                            String messageIdType = b3.toString();
                                            String a5 = csgqVar.a();
                                            eshn eshnVar2 = a2;
                                            enrrVar.K("Dependency inserted into RestoreDependencyCache. CmsDataProviderType=%s MsgCmsId=%s MsgBugleId=%s DependencyCmsId=%s", eshnVar2, str3, messageIdType, a5);
                                            a2 = eshnVar2;
                                            eyeeVar2 = eyeeVar3;
                                            map2 = map4;
                                            list2 = list2;
                                            it2 = it2;
                                        }
                                        ceflVar.c.b(5, a2);
                                        it4 = it5;
                                        map2 = map2;
                                    } else {
                                        it4 = it5;
                                    }
                                }
                            } else {
                                Iterator it7 = it4;
                                java.util.Map map5 = map2;
                                List list3 = list2;
                                Iterator it8 = it2;
                                cefk cefkVar3 = (cefk) linkedHashMap.get(str2);
                                if (cefkVar3 != null) {
                                    ensk i4 = cefl.a.i();
                                    i4.Y(ente.a, "BugleCmsAddFields");
                                    ((enrr) ((enrr) i4).g(th).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/CmsRestoreAdditionalFieldsDelegate", "restoreDataForProviderAndHandleResult", 124, "CmsRestoreAdditionalFieldsDelegate.kt")).D("Unable to restore data from CmsDataProvider. CmsDataProviderType=%s. cmsId=%s.", csdrVar2.a().name(), cefkVar3.b);
                                    ceflVar.c.b(6, csdrVar2.a());
                                }
                                it4 = it7;
                                map2 = map5;
                                list2 = list3;
                                it2 = it8;
                            }
                        }
                    }
                    List list4 = list2;
                    ensk h2 = cefl.a.h();
                    h2.Y(ente.a, "BugleCmsAddFields");
                    enrr enrrVar2 = (enrr) h2.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/CmsRestoreAdditionalFieldsDelegate", "restoreAdditionalFields$lambda$4", 71, "CmsRestoreAdditionalFieldsDelegate.kt");
                    Collection values = map2.values();
                    ArrayList arrayList = new ArrayList(ffdx.n(values, 10));
                    Iterator it9 = values.iterator();
                    while (it9.hasNext()) {
                        arrayList.add(((csdr) it9.next()).a());
                    }
                    enrrVar2.J("Data processed from AdditionalFields. CmsDataProviderTypes=%s. BugleDbIds=%s. CmsIds=%s.", ffdx.aA(arrayList, ",", null, null, null, 62), ffdx.aA(list4, ",", null, null, new ffji() { // from class: cefe
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj3) {
                            cefk cefkVar4 = (cefk) obj3;
                            cefkVar4.getClass();
                            return cefkVar4.a;
                        }
                    }, 30), ffdx.aA(list4, ",", null, null, new ffji() { // from class: ceff
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj3) {
                            cefk cefkVar4 = (cefk) obj3;
                            cefkVar4.getClass();
                            return cefkVar4.b;
                        }
                    }, 30));
                    return ffcu.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: cefj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ffji.this.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } finally {
            this.g.f(d2, d, null, ecrh.SUCCESS);
        }
    }

    public final void b(eshh eshhVar, String str, String str2, int i) {
        eshhVar.getClass();
        str.getClass();
        if (str2 == null || str2.length() == 0) {
            return;
        }
        a(ffdx.b(new cefk(str, str2, eshhVar)), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(String str) {
        if (str == null) {
            return;
        }
        engw r = engw.r(str);
        r.getClass();
        enqv it = csct.a(r).iterator();
        it.getClass();
        while (it.hasNext()) {
            bqrw bqrwVar = (bqrw) it.next();
            long k = bqrwVar.k();
            String m = bqrwVar.m();
            m.getClass();
            eshf eshfVar = (eshf) eshh.a.createBuilder();
            eshfVar.a(bqrwVar.l().name(), eyee.x(bqrwVar.n()));
            eyfy build = eshfVar.build();
            build.getClass();
            b((eshh) build, String.valueOf(k), m, 2);
        }
    }
}

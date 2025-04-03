package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.DesugarCollections;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csft implements csdr {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/cloudstore/completeness/userreference/UserReferenceCmsDataProvider");

    public csft(ffbr ffbrVar) {
        ffbrVar.getClass();
    }

    @Override // defpackage.csdr
    public final eshn a() {
        return eshn.USER_REFERENCE;
    }

    @Override // defpackage.csdr
    public final List b() {
        return ffel.a;
    }

    @Override // defpackage.csdr
    public final List c() {
        return ffel.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.csdr
    public final Map d(final List list) {
        if (!((Boolean) ((cfup) csgj.H.get()).e()).booleanValue()) {
            return ffem.a;
        }
        String[] strArr = bytk.a;
        byth bythVar = new byth(bytk.a);
        bythVar.z("userReferenceCmsDataProvider#getData");
        bythVar.d(new Function() { // from class: csfs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List list2 = list;
                bytj bytjVar = (bytj) obj;
                ArrayList arrayList = new ArrayList(ffdx.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(bdhb.b((String) it.next()));
                }
                engr engrVar = new engr();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    engrVar.h(String.valueOf(bdhb.a((MessageIdType) it2.next())));
                }
                bytjVar.aq(new dtrw("user_references.message_id", 3, bytj.at(engrVar.g()), true));
                return bytjVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bvvn e = ParticipantsTable.e();
        e.c(ParticipantsTable.c.E);
        dtvy i = dtvz.i(e.b(), ParticipantsTable.c.a, bytk.c.c);
        ((dtrd) i).e = "joined_participants";
        bythVar.G(i.g());
        engw y = bythVar.b().y();
        y.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        enqv it = y.iterator();
        while (it.hasNext()) {
            E next = it.next();
            MessageIdType m = ((bysc) next).m();
            Object obj = linkedHashMap.get(m);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(m, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            MessageIdType messageIdType = (MessageIdType) entry.getKey();
            List<bysc> list2 = (List) entry.getValue();
            String b = messageIdType.b();
            csfo csfoVar = (csfo) csfp.a.createBuilder();
            csfoVar.getClass();
            for (bysc byscVar : list2) {
                String valueOf = String.valueOf(byscVar.k());
                dtro[] aG = byscVar.aG("joined_participants", new ParticipantsTable.BindData[0]);
                aG.getClass();
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ffdo.H(aG);
                String L = bindData != null ? bindData.L() : null;
                if (L == null) {
                    ensk j = a.j();
                    j.Y(ente.a, "BugleCmsAddFields");
                    enrr enrrVar = (enrr) j;
                    enrrVar.Y(cdii.c, valueOf);
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/userreference/UserReferenceCmsDataProvider", "getData", 141, "UserReferenceCmsDataProvider.kt")).q("Could not find cmsId for participant.");
                } else {
                    DesugarCollections.unmodifiableList(((csfp) csfoVar.instance).b).getClass();
                    csfm csfmVar = (csfm) csfn.a.createBuilder();
                    csfmVar.getClass();
                    csfmVar.copyOnWrite();
                    ((csfn) csfmVar.instance).b = L;
                    long l = byscVar.l();
                    csfmVar.copyOnWrite();
                    ((csfn) csfmVar.instance).c = l;
                    eyfy build = csfmVar.build();
                    build.getClass();
                    csfn csfnVar = (csfn) build;
                    csfoVar.copyOnWrite();
                    csfp csfpVar = (csfp) csfoVar.instance;
                    eygr eygrVar = csfpVar.b;
                    if (!eygrVar.c()) {
                        csfpVar.b = eyfy.mutableCopy(eygrVar);
                    }
                    csfpVar.b.add(csfnVar);
                }
            }
            eyfy build2 = csfoVar.build();
            build2.getClass();
            arrayList.add(new ffcf(b, new ffch(((csfp) build2).toByteString())));
        }
        return ffew.k(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.csdr
    public final Map e(Map map) {
        bysc a2;
        map.getClass();
        if (!((Boolean) ((cfup) csgj.H.get()).e()).booleanValue()) {
            return ffem.a;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            try {
                csfp csfpVar = (csfp) eyfy.parseFrom(csfp.a, (eyee) entry.getValue());
                csfpVar.getClass();
                linkedHashMap.put(str, csfpVar);
            } catch (eygu e) {
                linkedHashMap2.put(str, e);
            }
        }
        bvvn e2 = ParticipantsTable.e();
        e2.z("restoreDataInTransaction-1");
        e2.h(new Function() { // from class: csfq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                Collection values = linkedHashMap.values();
                ArrayList arrayList = new ArrayList();
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    eygr eygrVar = ((csfp) it.next()).b;
                    eygrVar.getClass();
                    ArrayList arrayList2 = new ArrayList(ffdx.n(eygrVar, 10));
                    Iterator<E> it2 = eygrVar.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((csfn) it2.next()).b);
                    }
                    ffdx.w(arrayList, arrayList2);
                }
                bvvwVar.e(arrayList);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e2.e(new Function() { // from class: csfr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvtg bvtgVar = (bvtg) obj;
                return new bvth[]{bvtgVar.a, bvtgVar.E};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = e2.b().y();
        y.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(y, 10)), 16));
        enqv it = y.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            ffcf ffcfVar = new ffcf(bindData.L(), bindData.S());
            linkedHashMap3.put(ffcfVar.a, ffcfVar.b);
        }
        Set<Map.Entry> entrySet = linkedHashMap.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : entrySet) {
            String str2 = (String) entry2.getKey();
            eygr<csfn> eygrVar = ((csfp) entry2.getValue()).b;
            eygrVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (csfn csfnVar : eygrVar) {
                String str3 = (String) linkedHashMap3.get(csfnVar.b);
                if (str3 == null) {
                    ensk j = a.j();
                    j.Y(ente.a, "BugleCmsAddFields");
                    enrr enrrVar = (enrr) j;
                    enrrVar.Y(cdii.g, csfnVar.b);
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/userreference/UserReferenceCmsDataProvider", "restoreDataInTransaction", 230, "UserReferenceCmsDataProvider.kt")).q("Could not find bugleId for participant.");
                    a2 = null;
                } else {
                    String[] strArr = bytk.a;
                    bysf bysfVar = new bysf();
                    bysfVar.c(bdhb.b(str2));
                    bysfVar.d(Long.parseLong(str3));
                    bysfVar.e(csfnVar.c);
                    a2 = bysfVar.a();
                }
                if (a2 != null) {
                    arrayList2.add(a2);
                }
            }
            ffdx.w(arrayList, arrayList2);
        }
        bysc[] byscVarArr = (bysc[]) arrayList.toArray(new bysc[0]);
        try {
            dtub.A(bytk.b(), 5, false, new BiConsumer() { // from class: byrx
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    bysc byscVar = (bysc) obj;
                    final Long l = (Long) obj2;
                    String[] strArr2 = bytk.a;
                    if (l.longValue() >= 0) {
                        byscVar.a = (String) new dtuj() { // from class: byrw
                            @Override // defpackage.dtuj
                            public final Object a() {
                                String[] strArr3 = bytk.a;
                                return String.valueOf(l);
                            }
                        }.a();
                        byscVar.fY(0);
                    }
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            }, (bysc[]) Arrays.copyOf(byscVarArr, byscVarArr.length));
        } catch (Exception e3) {
            ensk j2 = a.j();
            j2.Y(ente.a, "BugleCmsAddFields");
            ((enrr) ((enrr) j2).g(e3).h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/userreference/UserReferenceCmsDataProvider", "restoreDataInTransaction", 246, "UserReferenceCmsDataProvider.kt")).q("Bulk insert of user reference data failed.");
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(ffew.a(map.size()));
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                linkedHashMap4.put(((Map.Entry) it2.next()).getKey(), e3);
            }
            linkedHashMap2.putAll(linkedHashMap4);
        }
        return linkedHashMap2;
    }
}

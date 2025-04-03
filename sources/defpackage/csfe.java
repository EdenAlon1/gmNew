package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csfe implements csdr {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/cloudstore/completeness/readreports/ReadReportsCmsDataProvider");
    private final axkm b;
    private final cctp c;
    private final ashh d;

    public csfe(ffbr ffbrVar, axkm axkmVar, cctp cctpVar, ashh ashhVar) {
        ffbrVar.getClass();
        axkmVar.getClass();
        cctpVar.getClass();
        ashhVar.getClass();
        this.b = axkmVar;
        this.c = cctpVar;
        this.d = ashhVar;
    }

    @Override // defpackage.csdr
    public final eshn a() {
        return eshn.READ_REPORTS;
    }

    @Override // defpackage.csdr
    public final List b() {
        if (this.b.al()) {
            bech a2 = this.c.b(14, becg.INSERT).a(1, "message_id");
            a2.f = 5;
            a2.g = ccrk.a(6);
            return ffdx.b(a2.a());
        }
        bech bechVar = new bech();
        bechVar.c = becg.INSERT;
        bechVar.e = 32;
        bechVar.b = 14;
        bechVar.i = "message_id";
        bechVar.f = 5;
        bechVar.c();
        bechVar.g = ccrk.a(6);
        bechVar.h = this.d.a();
        return ffdx.b(bechVar.a());
    }

    @Override // defpackage.csdr
    public final List c() {
        return ffdx.b(this.c.c(14, becg.INSERT));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.csdr
    public final Map d(final List list) {
        bwvt b = bwvy.b();
        b.z("readReportsCmsDataProvider#getReadReportsDatas");
        b.d(new Function() { // from class: csfd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List list2 = list;
                bwvx bwvxVar = (bwvx) obj;
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
                bwvxVar.aq(new dtrw("read_reports.message_id", 3, bwvx.at(engrVar.g()), true));
                return bwvxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bvvn e = ParticipantsTable.e();
        e.c(ParticipantsTable.c.E);
        dtvy i = dtvz.i(e.b(), ParticipantsTable.c.a, bwvy.c.c);
        ((dtrd) i).e = "joined_participants";
        b.G(i.g());
        engw y = b.b().y();
        y.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        enqv it = y.iterator();
        while (it.hasNext()) {
            E next = it.next();
            String messageIdType = ((bwuo) next).n().toString();
            Object obj = linkedHashMap.get(messageIdType);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(messageIdType, obj);
            }
            ((List) obj).add(next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            csfa csfaVar = (csfa) csfb.a.createBuilder();
            csfaVar.getClass();
            for (Object obj2 : (List) entry.getValue()) {
                obj2.getClass();
                bwuo bwuoVar = (bwuo) obj2;
                dtro[] aG = bwuoVar.aG("joined_participants", new ParticipantsTable.BindData[0]);
                aG.getClass();
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ffdo.H(aG);
                String L = bindData != null ? bindData.L() : null;
                if (L == null) {
                    ensk j = a.j();
                    j.Y(ente.a, "BugleCmsAddFields");
                    ((enrr) j.h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/readreports/ReadReportsCmsDataProvider", "getData", 158, "ReadReportsCmsDataProvider.kt")).D("Read reports could not find cmsId for participant. BugleParticipantId: %s, MessageId: %s", String.valueOf(bwuoVar.k()), entry.getKey());
                } else {
                    csey cseyVar = (csey) csez.a.createBuilder();
                    cseyVar.getClass();
                    cseyVar.copyOnWrite();
                    ((csez) cseyVar.instance).b = L;
                    long m = bwuoVar.m();
                    cseyVar.copyOnWrite();
                    ((csez) cseyVar.instance).c = m;
                    long l = bwuoVar.l();
                    cseyVar.copyOnWrite();
                    ((csez) cseyVar.instance).d = l;
                    long a2 = bdhe.a(bwuoVar.q());
                    cseyVar.copyOnWrite();
                    ((csez) cseyVar.instance).e = a2;
                    eyfy build = cseyVar.build();
                    build.getClass();
                    csez csezVar = (csez) build;
                    csfaVar.copyOnWrite();
                    csfb csfbVar = (csfb) csfaVar.instance;
                    eygr eygrVar = csfbVar.b;
                    if (!eygrVar.c()) {
                        csfbVar.b = eyfy.mutableCopy(eygrVar);
                    }
                    csfbVar.b.add(csezVar);
                }
            }
            if (((csfb) csfaVar.instance).b.size() > 0) {
                Object key = entry.getKey();
                key.getClass();
                linkedHashMap2.put(key, new ffch(((csfb) csfaVar.build()).toByteString()));
            }
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.csdr
    public final Map e(Map map) {
        map.getClass();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            try {
                linkedHashMap.put(str, (csfb) eyfy.parseFrom(csfb.a, (eyee) entry.getValue()));
            } catch (eygu e) {
                linkedHashMap2.put(str, e);
            }
        }
        bvvn e2 = ParticipantsTable.e();
        e2.z("readReportsCmsDataProvider#getBugleParticipantIds");
        bvtg bvtgVar = ParticipantsTable.c;
        e2.c(bvtgVar.a, bvtgVar.E);
        e2.h(new Function() { // from class: csfc
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
                    eygr eygrVar = ((csfb) it.next()).b;
                    eygrVar.getClass();
                    ArrayList arrayList2 = new ArrayList(ffdx.n(eygrVar, 10));
                    Iterator<E> it2 = eygrVar.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((csez) it2.next()).b);
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
        engw y = e2.b().y();
        y.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(y, 10)), 16));
        enqv it = y.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            linkedHashMap3.put(bindData.L(), bindData.S());
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            for (csez csezVar : ((csfb) entry2.getValue()).b) {
                String str2 = (String) linkedHashMap3.get(csezVar.b);
                if (str2 != null && !ffpc.J(str2)) {
                    String[] strArr = bwvy.a;
                    bwur bwurVar = new bwur();
                    bwurVar.d(bdhb.b((String) entry2.getKey()));
                    bwurVar.e(Long.parseLong(str2));
                    bwurVar.g(csezVar.c);
                    bwurVar.f(csezVar.d);
                    bwurVar.b(bdhe.b(csezVar.e));
                    arrayList.add(bwurVar.a());
                }
            }
        }
        try {
            bwuo[] bwuoVarArr = (bwuo[]) arrayList.toArray(new bwuo[0]);
            dtub.A(bwvy.c(), 5, false, new BiConsumer() { // from class: bwub
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    bwuo bwuoVar = (bwuo) obj;
                    final Long l = (Long) obj2;
                    String[] strArr2 = bwvy.a;
                    if (l.longValue() >= 0) {
                        bwuoVar.a = (String) new dtuj() { // from class: bwuc
                            @Override // defpackage.dtuj
                            public final Object a() {
                                String[] strArr3 = bwvy.a;
                                return String.valueOf(l);
                            }
                        }.a();
                        bwuoVar.fY(0);
                    }
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            }, (bwuo[]) Arrays.copyOf(bwuoVarArr, bwuoVarArr.length));
        } catch (Exception e3) {
            ensk j = a.j();
            j.Y(ente.a, "BugleCmsAddFields");
            ((enrr) ((enrr) j).g(e3).h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/readreports/ReadReportsCmsDataProvider", "restoreDataInTransaction", 249, "ReadReportsCmsDataProvider.kt")).q("Bulk insert of read reports data failed.");
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

package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csex implements csdr {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/cloudstore/completeness/messagestar/MessageStarCmsDataProvider");
    private final axkm b;
    private final cctp c;
    private final ashh d;

    public csex(axkm axkmVar, cctp cctpVar, ashh ashhVar) {
        axkmVar.getClass();
        cctpVar.getClass();
        ashhVar.getClass();
        this.b = axkmVar;
        this.c = cctpVar;
        this.d = ashhVar;
    }

    @Override // defpackage.csdr
    public final eshn a() {
        return eshn.MESSAGE_STAR;
    }

    @Override // defpackage.csdr
    public final List b() {
        ArrayList arrayList = new ArrayList();
        if (this.b.al()) {
            bech a2 = this.c.b(12, becg.INSERT).a(1, "message_id");
            a2.f = 5;
            a2.g = ccrk.a(6);
            arrayList.add(a2.a());
            bech a3 = this.c.b(12, becg.DELETE).a(1, "message_id");
            a3.f = 5;
            a3.g = ccrk.a(6);
            arrayList.add(a3.a());
            return arrayList;
        }
        bech bechVar = new bech();
        bechVar.c = becg.INSERT;
        bechVar.e = 32;
        bechVar.b = 12;
        bechVar.i = "message_id";
        bechVar.f = 5;
        bechVar.c();
        bechVar.g = ccrk.a(6);
        bechVar.h = this.d.a();
        arrayList.add(bechVar.a());
        bech bechVar2 = new bech();
        bechVar2.c = becg.DELETE;
        bechVar2.e = 32;
        bechVar2.b = 12;
        bechVar2.i = "message_id";
        bechVar2.f = 5;
        bechVar2.c();
        bechVar2.g = ccrk.a(6);
        bechVar2.h = this.d.a();
        arrayList.add(bechVar2.a());
        return arrayList;
    }

    @Override // defpackage.csdr
    public final List c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.c.c(12, becg.INSERT));
        arrayList.add(this.c.c(12, becg.DELETE));
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.csdr
    public final Map d(List list) {
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(bdhb.b((String) it.next()));
        }
        final List ak = ffdx.ak(arrayList);
        String[] strArr = bumm.a;
        bumh bumhVar = new bumh(bumm.a);
        bumhVar.z("batchGetMessageStarData");
        bumhVar.e(new Function() { // from class: csew
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buml bumlVar = (buml) obj;
                engr engrVar = new engr();
                Iterator it2 = ak.iterator();
                while (it2.hasNext()) {
                    engrVar.h(String.valueOf(bdhb.a((MessageIdType) it2.next())));
                }
                bumlVar.aq(new dtrw("message_star.message_id", 3, buml.at(engrVar.g()), true));
                return bumlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = bumhVar.b().y();
        y.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(y, 10)), 16));
        enqv it2 = y.iterator();
        while (it2.hasNext()) {
            String messageIdType = ((bulm) it2.next()).k().toString();
            messageIdType.getClass();
            cseu cseuVar = (cseu) csev.a.createBuilder();
            cseuVar.getClass();
            cseuVar.copyOnWrite();
            ((csev) cseuVar.instance).b = true;
            eyfy build = cseuVar.build();
            build.getClass();
            linkedHashMap.put(messageIdType, new ffch(((csev) build).toByteString()));
        }
        return linkedHashMap;
    }

    @Override // defpackage.csdr
    public final Map e(Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            try {
                csev csevVar = (csev) eyfy.parseFrom(csev.a, (eyee) entry.getValue());
                csevVar.getClass();
                if (csevVar.b) {
                    linkedHashMap.put(str, csevVar);
                }
            } catch (eygu e) {
                linkedHashMap2.put(str, e);
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String[] strArr = bumm.a;
            bulp bulpVar = new bulp();
            bulpVar.b(bdhb.b((String) entry2.getKey()));
            arrayList.add(bulpVar.a());
        }
        bulm[] bulmVarArr = (bulm[]) arrayList.toArray(new bulm[0]);
        try {
            dtub.A(bumm.a(), 5, false, new BiConsumer() { // from class: bulg
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    bulm bulmVar = (bulm) obj;
                    Long l = (Long) obj2;
                    String[] strArr2 = bumm.a;
                    if (l.longValue() >= 0) {
                        bulmVar.a = new bulh(l).a.longValue();
                        bulmVar.fY(0);
                    }
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            }, (bulm[]) Arrays.copyOf(bulmVarArr, bulmVarArr.length));
        } catch (Exception e2) {
            ensk j = a.j();
            j.Y(ente.a, "BugleCmsAddFields");
            ((enrr) ((enrr) j).g(e2).h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/messagestar/MessageStarCmsDataProvider", "restoreDataInTransaction", 174, "MessageStarCmsDataProvider.kt")).q("Bulk insert of message star data failed.");
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(ffew.a(map.size()));
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                linkedHashMap3.put(((Map.Entry) it.next()).getKey(), e2);
            }
            linkedHashMap2.putAll(linkedHashMap3);
        }
        return linkedHashMap2;
    }
}

package defpackage;

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
public final class csea implements csdr {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/cloudstore/completeness/conversationpin/ConversationPinCmsDataProvider");
    private final axkm b;
    private final cctp c;
    private final ashh d;

    public csea(axkm axkmVar, cctp cctpVar, ashh ashhVar) {
        axkmVar.getClass();
        cctpVar.getClass();
        ashhVar.getClass();
        this.b = axkmVar;
        this.c = cctpVar;
        this.d = ashhVar;
    }

    @Override // defpackage.csdr
    public final eshn a() {
        return eshn.CONVERSATION_PIN;
    }

    @Override // defpackage.csdr
    public final List b() {
        if (this.b.al()) {
            bech a2 = this.c.b(15, becg.INSERT).a(2, "conversation_id");
            a2.f = 2;
            a2.g = ccue.a(65);
            String a3 = a2.a();
            bech a4 = this.c.b(15, becg.DELETE).a(2, "conversation_id");
            a4.f = 2;
            a4.g = ccue.a(65);
            return ffdx.g(a3, a4.a());
        }
        bech bechVar = new bech();
        bechVar.c = becg.INSERT;
        bechVar.e = 32;
        bechVar.b = 15;
        bechVar.i = "conversation_id";
        bechVar.f = 2;
        bechVar.c();
        bechVar.g = ccue.a(65);
        bechVar.h = this.d.a();
        String a5 = bechVar.a();
        bech bechVar2 = new bech();
        bechVar2.c = becg.DELETE;
        bechVar2.e = 32;
        bechVar2.b = 15;
        bechVar2.i = "conversation_id";
        bechVar2.f = 2;
        bechVar2.c();
        bechVar2.g = ccue.a(65);
        bechVar2.h = this.d.a();
        return ffdx.g(a5, bechVar2.a());
    }

    @Override // defpackage.csdr
    public final List c() {
        return ffdx.g(this.c.c(15, becg.INSERT), this.c.c(15, becg.DELETE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.csdr
    public final Map d(List list) {
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(bdgq.b((String) it.next()));
        }
        final List ak = ffdx.ak(arrayList);
        String[] strArr = bryh.a;
        brye bryeVar = new brye(bryh.a);
        bryeVar.z("ConversationPinCmsDataProvider#batchGetData");
        bryeVar.d(new Function() { // from class: csdy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bryg brygVar = (bryg) obj;
                brygVar.c(ak);
                return brygVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bryeVar.d(new Function() { // from class: csdz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bryg brygVar = (bryg) obj;
                brygVar.aq(new dtwe("conversation_pin.pin_status", 1, 1));
                return brygVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = bryeVar.b().y();
        y.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(y, 10)), 16));
        enqv it2 = y.iterator();
        while (it2.hasNext()) {
            String conversationIdType = ((brxg) it2.next()).k().toString();
            conversationIdType.getClass();
            csdw csdwVar = (csdw) csdx.a.createBuilder();
            csdwVar.getClass();
            csdwVar.copyOnWrite();
            ((csdx) csdwVar.instance).b = true;
            eyfy build = csdwVar.build();
            build.getClass();
            linkedHashMap.put(conversationIdType, new ffch(((csdx) build).toByteString()));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.csdr
    public final Map e(Map map) {
        map.getClass();
        String[] strArr = bryh.a;
        brye bryeVar = new brye(bryh.a);
        bryeVar.c(bryh.c.b);
        bryeVar.z("ConversationPinCmsDataProvider#restoreDataInTransaction#batched#queryCount");
        engw y = bryeVar.b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
        enqv it = y.iterator();
        while (it.hasNext()) {
            arrayList.add(((brxg) it.next()).k().a());
        }
        enip f = engq.f(arrayList);
        int intValue = ((Number) ajhl.a.e()).intValue() - f.size();
        if (intValue <= 0) {
            ensk h = a.h();
            h.Y(ente.a, "BugleCmsAddFields");
            ((enrr) h.h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/conversationpin/ConversationPinCmsDataProvider", "restoreDataInTransaction", 165, "ConversationPinCmsDataProvider.kt")).r("Pin limit (%s) reached, skipping restore of conversation pin data.", intValue);
            return ffem.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            try {
                csdx csdxVar = (csdx) eyfy.parseFrom(csdx.a, (eyee) entry.getValue());
                csdxVar.getClass();
                if (csdxVar.b && !f.contains(str)) {
                    linkedHashMap.put(str, csdxVar);
                }
            } catch (eygu e) {
                linkedHashMap2.put(str, e);
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str2 = (String) entry2.getKey();
            csdx csdxVar2 = (csdx) entry2.getValue();
            brxj brxjVar = new brxj();
            brxjVar.b(bdgq.b(str2));
            brxjVar.c(csdxVar2.b);
            arrayList2.add(brxjVar.a());
        }
        brxg[] brxgVarArr = (brxg[]) ffdx.ai(arrayList2, intValue).toArray(new brxg[0]);
        try {
            dtub.A(bryh.a(), 4, false, new BiConsumer() { // from class: brxb
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    brxg brxgVar = (brxg) obj;
                    Long l = (Long) obj2;
                    String[] strArr2 = bryh.a;
                    if (l.longValue() >= 0) {
                        brxgVar.a = new brxa(l).a.longValue();
                        brxgVar.fY(0);
                    }
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            }, (brxg[]) Arrays.copyOf(brxgVarArr, brxgVarArr.length));
        } catch (Exception e2) {
            ensk j = a.j();
            j.Y(ente.a, "BugleCmsAddFields");
            ((enrr) ((enrr) j).g(e2).h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/conversationpin/ConversationPinCmsDataProvider", "restoreDataInTransaction", 208, "ConversationPinCmsDataProvider.kt")).q("Bulk insert of conversation pin data failed.");
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(ffew.a(map.size()));
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                linkedHashMap3.put(((Map.Entry) it2.next()).getKey(), e2);
            }
            linkedHashMap2.putAll(linkedHashMap3);
        }
        return linkedHashMap2;
    }
}

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
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csei implements csdr {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/cloudstore/completeness/messagecaptions/MessageCaptionsCmsDataProvider");

    @Override // defpackage.csdr
    public final eshn a() {
        return eshn.MESSAGE_CAPTIONS;
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
        Object apply;
        String[] strArr = btul.a;
        btui btuiVar = new btui(btul.a);
        btuiVar.z("getData");
        apply = new Function() { // from class: cseh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List list2 = list;
                btuk btukVar = (btuk) obj;
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
                btukVar.aq(new dtrw("message_captions.message_id", 3, btuk.at(engrVar.g()), true));
                return btukVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new btuk());
        btuiVar.k(new btuj((btuk) apply));
        btuiVar.z("MessageCaptionsCmsDataProvider#getData#batched");
        engw y = btuiVar.b().y();
        y.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(y, 10)), 16));
        enqv it = y.iterator();
        while (it.hasNext()) {
            bttn bttnVar = (bttn) it.next();
            bttnVar.az(0, "message_id");
            String b = bttnVar.a.b();
            csef csefVar = (csef) cseg.a.createBuilder();
            csefVar.getClass();
            String k = bttnVar.k();
            k.getClass();
            csefVar.copyOnWrite();
            cseg csegVar = (cseg) csefVar.instance;
            csegVar.b |= 1;
            csegVar.c = k;
            eyfy build = csefVar.build();
            build.getClass();
            ffcf ffcfVar = new ffcf(b, new ffch(((cseg) build).toByteString()));
            linkedHashMap.put(ffcfVar.a, ffcfVar.b);
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
                cseg csegVar = (cseg) eyfy.parseFrom(cseg.a, (eyee) entry.getValue());
                csegVar.getClass();
                if ((csegVar.b & 1) != 0) {
                    linkedHashMap.put(str, csegVar);
                }
            } catch (eygu e) {
                linkedHashMap2.put(str, e);
            }
        }
        Set<Map.Entry> entrySet = linkedHashMap.entrySet();
        ArrayList arrayList = new ArrayList(ffdx.n(entrySet, 10));
        for (Map.Entry entry2 : entrySet) {
            String str2 = (String) entry2.getKey();
            cseg csegVar2 = (cseg) entry2.getValue();
            String[] strArr = btul.a;
            bttq bttqVar = new bttq();
            bttqVar.c(bdhb.b(str2));
            bttqVar.b(csegVar2.c);
            arrayList.add(bttqVar.a());
        }
        bttn[] bttnVarArr = (bttn[]) arrayList.toArray(new bttn[0]);
        try {
            dtub.A(btul.a(), 5, false, new BiConsumer() { // from class: bttj
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    String[] strArr2 = btul.a;
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            }, (bttn[]) Arrays.copyOf(bttnVarArr, bttnVarArr.length));
        } catch (Exception e2) {
            ensk j = a.j();
            j.Y(ente.a, "BugleCmsAddFields");
            ((enrr) ((enrr) j).g(e2).h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/messagecaptions/MessageCaptionsCmsDataProvider", "restoreDataInTransaction", 102, "MessageCaptionsCmsDataProvider.kt")).q("Bulk insert of message caption data failed.");
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

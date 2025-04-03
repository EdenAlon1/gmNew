package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
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
public final class cset implements csdr {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/cloudstore/completeness/messagereplies/MessageRepliesCmsDataProvider");
    private final axkm b;
    private final cctp c;
    private final ashh d;

    public cset(ffbr ffbrVar, axkm axkmVar, cctp cctpVar, ashh ashhVar) {
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
        return eshn.MESSAGE_REPLIES;
    }

    @Override // defpackage.csdr
    public final List b() {
        if (this.b.al()) {
            bech a2 = this.c.b(13, becg.UPDATE).a(1, "message_id");
            a2.f = 5;
            a2.d = engw.r("replied_to_message_id");
            a2.g = ccrk.a(6);
            return ffdx.b(a2.a());
        }
        bech bechVar = new bech();
        bechVar.c = becg.UPDATE;
        bechVar.e = 32;
        bechVar.b = 13;
        bechVar.d = enkr.c("replied_to_message_id");
        bechVar.i = "message_id";
        bechVar.f = 5;
        bechVar.c();
        bechVar.g = ccrk.a(6);
        bechVar.h = this.d.a();
        return ffdx.b(bechVar.a());
    }

    @Override // defpackage.csdr
    public final List c() {
        return ffdx.b(this.c.c(13, becg.UPDATE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.csdr
    public final Map d(final List list) {
        Object byteString;
        String[] strArr = bufy.a;
        bufs bufsVar = new bufs(bufy.a);
        bufsVar.z("getData");
        bufsVar.e(new Function() { // from class: cseq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List list2 = list;
                bufx bufxVar = (bufx) obj;
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
                bufxVar.aq(new dtrw("message_replies.message_id", 3, bufx.at(engrVar.g()), true));
                return bufxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxo d = MessagesTable.d();
        d.c(MessagesTable.c.M);
        dtvy i = dtvz.i(d.b(), MessagesTable.c.a, bufy.c.b);
        ((dtrd) i).e = "joined_messages";
        bufsVar.G(i.g());
        bufsVar.z("MessageRepliesCmsDataProvider#getData#batched");
        engw y = bufsVar.b().y();
        y.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(y, 10)), 16));
        enqv it = y.iterator();
        while (it.hasNext()) {
            bueo bueoVar = (bueo) it.next();
            dtro[] aG = bueoVar.aG("joined_messages", new MessagesTable.BindData[0]);
            aG.getClass();
            MessagesTable.BindData bindData = (MessagesTable.BindData) ffdo.H(aG);
            String R = bindData != null ? bindData.R() : null;
            String b = bueoVar.l().b();
            if (bindData == null || R != null) {
                cseo cseoVar = (cseo) csep.a.createBuilder();
                cseoVar.getClass();
                if (R != null) {
                    cseoVar.copyOnWrite();
                    csep csepVar = (csep) cseoVar.instance;
                    csepVar.b |= 1;
                    csepVar.c = R;
                }
                ajrb k = bueoVar.k();
                k.getClass();
                cseoVar.copyOnWrite();
                csep csepVar2 = (csep) cseoVar.instance;
                csepVar2.d = k.a();
                csepVar2.b |= 2;
                bueoVar.az(3, "replied_to_rcs_message_id");
                String d2 = bdhg.d(bueoVar.d);
                if (d2 != null) {
                    cseoVar.copyOnWrite();
                    csep csepVar3 = (csep) cseoVar.instance;
                    csepVar3.b |= 4;
                    csepVar3.e = d2;
                }
                eyfy build = cseoVar.build();
                build.getClass();
                byteString = ((csep) build).toByteString();
            } else {
                MessageIdType m = bueoVar.m();
                m.getClass();
                byteString = ffci.a(csdv.a(m));
            }
            ffcf ffcfVar = new ffcf(b, new ffch(byteString));
            linkedHashMap.put(ffcfVar.a, ffcfVar.b);
        }
        return linkedHashMap;
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
                linkedHashMap.put(str, (csep) eyfy.parseFrom(csep.a, (eyee) entry.getValue()));
            } catch (eygu e) {
                linkedHashMap2.put(str, e);
            }
        }
        buxo d = MessagesTable.d();
        d.z("cmsIdToRepliedToBugleId");
        d.h(new Function() { // from class: cser
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                Collection values = linkedHashMap.values();
                ArrayList arrayList = new ArrayList(ffdx.n(values, 10));
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    arrayList.add(((csep) it.next()).c);
                }
                buxzVar.g(arrayList);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.e(new Function() { // from class: cses
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buum buumVar = (buum) obj;
                return new buun[]{buumVar.a, buumVar.M};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.z("MessageRepliesCmsDataProvider#restoreDataInTransaction");
        engw y = d.b().y();
        y.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(y, 10)), 16));
        enqv it = y.iterator();
        while (it.hasNext()) {
            MessagesTable.BindData bindData = (MessagesTable.BindData) it.next();
            ffcf ffcfVar = new ffcf(bindData.R(), bindData.D().b());
            linkedHashMap3.put(ffcfVar.a, ffcfVar.b);
        }
        Set entrySet = linkedHashMap.entrySet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = entrySet.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Map.Entry entry2 = (Map.Entry) next;
            String str2 = (String) entry2.getKey();
            if ((((csep) entry2.getValue()).b & 1) != 0) {
                Set keySet = linkedHashMap3.keySet();
                csep csepVar = (csep) linkedHashMap.get(str2);
                if (!keySet.contains(csepVar != null ? csepVar.c : null)) {
                    arrayList.add(next);
                }
            }
            arrayList2.add(next);
        }
        ffcf ffcfVar2 = new ffcf(arrayList, arrayList2);
        List list = (List) ffcfVar2.a;
        List<Map.Entry> list2 = (List) ffcfVar2.b;
        ArrayList arrayList3 = new ArrayList(ffdx.n(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add((String) ((Map.Entry) it3.next()).getKey());
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(arrayList3, 10)), 16));
        for (Object obj : arrayList3) {
            csep csepVar2 = (csep) linkedHashMap.get((String) obj);
            engw r = engw.r(new csgn(csepVar2 != null ? csepVar2.c : null, 3));
            r.getClass();
            linkedHashMap4.put(obj, new csgo("Cannot create message reply. BugleId does not exist for replied-to message.", r));
        }
        linkedHashMap2.putAll(linkedHashMap4);
        ArrayList arrayList4 = new ArrayList(ffdx.n(list2, 10));
        for (Map.Entry entry3 : list2) {
            String str3 = (String) entry3.getKey();
            csep csepVar3 = (csep) entry3.getValue();
            String[] strArr = bufy.a;
            buet buetVar = new buet();
            buetVar.d(bdhb.b(str3));
            String str4 = (String) linkedHashMap3.get(csepVar3.c);
            if (str4 != null) {
                buetVar.e(bdhb.b(str4));
            }
            csep csepVar4 = (csep) linkedHashMap.get(str3);
            if (csepVar4 != null) {
                if ((csepVar4.b & 2) != 0) {
                    ajrb b = ajrb.b(csepVar4.d);
                    if (b == null) {
                        b = ajrb.UNRECOGNIZED;
                    }
                    buetVar.f(b);
                }
                if ((csepVar4.b & 4) != 0) {
                    buetVar.g(bdhg.a(csepVar4.e));
                }
            }
            arrayList4.add(buetVar.a());
        }
        bueo[] bueoVarArr = (bueo[]) arrayList4.toArray(new bueo[0]);
        try {
            dtub.A(bufy.a(), 5, false, new BiConsumer() { // from class: buej
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj2, Object obj3) {
                    String[] strArr2 = bufy.a;
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            }, (bueo[]) Arrays.copyOf(bueoVarArr, bueoVarArr.length));
        } catch (Exception e2) {
            ensk j = a.j();
            j.Y(ente.a, "BugleCmsAddFields");
            ((enrr) ((enrr) j).g(e2).h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/messagereplies/MessageRepliesCmsDataProvider", "restoreDataInTransaction", 305, "MessageRepliesCmsDataProvider.kt")).q("Bulk insert of message reply data failed.");
            LinkedHashMap linkedHashMap5 = new LinkedHashMap(ffew.a(linkedHashMap.size()));
            Iterator it4 = linkedHashMap.entrySet().iterator();
            while (it4.hasNext()) {
                linkedHashMap5.put(((Map.Entry) it4.next()).getKey(), e2);
            }
            linkedHashMap2.putAll(linkedHashMap5);
        }
        return linkedHashMap2;
    }
}

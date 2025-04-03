package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import j$.time.Instant;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csfl implements csdr {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/cloudstore/completeness/scheduledsend/ScheduledSendCmsDataProvider");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public csfl(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar5;
    }

    @Override // defpackage.csdr
    public final eshn a() {
        return eshn.SCHEDULED_SEND;
    }

    @Override // defpackage.csdr
    public final List b() {
        if (((axkm) this.c.b()).al()) {
            bech a2 = ((cctp) this.d.b()).b(16, becg.DELETE).a(1, "message_id");
            a2.f = 5;
            a2.g = ccrk.a(6);
            return ffdx.b(a2.a());
        }
        bech bechVar = new bech();
        bechVar.c = becg.DELETE;
        bechVar.e = 32;
        bechVar.b = 16;
        bechVar.i = "message_id";
        bechVar.f = 5;
        bechVar.c();
        bechVar.g = ccrk.a(6);
        bechVar.h = ((ashh) this.e.b()).a();
        return ffdx.b(bechVar.a());
    }

    @Override // defpackage.csdr
    public final List c() {
        return ffdx.b(((cctp) this.d.b()).c(16, becg.DELETE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.csdr
    public final Map d(final List list) {
        coin b = ScheduledSendTable.b();
        b.z("batchGetScheduledSendData");
        b.e(new Function() { // from class: csfj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List list2 = list;
                coit coitVar = (coit) obj;
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
                coitVar.aq(new dtrw("scheduled_send.message_id", 3, coit.at(engrVar.g()), true));
                return coitVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = b.b().y();
        y.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(y, 10)), 16));
        enqv it = y.iterator();
        while (it.hasNext()) {
            ScheduledSendTable.BindData bindData = (ScheduledSendTable.BindData) it.next();
            bindData.az(1, "message_id");
            String messageIdType = bindData.b.toString();
            messageIdType.getClass();
            csff csffVar = (csff) csfg.a.createBuilder();
            csffVar.getClass();
            Instant l = bindData.l();
            l.getClass();
            eyja b2 = eykn.b(l);
            csffVar.copyOnWrite();
            csfg csfgVar = (csfg) csffVar.instance;
            csfgVar.c = b2;
            csfgVar.b = 1 | csfgVar.b;
            bindData.az(4, "status");
            String name = bindData.e.name();
            name.getClass();
            csffVar.copyOnWrite();
            ((csfg) csffVar.instance).d = name;
            Instant k = bindData.k();
            k.getClass();
            eyja b3 = eykn.b(k);
            csffVar.copyOnWrite();
            csfg csfgVar2 = (csfg) csffVar.instance;
            csfgVar2.e = b3;
            csfgVar2.b |= 2;
            eyfy build = csffVar.build();
            build.getClass();
            linkedHashMap.put(messageIdType, new ffch(((csfg) build).toByteString()));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.csdr
    public final Map e(Map map) {
        ScheduledSendTable.BindData bindData;
        map.getClass();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            try {
                csfg csfgVar = (csfg) eyfy.parseFrom(csfg.a, (eyee) entry.getValue());
                csfgVar.getClass();
                MessageIdType b = bdhb.b(str);
                eyja eyjaVar = csfgVar.c;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                eyjaVar.getClass();
                if (eykn.d(eyjaVar).compareTo(((cqoh) this.b.b()).f()) >= 0) {
                    linkedHashMap.put(b, csfgVar);
                } else {
                    arrayList.add(b);
                }
            } catch (eygu e) {
                linkedHashMap2.put(str, e);
            }
        }
        if (!arrayList.isEmpty()) {
            String[] strArr = MessagesTable.a;
            buxr buxrVar = new buxr();
            buxrVar.ap("markedScheduledMessagesAsFailed");
            buxrVar.Y(new Function() { // from class: csfk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    buxzVar.u(arrayList);
                    buxzVar.af(16);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            buxrVar.U(8);
            int e2 = buxrVar.b().e();
            if (e2 != arrayList.size()) {
                ensk j = a.j();
                j.Y(ente.a, "BugleCmsAddFields");
                ((enrr) j.h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/scheduledsend/ScheduledSendCmsDataProvider", "markedScheduledMessagesAsFailed", PrivateKeyType.INVALID, "ScheduledSendCmsDataProvider.kt")).u("Executed update of %s messages but only %s rows affected", arrayList.size(), e2);
            }
        }
        buxo d = MessagesTable.d();
        d.z("restoreDataInTransaction");
        d.h(new Function() { // from class: csfh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.u(linkedHashMap.keySet());
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.e(new Function() { // from class: csfi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buum buumVar = (buum) obj;
                return new buun[]{buumVar.a, buumVar.b};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = d.b().y();
        y.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(y, 10)), 16));
        enqv it = y.iterator();
        while (it.hasNext()) {
            MessagesTable.BindData bindData2 = (MessagesTable.BindData) it.next();
            ffcf ffcfVar = new ffcf(bindData2.D(), bindData2.C());
            linkedHashMap3.put(ffcfVar.a, ffcfVar.b);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            MessageIdType messageIdType = (MessageIdType) entry2.getKey();
            csfg csfgVar2 = (csfg) entry2.getValue();
            ConversationIdType conversationIdType = (ConversationIdType) linkedHashMap3.get(messageIdType);
            if (conversationIdType == null || conversationIdType.b()) {
                String b2 = messageIdType.b();
                Objects.toString(messageIdType);
                linkedHashMap2.put(b2, new IllegalArgumentException("No conversation id found for message id: ".concat(String.valueOf(messageIdType))));
                bindData = null;
            } else {
                String[] strArr2 = ScheduledSendTable.a;
                cohj cohjVar = new cohj();
                cohjVar.f(messageIdType);
                cohjVar.c(conversationIdType);
                eyja eyjaVar2 = csfgVar2.c;
                if (eyjaVar2 == null) {
                    eyjaVar2 = eyja.a;
                }
                eyjaVar2.getClass();
                cohjVar.g(eykn.d(eyjaVar2));
                eyja eyjaVar3 = csfgVar2.e;
                if (eyjaVar3 == null) {
                    eyjaVar3 = eyja.a;
                }
                eyjaVar3.getClass();
                cohjVar.d(eykn.d(eyjaVar3));
                String str2 = csfgVar2.d;
                str2.getClass();
                cohjVar.h((coiu) Enum.valueOf(coiu.class, str2));
                bindData = cohjVar.a();
            }
            if (bindData != null) {
                arrayList2.add(bindData);
            }
        }
        ScheduledSendTable.BindData[] bindDataArr = (ScheduledSendTable.BindData[]) arrayList2.toArray(new ScheduledSendTable.BindData[0]);
        try {
            dtub.A(ScheduledSendTable.c(), 5, false, new BiConsumer() { // from class: cogx
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ScheduledSendTable.BindData bindData3 = (ScheduledSendTable.BindData) obj;
                    final Long l = (Long) obj2;
                    String[] strArr3 = ScheduledSendTable.a;
                    if (l.longValue() >= 0) {
                        bindData3.a = (String) new dtuj() { // from class: cogy
                            @Override // defpackage.dtuj
                            public final Object a() {
                                String[] strArr4 = ScheduledSendTable.a;
                                return String.valueOf(l);
                            }
                        }.a();
                        bindData3.fY(0);
                    }
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            }, (ScheduledSendTable.BindData[]) Arrays.copyOf(bindDataArr, bindDataArr.length));
        } catch (Exception e3) {
            ensk j2 = a.j();
            j2.Y(ente.a, "BugleCmsAddFields");
            ((enrr) ((enrr) j2).g(e3).h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/scheduledsend/ScheduledSendCmsDataProvider", "restoreDataInTransaction", 237, "ScheduledSendCmsDataProvider.kt")).q("Bulk insert of scheduled send data failed.");
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

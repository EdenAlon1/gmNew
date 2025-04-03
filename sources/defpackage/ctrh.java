package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctrh {
    public final ffbr a;
    public final ffbr b;
    public final cqoh c;
    public final cbgf d;
    public final cskc e;
    private final ffbr f;
    private final ffbr g;

    public ctrh(ffbr ffbrVar, ffbr ffbrVar2, cqoh cqohVar, ffbr ffbrVar3, ffbr ffbrVar4, cbgf cbgfVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        cqohVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        cbgfVar.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = cqohVar;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.d = cbgfVar;
        this.e = cskc.g("Bugle", "SmartSuggestionPersister");
    }

    public final void a(MessageIdType messageIdType, List list, List list2, ConversationIdType conversationIdType) {
        MessageIdType messageIdType2;
        Object next;
        ctqg ctqgVar = (ctqg) this.g.b();
        if (ctjd.g()) {
            curl curlVar = (curl) ctqgVar.b.b();
            messageIdType2 = messageIdType;
            axol.k(curlVar.k, null, new curj(messageIdType2, list2, curlVar, conversationIdType, null), 3);
            if (((Boolean) ((cfup) ctjd.bL.get()).e()).booleanValue()) {
                bdmq bdmqVar = (bdmq) ctqgVar.c.b();
                Object e = ctjd.bN.e();
                e.getClass();
                List M = bdmqVar.M(conversationIdType, ((Number) e).intValue());
                M.getClass();
                ArrayList arrayList = new ArrayList(ffdx.n(M, 10));
                Iterator it = M.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MessageCoreData) it.next()).B());
                }
                engw<fbwv> r = ((ctqh) ctqgVar.f.b()).r(arrayList);
                if (!r.isEmpty()) {
                    for (fbwv fbwvVar : r) {
                        fbrc b = fbrc.b(fbwvVar.d);
                        if (b == null) {
                            b = fbrc.UNRECOGNIZED;
                        }
                        if (b == fbrc.MOBILE_BERT_CLASSIFICATION) {
                            int b2 = fbur.b((fbwvVar.b == 5 ? (fbus) fbwvVar.c : fbus.a).b);
                            if (b2 != 0 && b2 == 5) {
                                if ((fbwvVar.b == 5 ? (fbus) fbwvVar.c : fbus.a).c >= ((Number) ctjd.bG.e()).floatValue()) {
                                    ensk f = ctqg.a.f();
                                    f.Y(ente.a, "BugleSpam");
                                    ((enrr) f.h("com/google/android/apps/messaging/shared/util/p2p/operations/PenpalSpamClassificationHandler", "handleClassifications", 45, "PenpalSpamClassificationHandler.kt")).q("Penpal spam enforcement: skipping message because of recent detection");
                                    break;
                                }
                            }
                        }
                    }
                }
                if (messageIdType2.c()) {
                    ensk j = ctqg.a.j();
                    j.Y(ente.a, "BugleSpam");
                    ((enrr) j.h("com/google/android/apps/messaging/shared/util/p2p/operations/PenpalSpamClassificationHandler", "shouldNotifyScam", 71, "PenpalSpamClassificationHandler.kt")).q("Null or empty messageId, skipping Penpal enforcement");
                } else if (list2 == null || list2.isEmpty()) {
                    ensk e2 = ctqg.a.e();
                    e2.Y(ente.a, "BugleSpam");
                    enrr enrrVar = (enrr) e2;
                    enrrVar.Y(csux.b, messageIdType2);
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/p2p/operations/PenpalSpamClassificationHandler", "shouldNotifyScam", 79, "PenpalSpamClassificationHandler.kt")).q("No classification found.");
                } else {
                    ArrayList<fbwv> arrayList2 = new ArrayList();
                    for (Object obj : list2) {
                        fbwv fbwvVar2 = (fbwv) obj;
                        fbrc b3 = fbrc.b(fbwvVar2.d);
                        if (b3 == null) {
                            b3 = fbrc.UNRECOGNIZED;
                        }
                        if (b3 == fbrc.MOBILE_BERT_CLASSIFICATION) {
                            int b4 = fbur.b((fbwvVar2.b == 5 ? (fbus) fbwvVar2.c : fbus.a).b);
                            if (b4 != 0 && b4 == 5) {
                                arrayList2.add(obj);
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(ffdx.n(arrayList2, 10));
                    for (fbwv fbwvVar3 : arrayList2) {
                        arrayList3.add(fbwvVar3.b == 5 ? (fbus) fbwvVar3.c : fbus.a);
                    }
                    Iterator it2 = arrayList3.iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            float f2 = ((fbus) next).c;
                            do {
                                Object next2 = it2.next();
                                float f3 = ((fbus) next2).c;
                                int compare = Float.compare(f2, f3);
                                if (compare < 0) {
                                    f2 = f3;
                                }
                                if (compare < 0) {
                                    next = next2;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    fbus fbusVar = (fbus) next;
                    if (fbusVar != null) {
                        if (fbusVar.c >= ((Float) ctjd.bG.e()).floatValue()) {
                            if (((crlo) ctqgVar.d.b()).a(conversationIdType, messageIdType2, 254) != null) {
                                ensk e3 = ctqg.a.e();
                                e3.Y(ente.a, "BugleSpam");
                                ((enrr) e3.h("com/google/android/apps/messaging/shared/util/p2p/operations/PenpalSpamClassificationHandler", "handleClassifications", 58, "PenpalSpamClassificationHandler.kt")).q("submit m_acs toolstone");
                            }
                            ctqgVar.e.l(conversationIdType, messageIdType2, new String[0]);
                        }
                    }
                }
            }
        } else {
            messageIdType2 = messageIdType;
        }
        curf curfVar = (curf) this.f.b();
        axol.k(curfVar.f, null, new cure(messageIdType2, curfVar, list, null), 3);
    }
}

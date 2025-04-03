package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class barw {
    private static final entd b = entd.c("Bugle");
    private static final entd c = entd.c("BugleNotifications");
    public final ctrh a;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final errl j;

    public barw(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ctrh ctrhVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, errl errlVar) {
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.a = ctrhVar;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.j = errlVar;
    }

    public final barv a(MessageIdType messageIdType) {
        MessageCoreData z = ((bdmq) this.d.b()).z(messageIdType);
        if (z == null) {
            ensz enszVar = (ensz) b.j();
            enszVar.Y(csux.a, messageIdType.b());
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmartSuggestionsActionHelper", "getLatestMessageId", 173, "ReceiveSmartSuggestionsActionHelper.java")).q("Couldn't add Smart suggestions to conversation: target message ID not found.");
            return null;
        }
        ffbr ffbrVar = this.d;
        ConversationIdType z2 = z.z();
        MessageCoreData n = ((bdmq) ffbrVar.b()).n(z2);
        if (n == null) {
            ((ensz) ((ensz) b.j()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmartSuggestionsActionHelper", "getLatestMessageId", 180, "ReceiveSmartSuggestionsActionHelper.java")).q("Couldn't add Smart suggestions to conversation: latest message in conversation was null.");
            return null;
        }
        MessageIdType B = n.B();
        if (B == null) {
            throw new NullPointerException("Null lastMessageId");
        }
        if (z2 != null) {
            return new baca(B, z2);
        }
        throw new NullPointerException("Null conversationId");
    }

    public final elfl b(MessageIdType messageIdType, Supplier supplier) {
        Object obj;
        barv a = a(messageIdType);
        if ((!((Boolean) ((cfup) stl.k.get()).e()).booleanValue() && !((Boolean) ((cfup) ctjd.bD.get()).e()).booleanValue()) || a == null || ((Optional) this.f.b()).isEmpty()) {
            return elfo.e(false);
        }
        ahrq ahrqVar = (ahrq) ((Optional) this.f.b()).get();
        obj = supplier.get();
        return ahrqVar.a(((baca) a).b, (List) obj);
    }

    public final elfl c(MessageIdType messageIdType, Supplier supplier) {
        Object obj;
        if (a(messageIdType) == null || ((Optional) this.e.b()).isEmpty()) {
            return elfo.e(false);
        }
        if (!ctjd.f() && !ctjd.g()) {
            ((ensz) ((ensz) b.f()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmartSuggestionsActionHelper", "persistMessageClassifications", 132, "ReceiveSmartSuggestionsActionHelper.java")).q("Not persisting classifications for message because it is not enabled.");
            return elfo.e(false);
        }
        cgoo cgooVar = (cgoo) ((Optional) this.e.b()).get();
        obj = supplier.get();
        return cgooVar.a(messageIdType, (List) obj);
    }

    public final elfl d(final MessageIdType messageIdType, ArrayList arrayList, final Supplier supplier, Supplier supplier2, Supplier supplier3) {
        Object obj;
        barv a = a(messageIdType);
        if (a != null) {
            ctrh ctrhVar = this.a;
            obj = supplier2.get();
            ctrhVar.a(messageIdType, arrayList, (List) obj, ((baca) a).b);
        }
        return elfo.k(c(messageIdType, supplier2), b(messageIdType, supplier3)).a(new Callable() { // from class: baru
            @Override // java.util.concurrent.Callable
            public final Object call() {
                barw.this.e(messageIdType, supplier);
                return null;
            }
        }, this.j);
    }

    public final void e(MessageIdType messageIdType, Supplier supplier) {
        Object obj;
        barv a = a(messageIdType);
        if (a == null) {
            return;
        }
        ctrh ctrhVar = this.a;
        boolean b2 = ((cttn) ctrhVar.b.b()).b();
        baca bacaVar = (baca) a;
        ConversationIdType conversationIdType = bacaVar.b;
        if (b2) {
            MessageIdType messageIdType2 = bacaVar.a;
            csjb a2 = ctrhVar.e.a();
            a2.I("persistSmartSuggestions");
            if (a2.d) {
                a2.q("latestMessageId");
                a2.b.append(cskt.e(messageIdType2.toString()));
            }
            a2.r();
            if (((Boolean) ((cfup) ctjd.af.get()).e()).booleanValue() || ffkj.e(messageIdType2, messageIdType)) {
                ctqh ctqhVar = (ctqh) ctrhVar.a.b();
                obj = supplier.get();
                obj.getClass();
                ctqhVar.l((List) obj, conversationIdType, messageIdType, ctrhVar.c.f().toEpochMilli());
                ctrhVar.d.o(conversationIdType);
            } else {
                csjb e = ctrhVar.e.e();
                e.I("Couldn't add suggestions to conversation: last message ID doesn't match the target message ID. latest:");
                e.d(messageIdType2);
                e.v(", target:");
                e.d(messageIdType);
                e.r();
            }
        } else {
            ctrhVar.e.n("Smart suggestions are not enabled");
        }
        if (((auiv) this.i.b()).a()) {
            ((ensz) ((ensz) c.h()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmartSuggestionsActionHelper", "refreshNotificationActions", 216, "ReceiveSmartSuggestionsActionHelper.java")).q("Using system replies, not refreshing for smart replies");
        } else if (((cttn) this.g.b()).c()) {
            ensz enszVar = (ensz) c.h();
            enszVar.Y(csux.o, conversationIdType.toString());
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmartSuggestionsActionHelper", "refreshNotificationActions", 224, "ReceiveSmartSuggestionsActionHelper.java")).q("Updating notification in conversation due to Smart suggestions");
            ((cjbc) this.h.b()).d(false);
        }
    }
}

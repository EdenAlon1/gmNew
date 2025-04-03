package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cadh {
    public static final cskc a = cskc.g("BugleEtouffee", "IncomingFailedToDecryptReceiptProcessor");
    public final ffbr b;
    public final bzzi c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final cabi h;
    private final ffbr i;
    private final ffbr j;
    private final awtm k;
    private final ffbr l;

    public cadh(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, cabi cabiVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, awtm awtmVar, bzzi bzziVar, ffbr ffbrVar8) {
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = cabiVar;
        this.i = ffbrVar5;
        this.b = ffbrVar6;
        this.j = ffbrVar7;
        this.k = awtmVar;
        this.c = bzziVar;
        this.l = ffbrVar8;
    }

    private final void b(bdhg bdhgVar, MessageCoreData messageCoreData, boolean z) {
        cskc cskcVar = a;
        csjb e = cskcVar.e();
        e.I("Message was already sent over MAX_FTD_RETRY_COUNT times.");
        e.z("getSendCounter", messageCoreData.q());
        e.r();
        amdd p = amdg.p();
        p.c(messageCoreData.B());
        p.h(19);
        p.f(this.k.a());
        if (z) {
            ((amcr) p).d = Optional.of(false);
            p.b(false);
        }
        ((amcr) p).e = Optional.of(1);
        if (((amdh) this.l.b()).c(p.a())) {
            return;
        }
        csjb e2 = cskcVar.e();
        e2.I("Unable to update message id, counter, and state of the message when trying to resend the message. User won't be able to successfully resend the message.");
        e2.A("rcsMessageId", bdhgVar);
        e2.z("originalMessageCounter", messageCoreData.q());
        e2.r();
    }

    final boolean a(faym faymVar, bdhg bdhgVar, awui awuiVar, awui awuiVar2) {
        String j;
        String str = awuiVar.d;
        String str2 = awuiVar2.d;
        MessageCoreData w = ((bdmq) this.e.b()).w(bdhgVar);
        if (w == null) {
            ((akzt) this.b.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 10);
            csjb e = a.e();
            e.I("Message not found.");
            e.h(bdhgVar);
            e.r();
            return false;
        }
        MessageIdType C = w.C();
        MessageCoreData v = !C.c() ? ((bdmq) this.e.b()).v(C) : null;
        bcyk a2 = ((azwh) this.d.b()).a(w.z());
        if (a2 == null) {
            ((akzt) this.b.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 11);
            csjb e2 = a.e();
            e2.I("Reencrypting message in a deleted conversation is not possible");
            e2.h(w.E());
            e2.A("conversationId", w.z());
            e2.r();
            return false;
        }
        int L = a2.L();
        if (w.q() < (L == 0 ? 5 : bzwf.b())) {
            cabi cabiVar = this.h;
            ezgp ezgpVar = (ezgp) ezgq.a.createBuilder();
            ezgpVar.copyOnWrite();
            ezgq ezgqVar = (ezgq) ezgpVar.instance;
            faymVar.getClass();
            ezgqVar.c = faymVar;
            ezgqVar.b |= 1;
            ezgpVar.copyOnWrite();
            ezgq ezgqVar2 = (ezgq) ezgpVar.instance;
            str2.getClass();
            ezgqVar2.b |= 2;
            ezgqVar2.d = str2;
            ezgpVar.copyOnWrite();
            ezgq ezgqVar3 = (ezgq) ezgpVar.instance;
            str.getClass();
            ezgqVar3.b |= 4;
            ezgqVar3.e = str;
            ((cevh) cabiVar.a.b()).a(ceyr.g("FtdHandlerWorkItem", (ezgq) ezgpVar.build()));
            csjb c = a.c();
            c.I("Scheduled a work item to resend a message that resulted in an FTD receipt.");
            c.A("Original RCS message ID", bdhgVar.b);
            c.r();
            return true;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_E2EE_MESSAGE_RETRY_LIMIT_EXCEEDED;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eozt eoztVar = (eozt) eozu.a.createBuilder();
        String f = w.D().f();
        eoztVar.copyOnWrite();
        eozu eozuVar = (eozu) eoztVar.instance;
        eozuVar.b |= 1;
        eozuVar.c = f;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eozu eozuVar2 = (eozu) eoztVar.build();
        eozuVar2.getClass();
        eolvVar2.X = eozuVar2;
        eolvVar2.c |= 2097152;
        ((akxl) this.i.b()).j(eoluVar);
        ((akzt) this.b.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 16);
        b(bdhgVar, w, false);
        if (v != null) {
            if (L == 0) {
                b(bdhgVar, v, true);
            }
            cbej cbejVar = (cbej) this.f.b();
            ConversationIdType z = v.z();
            MessageIdType B = v.B();
            ParticipantsTable.BindData c2 = ((bdrr) this.g.b()).c(str);
            if (c2 != null) {
                j = c2.S();
                j.getClass();
            } else {
                j = ((bdrr) this.g.b()).j(bdqu.f(str));
            }
            cbejVar.a(z, B, j, ((cqoh) this.j.b()).f());
        }
        return false;
    }
}

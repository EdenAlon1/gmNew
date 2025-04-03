package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnmm implements bdnu {
    public static final entd a = entd.c("BugleReplies");
    public final ffbr b;
    public final ffbr c;
    private final ffsk d;
    private final cbgf e;
    private final ffbr f;

    public cnmm(ffsk ffskVar, cbgf cbgfVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffskVar.getClass();
        cbgfVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar4.getClass();
        this.d = ffskVar;
        this.e = cbgfVar;
        this.f = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
    }

    private static final MessageIdType a(bdhg bdhgVar, buxz buxzVar) {
        buxo d = MessagesTable.d();
        d.z("RepliesOnRcsMessageReceiverListener#queryMessageId");
        d.c(MessagesTable.c.a);
        buxzVar.B(false);
        d.g(buxzVar);
        d.x(1);
        dtsu o = d.b().o();
        try {
            buuo buuoVar = (buuo) o;
            if (buuoVar.moveToFirst()) {
                MessageIdType q = buuoVar.q();
                ffig.a(o, null);
                return q;
            }
            MessageIdType a2 = cmkc.a(bdhgVar);
            ffig.a(o, null);
            return a2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(o, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.bdnu
    public final void d(final MessageCoreData messageCoreData) {
        Object apply;
        messageCoreData.getClass();
        axol.k(this.d, null, new cnml(this, messageCoreData, null), 3);
        String[] strArr = bufy.a;
        bufv bufvVar = new bufv();
        bufvVar.ap("linkMissingRepliesToMessage");
        apply = new Function() { // from class: cnmk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bufx bufxVar = (bufx) obj;
                entd entdVar = cnmm.a;
                ajrb ajrbVar = ajrb.REPLIED_TO_MESSAGE_NOT_FOUND;
                int a2 = ajrbVar == null ? 0 : ajrbVar.a();
                MessageCoreData messageCoreData2 = MessageCoreData.this;
                bufxVar.aq(new dtwe("message_replies.replied_to_message_id_null_reason", 1, Integer.valueOf(a2)));
                bufxVar.aq(new dtrt("message_replies.replied_to_rcs_message_id", 1, bdhg.d(messageCoreData2.E())));
                return bufxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bufx());
        bufvVar.af(new bufw((bufx) apply));
        bufvVar.c(messageCoreData.B());
        bufvVar.a.putNull("replied_to_rcs_message_id");
        bufvVar.a.putNull("replied_to_message_id_null_reason");
        final bufu b = bufvVar.b();
        final int i = 0;
        engw engwVar = (engw) bufy.a().r("message_replies.updateAndReturnUpdatedRows-txn", new emyl() { // from class: buft
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emyl
            public final Object get() {
                String[] strArr2 = bufy.a;
                bufs bufsVar = new bufs(bufy.a);
                bufsVar.z("message_replies.updateAndReturnUpdatedRows-query");
                bufu bufuVar = bufu.this;
                engw engwVar2 = bufuVar.e;
                int i2 = ((enou) engwVar2).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    bufsVar.k((bufw) ((duap) engwVar2.get(i3)));
                }
                if (((dtrm) bufuVar.d).b) {
                    bufx bufxVar = new bufx();
                    bufxVar.as(bufuVar.h());
                    bufsVar.k(new bufw(bufxVar));
                }
                if (((dtrm) bufuVar.d).c) {
                    bufsVar.r();
                }
                Integer num = i;
                engw y = bufsVar.b().y();
                num.intValue();
                bufuVar.t(0);
                return y;
            }
        });
        if (engwVar.isEmpty()) {
            return;
        }
        ensz enszVar = (ensz) a.h();
        ensn ensnVar = ajro.a;
        enszVar.Y(ajro.c, messageCoreData.B().b());
        enszVar.Y(ajro.d, messageCoreData.E().f());
        enszVar.r("Linked %d previous replies to the received message.", engwVar.size());
        cbgf cbgfVar = this.e;
        ConversationIdType z = messageCoreData.z();
        engwVar.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        Iterator<E> it = engwVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((bueo) it.next()).l());
        }
        cbgfVar.m(z, arrayList, new String[0]);
        ((akzt) this.f.b()).d("Bugle.MessageReplies.Rcs.Received.MissingRepliedToLinked.Count", engwVar.size());
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void e(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bdnu
    public final void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        fayv aa = messageCoreData.aa();
        bdhg a2 = aa != null ? cnmg.a(aa) : bdhg.a;
        if (a2.i()) {
            ensk n = a.n();
            n.Y(csux.b, messageCoreData.B());
            n.q("Message is not a reply, replied-to RCS message id is empty.");
            return;
        }
        String[] strArr = MessagesTable.a;
        buxz buxzVar = new buxz();
        buxzVar.G(a2);
        MessageIdType a3 = a(a2, buxzVar);
        if (a3.c()) {
            buxz buxzVar2 = new buxz();
            buxzVar2.O(a2);
            a3 = a(a2, buxzVar2);
        }
        if (a3.c()) {
            ensz enszVar = (ensz) a.h();
            ensn ensnVar = ajro.a;
            enszVar.Y(ajro.a, messageCoreData.B().b());
            enszVar.Y(ajro.d, a2.f());
            enszVar.q("Processing reply to a missing message.");
            String[] strArr2 = bufy.a;
            buet buetVar = new buet();
            buetVar.d(messageCoreData.B());
            buetVar.g(a2);
            buetVar.f(ajrb.REPLIED_TO_MESSAGE_NOT_FOUND);
            buetVar.c();
            ((akzt) this.f.b()).c("Bugle.MessageReplies.Rcs.Received.MissingRepliedTo.Count");
            return;
        }
        ensk n2 = a.n();
        ensn ensnVar2 = ajro.a;
        n2.Y(ajro.a, messageCoreData.B().b());
        n2.Y(ajro.c, a3.b());
        n2.q("Processing reply.");
        String[] strArr3 = bufy.a;
        buet buetVar2 = new buet();
        buetVar2.d(messageCoreData.B());
        buetVar2.e(a3);
        buetVar2.c();
        messageCoreData.bO(cnmc.a(a3));
        ((akzt) this.f.b()).c("Bugle.MessageReplies.Rcs.Received.Success.Count");
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}

package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmla implements bdod {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/rcsedit/transport/EditOnOutgoingMessageInsertionListener");
    private final ffbr b;
    private final ffbr c;

    public cmla(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    @Override // defpackage.bdod
    public final Object a(MessageCoreData messageCoreData, ffgu ffguVar) {
        ekzz f = eleg.f("EditOnOutgoingMessageInsertionListener#onBeforeInsertion");
        try {
            if (messageCoreData.S() != null) {
                messageCoreData.bx(false);
            }
            ffig.a(f, null);
            return messageCoreData;
        } finally {
        }
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        bdoc.a(messageCoreData, messageIdType);
    }

    @Override // defpackage.bdod
    public final void h(MessageCoreData messageCoreData) {
        MessageCoreData messageCoreData2;
        ekzz f = eleg.f("EditOnOutgoingMessageInsertionListener#onInsertInTransaction");
        try {
            cmlk S = messageCoreData.S();
            if (S == null) {
                ffig.a(f, null);
                return;
            }
            String aA = messageCoreData.aA();
            if (aA == null) {
                ffig.a(f, null);
                return;
            }
            cmkx c = cmky.c(S.c, aA);
            enru enruVar = a;
            ensk h = enruVar.h();
            h.Y(ente.a, "BugleRcsEdits");
            enrr enrrVar = (enrr) h;
            ensn ensnVar = cmkz.a;
            enrrVar.Y(cmkz.a, messageCoreData.B());
            enrrVar.Y(cmkz.b, S.b);
            enrrVar.Y(cmkz.c, S.c);
            enrrVar.Y(cmkz.d, S.d);
            enrrVar.Y(cmkz.e, c != null ? c.a : null);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcsedit/transport/EditOnOutgoingMessageInsertionListener", "onInsertInTransaction", 67, "EditOnOutgoingMessageInsertionListener.kt")).q("Processing outgoing edit.");
            Instant ofEpochMilli = Instant.ofEpochMilli(messageCoreData.o());
            Instant b = cmky.b(S.c, aA);
            if (b != null) {
                messageCoreData2 = messageCoreData;
                messageCoreData2.bM(b.toEpochMilli());
                String[] strArr = MessagesTable.a;
                buxr buxrVar = new buxr();
                buxrVar.ap("onInsertInTransaction");
                buxrVar.G(b.toEpochMilli());
                buxrVar.e(messageCoreData2.B());
            } else {
                messageCoreData2 = messageCoreData;
            }
            cmky cmkyVar = (cmky) this.b.b();
            ConversationIdType z = messageCoreData2.z();
            z.getClass();
            MessageIdType B = messageCoreData2.B();
            B.getClass();
            bdhg bdhgVar = S.c;
            Instant instant = S.d;
            ofEpochMilli.getClass();
            cmkyVar.a(z, B, aA, bdhgVar, instant, ofEpochMilli, c);
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "BugleRcsEdits");
            enrr enrrVar2 = (enrr) h2;
            enrrVar2.Y(cmkz.a, messageCoreData.B());
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/rcsedit/transport/EditOnOutgoingMessageInsertionListener", "onInsertInTransaction", 99, "EditOnOutgoingMessageInsertionListener.kt")).q("Processed outgoing edit.");
            ffig.a(f, null);
        } finally {
        }
    }

    @Override // defpackage.bdod
    public final /* bridge */ /* synthetic */ boolean j() {
        return ((Boolean) this.c.b()).booleanValue();
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, ffgu ffguVar) {
        return messageCoreData;
    }
}

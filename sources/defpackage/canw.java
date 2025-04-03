package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class canw {
    public static final cskc a = cskc.g("BugleDatabase", "TombstoneManagerOperations");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;

    public canw(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.b = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.c = ffbrVar6;
        this.i = ffbrVar7;
        this.d = ffbrVar8;
    }

    public final void a(final MessageCoreData messageCoreData) {
        final cgpv cgpvVar = (cgpv) this.g.b();
        ekzz f = eleg.f("DeleteDatabaseOperations#deleteProtocolSwitchTombstone");
        try {
            final ConversationIdType z = messageCoreData.z();
            ((Integer) cgpvVar.c.c("DeleteDatabaseOperations#deleteMessagesInConversation", new emyl() { // from class: cgpa
                @Override // defpackage.emyl
                public final Object get() {
                    String[] strArr = MessagesTable.a;
                    buxh buxhVar = new buxh();
                    buxhVar.f("deleteMessagesInConversation");
                    final ConversationIdType conversationIdType = z;
                    final MessageCoreData messageCoreData2 = messageCoreData;
                    buxhVar.c(new Function() { // from class: cgpn
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            buxzVar.m(ConversationIdType.this);
                            buxzVar.q(messageCoreData2.B());
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int d = buxhVar.d();
                    ((cbgf) cgpv.this.b.b()).m(conversationIdType, engw.r(messageCoreData2.B()), new String[0]);
                    return Integer.valueOf(d);
                }
            })).intValue();
            f.close();
            csjb a2 = a.a();
            a2.I("TombstoneManagerOperations deleted protocol switch tombstone");
            a2.A("conversationId", messageCoreData.z());
            a2.y("status", messageCoreData.k());
            a2.r();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(final ConversationIdType conversationIdType, int i, long j, final Boolean bool) {
        int i2;
        aztg e = ((bdtd) this.e.b()).e();
        e.getClass();
        ParticipantsTable.BindData a2 = e.a();
        List L = ((bczy) this.f.b()).L(conversationIdType);
        L.getClass();
        long g = ((bczy) this.f.b()).g(conversationIdType);
        ffbz a3 = ffca.a(new ffix() { // from class: canv
            @Override // defpackage.ffix
            public final Object invoke() {
                Boolean bool2 = bool;
                boolean z = true;
                if (bool2 == null || !ffkj.e(bool2, true)) {
                    if (!((bzqb) this.c.b()).j(conversationIdType)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
        if (i != 234) {
            i2 = i;
        } else {
            if (!((Boolean) a3.a()).booleanValue()) {
                a.m("Attempting to add a downgrade to RCS tombstone, but found no E2EE tombstones");
                ((canu) this.i.b()).b.c("Bugle.Etouffee.UI.PredictiveTombstone.Found.NoE2eeUpgradeTombstoneInRcsGroup");
                return;
            }
            i2 = 234;
        }
        ((cbvt) this.h.b()).j(Optional.empty(), conversationIdType, e, a2, L, i2, j, g);
        csjb a4 = a.a();
        a4.I("inserted new conversation tombstone");
        a4.A("conversationId", conversationIdType);
        a4.y("tombstone", i2);
        a4.z("time", j);
        a4.r();
    }

    public final void c(MessageCoreData messageCoreData) {
        ((bdmq) this.b.b()).O(messageCoreData);
        csjb a2 = a.a();
        a2.I("updated message");
        a2.A("messageId", messageCoreData.B());
        a2.r();
    }

    public final void d(MessageCoreData messageCoreData, int i) {
        if (messageCoreData.k() == i) {
            csjb a2 = a.a();
            a2.I("Skipping tombstone update, both current and new tombstones are equal");
            a2.y("currentTombstone", messageCoreData.k());
            a2.y("newTombstone", i);
            a2.r();
            return;
        }
        ConversationIdType z = messageCoreData.z();
        z.getClass();
        int k = messageCoreData.k();
        csjb a3 = a.a();
        a3.I("TombstoneManagerOperations updated conversation creation tombstone");
        a3.A("conversationId", z);
        a3.y("oldTombstone", k);
        a3.y("newTombstone", i);
        a3.r();
        messageCoreData.bV(i);
        ((bdmq) this.b.b()).O(messageCoreData);
        ((canu) this.i.b()).b.e("Bugle.Tombstone.Generated", i);
    }
}

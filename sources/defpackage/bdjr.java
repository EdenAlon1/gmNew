package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteConstraintException;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdjr {
    private static final cskc f = cskc.g("Bugle", "MessageCoreDataInserter");
    private static final enru g = enru.c("com/google/android/apps/messaging/shared/datamodel/data/message/MessageCoreDataInserter");
    public final dtuu a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final cqoh k;
    private final ffbr l;
    private final ffbr m;

    public bdjr(dtuu dtuuVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, cqoh cqohVar, ffbr ffbrVar8, ffbr ffbrVar9) {
        this.a = dtuuVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.h = ffbrVar3;
        this.d = ffbrVar4;
        this.i = ffbrVar5;
        this.e = ffbrVar6;
        this.j = ffbrVar7;
        this.k = cqohVar;
        this.l = ffbrVar8;
        this.m = ffbrVar9;
    }

    private final void f(SQLiteConstraintException sQLiteConstraintException, String str, ConversationIdType conversationIdType, String str2, ParticipantsTable.BindData bindData, String str3, String str4) {
        if (((auxc) this.m.b()).a()) {
            ((enrr) ((enrr) ((enrr) g.j()).g(sQLiteConstraintException)).h("com/google/android/apps/messaging/shared/datamodel/data/message/MessageCoreDataInserter", "logSqLiteConstraintException", (char) 353, "MessageCoreDataInserter.java")).q("Exception thrown while persisting a message to Bugle DB.");
            return;
        }
        cskc cskcVar = f;
        if (cskcVar.t(5)) {
            csjb e = cskcVar.e();
            e.I("SQLiteConstraintException while inserting:");
            e.D("message", str);
            e.I("found:");
            e.c(conversationIdType);
            e.A("selfId", str2);
            e.A("senderId", bindData);
            e.I("found:");
            e.D("selfDest", str3);
            e.I("found:");
            e.D("senderDest", str4);
            e.s(sQLiteConstraintException);
        }
    }

    public final MessageIdType a(MessageCoreData messageCoreData) {
        ekzz f2 = eleg.f("MessageCoreDataInserter#insertNewMessage1");
        try {
            ekzz f3 = eleg.f("MessageCoreDataInserter#insertNewMessage2");
            try {
                MessageIdType d = d(messageCoreData, false, Optional.empty());
                f3.close();
                f2.close();
                return d;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageIdType b(MessageCoreData messageCoreData) {
        boolean z;
        aoku q;
        String str;
        String str2;
        ConversationIdType conversationIdType;
        bdjr bdjrVar;
        messageCoreData.bK(this.k.f());
        messageCoreData.aK(eooi.class.getName(), messageCoreData.y().j());
        MessagesTable.BindData J = messageCoreData.J();
        try {
            return J.E();
        } catch (SQLiteConstraintException e) {
            final ConversationIdType C = J.C();
            if (C.b()) {
                z = false;
            } else {
                bsob e2 = bsom.e();
                e2.z("logSQLiteConstraintExceptionForMessageInsert");
                e2.i(new Function() { // from class: bdjl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsol bsolVar = (bsol) obj;
                        bsolVar.q(ConversationIdType.this);
                        return bsolVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                z = e2.b().T();
            }
            String W = J.W();
            ParticipantsTable.BindData b = W == null ? null : ((bdrr) this.i.b()).b(W);
            String X = J.X();
            ParticipantsTable.BindData b2 = X == null ? null : ((bdrr) this.i.b()).b(X);
            if (!((astz) this.l.b()).a()) {
                String str3 = null;
                String U = b == null ? null : b.U();
                if (b2 == null) {
                    b2 = null;
                } else {
                    str3 = b2.U();
                }
                String a = J.a();
                if (!z) {
                    C = bdgq.a;
                }
                f(e, a, C, W, b2, U, str3);
                throw e;
            }
            aoku q2 = b == null ? null : ((aolr) this.j.b()).q(b);
            if (b2 == null) {
                b2 = null;
                q = null;
                str = null;
            } else {
                q = ((aolr) this.j.b()).q(b2);
                str = null;
            }
            String a2 = J.a();
            if (!z) {
                C = bdgq.a;
            }
            String o = q2 == null ? str : ((aoks) q2).o();
            if (q == null) {
                bdjrVar = this;
                str2 = o;
                conversationIdType = C;
            } else {
                str = ((aoks) q).o();
                str2 = o;
                conversationIdType = C;
                bdjrVar = this;
            }
            bdjrVar.f(e, a2, conversationIdType, W, b2, str2, str);
            throw e;
        }
    }

    public final void c(final MessagePartCoreData messagePartCoreData, final ConversationIdType conversationIdType) {
    }

    public final MessageIdType d(MessageCoreData messageCoreData, boolean z, Optional optional) {
        csix.h();
        if (messageCoreData.t() == 0) {
            akvz akvzVar = (akvz) this.h.b();
            if (optional.isPresent()) {
                messageCoreData.bX(messageCoreData.cK() ? akvzVar.e(messageCoreData) : akvzVar.f());
            } else {
                messageCoreData.bX(akvzVar.d(messageCoreData));
            }
        }
        if (z) {
            messageCoreData.br(csgg.RESTORED_FROM_TELEPHONY);
        }
        return e(messageCoreData, z);
    }

    public final MessageIdType e(final MessageCoreData messageCoreData, final boolean z) {
        return (MessageIdType) this.a.c("MessageCoreDataInserter#insertPreparedNewMessage", new emyl() { // from class: bdjp
            @Override // defpackage.emyl
            public final Object get() {
                bdjr bdjrVar = bdjr.this;
                MessageCoreData messageCoreData2 = messageCoreData;
                if (!z && messageCoreData2.E().i() && ((messageCoreData2.cX() || messageCoreData2.dh()) && !messageCoreData2.db())) {
                    messageCoreData2.ce(((awtm) bdjrVar.c.b()).a());
                }
                MessageIdType b = bdjrVar.b(messageCoreData2);
                csix.r(b.a);
                messageCoreData2.cd(b);
                bdnn F = messageCoreData2.F();
                if (F != null) {
                    String[] strArr = btul.a;
                    bttq bttqVar = new bttq();
                    bttqVar.c(b);
                    bttqVar.b(F.a);
                    bttn a = bttqVar.a();
                    final dtve a2 = btul.a();
                    emxf.a(Long.valueOf(dtub.b(btul.a(), "message_captions", a, new Function() { // from class: bttk
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Long.valueOf(dtve.this.S("message_captions", (ContentValues) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Consumer() { // from class: bttl
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    })).longValue() >= 0);
                }
                ((cbgf) bdjrVar.b.b()).l(messageCoreData2.z(), b, new String[0]);
                for (MessagePartCoreData messagePartCoreData : messageCoreData2.ab()) {
                    messagePartCoreData.aQ(b);
                    bdjrVar.c(messagePartCoreData, messageCoreData2.z());
                }
                if (!messageCoreData2.cS() || !((bdol) bdjrVar.e.b()).a().booleanValue()) {
                    return b;
                }
                bdol bdolVar = (bdol) bdjrVar.e.b();
                messageCoreData2.getClass();
                ekzz f2 = eleg.f("OutgoingMessageInsertionListenersManager::onInsertInTransaction");
                try {
                    Iterator it = bdolVar.b().iterator();
                    while (it.hasNext()) {
                        ((bdod) it.next()).h(messageCoreData2);
                    }
                    ffig.a(f2, null);
                    return b;
                } finally {
                }
            }
        });
    }
}

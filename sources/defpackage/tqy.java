package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqy {
    public static final cskc a = cskc.g("BugleCms", "ConversationUpdateEventHandler");
    static final cfup b = cfvl.r(172676922, "enable_cancel_notifications_after_read_status_update");
    static final cfup c = cfvl.i(cfvl.b, "enable_handle_conversation_status_opaque_data_update", false);
    public static final engf d = engf.d(byyt.UNARCHIVED, eshu.ACTIVE, byyt.ARCHIVED, eshu.ARCHIVED, byyt.KEEP_ARCHIVED, eshu.KEEP_ARCHIVED, byyt.SPAM_FOLDER, eshu.SPAM_FOLDER, byyt.BLOCKED_FOLDER, eshu.BLOCKED_FOLDER, byyt.CROSS_COUNTRY_FOLDER, eshu.CROSS_COUNTRY_FOLDER);
    public final crty e;
    public final cryl f;
    public final errl g;
    public final errl h;
    public final cbwj i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;

    public tqy(crty crtyVar, cryl crylVar, cbwj cbwjVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, errl errlVar, errl errlVar2) {
        this.e = crtyVar;
        this.f = crylVar;
        this.i = cbwjVar;
        this.j = ffbrVar;
        this.k = ffbrVar2;
        this.l = ffbrVar3;
        this.m = ffbrVar4;
        this.g = errlVar;
        this.h = errlVar2;
    }

    public static void b(eswu eswuVar, String str) {
        csjb c2 = a.c();
        String str2 = cdii.t.a;
        int b2 = eswt.b(eswuVar.b);
        if (b2 == 0) {
            b2 = 1;
        }
        c2.A(str2, eswt.a(b2));
        c2.A(cdii.v.a, "Ignore");
        c2.A(cdii.w.a, eswuVar.c);
        c2.A(cdii.x.a, str);
        c2.I("ConversationEvent received");
        c2.r();
    }

    public final Optional a(eswr eswrVar, eswu eswuVar) {
        if (!eswuVar.d.contains("most_recent_read_message_time_web")) {
            return Optional.empty();
        }
        eyee eyeeVar = (eyee) DesugarCollections.unmodifiableMap(eswrVar.g).get("most_recent_read_message_time_web");
        if (eyeeVar == null) {
            csjb e = a.e();
            String str = cdii.t.a;
            int b2 = eswt.b(eswuVar.b);
            e.A(str, eswt.a(b2 != 0 ? b2 : 1));
            e.A(cdii.v.a, "Ignore");
            e.A(cdii.w.a, eswuVar.c);
            e.A(cdii.x.a, "Missing most_recent_read_message_time_web key in opaque data");
            e.I("ConversationEvent received");
            e.r();
            return Optional.empty();
        }
        try {
            return Optional.of((esid) this.f.a((esij) eyfy.parseFrom(esij.a, eyeeVar, eyfc.a()), esid.a));
        } catch (csgt unused) {
            csjb e2 = a.e();
            String str2 = cdii.t.a;
            int b3 = eswt.b(eswuVar.b);
            e2.A(str2, eswt.a(b3 != 0 ? b3 : 1));
            e2.A(cdii.v.a, "Ignore");
            e2.A(cdii.w.a, eswuVar.c);
            e2.A(cdii.x.a, "Failed to convert CMS conversation to ReadStatus object.");
            e2.r();
            return Optional.empty();
        } catch (eygu unused2) {
            csjb e3 = a.e();
            String str3 = cdii.t.a;
            int b4 = eswt.b(eswuVar.b);
            e3.A(str3, eswt.a(b4 != 0 ? b4 : 1));
            e3.A(cdii.v.a, "Ignore");
            e3.A(cdii.w.a, eswuVar.c);
            e3.A(cdii.x.a, "Failed to parse encrypted most recent read message timestamp for web in opaque data.");
            e3.r();
            return Optional.empty();
        }
    }

    public final void c(ConversationIdType conversationIdType, boolean z) {
        byyt s = ((bczy) this.j.b()).s(conversationIdType);
        bdfl bdflVar = (bdfl) this.k.b();
        if (s == null) {
            s = byyt.UNARCHIVED;
        }
        bdflVar.b(conversationIdType, false, s);
        if (((Boolean) b.e()).booleanValue() && z) {
            ((cins) this.m.b()).M(conversationIdType);
            csjb c2 = a.c();
            c2.A(cdii.v.a, "Process");
            c2.A("conversationId", conversationIdType);
            c2.I("Canceled notification for conversation");
            c2.r();
        }
    }

    public final boolean d(final ConversationIdType conversationIdType, esid esidVar, bseh bsehVar, eswu eswuVar) {
        eyja eyjaVar = esidVar.c;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        final long b2 = eykm.b(eyjaVar);
        cskc cskcVar = a;
        csjb c2 = cskcVar.c();
        c2.A(cdii.w.a, eswuVar.c);
        c2.z("conversationEventReadTimestamp", b2);
        c2.r();
        if (b2 <= bsehVar.t() || b2 <= ((bdmq) this.l.b()).e(conversationIdType)) {
            b(eswuVar, "Database has a more recent timestamp.");
            return false;
        }
        ekzz f = eleg.f("CmsDatabaseOperations#updateConversationsCmsMostRecentReadMessageTimestampMs");
        try {
            String[] strArr = bsom.a;
            bsoe bsoeVar = new bsoe();
            bsoeVar.ap("updateConversationsCmsMostRecentReadMessageTimestampMs");
            int intValue = bsom.g().intValue();
            int intValue2 = bsom.g().intValue();
            if (intValue2 < 53030) {
                dtub.w("cms_most_recent_read_message_timestamp_ms", intValue2);
            }
            if (intValue >= 53030) {
                bsoeVar.a.put("cms_most_recent_read_message_timestamp_ms", Long.valueOf(b2));
            }
            bsoeVar.ad(new Function() { // from class: crxz
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
            bsoeVar.b().e();
            f.close();
            f = eleg.f("CmsDatabaseOperations#updateMessagesReadStatus");
            try {
                String[] strArr2 = MessagesTable.a;
                buxr buxrVar = new buxr();
                buxrVar.ap("updateMessagesReadStatus");
                buxrVar.F(true);
                buxrVar.Y(new Function() { // from class: crxy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar = (buxz) obj;
                        buxzVar.m(ConversationIdType.this);
                        buxzVar.B(false);
                        buxzVar.P(false);
                        buxzVar.ak(100, 117);
                        buxzVar.U(b2);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                buxrVar.b().e();
                f.close();
                csjb c3 = cskcVar.c();
                String str = cdii.t.a;
                int b3 = eswt.b(eswuVar.b);
                if (b3 == 0) {
                    b3 = 1;
                }
                c3.A(str, eswt.a(b3));
                c3.A(cdii.v.a, "Process");
                c3.A(cdii.w.a, eswuVar.c);
                c3.I("Updated messages read status based on CMS conversation event.");
                c3.r();
                return true;
            } finally {
                try {
                    f.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

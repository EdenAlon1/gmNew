package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cldf {
    public static final cskc a = cskc.g("BugleDataModel", "RcsDeliveryReportProcessor");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/rcs/incoming/RcsDeliveryReportProcessor");
    private final ffbr A;
    private final errl B;
    private final errl C;
    private final ffbr D;
    private final ffbr E;
    private final ffbr F;
    public final cqoh c;
    public final ffbr d;
    public final ffbr e;
    public final dtuu f;
    public final csrv g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final azei m;
    private final cvlf n;
    private final altk o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;
    private final akzt s;
    private final Optional t;
    private final awtm u;
    private final ffbr v;
    private final ffbr w;
    private final ffbr x;
    private final ffbr y;
    private final ffbr z;

    public cldf(cvlf cvlfVar, altk altkVar, cqoh cqohVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, akzt akztVar, dtuu dtuuVar, csrv csrvVar, Optional optional, awtm awtmVar, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, errl errlVar, errl errlVar2, ffbr ffbrVar16, azei azeiVar, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19) {
        this.n = cvlfVar;
        this.o = altkVar;
        this.c = cqohVar;
        this.d = ffbrVar3;
        this.r = ffbrVar4;
        this.z = ffbrVar5;
        this.s = akztVar;
        this.f = dtuuVar;
        this.g = csrvVar;
        this.t = optional;
        this.u = awtmVar;
        this.v = ffbrVar6;
        this.w = ffbrVar7;
        this.x = ffbrVar8;
        this.y = ffbrVar9;
        this.h = ffbrVar10;
        this.i = ffbrVar11;
        this.p = ffbrVar;
        this.q = ffbrVar2;
        this.A = ffbrVar12;
        this.j = ffbrVar13;
        this.e = ffbrVar14;
        this.k = ffbrVar15;
        this.B = errlVar;
        this.C = errlVar2;
        this.l = ffbrVar16;
        this.m = azeiVar;
        this.D = ffbrVar17;
        this.E = ffbrVar18;
        this.F = ffbrVar19;
    }

    private final String d(ChatSessionMessageEvent chatSessionMessageEvent) {
        String str = chatSessionMessageEvent.a;
        if (str == null) {
            throw new IllegalStateException("RcsDeliveryReportProcessor: User ID of sender was null.");
        }
        ParticipantsTable.BindData c = ((bdrr) this.r.b()).c(str);
        if (c == null) {
            return ((bdrr) this.r.b()).j(bdqu.f(str));
        }
        String S = c.S();
        S.getClass();
        return S;
    }

    private final void e(ConversationIdType conversationIdType, awui awuiVar, awui awuiVar2, boolean z) {
        enrr i = a.i();
        i.Y(csux.E, awuiVar.d);
        ((enrr) i.h("com/google/android/apps/messaging/shared/rcs/incoming/RcsDeliveryReportProcessor", "logAndDisableEncryptionForRemoteRegistration", 689, "RcsDeliveryReportProcessor.java")).t("Disable [isGroup=%s] encryption on the remote instance.", Boolean.valueOf(z));
        ((bcvy) this.F.b()).a(awuiVar2, conversationIdType).c(awuiVar, z, eozn.RECEIVED_PLAINTEXT_DELIVERY_RECEIPT);
    }

    private final void f(MessageCoreData messageCoreData, ConversationIdType conversationIdType, eqyl eqylVar) {
        akzo a2 = akzn.a(this.c);
        Optional empty = Optional.empty();
        bcyk a3 = ((azwh) this.p.b()).a(conversationIdType);
        if (a3 != null) {
            empty = Optional.of(Integer.valueOf(a3.L()));
        }
        this.o.aq(messageCoreData, empty, eqylVar, a2);
    }

    public final elfl a(final ChatSessionMessageEvent chatSessionMessageEvent, final boolean z, final bdhg bdhgVar, final eopq eopqVar) {
        final bdhg a2 = bdhg.a(chatSessionMessageEvent.c);
        return ((clfy) this.E.b()).a(clfx.DELIVERED).i(new eroh() { // from class: clcy
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cldf cldfVar = cldf.this;
                covh covhVar = (covh) cldfVar.k.b();
                final bdhg bdhgVar2 = a2;
                covhVar.c(bdhgVar2, 2);
                if (chatSessionMessageEvent.h == 50035) {
                    final MessageIdType messageIdType = bdhb.a;
                    ((enrr) ((enrr) cldf.b.e()).h("com/google/android/apps/messaging/shared/rcs/incoming/RcsDeliveryReportProcessor", "updateStatusInUiWithoutDb", 346, "RcsDeliveryReportProcessor.java")).t("Setting delivered status in status tracker using rcsMessageId only for rcsMessageId: %s", bdhgVar2);
                    if (((cbwc) cldfVar.l.b()).c(bdhgVar2, 2)) {
                        ((enrr) ((enrr) cldf.b.e()).h("com/google/android/apps/messaging/shared/rcs/incoming/RcsDeliveryReportProcessor", "updateStatusInUiWithoutDb", 359, "RcsDeliveryReportProcessor.java")).q("Successfully updated status in status tracker to delivered; now notifying UI.");
                        ekzz f = eleg.f("RcsDeliveryReportProcessor::onMessageStatusChanging");
                        try {
                            cldfVar.m.d(new Consumer() { // from class: cldd
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj2) {
                                    ((cbvx) obj2).a(MessageIdType.this, bdhgVar2);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            f.close();
                        } catch (Throwable th) {
                            try {
                                f.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else {
                        ((enrr) ((enrr) cldf.b.e()).h("com/google/android/apps/messaging/shared/rcs/incoming/RcsDeliveryReportProcessor", "updateStatusInUiWithoutDb", 366, "RcsDeliveryReportProcessor.java")).q("Status in status tracker was unchanged.");
                    }
                }
                return ((covh) cldfVar.k.b()).b(bdhgVar2);
            }
        }, this.C).h(new emwl() { // from class: clcz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final cldf cldfVar = cldf.this;
                final ChatSessionMessageEvent chatSessionMessageEvent2 = chatSessionMessageEvent;
                final boolean z2 = z;
                final bdhg bdhgVar2 = bdhgVar;
                final eopq eopqVar2 = eopqVar;
                return (Void) cldfVar.f.b(new emyl() { // from class: clcx
                    @Override // defpackage.emyl
                    public final Object get() {
                        final int i;
                        ekzz f = eleg.f("RcsDeliveryReportProcessor.processInternal");
                        final eopq eopqVar3 = eopqVar2;
                        bdhg bdhgVar3 = bdhgVar2;
                        final ChatSessionMessageEvent chatSessionMessageEvent3 = chatSessionMessageEvent2;
                        final boolean z3 = z2;
                        final cldf cldfVar2 = cldf.this;
                        try {
                            if (cldfVar2.g.s) {
                                csjb a3 = cldf.a.a();
                                a3.I("Ignoring received RCS IMDN for debugging");
                                a3.r();
                            } else {
                                final long epochMilli = cldfVar2.c.f().toEpochMilli();
                                final MessageCoreData x = ((bdmq) cldfVar2.d.b()).x(bdhg.a(chatSessionMessageEvent3.c));
                                fjay aJ = x == null ? null : x.aJ();
                                if (x == null) {
                                    ((akzt) cldfVar2.e.b()).c("Bugle.Rcs.Chat.Message.DeliveryReport.Nonexistent.Counts");
                                }
                                if (((Boolean) cpex.d.e()).booleanValue()) {
                                    String f2 = bdhgVar3.f();
                                    if (aJ != null) {
                                        String str = aJ.b;
                                        ((cpev) cldfVar2.j.b()).d(f2, str);
                                        ((cpev) cldfVar2.j.b()).f(str, 10, cpev.i);
                                    }
                                }
                                int i2 = chatSessionMessageEvent3.h;
                                if (i2 == 50032) {
                                    cldfVar2.b(aJ, chatSessionMessageEvent3, fgjz.BUGLE_SENDING_INTERNAL_STATUS_DISPLAYED);
                                    i = 11;
                                } else if (i2 != 50035) {
                                    cldfVar2.b(aJ, chatSessionMessageEvent3, fgjz.BUGLE_SENDING_INTERNAL_STATUS_DELIVERY_EVENT_UNHANDLED);
                                    csjb e = cldf.a.e();
                                    e.I("Unhandled delivery event");
                                    e.I(chatSessionMessageEvent3);
                                    e.r();
                                } else {
                                    cldfVar2.b(aJ, chatSessionMessageEvent3, fgjz.BUGLE_SENDING_INTERNAL_STATUS_DELIVERED);
                                    i = 2;
                                }
                                if (x == null) {
                                    csjb b2 = cldf.a.b();
                                    b2.I("cannot find");
                                    b2.d(bdhb.b(chatSessionMessageEvent3.c));
                                    b2.r();
                                } else {
                                    cldfVar2.f.d("RcsDeliveryReportProcessor#executeAction", new Runnable() { // from class: clda
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            MessageCoreData v;
                                            cldf cldfVar3 = cldf.this;
                                            MessageCoreData messageCoreData = x;
                                            ChatSessionMessageEvent chatSessionMessageEvent4 = chatSessionMessageEvent3;
                                            boolean z4 = z3;
                                            long j = epochMilli;
                                            int i3 = i;
                                            eopq eopqVar4 = eopqVar3;
                                            cldfVar3.c(messageCoreData, chatSessionMessageEvent4, z4, j, i3, eopqVar4);
                                            if (messageCoreData.C().c()) {
                                                return;
                                            }
                                            MessageIdType C = messageCoreData.C();
                                            if (C.c() || (v = ((bdmq) cldfVar3.d.b()).v(C)) == null) {
                                                return;
                                            }
                                            cldfVar3.c(v, chatSessionMessageEvent4, z4, j, i3, eopqVar4);
                                        }
                                    });
                                    ((cbgf) cldfVar2.i.b()).j(x.z(), x.B());
                                    if (i == 2) {
                                        bdob bdobVar = (bdob) cldfVar2.h.b();
                                        ekzz f3 = eleg.f("OnMessageUpdatedCompositeListener.onProcessDeliveredSuccess");
                                        try {
                                            for (bdnz bdnzVar : (Set) bdobVar.b.b()) {
                                                ekzz a4 = bdnzVar.a();
                                                try {
                                                    bdnzVar.b(x);
                                                    ffig.a(a4, null);
                                                } finally {
                                                }
                                            }
                                            ffig.a(f3, null);
                                        } finally {
                                        }
                                    }
                                }
                            }
                            f.close();
                            return null;
                        } finally {
                        }
                    }
                });
            }
        }, this.B);
    }

    public final void b(fjay fjayVar, ChatSessionMessageEvent chatSessionMessageEvent, fgjz fgjzVar) {
        ((bbbr) this.v.b()).c(fjayVar, bdhg.a(chatSessionMessageEvent.c), 7, Optional.of(fgjzVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0270, code lost:
    
        if (r20.d() == 3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0269, code lost:
    
        if (r2 == 2) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(final com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r20, com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent r21, boolean r22, long r23, final int r25, defpackage.eopq r26) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cldf.c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent, boolean, long, int, eopq):void");
    }
}

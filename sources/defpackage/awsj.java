package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionsJsonParser;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.data.BasicTextMessage;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import com.google.android.rcs.client.messaging.data.LocationInformation;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awsj implements eigy {
    public static final entd a = entd.c("Bugle");
    public final awrj b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final awsn j;
    private final ffbr k;
    private final errl l;
    private final avty m = new avty();
    private final cqoh n;
    private final Bundle o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;
    private final ffbr s;
    private final ffbr t;
    private final ffbr u;
    private final ffbr v;
    private final ffbr w;
    private final ffbr x;
    private final ffbr y;
    private final atmb z;

    public awsj(awrj awrjVar, awsn awsnVar, Bundle bundle, errl errlVar, cqoh cqohVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, atmb atmbVar, ffbr ffbrVar18) {
        this.b = awrjVar;
        this.j = awsnVar;
        this.o = bundle;
        this.g = ffbrVar10;
        this.t = ffbrVar11;
        this.h = ffbrVar12;
        this.u = ffbrVar13;
        this.l = errlVar;
        this.n = cqohVar;
        this.p = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar;
        this.q = ffbrVar4;
        this.k = ffbrVar5;
        this.r = ffbrVar6;
        this.s = ffbrVar7;
        this.e = ffbrVar8;
        this.f = ffbrVar9;
        this.v = ffbrVar14;
        this.w = ffbrVar15;
        this.x = ffbrVar16;
        this.y = ffbrVar17;
        this.z = atmbVar;
        this.i = ffbrVar18;
    }

    private final elfl h() {
        ekzz f = eleg.f("UnencryptedIncomingChatMessageVisitor::clearTypingIndicatorAsync");
        try {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "clearTypingIndicator", 955, "UnencryptedIncomingChatMessageVisitor.java")).q("Clearing typing indicator on incoming message async.");
            elfl h = elfo.h(new erog() { // from class: awsf
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    eiem eiemVar = new eiem();
                    eiemVar.c(eigd.STOP);
                    IsComposingMessage a2 = eiemVar.a();
                    awsj awsjVar = awsj.this;
                    return ((awpq) awsjVar.d.b()).a(a2, awsjVar.b.b());
                }
            }, this.l);
            f.b(h);
            h.k(axnw.b(), erpp.a);
            elfl e = elfo.e(null);
            f.close();
            return e;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final void i(MessageReceipt messageReceipt, int i) {
        String d = messageReceipt.d();
        eyja eyjaVar = this.b.b().p;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        long epochMilli = eykj.d(eyjaVar).toEpochMilli();
        awui awuiVar = this.b.b().d;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        awrj awrjVar = this.b;
        String str = awuiVar.d;
        awuh awuhVar = awuh.GROUP;
        awui awuiVar2 = awrjVar.b().g;
        if (awuiVar2 == null) {
            awuiVar2 = awui.a;
        }
        awuh b = awuh.b(awuiVar2.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        ChatSessionMessageEvent chatSessionMessageEvent = new ChatSessionMessageEvent(0L, d, epochMilli, i, str, awuhVar.equals(b));
        cldf cldfVar = (cldf) this.t.b();
        awrj awrjVar2 = this.b;
        bdhg a2 = bdhg.a(awrjVar2.b().l);
        eopq eopqVar = awrjVar2.b().q;
        if (eopqVar == null) {
            eopqVar = eopq.a;
        }
        cldfVar.a(chatSessionMessageEvent, false, a2, eopqVar).k(axnw.c(new Consumer() { // from class: awsb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ensz enszVar = (ensz) awsj.a.h();
                ensn ensnVar = csux.f;
                awsj awsjVar = awsj.this;
                enszVar.Y(ensnVar, bdhg.a(awsjVar.b.b().l));
                enszVar.Y(csux.p, bdgq.b(awsjVar.b.b().m));
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "processDeliveryOrDisplayReceipt", 513, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for Message Receipt from Persistent Work Queue.");
                awsjVar.j.a(avui.SUCCESS);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), this.l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26, types: [int] */
    /* JADX WARN: Type inference failed for: r1v94 */
    /* JADX WARN: Type inference failed for: r3v9, types: [ckeo] */
    public final ckeo a() {
        ?? r1;
        azhq a2;
        Bundle bundle = new Bundle();
        eopq eopqVar = this.b.b().q;
        if (eopqVar == null) {
            eopqVar = eopq.a;
        }
        bundle.putByteArray("chat.extra.logData", eopqVar.toByteArray());
        bundle.putAll(this.o);
        fayv fayvVar = this.b.b().n;
        if (fayvVar == null) {
            fayvVar = fayv.a;
        }
        fayz fayzVar = fayz.a;
        eyhm eyhmVar = fayvVar.b;
        if (eyhmVar.containsKey("http://www.gsma.com/rcs/")) {
            fayzVar = (fayz) eyhmVar.get("http://www.gsma.com/rcs/");
        }
        eyhm eyhmVar2 = fayzVar.b;
        String str = eyhmVar2.containsKey("advised-action") ? (String) eyhmVar2.get("advised-action") : "";
        if (str.equals("warn")) {
            r1 = 1;
        } else if (str.equals("hide")) {
            r1 = 2;
        } else {
            fayv fayvVar2 = this.b.b().n;
            if (fayvVar2 == null) {
                fayvVar2 = fayv.a;
            }
            fayz fayzVar2 = fayz.a;
            eyhm eyhmVar3 = fayvVar2.b;
            if (eyhmVar3.containsKey("http://id.messages.google.com")) {
                fayzVar2 = (fayz) eyhmVar3.get("http://id.messages.google.com");
            }
            eyhm eyhmVar4 = fayzVar2.b;
            r1 = "warn".equals(eyhmVar4.containsKey("warn-level") ? (String) eyhmVar4.get("warn-level") : "");
        }
        awrj awrjVar = this.b;
        ?? C = ckep.C();
        ckay ckayVar = (ckay) C;
        ckayVar.a = bdhg.a(awrjVar.b().l);
        awui awuiVar = awrjVar.b().d;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        C.l(awuiVar.d);
        awui awuiVar2 = this.b.b().d;
        if (awuiVar2 == null) {
            awuiVar2 = awui.a;
        }
        C.k(awuiVar2);
        eyja eyjaVar = this.b.b().p;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        C.o(eykm.b(eyjaVar));
        C.j(this.n.f().toEpochMilli());
        avty avtyVar = this.m;
        awup awupVar = this.b.e().c;
        if (awupVar == null) {
            awupVar = awup.a;
        }
        ckayVar.f = ((ContentType) avtyVar.fP(awupVar)).toString();
        C.i();
        awrj awrjVar2 = this.b;
        awuh awuhVar = awuh.GROUP;
        awui awuiVar3 = awrjVar2.b().g;
        if (awuiVar3 == null) {
            awuiVar3 = awui.a;
        }
        awuh b = awuh.b(awuiVar3.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        C.e(awuhVar.equals(b));
        C.q(r1);
        awrj awrjVar3 = this.b;
        awuh awuhVar2 = awuh.BOT;
        awui awuiVar4 = awrjVar3.b().d;
        if (awuiVar4 == null) {
            awuiVar4 = awui.a;
        }
        awuh b2 = awuh.b(awuiVar4.c);
        if (b2 == null) {
            b2 = awuh.UNKNOWN_TYPE;
        }
        C.f(awuhVar2.equals(b2));
        awrj awrjVar4 = this.b;
        fayv fayvVar3 = awrjVar4.b().n;
        if (fayvVar3 == null) {
            fayvVar3 = fayv.a;
        }
        ckayVar.g = fayvVar3;
        awui awuiVar5 = awrjVar4.b().j;
        if (awuiVar5 == null) {
            awuiVar5 = awui.a;
        }
        C.m(awuiVar5);
        C.b(bundle);
        C.p(false);
        if (this.z.a()) {
            azee azeeVar = this.b.b().f;
            if (azeeVar == null) {
                azeeVar = azee.a;
            }
            C.n(azcp.a(azeeVar));
        } else {
            String str2 = this.b.b().e;
            azcr azcrVar = azcr.a;
            C.n(azcq.a(str2));
        }
        awui awuiVar6 = this.b.b().g;
        if (awuiVar6 == null) {
            awuiVar6 = awui.a;
        }
        awuh b3 = awuh.b(awuiVar6.c);
        if (b3 == null) {
            b3 = awuh.UNKNOWN_TYPE;
        }
        if (b3.equals(awuh.GROUP)) {
            awrj awrjVar5 = this.b;
            ckayVar.d = awrjVar5.b().m;
            awui awuiVar7 = awrjVar5.b().g;
            if (awuiVar7 == null) {
                awuiVar7 = awui.a;
            }
            ckayVar.e = awuiVar7.d;
            if (this.z.a()) {
                azjw azjwVar = this.b.b().i;
                if (azjwVar == null) {
                    azjwVar = azjw.a;
                }
                a2 = azhf.a(azjwVar);
            } else {
                a2 = azhp.a(this.b.b().h);
            }
            ckayVar.c = a2;
        }
        eygk eygkVar = new eygk(this.b.b().s, awxk.a);
        C.c(eygkVar.contains(awxj.POSITIVE_DELIVERY));
        C.d(eygkVar.contains(awxj.DISPLAY));
        if (((augx) this.v.b()).a()) {
            C.g(eygkVar.contains(awxj.NEGATIVE_DELIVERY));
            return C;
        }
        C.g(false);
        return C;
    }

    @Override // defpackage.eigy
    public final void b(final BasicTextMessage basicTextMessage) {
        (((askz) this.i.b()).a() ? elfo.e(null) : h()).i(new eroh() { // from class: awrm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                awsj awsjVar = awsj.this;
                clbm clbmVar = (clbm) awsjVar.g.b();
                ckeo a2 = awsjVar.a();
                ckay ckayVar = (ckay) a2;
                ckayVar.b = basicTextMessage.a();
                if (((askz) awsjVar.i.b()).a()) {
                    a2.p(true);
                    ckayVar.i = awsjVar.b.b();
                }
                return clbmVar.a(a2.r());
            }
        }, this.l).h(new emwl() { // from class: awrn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensz enszVar = (ensz) awsj.a.h();
                ensn ensnVar = csux.f;
                awsj awsjVar = awsj.this;
                enszVar.Y(ensnVar, bdhg.a(awsjVar.b.b().l));
                enszVar.Y(csux.p, bdgq.b(awsjVar.b.b().m));
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 300, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for BasicTextMessage from Persistent Work Queue.");
                awsjVar.j.a(avui.SUCCESS);
                return avui.SUCCESS;
            }
        }, this.l).e(awqs.class, new emwl() { // from class: awro
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                awsj.this.j.a(avui.FAIL_RETRY);
                return avui.FAIL_RETRY;
            }
        }, this.l).e(cjee.class, new emwl() { // from class: awrp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((ensz) ((ensz) ((ensz) awsj.a.j()).g((cjee) obj)).h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 316, "UnencryptedIncomingChatMessageVisitor.java")).q("Received GeminiParticipantsLookupException. Retying.");
                awsj.this.j.a(avui.FAIL_RETRY);
                return avui.FAIL_RETRY;
            }
        }, this.l).k(axnw.b(), erpp.a);
    }

    @Override // defpackage.eigy
    public final void c(final ChatMessage chatMessage) {
        boolean a2;
        if (eijq.f.f(chatMessage.a())) {
            h().i(new eroh() { // from class: awrk
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    awsj awsjVar = awsj.this;
                    clbm clbmVar = (clbm) awsjVar.g.b();
                    ckeo a3 = awsjVar.a();
                    ((ckay) a3).b = chatMessage.b().E();
                    return clbmVar.a(a3.r());
                }
            }, this.l).h(new emwl() { // from class: awrv
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ensz enszVar = (ensz) awsj.a.h();
                    ensn ensnVar = csux.f;
                    awsj awsjVar = awsj.this;
                    enszVar.Y(ensnVar, bdhg.a(awsjVar.b.b().l));
                    enszVar.Y(csux.p, bdgq.b(awsjVar.b.b().m));
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visitIncomingRbmMessage", 670, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for incoming RBM message from Persistent Work Queue.");
                    awsjVar.j.a(avui.SUCCESS);
                    return avui.SUCCESS;
                }
            }, this.l).k(axnw.b(), erpp.a);
            return;
        }
        if (eijq.g.f(chatMessage.a())) {
            final avig avigVar = (avig) this.k.b();
            final awrj awrjVar = this.b;
            elfl i = elfo.g(new Callable() { // from class: avid
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String f = ((awtm) avig.this.e.b()).a().f();
                    awrj awrjVar2 = awrjVar;
                    String str = awrjVar2.b().l;
                    ArrayList<ConversationSuggestion> parse = new ConversationSuggestionsJsonParser().parse(chatMessage.b().E());
                    int size = parse.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ConversationSuggestion conversationSuggestion = parse.get(i2);
                        conversationSuggestion.setRcsMessageId(f);
                        conversationSuggestion.setTargetRcsMessageId(str);
                    }
                    if (Objects.isNull(parse) || dkta.a(parse) || TextUtils.isEmpty(str)) {
                        return Optional.empty();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArrayList(RcsIntents.EXTRA_CONVERSATION_SUGGESTIONS, parse);
                    awui awuiVar = awrjVar2.b().d;
                    if (awuiVar == null) {
                        awuiVar = awui.a;
                    }
                    bundle.putString(RcsIntents.EXTRA_USER_ID, awuiVar.d);
                    bdhg.h(bundle, RcsIntents.EXTRA_MESSAGE_ID, bdhg.a(f));
                    bdhg.h(bundle, RcsIntents.EXTRA_TARGET_RCS_MESSAGE_ID, bdhg.a(str));
                    return Optional.of(bundle);
                }
            }, avigVar.c).i(new eroh() { // from class: avie
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final awrj awrjVar2 = awrjVar;
                    Optional optional = (Optional) obj;
                    if (optional != null && optional.isPresent()) {
                        avig avigVar2 = avig.this;
                        return ((bart) avigVar2.d.b()).a((Bundle) optional.get()).q().h(new emwl() { // from class: avif
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                csjb c = avig.a.c();
                                awrj awrjVar3 = awrj.this;
                                c.h(bdhg.a(awrjVar3.b().l));
                                c.g(awrjVar3.b().m);
                                c.I("Completed action for incoming RBM suggestions from Persistent Work Queue.");
                                c.r();
                                return avui.SUCCESS;
                            }
                        }, avigVar2.b);
                    }
                    csjb e = avig.a.e();
                    e.h(bdhg.a(awrjVar2.b().l));
                    e.g(awrjVar2.b().m);
                    e.I("RBM suggestions could not be processed. Discarding..");
                    e.r();
                    return elfo.e(avui.FAIL_NO_RETRY);
                }
            }, avigVar.b);
            final awsn awsnVar = this.j;
            i.k(axnw.c(new Consumer() { // from class: awrx
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    awsn.this.a((avui) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), this.l);
            return;
        }
        if (djbc.a.f(chatMessage.a())) {
            h().i(new eroh() { // from class: awsg
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    awsj awsjVar = awsj.this;
                    clbm clbmVar = (clbm) awsjVar.g.b();
                    ckeo a3 = awsjVar.a();
                    ((ckay) a3).b = chatMessage.b().E();
                    return clbmVar.a(a3.r());
                }
            }, this.l).h(new emwl() { // from class: awsh
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ensz enszVar = (ensz) awsj.a.h();
                    ensn ensnVar = csux.f;
                    awsj awsjVar = awsj.this;
                    enszVar.Y(ensnVar, bdhg.a(awsjVar.b.b().l));
                    enszVar.Y(csux.p, bdgq.b(awsjVar.b.b().m));
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visitProtoMessage", 701, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for Proto Message from Persistent Work Queue.");
                    awsjVar.j.a(avui.SUCCESS);
                    return avui.SUCCESS;
                }
            }, this.l).k(axnw.b(), erpp.a);
            return;
        }
        if (((bzqa) this.e.b()).h()) {
            ContentType a3 = chatMessage.a();
            a2 = djbb.a(a3) || djbb.c(a3);
        } else {
            a2 = djbb.a(chatMessage.a());
        }
        if (a2) {
            ensz enszVar = (ensz) a.j();
            enszVar.Y(csux.f, bdhg.a(this.b.b().l));
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visitUnsupportedEncryptedMessage", 715, "UnencryptedIncomingChatMessageVisitor.java")).q("Incoming Etouffee message. Check if the release was compiled with the Etouffee module. Message will be processed as a basic text message.");
            h().i(new eroh() { // from class: awsc
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    awsj awsjVar = awsj.this;
                    if (((bzqa) awsjVar.e.b()).h()) {
                        ckeo a4 = awsjVar.a();
                        ckay ckayVar = (ckay) a4;
                        ckayVar.f = eijq.e.toString();
                        ckayVar.b = ((Context) awsjVar.h.b()).getString(((caao) awsjVar.f.b()).a());
                        a4.h(114);
                        return ((clbm) awsjVar.g.b()).a(a4.r());
                    }
                    ChatMessage chatMessage2 = chatMessage;
                    ckeo a5 = awsjVar.a();
                    ckay ckayVar2 = (ckay) a5;
                    ckayVar2.f = eijq.e.toString();
                    ckayVar2.b = chatMessage2.b().E();
                    return ((clbm) awsjVar.g.b()).a(a5.r());
                }
            }, this.l).k(axnw.c(new Consumer() { // from class: awsd
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ensz enszVar2 = (ensz) awsj.a.h();
                    ensn ensnVar = csux.f;
                    awsj awsjVar = awsj.this;
                    enszVar2.Y(ensnVar, bdhg.a(awsjVar.b.b().l));
                    enszVar2.Y(csux.p, bdgq.b(awsjVar.b.b().m));
                    ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visitUnsupportedEncryptedMessage", 754, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for Unknown Encrypted message from Persistent Work Queue.");
                    awsjVar.j.a(avui.SUCCESS);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), this.l);
            return;
        }
        if (((augx) this.v.b()).a()) {
            ensz enszVar2 = (ensz) a.j();
            enszVar2.Y(csux.f, bdhg.a(this.b.b().l));
            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visitUnknownContentTypeMessage", 768, "UnencryptedIncomingChatMessageVisitor.java")).D("Incoming message with unknown content type. type: %s, subType: %s", chatMessage.a().c(), chatMessage.a().b());
            h().i(new eroh() { // from class: awrq
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    awsj awsjVar = awsj.this;
                    clbm clbmVar = (clbm) awsjVar.g.b();
                    ckeo a4 = awsjVar.a();
                    a4.h(116);
                    return clbmVar.a(a4.r());
                }
            }, this.l).h(new emwl() { // from class: awrr
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ensz enszVar3 = (ensz) awsj.a.h();
                    ensn ensnVar = csux.f;
                    awsj awsjVar = awsj.this;
                    enszVar3.Y(ensnVar, bdhg.a(awsjVar.b.b().l));
                    enszVar3.Y(csux.p, bdgq.b(awsjVar.b.b().m));
                    ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visitUnknownContentTypeMessage", 794, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for Unknown Content Type message from Persistent Work Queue.");
                    awsjVar.j.a(avui.SUCCESS);
                    return avui.SUCCESS;
                }
            }, this.l).k(axnw.b(), erpp.a);
            return;
        }
        bdhg a4 = bdhg.a(this.b.b().l);
        ensz enszVar3 = (ensz) a.j();
        enszVar3.Y(csux.f, a4);
        enszVar3.Y(csux.p, bdgq.b(this.b.b().m));
        ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 264, "UnencryptedIncomingChatMessageVisitor.java")).D("Ignoring received message with unknown content type. type: %s, subType: %s", chatMessage.a().c(), chatMessage.a().b());
        avkz avkzVar = (avkz) this.r.b();
        String contentType = chatMessage.a().toString();
        eopq eopqVar = this.b.b().q;
        if (eopqVar == null) {
            eopqVar = eopq.a;
        }
        eqyl b = eqyl.b(eopqVar.aa);
        if (b == null) {
            b = eqyl.UNKNOWN_RCS_TYPE;
        }
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        String f = a4.f();
        eoopVar.copyOnWrite();
        eopq eopqVar2 = (eopq) eoopVar.instance;
        eopqVar2.b |= Integer.MIN_VALUE;
        eopqVar2.H = f;
        if (b == null) {
            b = avkzVar.a.a();
        }
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.aa = b.h;
        eopqVar3.c |= 2097152;
        eoopVar.copyOnWrite();
        eopq eopqVar4 = (eopq) eoopVar.instance;
        eopqVar4.g = 8;
        eopqVar4.b = 1 | eopqVar4.b;
        eoopVar.copyOnWrite();
        eopq eopqVar5 = (eopq) eoopVar.instance;
        eopqVar5.h = 22;
        eopqVar5.b |= 2;
        eoopVar.copyOnWrite();
        eopq eopqVar6 = (eopq) eoopVar.instance;
        eopqVar6.c |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        eopqVar6.ah = contentType;
        avkzVar.d((eopq) eoopVar.build());
        this.j.a(avui.FAIL_NO_RETRY);
    }

    @Override // defpackage.eigy
    public final void d(final FileTransferInformation fileTransferInformation) {
        final cqzx cqzxVar = (cqzx) this.q.b();
        final awxk b = this.b.b();
        final bdhg a2 = bdhg.a(b.l);
        awui awuiVar = b.d;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        final awui awuiVar2 = awuiVar;
        awui awuiVar3 = b.g;
        if (awuiVar3 == null) {
            awuiVar3 = awui.a;
        }
        final awui awuiVar4 = awuiVar3;
        awui awuiVar5 = b.j;
        if (awuiVar5 == null) {
            awuiVar5 = awui.a;
        }
        final awui awuiVar6 = awuiVar5;
        ((chxe) cqzxVar.L.b()).a(awuiVar2.d, 24);
        ((chxe) cqzxVar.L.b()).a(awuiVar6.d, 25);
        eyja eyjaVar = b.p;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        final Instant ofEpochSecond = Instant.ofEpochSecond(eyjaVar.b, eyjaVar.c);
        final Instant f = (cqzx.h(awuiVar2) && ofEpochSecond.isAfter(Instant.MIN)) ? ofEpochSecond : cqzxVar.t.f();
        final Bundle bundle = this.o;
        elfo.g(new Callable() { // from class: cqyn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(((crrm) cqzx.this.x.b()).e(awuiVar2.d));
            }
        }, cqzxVar.c).i(new eroh() { // from class: cqxy
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                bdhg bdhgVar;
                awxk awxkVar;
                final Optional empty;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final cqzx cqzxVar2 = cqzx.this;
                final bdhg bdhgVar2 = a2;
                final awui awuiVar7 = awuiVar2;
                final awxk awxkVar2 = b;
                final Bundle bundle2 = bundle;
                final awui awuiVar8 = awuiVar6;
                final awui awuiVar9 = awuiVar4;
                final Instant instant = ofEpochSecond;
                if (booleanValue) {
                    if (!new eygk(awxkVar2.s, awxk.a).contains(awxj.POSITIVE_DELIVERY)) {
                        ensk n = cqzx.a.n();
                        n.Y(csux.f, bdhgVar2);
                        n.Y(csux.n, cskt.b(awuiVar7.d));
                        ((ensz) n.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "sendDeliveryReportForBlockedUser", 1038, "IncomingFileTransferProcessor.java")).q("Do not send a delivery report as it is not requested.");
                        return elfo.e(avui.SUCCESS);
                    }
                    ensz enszVar = (ensz) cqzx.a.h();
                    enszVar.Y(csux.f, bdhgVar2);
                    enszVar.Y(csux.n, cskt.b(awuiVar7.d));
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "sendDeliveryReportForBlockedUser", 1045, "IncomingFileTransferProcessor.java")).q("Received a file transfer message from a blocked user. Sending delivery report");
                    final avkl avklVar = cqzx.i(awuiVar9) ? new avkl(cqzxVar2.k.a.a(awxkVar2.m, awuiVar9.d), engw.r(awuiVar7), true) : new avkl(awuiVar7);
                    return elfo.h(new erog() { // from class: cqxz
                        @Override // defpackage.erog
                        public final ListenableFuture a() {
                            Optional empty2;
                            Bundle bundle3 = bundle2;
                            bdhg bdhgVar3 = bdhgVar2;
                            String string = bundle3.getString("chat.extra.customDeliveryReceiptContentType");
                            byte[] byteArray = bundle3.getByteArray("chat.extra.customDeliveryReceipt");
                            if (string != null && byteArray != null) {
                                empty2 = Optional.of(new couq(string, byteArray));
                            } else {
                                if (string != null || byteArray != null) {
                                    ensz enszVar2 = (ensz) cqzx.a.j();
                                    enszVar2.Y(csux.f, bdhgVar3);
                                    ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getOptionalRcsMessageReceiptConverter", 1110, "IncomingFileTransferProcessor.java")).t("custom report contentType or receipt is null. Content type: %s", string);
                                    throw new IllegalArgumentException("custom contentType and receipt must both be null or not null");
                                }
                                empty2 = Optional.empty();
                            }
                            Optional optional = empty2;
                            cqzx cqzxVar3 = cqzx.this;
                            awui awuiVar10 = awuiVar8;
                            avkl avklVar2 = avklVar;
                            return cqzxVar3.j.d(bdhgVar3, instant, avklVar2, optional, awuiVar10, bundle3);
                        }
                    }, cqzxVar2.c).i(new eroh() { // from class: cqya
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            ckdq ckdqVar = (ckdq) obj2;
                            altk altkVar = (altk) cqzx.this.d.b();
                            eqxi eqxiVar = ckdqVar.b;
                            eqyl eqylVar = ckdqVar.c;
                            bdhg bdhgVar3 = bdhgVar2;
                            altkVar.ap(bdhgVar3, eqxiVar, eqylVar);
                            boolean z = ckdqVar.a;
                            awui awuiVar10 = awuiVar7;
                            if (z) {
                                ensz enszVar2 = (ensz) cqzx.a.h();
                                enszVar2.Y(csux.f, bdhgVar3);
                                enszVar2.Y(csux.n, cskt.b(awuiVar10.d));
                                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "sendDeliveryReportForBlockedUser", 1079, "IncomingFileTransferProcessor.java")).q("Completed a file transfer from a blocked user.");
                                return elfo.e(avui.SUCCESS);
                            }
                            ensz enszVar3 = (ensz) cqzx.a.i();
                            enszVar3.Y(csux.f, bdhgVar3);
                            enszVar3.Y(csux.n, cskt.b(awuiVar10.d));
                            ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "sendDeliveryReportForBlockedUser", 1087, "IncomingFileTransferProcessor.java")).q("Failed to send delivery report for incoming file transfer push message from a blocked user. InvocationResultAndDiagnostic is not successful");
                            return elfo.e(avui.FAIL_RETRY);
                        }
                    }, cqzxVar2.c);
                }
                final FileTransferInformation fileTransferInformation2 = fileTransferInformation;
                final Instant instant2 = f;
                if (cqzxVar2.N.a()) {
                    final elfl c = cqzxVar2.c(awuiVar7);
                    return c.i(new eroh() { // from class: cqyq
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            final azcr a3;
                            elfl c2;
                            awxk awxkVar3 = awxkVar2;
                            final cqzx cqzxVar3 = cqzx.this;
                            if (cqzxVar3.O.a()) {
                                if ((awxkVar3.c & 32) != 0) {
                                    azfv azfvVar = (azfv) cqzxVar3.S.b();
                                    azjw azjwVar = awxkVar3.i;
                                    if (azjwVar == null) {
                                        azjwVar = azjw.a;
                                    }
                                    a3 = azfvVar.a(azhf.a(azjwVar));
                                } else {
                                    azee azeeVar = awxkVar3.f;
                                    if (azeeVar == null) {
                                        azeeVar = azee.a;
                                    }
                                    a3 = azcp.a(azeeVar);
                                }
                            } else if ((awxkVar3.c & 16) != 0) {
                                a3 = ((azfv) cqzxVar3.S.b()).a(azhp.a(awxkVar3.h));
                            } else {
                                String str = awxkVar3.e;
                                azcr azcrVar = azcr.a;
                                a3 = azcq.a(str);
                            }
                            if ((!cqzxVar3.O.a() && (awxkVar3.c & 16) != 0) || (cqzxVar3.O.a() && (awxkVar3.c & 32) != 0)) {
                                return ((awss) cqzxVar3.Q.b()).c(a3);
                            }
                            azow azowVar = (azow) cqzxVar3.P.b();
                            awui awuiVar10 = awxkVar3.j;
                            if (awuiVar10 == null) {
                                awuiVar10 = awui.a;
                            }
                            awuiVar10.getClass();
                            c2 = axol.c(azowVar.b, ffhe.a, ffsm.a, new azot(azowVar, awuiVar10, null));
                            return c2.i(new eroh() { // from class: cqys
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    elfl c3;
                                    awss awssVar = (awss) cqzx.this.Q.b();
                                    azsu b2 = ((azop) obj3).b();
                                    amer amerVar = amer.b;
                                    amerVar.getClass();
                                    c3 = axol.c(awssVar.b, ffhe.a, ffsm.a, new awsr(awssVar, a3, b2, amerVar, null));
                                    return c3;
                                }
                            }, cqzxVar3.c);
                        }
                    }, cqzxVar2.c).i(new eroh() { // from class: cqyr
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            elfl h;
                            final ConversationIdType conversationIdType = (ConversationIdType) obj2;
                            boolean b2 = conversationIdType.b();
                            final bdhg bdhgVar3 = bdhgVar2;
                            final awui awuiVar10 = awuiVar7;
                            if (b2) {
                                ensz enszVar2 = (ensz) cqzx.a.i();
                                enszVar2.Y(csux.f, bdhgVar3);
                                enszVar2.Y(csux.n, cskt.b(awuiVar10.d));
                                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "processFileTransferPushMessageForNonBlockedUserWithDestination", 622, "IncomingFileTransferProcessor.java")).q("Failed to process incoming file transfer push message. Could not retrieve the conversation for this message.");
                                return elfo.e(avui.FAIL_RETRY);
                            }
                            elfl elflVar = c;
                            final awxk awxkVar3 = awxkVar2;
                            final cqzx cqzxVar3 = cqzx.this;
                            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) erqt.q(elflVar);
                            if (bindData != null) {
                                ensz enszVar3 = (ensz) cqzx.a.h();
                                enszVar3.Y(csux.n, cskt.b(awuiVar10.d));
                                ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "updateRbmSenderParticipantInDb", 1345, "IncomingFileTransferProcessor.java")).q("Existing RBM bot participant found. No need to update.");
                                h = elfo.e(bindData);
                            } else if (cqzx.h(awuiVar10)) {
                                ParticipantsTable.BindData c2 = ((bdrr) cqzxVar3.e.b()).c(awuiVar10.d);
                                c2.getClass();
                                final String S = c2.S();
                                h = cqzxVar3.b(awuiVar10).h(new emwl() { // from class: cqzp
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        BusinessInfoData businessInfoData = (BusinessInfoData) obj3;
                                        avhl avhlVar = (avhl) cqzx.this.R.b();
                                        awxk awxkVar4 = awxkVar3;
                                        String str = awuiVar10.d;
                                        fayv fayvVar = awxkVar4.n;
                                        if (fayvVar == null) {
                                            fayvVar = fayv.a;
                                        }
                                        return Boolean.valueOf(avhlVar.c(S, str, businessInfoData, fayvVar));
                                    }
                                }, cqzxVar3.c).h(new emwl() { // from class: cqzq
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        ParticipantsTable.BindData b3 = ((bdrr) cqzx.this.e.b()).b(S);
                                        b3.getClass();
                                        return b3;
                                    }
                                }, cqzxVar3.c);
                            } else {
                                ParticipantsTable.BindData d = ((bdrr) cqzxVar3.e.b()).d(awuiVar10.d);
                                d.getClass();
                                h = elfo.e(d);
                            }
                            final Bundle bundle3 = bundle2;
                            final FileTransferInformation fileTransferInformation3 = fileTransferInformation2;
                            final awui awuiVar11 = awuiVar9;
                            final Instant instant3 = instant2;
                            final Instant instant4 = instant;
                            final awui awuiVar12 = awuiVar8;
                            return h.i(new eroh() { // from class: cqzo
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    cqzx cqzxVar4 = cqzx.this;
                                    awui awuiVar13 = awuiVar11;
                                    bdhg bdhgVar4 = bdhgVar3;
                                    ConversationIdType conversationIdType2 = conversationIdType;
                                    FileTransferInformation fileTransferInformation4 = fileTransferInformation3;
                                    return cqzxVar4.f(bdhgVar4, awuiVar10, awuiVar12, (ParticipantsTable.BindData) obj3, null, conversationIdType2, instant4, instant3, null, awuiVar13, fileTransferInformation4, awxkVar3, bundle3);
                                }
                            }, cqzxVar3.c);
                        }
                    }, cqzxVar2.c);
                }
                final elfl c2 = cqzxVar2.c(awuiVar7);
                final elfl b2 = cqzxVar2.b(awuiVar7);
                fayv fayvVar = awxkVar2.n;
                if (fayvVar == null) {
                    fayvVar = fayv.a;
                }
                if (fayvVar == null) {
                    empty = Optional.empty();
                    bdhgVar = bdhgVar2;
                    awxkVar = awxkVar2;
                } else {
                    bdhgVar = bdhgVar2;
                    awxkVar = awxkVar2;
                    ((ensz) ((ensz) cqzx.a.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getAgentNameFromCpimHeader", 1299, "IncomingFileTransferProcessor.java")).q("Trying to get Agent Name from custom CPIM header");
                    fayz fayzVar = fayz.a;
                    eyhm eyhmVar = fayvVar.b;
                    if (eyhmVar.containsKey("urn:rcs:google:")) {
                        fayzVar = (fayz) eyhmVar.get("urn:rcs:google:");
                    }
                    eyhm eyhmVar2 = fayzVar.b;
                    String str = eyhmVar2.containsKey("Agent-Name") ? (String) eyhmVar2.get("Agent-Name") : "";
                    empty = TextUtils.isEmpty(str) ? Optional.empty() : Optional.of(str);
                }
                final elfl a3 = elfo.m(c2, b2).a(new Callable() { // from class: cqzb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        entd entdVar = cqzx.a;
                        Object q = erqt.q(elfl.this);
                        awui awuiVar10 = awuiVar7;
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) q;
                        BusinessInfoData businessInfoData = (BusinessInfoData) erqt.q(b2);
                        if (!cqzx.j(awuiVar10, bindData)) {
                            return bdqu.b(awuiVar10.d);
                        }
                        if (bindData != null) {
                            ensz enszVar2 = (ensz) cqzx.a.h();
                            enszVar2.Y(csux.n, cskt.b(awuiVar10.d));
                            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getSenderParticipant", 1157, "IncomingFileTransferProcessor.java")).q("Existing RBM bot participant found");
                            return bindData;
                        }
                        if (businessInfoData == null) {
                            Optional optional = empty;
                            if (optional.isPresent()) {
                                ((ensz) ((ensz) cqzx.a.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getSenderParticipant", 1163, "IncomingFileTransferProcessor.java")).q("Using Agent Name from Custom Header to create participant");
                                return bdqu.a(awuiVar10.d, (String) optional.get(), null);
                            }
                        }
                        if (businessInfoData == null) {
                            ensz enszVar3 = (ensz) cqzx.a.j();
                            enszVar3.Y(csux.n, cskt.b(awuiVar10.d));
                            ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getNewParticipantDataForRbmBot", 1315, "IncomingFileTransferProcessor.java")).q("No business info available for incoming RCS file transfer. Using defaults");
                        }
                        String name = businessInfoData == null ? null : businessInfoData.getName();
                        String color = businessInfoData != null ? businessInfoData.getColor() : null;
                        ParticipantsTable.BindData a4 = bdqu.a(awuiVar10.d, name, color);
                        ensz enszVar4 = (ensz) cqzx.a.h();
                        enszVar4.Y(csux.n, cskt.b(awuiVar10.d));
                        ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getNewParticipantDataForRbmBot", 1326, "IncomingFileTransferProcessor.java")).D("No existing bot participant. Creating one: Name: %s. Color: %s", cskt.b(name), color);
                        return a4;
                    }
                }, cqzxVar2.c);
                ListenableFuture[] listenableFutureArr = {a3, c2};
                final bdhg bdhgVar3 = bdhgVar;
                final awxk awxkVar3 = awxkVar;
                return elfo.m(listenableFutureArr).a(new Callable() { // from class: cqzc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) erqt.q(a3);
                        ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) erqt.q(c2);
                        awxk awxkVar4 = awxkVar3;
                        String str2 = awxkVar4.m;
                        fayv fayvVar2 = awxkVar4.n;
                        if (fayvVar2 == null) {
                            fayvVar2 = fayv.a;
                        }
                        awui awuiVar10 = awuiVar9;
                        awuh b3 = awuh.b(awuiVar10.c);
                        if (b3 == null) {
                            b3 = awuh.UNKNOWN_TYPE;
                        }
                        awui awuiVar11 = awuiVar7;
                        cqzx cqzxVar3 = cqzx.this;
                        boolean equals = b3.equals(awuh.GROUP);
                        ckjy w = ckjz.w();
                        w.j(!equals);
                        w.p(cqzx.j(awuiVar11, bindData2));
                        w.q(equals);
                        w.w(epby.INCOMING_FILE_TRANSFER);
                        w.r(engw.r(bindData));
                        w.k(fayvVar2);
                        if (equals) {
                            emxf.b(!str2.isEmpty(), "RCS group ID missing");
                            emxf.b(true ^ awuiVar10.d.isEmpty(), "Conference URI is missing");
                            w.u(str2);
                            w.s(awuiVar10.d);
                        } else {
                            if (cqzxVar3.U.b(bundle2)) {
                                w.B(true);
                                w.i(amer.b);
                            }
                        }
                        bdhg bdhgVar4 = bdhgVar3;
                        crme c3 = cqzxVar3.l.c(w.D());
                        if (c3 == null) {
                            ensz enszVar2 = (ensz) cqzx.a.j();
                            enszVar2.Y(csux.f, bdhgVar4);
                            enszVar2.Y(csux.n, cskt.b(awuiVar11.d));
                            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getConversation", 1262, "IncomingFileTransferProcessor.java")).q("Incoming RCS file transfer but we could not get/create the conversation");
                            c3 = null;
                        } else {
                            ensz enszVar3 = (ensz) cqzx.a.h();
                            enszVar3.Y(csux.f, bdhgVar4);
                            enszVar3.Y(csux.n, cskt.b(awuiVar11.d));
                            enszVar3.Y(csux.p, c3.a());
                            ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getConversation", 1271, "IncomingFileTransferProcessor.java")).q("Conversation found for incoming RCS file transfer");
                        }
                        return Optional.ofNullable(c3);
                    }
                }, cqzxVar2.c).i(new eroh() { // from class: cqzd
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        Optional optional = (Optional) obj2;
                        boolean isEmpty = optional.isEmpty();
                        bdhg bdhgVar4 = bdhgVar3;
                        awui awuiVar10 = awuiVar7;
                        if (isEmpty) {
                            ensz enszVar2 = (ensz) cqzx.a.i();
                            enszVar2.Y(csux.f, bdhgVar4);
                            enszVar2.Y(csux.n, cskt.b(awuiVar10.d));
                            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "processFileTransferPushMessageForNonBlockedUser", 524, "IncomingFileTransferProcessor.java")).q("Failed to process incoming file transfer push message. Could not retrieve the conversation for this message.");
                            return elfo.e(avui.FAIL_RETRY);
                        }
                        Bundle bundle3 = bundle2;
                        awxk awxkVar4 = awxkVar3;
                        FileTransferInformation fileTransferInformation3 = fileTransferInformation2;
                        awui awuiVar11 = awuiVar9;
                        elfl elflVar = b2;
                        Instant instant3 = instant2;
                        Instant instant4 = instant;
                        elfl elflVar2 = a3;
                        return cqzx.this.f(bdhgVar4, awuiVar10, awuiVar8, (ParticipantsTable.BindData) erqt.q(elflVar2), (crme) optional.get(), null, instant4, instant3, (BusinessInfoData) erqt.q(elflVar), awuiVar11, fileTransferInformation3, awxkVar4, bundle3);
                    }
                }, cqzxVar2.c);
            }
        }, cqzxVar.c).e(IllegalStateException.class, new emwl() { // from class: awry
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((ensz) ((ensz) ((ensz) awsj.a.j()).g((IllegalStateException) obj)).h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 379, "UnencryptedIncomingChatMessageVisitor.java")).q("File transfer processing failed.");
                return avui.FAIL_RETRY;
            }
        }, this.l).e(cjee.class, new emwl() { // from class: awrz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((ensz) ((ensz) ((ensz) awsj.a.j()).g((cjee) obj)).h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 386, "UnencryptedIncomingChatMessageVisitor.java")).q("Received GeminiParticipantsLookupException. Retying.");
                awsj.this.j.a(avui.FAIL_RETRY);
                return avui.FAIL_RETRY;
            }
        }, this.l).k(axnw.c(new Consumer() { // from class: awsa
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ensz enszVar = (ensz) awsj.a.h();
                ensn ensnVar = csux.e;
                awsj awsjVar = awsj.this;
                enszVar.Y(ensnVar, awsjVar.b.b().l);
                enszVar.Y(csux.p, bdgq.b(awsjVar.b.b().m));
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 403, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for FileTransferInformation from Persistent Work Queue.");
                awsjVar.j.a((avui) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), this.l);
    }

    @Override // defpackage.eigy
    public final void e(final IsComposingMessage isComposingMessage) {
        ((awpq) this.d.b()).a(isComposingMessage, this.b.b()).k(axnw.c(new Consumer() { // from class: awrl
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ensz enszVar = (ensz) awsj.a.h();
                ensn ensnVar = csux.e;
                awsj awsjVar = awsj.this;
                enszVar.Y(ensnVar, awsjVar.b.b().l);
                enszVar.Y(csux.J, awsjVar.b.b().m);
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 472, "UnencryptedIncomingChatMessageVisitor.java")).t("Completed processing IsComposing message with state: %s", isComposingMessage.a());
                awsjVar.j.a(avui.SUCCESS);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), this.l);
    }

    @Override // defpackage.eigy
    public final void f(LocationInformation locationInformation) {
        final com.google.android.ims.rcsservice.locationsharing.LocationInformation locationInformation2 = new com.google.android.ims.rcsservice.locationsharing.LocationInformation();
        locationInformation2.d = locationInformation.a();
        locationInformation2.c = locationInformation.b();
        if (locationInformation.d().isPresent()) {
            locationInformation2.f = ((Instant) locationInformation.d().get()).toEpochMilli();
        }
        locationInformation.g().ifPresent(new Consumer() { // from class: awrs
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                com.google.android.ims.rcsservice.locationsharing.LocationInformation.this.e = ((Double) obj).doubleValue();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        locationInformation.e().ifPresent(new Consumer() { // from class: awrt
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                com.google.android.ims.rcsservice.locationsharing.LocationInformation.this.a = (String) obj;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        clbm clbmVar = (clbm) this.g.b();
        ckeo a2 = a();
        ((ckay) a2).h = locationInformation2;
        clbmVar.a(a2.r()).h(new emwl() { // from class: awru
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensz enszVar = (ensz) awsj.a.h();
                ensn ensnVar = csux.e;
                awsj awsjVar = awsj.this;
                enszVar.Y(ensnVar, awsjVar.b.b().l);
                enszVar.Y(csux.p, bdgq.b(awsjVar.b.b().m));
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 350, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for Location Information from Persistent Work Queue.");
                awsjVar.j.a(avui.SUCCESS);
                return avui.SUCCESS;
            }
        }, this.l).e(awqs.class, new emwl() { // from class: awrw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                awsj.this.j.a(avui.FAIL_RETRY);
                return avui.FAIL_RETRY;
            }
        }, this.l).k(axnw.b(), erpp.a);
    }

    @Override // defpackage.eigy
    public final void g(final MessageReceipt messageReceipt) {
        entd entdVar = a;
        ensz enszVar = (ensz) entdVar.h();
        enszVar.Y(csux.e, this.b.b().l);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 417, "UnencryptedIncomingChatMessageVisitor.java")).D("Received unencrypted RCS report for message %s. Type: %s", messageReceipt.d(), messageReceipt.a().name());
        int ordinal = messageReceipt.a().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (!messageReceipt.a().equals(eigx.DELIVERY) || !messageReceipt.e().equals("failed")) {
                    i(messageReceipt, 50035);
                    return;
                }
                if (!((augx) this.v.b()).a()) {
                    awrj awrjVar = this.b;
                    ffbr ffbrVar = this.s;
                    final awxk b = awrjVar.b();
                    bbfr bbfrVar = (bbfr) ffbrVar.b();
                    bdhg a2 = bdhg.a(messageReceipt.d());
                    awui awuiVar = b.j;
                    if (awuiVar == null) {
                        awuiVar = awui.a;
                    }
                    int a3 = ((ckam) this.u.b()).a(awuiVar);
                    Instant f = this.n.f();
                    eopq eopqVar = b.q;
                    if (eopqVar == null) {
                        eopqVar = eopq.a;
                    }
                    bbfrVar.e(a2, a3, f, eopqVar, awyp.a).q().k(axnw.c(new Consumer() { // from class: awsi
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ensz enszVar2 = (ensz) awsj.a.h();
                            enszVar2.Y(csux.f, bdhg.a(messageReceipt.d()));
                            enszVar2.Y(csux.p, bdgq.b(b.m));
                            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "processLocallyGeneratedFailedDeliveryReceipt", 578, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for locally generated MSRP report Message Receipt from Persistent Work Queue.");
                            awsj.this.j.a(avui.SUCCESS);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }), this.l);
                    return;
                }
                bdhg a4 = bdhg.a(messageReceipt.d());
                MessageCoreData x = ((bdmq) this.x.b()).x(a4);
                if (x == null) {
                    ensz enszVar2 = (ensz) entdVar.j();
                    enszVar2.Y(csux.f, a4);
                    enszVar2.Y(csux.p, bdgq.b(this.b.b().m));
                    ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "processFailedDeliveryReceipt", 531, "UnencryptedIncomingChatMessageVisitor.java")).t("Ignoring Message Receipt with type: %s as the RCS message not found", messageReceipt.a().name());
                } else {
                    altk altkVar = (altk) this.y.b();
                    eopq eopqVar2 = this.b.b().q;
                    if (eopqVar2 == null) {
                        eopqVar2 = eopq.a;
                    }
                    eqyl b2 = eqyl.b(eopqVar2.aa);
                    if (b2 == null) {
                        b2 = eqyl.UNKNOWN_RCS_TYPE;
                    }
                    altkVar.A(a4, x, 3, b2);
                    amdd p = amdg.p();
                    p.c(x.B());
                    p.h(24);
                    p.g(epdh.RECIPIENT_NEGATIVE_DELIVERY);
                    ((amdh) this.w.b()).c(p.a());
                }
                this.j.a(avui.SUCCESS);
                return;
            }
            if (ordinal == 2) {
                i(messageReceipt, 50032);
                return;
            }
            if (ordinal != 3) {
                if (ordinal != 4) {
                    return;
                }
                bdhg a5 = bdhg.a(messageReceipt.d());
                awrj awrjVar2 = this.b;
                awuh awuhVar = awuh.GROUP;
                awui awuiVar2 = awrjVar2.b().g;
                if (awuiVar2 == null) {
                    awuiVar2 = awui.a;
                }
                awuh b3 = awuh.b(awuiVar2.c);
                if (b3 == null) {
                    b3 = awuh.UNKNOWN_TYPE;
                }
                if (awuhVar.equals(b3)) {
                    ensz enszVar3 = (ensz) entdVar.j();
                    enszVar3.Y(csux.f, bdhg.a(this.b.b().l));
                    enszVar3.Y(csux.p, bdgq.b(this.b.b().m));
                    ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "processInterworkingReceipt", 604, "UnencryptedIncomingChatMessageVisitor.java")).q("Ignoring Interworking Message Receipt received for group conversation.");
                    this.j.a(avui.FAIL_NO_RETRY);
                    return;
                }
                boolean equals = eigx.INTERWORKING.f.equals(messageReceipt.e());
                final String str = true != equals ? "Bugle.Rcs.Chat.Message.Interworked.Mms.Fallback.Counts" : "Bugle.Rcs.Chat.Message.Interworked.Sms.Fallback.Counts";
                int i = true != equals ? 5 : 4;
                baed baedVar = (baed) this.p.b();
                eopq eopqVar3 = this.b.b().q;
                if (eopqVar3 == null) {
                    eopqVar3 = eopq.a;
                }
                eqyl b4 = eqyl.b(eopqVar3.aa);
                if (b4 == null) {
                    b4 = eqyl.UNKNOWN_RCS_TYPE;
                }
                baedVar.a(a5, i, b4).q().k(axnw.c(new Consumer() { // from class: awse
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        awsj awsjVar = awsj.this;
                        ((akzt) awsjVar.c.b()).g(str, 0L);
                        ensz enszVar4 = (ensz) awsj.a.h();
                        enszVar4.Y(csux.f, bdhg.a(awsjVar.b.b().l));
                        enszVar4.Y(csux.p, bdgq.b(awsjVar.b.b().m));
                        ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "processInterworkingReceipt", 641, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for Message Receipt from Persistent Work Queue.");
                        awsjVar.j.a(avui.SUCCESS);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }), this.l);
                return;
            }
        }
        ensz enszVar4 = (ensz) entdVar.j();
        enszVar4.Y(csux.f, bdhg.a(this.b.b().l));
        enszVar4.Y(csux.p, bdgq.b(this.b.b().m));
        ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 452, "UnencryptedIncomingChatMessageVisitor.java")).t("Ignoring unknown Message Receipt with type: %s", messageReceipt.a().name());
        this.j.a(avui.FAIL_NO_RETRY);
    }
}

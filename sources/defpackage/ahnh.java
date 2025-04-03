package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahnh implements akwp {
    static final cfva a = cfvl.i(cfvl.b, "disable_logging_linkify", false);
    public static final cskc b = cskc.g("BugleAnnotation", "LinkifyLogging");
    public final Context c;
    public final altk d;
    public final akzt e;
    public final Optional f;
    public final ffbr g;
    public final ffbr h;
    public final errl i;
    private final albu j;
    private final errl k;

    public ahnh(Context context, altk altkVar, akzt akztVar, Optional optional, ffbr ffbrVar, ffbr ffbrVar2, albu albuVar, errl errlVar, errl errlVar2) {
        this.c = context;
        this.d = altkVar;
        this.e = akztVar;
        this.f = optional;
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.j = albuVar;
        this.k = errlVar;
        this.i = errlVar2;
    }

    @Override // defpackage.akwp
    public final void a(final MessageCoreData messageCoreData, final ParticipantsTable.BindData bindData) {
        if (bindData == null || ((Boolean) a.e()).booleanValue()) {
            return;
        }
        this.j.a(new Runnable() { // from class: ahne
            @Override // java.lang.Runnable
            public final void run() {
                final ahnh ahnhVar = ahnh.this;
                bczy bczyVar = (bczy) ahnhVar.h.b();
                final MessageCoreData messageCoreData2 = messageCoreData;
                final boolean b2 = byyr.b(bczyVar.c(messageCoreData2.z()));
                final ConversationIdType z = messageCoreData2.z();
                ekzz f = eleg.f("MessageDatabaseOperations#hasSentMessage");
                try {
                    csix.h();
                    buxo d = MessagesTable.d();
                    d.z("hasSentMessage");
                    d.h(new Function() { // from class: bdlv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            cskc cskcVar = bdmq.a;
                            buxzVar.m(ConversationIdType.this);
                            buxzVar.ai(axuh.d);
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final boolean T = d.b().T();
                    f.close();
                    if (((Boolean) ahnh.a.e()).booleanValue()) {
                        return;
                    }
                    if (ahnhVar.f.isEmpty()) {
                        ahnh.b.m("Received message or sender is null, skip logging links.");
                        return;
                    }
                    final ParticipantsTable.BindData bindData2 = bindData;
                    final boolean z2 = !TextUtils.isEmpty(bindData2.T());
                    final int s = bdqu.s(bindData2);
                    String ar = messageCoreData2.ar();
                    if (TextUtils.isEmpty(ar)) {
                        ahnh.b.m("Received message text is empty, skip logging links.");
                    } else {
                        erqt.r(((cglo) ahnhVar.f.get()).a(SpannableString.valueOf(ar), ahnhVar.c, null), axou.a(new csvw(new Consumer() { // from class: ahnf
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                enqu listIterator = ((enhk) ((Pair) obj).second).values().listIterator();
                                while (listIterator.hasNext()) {
                                    cgln cglnVar = (cgln) listIterator.next();
                                    if (cglnVar == cgln.WEB_URL) {
                                        int i = s;
                                        eoir eoirVar = (eoir) eoit.a.createBuilder();
                                        fbqt fbqtVar = fbqt.LINK_ANNOTATION;
                                        eoirVar.copyOnWrite();
                                        eoit eoitVar = (eoit) eoirVar.instance;
                                        eoitVar.c = fbqtVar.a();
                                        int i2 = 1;
                                        eoitVar.b |= 1;
                                        eoirVar.copyOnWrite();
                                        eoit eoitVar2 = (eoit) eoirVar.instance;
                                        boolean z3 = z2;
                                        MessageCoreData messageCoreData3 = messageCoreData2;
                                        ahnh ahnhVar2 = ahnh.this;
                                        eoitVar2.d = i - 1;
                                        eoitVar2.b |= 2;
                                        eoirVar.copyOnWrite();
                                        eoit eoitVar3 = (eoit) eoirVar.instance;
                                        eoitVar3.b |= 4;
                                        eoitVar3.e = z3;
                                        ahnhVar2.d.E(messageCoreData3, (eoit) eoirVar.build());
                                        if (cglnVar == cgln.WEB_URL) {
                                            boolean ab = bindData2.ab();
                                            if (((Boolean) cful.w.e()).booleanValue()) {
                                                boolean z4 = T;
                                                if (b2) {
                                                    i2 = ab ? 4 : !z4 ? 6 : 2;
                                                } else if (ab) {
                                                    i2 = 3;
                                                } else if (!z4) {
                                                    i2 = 5;
                                                }
                                                ahnhVar2.e.e("Bugle.Share.WebLink.Received", i2);
                                            }
                                        }
                                    }
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }, new Consumer() { // from class: ahng
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                csjb e = ahnh.b.e();
                                e.I("Threw during logReceivedMessageLinkAnnotationEvents()");
                                e.s((Throwable) obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        })), ahnhVar.i);
                    }
                } finally {
                }
            }
        }, "Bugle.Async.LinkPreviewUtils.logReceivedLinkAnnotation.Duration", this.k);
    }

    @Override // defpackage.akwp
    public final void b(final MessageCoreData messageCoreData) {
        if (((Boolean) a.e()).booleanValue()) {
            return;
        }
        if (messageCoreData == null || this.f.isEmpty()) {
            b.m("Sent message is null, skip logging links.");
            return;
        }
        String ar = messageCoreData.ar();
        if (TextUtils.isEmpty(ar)) {
            b.m("Sent message text is empty, skip logging links.");
        } else {
            erqt.r(((cglo) this.f.get()).a(SpannableString.valueOf(ar), this.c, null), axou.a(new csvw(new Consumer() { // from class: ahnc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    enqu listIterator = ((enhk) ((Pair) obj).second).values().listIterator();
                    while (listIterator.hasNext()) {
                        if (((cgln) listIterator.next()) == cgln.WEB_URL) {
                            MessageCoreData messageCoreData2 = messageCoreData;
                            ahnh ahnhVar = ahnh.this;
                            eoir eoirVar = (eoir) eoit.a.createBuilder();
                            fbqt fbqtVar = fbqt.LINK_ANNOTATION;
                            eoirVar.copyOnWrite();
                            eoit eoitVar = (eoit) eoirVar.instance;
                            eoitVar.c = fbqtVar.a();
                            eoitVar.b |= 1;
                            ahnhVar.d.F(messageCoreData2, (eoit) eoirVar.build());
                        }
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: ahnd
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    csjb e = ahnh.b.e();
                    e.I("Threw during logSentMessageLinkAnnotationEvents()");
                    e.s((Throwable) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            })), this.i);
        }
    }

    @Override // defpackage.akwp
    public final void c(final MessageIdType messageIdType, final boolean z) {
        csix.f(messageIdType.c());
        if (((Boolean) a.e()).booleanValue()) {
            return;
        }
        this.j.a(new Runnable() { // from class: ahnb
            @Override // java.lang.Runnable
            public final void run() {
                ahnh ahnhVar = ahnh.this;
                MessageIdType messageIdType2 = messageIdType;
                try {
                    MessageCoreData v = ((bdmq) ahnhVar.g.b()).v(messageIdType2);
                    if (v == null) {
                        csjb e = ahnh.b.e();
                        e.I("Couldn't read.");
                        e.d(messageIdType2);
                        e.I("when logging link preview click.");
                        e.r();
                        return;
                    }
                    eoqc eoqcVar = (eoqc) eoqd.a.createBuilder();
                    int i = true != z ? 3 : 4;
                    eoqcVar.copyOnWrite();
                    eoqd eoqdVar = (eoqd) eoqcVar.instance;
                    eoqdVar.c = eohz.a(i);
                    eoqdVar.b |= 1;
                    eotx eotxVar = (eotx) eoty.a.createBuilder();
                    fbqp fbqpVar = fbqp.CONVERSATION_VIEW;
                    eotxVar.copyOnWrite();
                    eoty eotyVar = (eoty) eotxVar.instance;
                    eotyVar.d = fbqpVar.a();
                    eotyVar.b |= 2;
                    eotxVar.copyOnWrite();
                    eoty eotyVar2 = (eoty) eotxVar.instance;
                    eotyVar2.c = fbqr.a(4);
                    eotyVar2.b = 1 | eotyVar2.b;
                    eotxVar.copyOnWrite();
                    eoty eotyVar3 = (eoty) eotxVar.instance;
                    eoqd eoqdVar2 = (eoqd) eoqcVar.build();
                    eoqdVar2.getClass();
                    eotyVar3.e = eoqdVar2;
                    eotyVar3.b |= 4;
                    ahnhVar.d.X(v, (eoty) eotxVar.build());
                } catch (Exception e2) {
                    csjb b2 = ahnh.b.b();
                    b2.I("Couldn't log link preview click.");
                    b2.d(messageIdType2);
                    b2.s(e2);
                }
            }
        }, "Bugle.Async.LinkifyLogging.logLinkClick.Duration", this.k);
    }
}

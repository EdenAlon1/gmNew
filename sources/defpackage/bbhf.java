package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbhf {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/actionhelpers/SendMessageActionQueuer");
    public final aolr b;
    private final Context c;
    private final cqoh d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final altk j;
    private final fazb k;
    private final Optional l;
    private final bbge m;
    private final dtuu n;
    private final csrv o;
    private final cbut p;
    private final Optional q;
    private final cmlm r;
    private final ffbr s;
    private final ffbr t;

    public bbhf(Context context, cqoh cqohVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, altk altkVar, fazb fazbVar, Optional optional, bbge bbgeVar, dtuu dtuuVar, csrv csrvVar, aolr aolrVar, cbut cbutVar, Optional optional2, cmlm cmlmVar, ffbr ffbrVar6, ffbr ffbrVar7) {
        this.c = context;
        this.d = cqohVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.j = altkVar;
        this.k = fazbVar;
        this.l = optional;
        this.m = bbgeVar;
        this.n = dtuuVar;
        this.o = csrvVar;
        this.b = aolrVar;
        this.p = cbutVar;
        this.q = optional2;
        this.i = ffbrVar5;
        this.r = cmlmVar;
        this.s = ffbrVar6;
        this.t = ffbrVar7;
    }

    public static void a(Action action, long j, Optional optional, boolean z, boolean z2) {
        action.t.s("rcs_session_id", j);
        if (j == -1) {
            action.t.v("conversation_name", (String) optional.orElse(null));
        }
        action.t.p("is_rcs_group", z);
        action.t.p("is_rbm_conversation", z2);
    }

    private final int f(MessageCoreData messageCoreData, long j, aztg aztgVar) {
        int k = messageCoreData.k();
        if (!messageCoreData.dk()) {
            messageCoreData.bi(j);
            return k;
        }
        this.j.Z(epyw.UMA_MESSAGE_SENDING_START, messageCoreData, aztgVar.e());
        messageCoreData.bk(j);
        return k;
    }

    private final Action g(final MessageCoreData messageCoreData, final aztg aztgVar) {
        engw n = engw.n(((bczy) this.f.b()).L(messageCoreData.z()));
        if (messageCoreData.ap() != null) {
            ParticipantsTable.BindData b = ((bdrr) this.e.b()).b(messageCoreData.ap());
            if (b == null || b.W() == null) {
                ensk j = a.j();
                j.Y(ente.a, "BugleDataModel");
                enrr enrrVar = (enrr) j;
                enrrVar.Y(csux.f, messageCoreData.E());
                enrrVar.Y(csux.p, messageCoreData.z());
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/SendMessageActionQueuer", "createSendMessageAction", 351, "SendMessageActionQueuer.java")).t("Participant for the group private message does not exist, groupPrivateParticipant: %s", messageCoreData.ap());
                return null;
            }
            n = engw.r(b);
        }
        final Action a2 = this.m.a();
        if (messageCoreData.cX()) {
            Optional ofNullable = Optional.ofNullable(((bczy) this.f.b()).r(messageCoreData.z()));
            ofNullable.ifPresentOrElse(new Consumer() { // from class: bbgu
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    bseh bsehVar = (bseh) obj;
                    bbhf.a(Action.this, bsehVar.v(), Optional.ofNullable(bsehVar.ah()), byyr.d(bsehVar.k()), bsehVar.am());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Runnable() { // from class: bbgv
                @Override // java.lang.Runnable
                public final void run() {
                    bbhf.a(Action.this, -1L, Optional.empty(), false, false);
                }
            });
            final awui w = messageCoreData.w();
            if (!((Boolean) ofNullable.map(new Function() { // from class: bbhd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(!byyr.d(((bseh) obj).k()));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(true)).booleanValue()) {
                n = (engw) Collection.EL.stream(n).filter(new Predicate() { // from class: bbhe
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo439negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return !Objects.equals(((ParticipantsTable.BindData) obj).U(), awui.this.d);
                    }
                }).collect(endq.a);
            }
        }
        ekzz f = eleg.f("SendMessageActionQueuer::buildMessageIdentityProtos");
        try {
            engw engwVar = (engw) Collection.EL.stream(n).map(new Function() { // from class: bbgy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bbhf bbhfVar = bbhf.this;
                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                    return messageCoreData.cw() ? bbhfVar.b.q(bindData) : bbhfVar.b.t(bindData);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: bbgz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return aolm.f((aoku) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(endq.a);
            f.close();
            a2.t.t("message", messageCoreData);
            a2.t.r("sub_id", aztgVar.e());
            a2.t.v("sub_phone_number", (String) aztgVar.b().map(new Function() { // from class: bbha
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((aoku) obj).p(((Boolean) aoqm.d.e()).booleanValue());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(null));
            a2.t.u("remote_messaging_identities", new ArrayList(engwVar));
            if (messageCoreData.df()) {
                if (engwVar.size() != 1) {
                    throw new IllegalStateException("Trying to resend a broadcast SMS - not allowed");
                }
                a2.t.v("sms_service_center", (String) this.l.map(new Function() { // from class: bbgt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((cpbz) obj).b(aztg.this.e(), messageCoreData.z());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(null));
                a2.t.t("remote_messaging_identity", (Parcelable) engwVar.get(0));
            }
            ensk e = a.e();
            e.Y(ente.a, "BugleDataModel");
            enrr enrrVar2 = (enrr) e;
            enrrVar2.Y(csux.b, messageCoreData.B());
            enrrVar2.Y(csux.y, MessageData.ax(messageCoreData.d()));
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/SendMessageActionQueuer", "populateSendMessageAction", 394, "SendMessageActionQueuer.java")).q("Queued for sending");
            return a2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final boolean h(final MessageCoreData messageCoreData, final Uri uri, final boolean z, final Optional optional) {
        boolean d = d(messageCoreData, z);
        this.n.d("SendMessageActionQueuer#updateLocalDatabaseInTransaction", new Runnable() { // from class: bbgs
            @Override // java.lang.Runnable
            public final void run() {
                bbhf.this.b(messageCoreData, uri, z, optional);
            }
        });
        return d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        if (r3.p.r(r4, r5, r7) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r4, android.net.Uri r5, boolean r6, j$.util.Optional r7) {
        /*
            r3 = this;
            r0 = 0
            if (r5 == 0) goto L10
            boolean r5 = r4.cw()
            if (r5 != 0) goto L10
            cbut r5 = r3.p
            r5.l(r4)
            goto L95
        L10:
            java.lang.String[] r5 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.a
            buxr r5 = new buxr
            r5.<init>()
            java.lang.String r1 = "updateLocalDatabase"
            r5.ap(r1)
            bbgr r1 = new bbgr
            r1.<init>()
            r5.Y(r1)
            int r1 = r4.k()
            r5.U(r1)
            if (r6 == 0) goto L30
            r5.v(r0)
        L30:
            ffbr r6 = r3.t
            java.lang.Object r6 = r6.b()
            autk r6 = (defpackage.autk) r6
            boolean r6 = r6.a()
            if (r6 == 0) goto L45
            long r1 = r4.r()
            r5.O(r1)
        L45:
            long r1 = r4.o()
            r5.G(r1)
            int r6 = r4.f()
            r5.B(r6)
            int r6 = r4.j()
            r5.P(r6)
            java.lang.String r6 = r4.aB()
            r5.Q(r6)
            bdhg r6 = r4.E()
            r5.E(r6)
            int r6 = r4.i()
            r5.H(r6)
            byzl r6 = r4.O()
            r5.W(r6)
            boolean r6 = r4.cw()
            if (r6 == 0) goto L8d
            java.lang.String r6 = r4.ai()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L8d
            java.lang.String r6 = r4.ai()
            r5.i(r6)
        L8d:
            cbut r6 = r3.p
            boolean r5 = r6.r(r4, r5, r7)
            if (r5 == 0) goto La6
        L95:
            ffbr r5 = r3.g
            java.lang.Object r5 = r5.b()
            bdfl r5 = (defpackage.bdfl) r5
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6 = r4.z()
            byyt r7 = defpackage.byyt.UNARCHIVED
            r5.b(r6, r0, r7)
        La6:
            enru r5 = defpackage.bbhf.a
            ensk r5 = r5.g()
            ensn r6 = defpackage.ente.a
            java.lang.String r7 = "BugleDataModel"
            r5.Y(r6, r7)
            enrr r5 = (defpackage.enrr) r5
            ensn r6 = defpackage.csux.y
            java.lang.String r7 = r4.aw()
            r5.Y(r6, r7)
            ensn r6 = defpackage.csux.b
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r7 = r4.B()
            r5.Y(r6, r7)
            java.lang.String r6 = "updateMessageInLocalDatabaseAndRefreshConvMetadata"
            r7 = 786(0x312, float:1.101E-42)
            java.lang.String r0 = "com/google/android/apps/messaging/shared/datamodel/actionhelpers/SendMessageActionQueuer"
            java.lang.String r1 = "SendMessageActionQueuer.java"
            ensk r5 = r5.h(r0, r6, r7, r1)
            enrr r5 = (defpackage.enrr) r5
            long r6 = r4.o()
            java.lang.String r4 = "Updated message in local db. receivedTimeStamp: %s"
            r5.s(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbhf.b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, android.net.Uri, boolean, j$.util.Optional):void");
    }

    public final boolean c(MessageCoreData messageCoreData, Uri uri, boolean z, Optional optional) {
        ekzz f = eleg.f("SendMessageActionQueuer::updateMessageAndStatusWithLogContent");
        try {
            boolean h = h(messageCoreData, uri, z, optional);
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0107 A[Catch: all -> 0x0191, TRY_LEAVE, TryCatch #0 {all -> 0x0191, blocks: (B:3:0x0006, B:18:0x0029, B:21:0x002f, B:25:0x0107, B:28:0x011b, B:29:0x0184, B:36:0x014d, B:38:0x0153, B:40:0x003f, B:42:0x0045, B:45:0x0053, B:47:0x0068, B:50:0x0072, B:53:0x007a, B:55:0x008c, B:57:0x0098, B:62:0x00c2, B:74:0x0103, B:73:0x0100, B:59:0x00a6, B:63:0x00c6, B:68:0x00fa), top: B:2:0x0006, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011b A[Catch: all -> 0x0191, TRY_ENTER, TryCatch #0 {all -> 0x0191, blocks: (B:3:0x0006, B:18:0x0029, B:21:0x002f, B:25:0x0107, B:28:0x011b, B:29:0x0184, B:36:0x014d, B:38:0x0153, B:40:0x003f, B:42:0x0045, B:45:0x0053, B:47:0x0068, B:50:0x0072, B:53:0x007a, B:55:0x008c, B:57:0x0098, B:62:0x00c2, B:74:0x0103, B:73:0x0100, B:59:0x00a6, B:63:0x00c6, B:68:0x00fa), top: B:2:0x0006, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014d A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:3:0x0006, B:18:0x0029, B:21:0x002f, B:25:0x0107, B:28:0x011b, B:29:0x0184, B:36:0x014d, B:38:0x0153, B:40:0x003f, B:42:0x0045, B:45:0x0053, B:47:0x0068, B:50:0x0072, B:53:0x007a, B:55:0x008c, B:57:0x0098, B:62:0x00c2, B:74:0x0103, B:73:0x0100, B:59:0x00a6, B:63:0x00c6, B:68:0x00fa), top: B:2:0x0006, inners: #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(final com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbhf.d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (java.lang.Integer.parseInt(r0.substring(6)) == 0) goto L16;
     */
    /* JADX WARN: Type inference failed for: r8v2, types: [baze, com.google.android.apps.messaging.shared.datamodel.action.common.Action] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.apps.messaging.shared.datamodel.action.common.Action e(final com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r16, int r17) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbhf.e(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, int):com.google.android.apps.messaging.shared.datamodel.action.common.Action");
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.app.RemoteActionCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.List;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cizx extends civa {
    public static final entd a = entd.c("BugleNotifications");
    public final Context b;
    public final errl c;
    public final errm d;
    public final cjcf e;
    public final ayfg f;
    public final Optional g;
    public final ffbr h;
    public final cqoh i;
    public final cjcj j;
    public final Optional k;
    public final Optional l;
    public final cjat m;
    public final Optional n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    public final ciwj r;
    private final errl s;
    private final ciyg t;
    private final cjam u;
    private final ciyy v;
    private final cjad w;
    private final cjci x;
    private final ciyv y;
    private final ffbr z;

    public cizx(Context context, errl errlVar, errl errlVar2, errm errmVar, cjat cjatVar, ciyg ciygVar, cjcf cjcfVar, cjam cjamVar, ciyy ciyyVar, ayfg ayfgVar, Optional optional, ffbr ffbrVar, cqoh cqohVar, cjad cjadVar, cjcj cjcjVar, cjci cjciVar, ciyv ciyvVar, Optional optional2, ffbr ffbrVar2, Optional optional3, ciwj ciwjVar, Optional optional4, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.b = context;
        this.s = errlVar;
        this.c = errlVar2;
        this.d = errmVar;
        this.t = ciygVar;
        this.e = cjcfVar;
        this.u = cjamVar;
        this.v = ciyyVar;
        this.f = ayfgVar;
        this.g = optional;
        this.h = ffbrVar;
        this.i = cqohVar;
        this.w = cjadVar;
        this.j = cjcjVar;
        this.x = cjciVar;
        this.y = ciyvVar;
        this.k = optional2;
        this.z = ffbrVar2;
        this.l = optional3;
        this.r = ciwjVar;
        this.n = optional4;
        this.o = ffbrVar3;
        this.m = cjatVar;
        this.p = ffbrVar4;
        this.q = ffbrVar5;
    }

    @Override // defpackage.civa
    public final /* bridge */ /* synthetic */ elfl a(List list, Object obj) {
        final cjax cjaxVar = (cjax) obj;
        if (list.isEmpty() && DesugarCollections.unmodifiableMap(cjaxVar.c).isEmpty() && !cjaxVar.e) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "createNotificationCreationPackage", 198, "IncomingMessageBlueprint.java")).q("No inputs, not creating incoming message notification");
            return elfo.e(null);
        }
        final cjac a2 = this.w.a(list);
        ciyg ciygVar = this.t;
        boolean z = cjaxVar.e;
        Context context = (Context) ciygVar.a.b();
        context.getClass();
        ((errl) ciygVar.b.b()).getClass();
        errl errlVar = (errl) ciygVar.c.b();
        errlVar.getClass();
        errl errlVar2 = (errl) ciygVar.d.b();
        errlVar2.getClass();
        cjbl cjblVar = (cjbl) ciygVar.e.b();
        cjblVar.getClass();
        cjbb cjbbVar = (cjbb) ciygVar.f.b();
        cjbbVar.getClass();
        cjad cjadVar = (cjad) ciygVar.g.b();
        cjadVar.getClass();
        cjcb cjcbVar = (cjcb) ciygVar.h.b();
        cjcbVar.getClass();
        cjaxVar.getClass();
        final ciyf ciyfVar = new ciyf(context, errlVar, errlVar2, cjblVar, cjbbVar, cjadVar, cjcbVar, cjaxVar, z);
        final elfl a3 = ciyfVar.g.a(list).a();
        cjcb cjcbVar2 = ciyfVar.h;
        final elfl e = !ciyfVar.j ? elfo.e(cjax.a) : cjcbVar2.c.h().e(eygu.class, new emwl() { // from class: cjbx
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                ensk j = cjcb.a.j();
                j.Y(ente.a, "BugleNotifications");
                ((enrr) ((enrr) ((enrr) j).g((eygu) obj2)).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSettingsStore", "getDataAsync", 100, "IncomingMessageSettingsStore.java")).q("Error getting data from incoming message settings store");
                return cjce.a;
            }
        }, cjcbVar2.b).h(new emwl() { // from class: cjbr
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                cjce cjceVar = (cjce) obj2;
                if (cjceVar == null) {
                    return cjax.a;
                }
                cjax cjaxVar2 = cjceVar.c;
                return cjaxVar2 == null ? cjax.a : cjaxVar2;
            }
        }, cjcbVar2.b);
        elfl h = elfo.m(a3, e).a(new Callable() { // from class: ciye
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Map hashMap = new HashMap();
                cjax cjaxVar2 = (cjax) erqt.q(e);
                if (!DesugarCollections.unmodifiableMap(cjaxVar2.c).isEmpty()) {
                    hashMap = ciyf.c(enhk.j(hashMap), enhk.j(DesugarCollections.unmodifiableMap(cjaxVar2.c)));
                }
                elfl elflVar = a3;
                ciyf ciyfVar2 = ciyf.this;
                cjax cjaxVar3 = (cjax) erqt.q(elflVar);
                Map c = ciyf.c(enhk.j(ciyf.c(enhk.j(hashMap), enhk.j(DesugarCollections.unmodifiableMap(cjaxVar3.c)))), enhk.j(DesugarCollections.unmodifiableMap(ciyfVar2.i.c)));
                ensz enszVar = (ensz) ciyf.a.h();
                enszVar.Y(cjbf.a, ciyf.a(ciyfVar2.i));
                enszVar.Y(cjbf.b, ciyf.a(cjaxVar3));
                enszVar.Y(cjbf.c, ciyf.a(cjaxVar2));
                enszVar.Y(cjbf.d, ciyf.b(c));
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/ConversationAndMessagesDataCreator", "createInputIds", 217, "ConversationAndMessagesDataCreator.java")).q("Creating notification input ids");
                return c;
            }
        }, ciyfVar.c).h(new emwl() { // from class: ciyd
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                bcrs bcrsVar;
                ekzz f;
                Stream map;
                int i;
                int i2 = engw.d;
                engr engrVar = new engr();
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    ciyf ciyfVar2 = ciyf.this;
                    ConversationIdType b = bdgq.b((String) entry.getKey());
                    final long j = ((cjap) entry.getValue()).c;
                    bcrs bcrsVar2 = (bcrs) ciyfVar2.e.c.b();
                    bejf bejfVar = (bejf) ((bfkf) bejc.a(b).o()).cS();
                    if (bejfVar == null) {
                        ensz enszVar = (ensz) cjbl.a.h();
                        enszVar.Y(csux.o, b.a());
                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageNotificationQueries", "getConversationSync", 173, "IncomingMessageNotificationQueries.java")).q("Unable to find ConversationListItemData for conversation id");
                        bcrsVar = null;
                    } else {
                        bcrsVar2.S(bejfVar);
                        bcrsVar = bcrsVar2;
                    }
                    if (bcrsVar == null) {
                        ensz enszVar2 = (ensz) ciyf.a.h();
                        enszVar2.Y(csux.o, b.toString());
                        enszVar2.Y(cird.r, Long.valueOf(j));
                        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/ConversationAndMessagesDataCreator", "createConversationAndMessagesDataList", 107, "ConversationAndMessagesDataCreator.java")).q("conversationData is null, skipping");
                    } else {
                        final cjbl cjblVar2 = ciyfVar2.e;
                        if (cjblVar2.g.a()) {
                            bdjk bdjkVar = (bdjk) cjblVar2.b.b();
                            f = eleg.f("ConversationMessageListDatabaseOperations#getLastMessagesInConversationWithReactions");
                            try {
                                engw y = ((bcsy) bdjkVar.d.b()).e(b, 7, 0).b().y();
                                f.close();
                                map = Collection.EL.stream(y).map(new Function() { // from class: cjbi
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        return ((bcsf) cjbl.this.f.b()).b((bgmp) obj3);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                            } finally {
                            }
                        } else {
                            bdjk bdjkVar2 = (bdjk) cjblVar2.b.b();
                            f = eleg.f("ConversationMessageListDatabaseOperations#getLastMessagesInConversationWithReactions");
                            try {
                                engw y2 = ((bcsq) bdjkVar2.c.b()).f(b, 7, 0).b().y();
                                f.close();
                                map = Collection.EL.stream(y2).map(new Function() { // from class: cjbj
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        return ((bcsf) cjbl.this.f.b()).d((bigm) obj3);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                            } finally {
                            }
                        }
                        engw a4 = ((engw) map.filter(new Predicate() { // from class: cjbk
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
                            public final boolean test(Object obj3) {
                                bcse bcseVar = (bcse) obj3;
                                entd entdVar = cjbl.a;
                                boolean aJ = bcseVar.aJ();
                                long j2 = j;
                                return aJ ? bcseVar.k() >= j2 : bcseVar.i() >= j2;
                            }
                        }).collect(endq.a)).a();
                        if (a4.isEmpty()) {
                            ensz enszVar3 = (ensz) ciyf.a.h();
                            enszVar3.Y(csux.o, b.toString());
                            enszVar3.Y(cird.r, Long.valueOf(j));
                            ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/ConversationAndMessagesDataCreator", "createConversationAndMessagesDataList", 119, "ConversationAndMessagesDataCreator.java")).q("messagesData is null or empty, skipping");
                        } else {
                            String join = TextUtils.join(",", (Iterable) Collection.EL.stream(a4).map(new Function() { // from class: ciyc
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    return ((bcse) obj3).u();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(Collectors.toCollection(new ciyb())));
                            ensz enszVar4 = (ensz) ciyf.a.h();
                            enszVar4.Y(csux.o, b.a());
                            enszVar4.Y(cjbf.e, join);
                            ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/ConversationAndMessagesDataCreator", "createConversationAndMessagesDataList", 133, "ConversationAndMessagesDataCreator.java")).q("Queried message ids");
                            cjay a5 = ciyfVar2.f.a(ciyfVar2.b, (bcse) enjk.j(a4), bcrsVar.X(), bcrsVar.X() ? bcrsVar.t() : null);
                            cjbl cjblVar3 = ciyfVar2.e;
                            if (cjblVar3.g.a()) {
                                bifz c = ((bcsy) cjblVar3.e.b()).c(b, -1, 0);
                                String[] strArr = bige.a;
                                bigd bigdVar = new bigd();
                                bigdVar.aq(new dtwe("messages.received_timestamp", 9, Long.valueOf(j)));
                                c.c(bigdVar);
                                i = c.b().i();
                            } else {
                                bjji f2 = ((bcsq) cjblVar3.d.b()).f(b, -1, 0);
                                String[] strArr2 = bjjn.a;
                                bjjm bjjmVar = new bjjm();
                                bjjmVar.e(j);
                                f2.e(bjjmVar);
                                i = f2.b().i();
                            }
                            emxf.l(!a4.isEmpty());
                            engrVar.h(new cixw(b, j, bcrsVar, a4, a5, i));
                        }
                    }
                }
                return engrVar.g();
            }
        }, ciyfVar.d);
        final elfl i = h.i(new eroh() { // from class: cizb
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:36:0x027b  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x02d0  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0316  */
            /* JADX WARN: Type inference failed for: r1v19 */
            /* JADX WARN: Type inference failed for: r1v20 */
            /* JADX WARN: Type inference failed for: r1v22, types: [boolean] */
            /* JADX WARN: Type inference failed for: r1v28 */
            /* JADX WARN: Type inference failed for: r1v29 */
            @Override // defpackage.eroh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r28) {
                /*
                    Method dump skipped, instructions count: 856
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cizb.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
            }
        }, erpp.a);
        final elfl h2 = h.h(new emwl() { // from class: cizg
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                entd entdVar = cizx.a;
                if (!((engw) obj2).isEmpty()) {
                    return new citd();
                }
                ((ensz) ((ensz) cizx.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "createNotificationSummaryBuilderInfo", 915, "IncomingMessageBlueprint.java")).q("Conversation and messages data list is empty, not creating summary builder info");
                return null;
            }
        }, this.s);
        return elfo.m(i, h2).a(new Callable() { // from class: cizk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                entd entdVar = cizx.a;
                List list2 = (List) erqt.q(elfl.this);
                list2.getClass();
                engw n = engw.n(list2);
                if (n.isEmpty()) {
                    ((ensz) ((ensz) cizx.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "createNotificationCreationPackage", 224, "IncomingMessageBlueprint.java")).q("No builder infos, not creating notification creation package");
                    return null;
                }
                cixc cixcVar = (cixc) erqt.q(h2);
                if (cixcVar != null) {
                    return new cisv(n, Optional.of(cixcVar));
                }
                ((ensz) ((ensz) cizx.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "createNotificationCreationPackage", 232, "IncomingMessageBlueprint.java")).q("summaryBuilderInfo is null, not creating notification creation package");
                return null;
            }
        }, this.s);
    }

    public final elfl b(final cjax cjaxVar, final cixz cixzVar, final Set set) {
        elfl e;
        final elfl e2;
        final elfl e3;
        elfl e4;
        elfl h;
        elfl e5;
        final cizx cizxVar = this;
        if (((carb) cizxVar.z.b()).f(cixzVar.d()) && (cizxVar.k.isEmpty() || !((cthm) cizxVar.k.get()).f())) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "createNotificationBuilderInfoFuture", 409, "IncomingMessageBlueprint.java")).q("Skipping notification creation because in focused conversation");
            ciyy ciyyVar = cizxVar.v;
            if (ciyyVar.f.getRingerMode() != 2) {
                ((ensz) ((ensz) ciyy.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageAudioPlayer", "playInConversationNotificationSoundSync", 63, "IncomingMessageAudioPlayer.java")).q("Ringer mode silenced: notification sound not played");
            } else {
                if (ciyyVar.d.q(ciyyVar.b.getString(R.string.send_sound_pref_key), ciyyVar.b.getResources().getBoolean(R.bool.send_sound_pref_default))) {
                    ctcy ctcyVar = ciyyVar.e;
                    ctcp ctcpVar = new ctcp();
                    ctcpVar.a = ctch.b(R.raw.message_incoming);
                    ctcpVar.d(0.25f);
                    ctcpVar.b(new AudioAttributes.Builder().setUsage(5).build());
                    ctcpVar.c(new ctcr());
                    axnw.h(ctcyVar.a(ctcpVar.a()).j(5L, TimeUnit.SECONDS, ciyyVar.c).e(TimeoutException.class, new emwl() { // from class: ciyw
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            ((ensz) ((ensz) ((ensz) ciyy.a.j()).g((TimeoutException) obj)).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageAudioPlayer", "playInConversationNotificationSoundSync", 94, "IncomingMessageAudioPlayer.java")).q("In-conversation notification sound timed out");
                            return ctck.c(2);
                        }
                    }, erpp.a).e(ctcz.class, new emwl() { // from class: ciyx
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            ((ensz) ((ensz) ((ensz) ciyy.a.j()).g((ctcz) obj)).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageAudioPlayer", "playInConversationNotificationSoundSync", 102, "IncomingMessageAudioPlayer.java")).q("Failed to play notification sound");
                            return ctck.c(2);
                        }
                    }, ciyyVar.c));
                } else {
                    ((ensz) ((ensz) ciyy.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageAudioPlayer", "playInConversationNotificationSoundSync", 71, "IncomingMessageAudioPlayer.java")).q("Sound setting disabled for in-conversation notifications");
                }
            }
            return elfo.e(null);
        }
        final bcrs c = cixzVar.c();
        final engw f = cixzVar.f();
        final bcse bcseVar = (bcse) enjk.j(f);
        final cjay e6 = cixzVar.e();
        final cjci cjciVar = cizxVar.x;
        if (cjci.b()) {
            ((ensz) ((ensz) cjci.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSuggestionCreator", "getSuggestions", 65, "IncomingMessageSuggestionCreator.java")).q("Using system text classifier suggestions, not creating custom suggestions");
            e = elfo.e(Optional.empty());
        } else if (!((cttn) cjciVar.e.b()).c()) {
            ((ensz) ((ensz) cjci.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSuggestionCreator", "getSuggestions", 71, "IncomingMessageSuggestionCreator.java")).q("Smart suggestions in notifications are disabled, not creating suggestions");
            e = elfo.e(Optional.empty());
        } else if (TextUtils.isEmpty(c.Q().toString()) || c.W() || bcseVar == null) {
            ((ensz) ((ensz) cjci.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSuggestionCreator", "getSuggestions", 82, "IncomingMessageSuggestionCreator.java")).q("Rbm bot or invalid input data, not creating suggestions");
            e = elfo.e(Optional.empty());
        } else if (!cjci.c()) {
            ensz enszVar = (ensz) cjci.a.h();
            enszVar.Y(csux.a, bcseVar.u().b());
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSuggestionCreator", "getSuggestions", 116, "IncomingMessageSuggestionCreator.java")).q("Loading suggestions from DB by message ID");
            e = elfo.g(new Callable() { // from class: cjch
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Optional.of(((ctqh) cjci.this.d.b()).d(bcseVar.u()));
                }
            }, cjciVar.b);
        } else if (cjciVar.c.isEmpty()) {
            ((ensz) ((ensz) cjci.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSuggestionCreator", "getSuggestions", 88, "IncomingMessageSuggestionCreator.java")).q("Notification suggestions loader not present, not creating suggestions");
            e = elfo.e(Optional.empty());
        } else {
            ConversationIdType Q = c.Q();
            if (Q == null) {
                throw new NullPointerException("Null conversationId");
            }
            boolean B = c.B();
            boolean W = c.W();
            MessageIdType u = bcseVar.u();
            if (u == null) {
                throw new NullPointerException("Null latestMessageId");
            }
            boolean aJ = bcseVar.aJ();
            bduq bduqVar = (bduq) Objects.requireNonNullElseGet(ctgv.a(c.i()), new Supplier() { // from class: cjcg
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new bduq();
                }
            });
            if (bduqVar == null) {
                throw new NullPointerException("Null latestMessageAnnotationData");
            }
            ((ensz) ((ensz) cjci.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSuggestionCreator", "getSuggestions", 109, "IncomingMessageSuggestionCreator.java")).q("Creating suggestions using notificationSuggestionsLoader");
            Object obj = cjciVar.c.get();
            final ciqy ciqyVar = new ciqy(Q, W, B, u, aJ, bduqVar);
            if (ciqyVar.a.b() || ciqyVar.b || ciqyVar.e) {
                e = elfo.e(Optional.empty());
            } else {
                final MessageIdType messageIdType = ciqyVar.d;
                final cwkp cwkpVar = (cwkp) obj;
                final elfl g = elfo.g(new Callable() { // from class: cwkm
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return ((ctqh) cwkp.this.a.b()).d(messageIdType);
                    }
                }, cwkpVar.b);
                final ConversationIdType conversationIdType = ciqyVar.a;
                final elfl g2 = elfo.g(new Callable() { // from class: cwko
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Optional.ofNullable(cwkp.this.d.a(bcui.c(conversationIdType).y()).a());
                    }
                }, cwkpVar.b);
                e = elfo.m(g, g2).a(new Callable() { // from class: cwkn
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final List list = (List) erqt.q(g);
                        Optional optional = (Optional) erqt.q(g2);
                        final cwkp cwkpVar2 = cwkp.this;
                        final ciqz ciqzVar = ciqyVar;
                        return optional.map(new Function() { // from class: cwkl
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                cwkp cwkpVar3 = cwkp.this;
                                cwkpVar3.f.getClass();
                                cvfe cvfeVar = cwkpVar3.g;
                                cvfeVar.getClass();
                                return cpfs.a(cwkpVar3.e, list, new cwkk(ciqzVar, (ParticipantsTable.BindData) obj2, cvfeVar), 4);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }
                }, cwkpVar.c);
            }
        }
        bcseVar.getClass();
        final Optional ofNullable = Optional.ofNullable(bcseVar.s());
        final ciyv ciyvVar = cizxVar.y;
        boolean z = cjaxVar.d;
        final ConversationIdType Q2 = c.Q();
        final bcse bcseVar2 = (bcse) enjk.j(f);
        ciyvVar.h.isPresent();
        if (((Boolean) cjau.b.e()).booleanValue() && ciyv.c(c.C(), f) && cjci.c() && z) {
            CharSequence charSequence = ((cixx) e6).b;
            if (charSequence == null) {
                ((ensz) ((ensz) ciyv.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createTextClassifierSmartActions", 764, "IncomingMessageActionCreator.java")).q("Text is empty, not creating text classifier actions");
                e2 = elfo.e(new ArrayList());
            } else {
                cwkz cwkzVar = (cwkz) ciyvVar.h.get();
                cwln cwlnVar = cwkzVar.a;
                final String charSequence2 = charSequence.toString();
                e2 = cwlnVar.a().h(new emwl() { // from class: cwky
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        RemoteActionCompat remoteActionCompat;
                        Optional optional = (Optional) obj2;
                        if (optional.isEmpty()) {
                            int i = engw.d;
                            return enou.a;
                        }
                        String str = charSequence2;
                        List singletonList = Collections.singletonList(new ewxa(ewxa.b, str == null ? null : new SpannedString(str), Bundle.EMPTY));
                        engw r = engw.r("notification");
                        ewza ewzaVar = new ewza();
                        ewzaVar.a = engw.r("text_reply");
                        singletonList.getClass();
                        ewxd f2 = ((TextClassifierLib) optional.get()).f(new ewxc(DesugarCollections.unmodifiableList(singletonList), ewzaVar.a(), r == null ? enou.a : DesugarCollections.unmodifiableList(r), Bundle.EMPTY));
                        ArrayList arrayList = new ArrayList();
                        engw engwVar = ((ewvq) f2).a;
                        int size = engwVar.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ewwx ewwxVar = (ewwx) engwVar.get(i2);
                            if (TextUtils.isEmpty(ewwxVar.a) && (remoteActionCompat = ewwxVar.b) != null && remoteActionCompat.f) {
                                klz klzVar = new klz(remoteActionCompat.a, remoteActionCompat.b, remoteActionCompat.d);
                                klzVar.e = true;
                                arrayList.add(klzVar.a());
                            }
                        }
                        return arrayList;
                    }
                }, cwkzVar.b).h(new emwl() { // from class: ciyj
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        entd entdVar = ciyv.a;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) obj2).iterator();
                        while (it.hasNext()) {
                            arrayList.add(ciuw.o(ciux.NAT_TEXT_CLASSIFIER_ACTION, (kma) it.next(), Optional.empty()));
                        }
                        return arrayList;
                    }
                }, ciyvVar.e);
            }
        } else {
            ((ensz) ((ensz) ciyv.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createTextClassifierSmartActions", 752, "IncomingMessageActionCreator.java")).q("Conversation/message doesn't allow smart text actions, not creating text classifier actions");
            ensz enszVar2 = (ensz) ciyv.a.h();
            enszVar2.Y(csux.o, c.Q().a());
            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createTextClassifierSmartActions", 758, "IncomingMessageActionCreator.java")).q("Skipping text classifier smart actions");
            e2 = elfo.e(new ArrayList());
        }
        final ConversationId O = c.O();
        if (ciyv.c(c.C(), f) && cjci.c()) {
            e3 = e.h(new emwl() { // from class: ciyo
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    Optional optional = (Optional) obj2;
                    if (optional.isEmpty()) {
                        return new ArrayList();
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    engw engwVar = (engw) optional.get();
                    int size = engwVar.size();
                    int i = 0;
                    while (true) {
                        ciyv ciyvVar2 = ciyv.this;
                        if (i >= size) {
                            ciyvVar2.g.a(arrayList2);
                            return arrayList;
                        }
                        SuggestionData suggestionData = (SuggestionData) engwVar.get(i);
                        if (!bduu.c(suggestionData)) {
                            emxf.a(!bduu.c(suggestionData));
                            ciuw ciuwVar = null;
                            cira ciraVar = suggestionData instanceof SmartSuggestionItemSuggestionData ? (cira) ciyvVar2.j.get(((SmartSuggestionItemSuggestionData) suggestionData).l()) : null;
                            if (ciraVar != null) {
                                ciuwVar = ciuw.o(ciux.NAT_NON_TEXT_SMART_ACTION, ciraVar.a(suggestionData, O), Optional.empty());
                            } else {
                                ensz enszVar3 = (ensz) ciyv.a.j();
                                enszVar3.Y(cird.e, suggestionData.b());
                                ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "getNotificationSmartAction", 819, "IncomingMessageActionCreator.java")).q("Missing smart action provider for type");
                            }
                            String b = suggestionData.b();
                            if (ciuwVar != null && !TextUtils.isEmpty(b)) {
                                arrayList2.add(b);
                                arrayList.add(ciuwVar);
                            }
                        }
                        i++;
                    }
                }
            }, ciyvVar.f);
        } else {
            ensz enszVar3 = (ensz) ciyv.a.h();
            enszVar3.Y(csux.o, O.b());
            ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createNonTextSmartActions", 623, "IncomingMessageActionCreator.java")).q("Skipping non-text smart actions");
            e3 = elfo.e(new ArrayList());
        }
        final elfl elflVar = e;
        final elfl h2 = elfo.h(new erog() { // from class: ciyt
            @Override // defpackage.erog
            public final ListenableFuture a() {
                elfl h3;
                elfl h4;
                elfl e7;
                final ArrayList arrayList = new ArrayList();
                final bcse bcseVar3 = bcseVar2;
                bduq a2 = ctgv.a(bcseVar3.u());
                boolean booleanValue = ((Boolean) ddjr.e.e()).booleanValue();
                final ciyv ciyvVar2 = ciyv.this;
                if (!booleanValue) {
                    h3 = elfo.e(null);
                } else if (ciyvVar2.q.isEmpty()) {
                    ((ensz) ((ensz) ciyv.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createReminderAction", 665, "IncomingMessageActionCreator.java")).q("Reminder settings service not present, skipping reminder action");
                    h3 = elfo.e(null);
                } else {
                    h3 = ((cnlo) ciyvVar2.q.get()).b().h(new emwl() { // from class: ciyp
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            bcse bcseVar4 = bcseVar3;
                            final MessageIdType u2 = bcseVar4.u();
                            if (!((Boolean) obj2).booleanValue() || u2.c() || bcseVar4.au()) {
                                ((ensz) ((ensz) ciyv.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createReminderAction", 679, "IncomingMessageActionCreator.java")).q("Unable to create reminder action from message data");
                                return null;
                            }
                            ciyv ciyvVar3 = ciyv.this;
                            final ConversationIdType t = bcseVar4.t();
                            Optional map = ciyvVar3.p.map(new Function() { // from class: ciyi
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    entd entdVar = ciyv.a;
                                    return ((cnla) obj3).a(ConversationIdType.this, u2);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            if (map.isPresent()) {
                                return ciuw.o(ciux.NAT_REMINDER, (kma) map.get(), Optional.empty());
                            }
                            ((ensz) ((ensz) ciyv.a.j()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createReminderAction", 691, "IncomingMessageActionCreator.java")).q("Reminder action is not present, not creating reminder action");
                            return null;
                        }
                    }, ciyvVar2.e);
                }
                ConversationIdType conversationIdType2 = Q2;
                arrayList.add(h3);
                Context context = ciyvVar2.d;
                ciuv n = ciuw.n(ciux.NAT_MARK_AS_READ, IconCompat.h(context, R.drawable.ic_check_circle_gray), context.getString(R.string.im_notification_mark_as_read), ciyvVar2.i.f(conversationIdType2), Optional.empty());
                ((cisq) n).e = Optional.of(2);
                arrayList.add(elfo.e(n.a()));
                if (cjci.b() || !a2.b().isPresent() || ((cojg) ciyvVar2.r.b()).b()) {
                    engw engwVar = f;
                    Optional optional = ofNullable;
                    if (optional.isPresent()) {
                        final bcrs bcrsVar = c;
                        final SelfIdentityId selfIdentityId = (SelfIdentityId) optional.get();
                        if (!ciyv.c(bcrsVar.C(), engwVar)) {
                            ensz enszVar4 = (ensz) ciyv.a.h();
                            enszVar4.Y(csux.o, bcrsVar.Q().a());
                            ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createQuickReplyAction", 527, "IncomingMessageActionCreator.java")).q("Conversation/message doesn't allow quick reply, not adding quick reply action");
                            h4 = elfo.e(null);
                        } else if (bcrsVar.r().booleanValue()) {
                            ensz enszVar5 = (ensz) ciyv.a.h();
                            enszVar5.Y(csux.p, bcrsVar.Q());
                            ((ensz) enszVar5.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createQuickReplyAction", 537, "IncomingMessageActionCreator.java")).q("eSOS Conversation doesn't allow quick reply, not adding quick reply action");
                            h4 = elfo.e(null);
                        } else {
                            h4 = elflVar.h(new emwl() { // from class: ciyk
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    cisq cisqVar;
                                    Optional of;
                                    Optional optional2 = (Optional) obj2;
                                    ciyv ciyvVar3 = ciyv.this;
                                    CharSequence[] charSequenceArr = null;
                                    if (!((auiv) ciyvVar3.t.b()).a()) {
                                        final cjci cjciVar2 = ciyvVar3.g;
                                        charSequenceArr = (CharSequence[]) optional2.flatMap(new Function() { // from class: ciyh
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj3) {
                                                engw engwVar2 = (engw) obj3;
                                                ArrayList arrayList2 = new ArrayList(engwVar2.size());
                                                ArrayList arrayList3 = new ArrayList(engwVar2.size());
                                                Iterator<E> it = engwVar2.iterator();
                                                while (it.hasNext()) {
                                                    SmartSuggestionData smartSuggestionData = (SmartSuggestionData) ((SuggestionData) it.next());
                                                    if (bduu.c(smartSuggestionData)) {
                                                        String d = smartSuggestionData.d();
                                                        String b = smartSuggestionData.b();
                                                        if (!TextUtils.isEmpty(d) && !TextUtils.isEmpty(b)) {
                                                            arrayList2.add(b);
                                                            arrayList3.add(d);
                                                        }
                                                    }
                                                }
                                                cjci.this.a(arrayList2);
                                                return arrayList3.isEmpty() ? Optional.empty() : Optional.of((CharSequence[]) arrayList3.toArray(new CharSequence[0]));
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).orElse(null);
                                    }
                                    CharSequence[] charSequenceArr2 = charSequenceArr;
                                    SelfIdentityId selfIdentityId2 = selfIdentityId;
                                    bcrs bcrsVar2 = bcrsVar;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("conversation_id", bcrsVar2.Q().a());
                                    bundle.putString("self_id", selfIdentityId2.b());
                                    bundle.putBoolean("requires_mms", bcrsVar2.X());
                                    bundle.putBoolean("has_rbm_bot_recipient", bcrsVar2.W());
                                    bundle.putBoolean("via_notification", true);
                                    bundle.putBoolean("via_quickreply", true);
                                    ciuv m = ciuw.m(ciux.NAT_QUICK_REPLY, IconCompat.h(ciyvVar3.d, R.drawable.ic_wear_reply), ciyvVar3.d.getString(R.string.im_notification_reply), Optional.of(bundle));
                                    if (((auiv) ciyvVar3.t.b()).a()) {
                                        cisqVar = (cisq) m;
                                        cisqVar.f = Optional.of(new kns[]{new kns("android.intent.extra.TEXT", ciyvVar3.d.getString(R.string.im_notification_reply_prompt), null, true, 0, new Bundle(), new HashSet())});
                                        of = Optional.of(true);
                                    } else {
                                        cisqVar = (cisq) m;
                                        cisqVar.f = Optional.of(new kns[]{new kns("android.intent.extra.TEXT", ciyvVar3.d.getString(R.string.im_notification_reply_prompt), charSequenceArr2, true, 0, new Bundle(), new HashSet())});
                                        of = Optional.of(Boolean.valueOf(cjci.b()));
                                    }
                                    cisqVar.d = of;
                                    ((cisq) m).e = Optional.of(1);
                                    return m.a();
                                }
                            }, ciyvVar2.f);
                        }
                        arrayList.add(h4);
                    } else {
                        ((ensz) ((ensz) ciyv.a.j()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createActions", 231, "IncomingMessageActionCreator.java")).q("Not creating quick reply, no self id to reply on");
                    }
                    arrayList.add(ciyvVar2.b(conversationIdType2, e6, engwVar.size()));
                } else {
                    MessageIdType messageIdType2 = a2.c;
                    if (a2.b().isEmpty()) {
                        ensz enszVar6 = (ensz) ciyv.a.h();
                        enszVar6.Y(csux.o, conversationIdType2.a());
                        enszVar6.Y(csux.a, messageIdType2.b());
                        ((ensz) enszVar6.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createOtpAction", 486, "IncomingMessageActionCreator.java")).q("OTP annotation missing, not creating OTP Action");
                        e7 = elfo.e(null);
                    } else {
                        fbuk fbukVar = (fbuk) a2.b().get();
                        e7 = elfo.e(ciuw.n(ciux.NAT_COPY_OTP, IconCompat.h(ciyvVar2.d, R.drawable.quantum_ic_content_copy_grey600_24), ciyvVar2.d.getString(R.string.action_copy_otp, crnx.f((fbukVar.c == 2 ? (fbva) fbukVar.d : fbva.a).b)), ciyvVar2.i.e((fbukVar.c == 2 ? (fbva) fbukVar.d : fbva.a).b, conversationIdType2, messageIdType2), Optional.empty()).a());
                    }
                    arrayList.add(e7);
                }
                return elfo.l(arrayList).a(new Callable() { // from class: ciyn
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        entd entdVar = ciyv.a;
                        int i = engw.d;
                        engr engrVar = new engr();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ciuw ciuwVar = (ciuw) erqt.q((elfl) it.next());
                            if (ciuwVar != null) {
                                engrVar.h(ciuwVar);
                            }
                        }
                        return engrVar.g();
                    }
                }, ciyvVar2.e);
            }
        }, ciyvVar.f);
        final elfl a2 = elfo.m(h2, e2, e3).a(new Callable() { // from class: ciyu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ensz enszVar4 = (ensz) ciyv.a.h();
                enszVar4.Y(csux.o, ConversationIdType.this.a());
                ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createActions", 265, "IncomingMessageActionCreator.java")).q("Notification actions created");
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((java.util.Collection) Objects.requireNonNullElse((AbstractCollection) erqt.q(h2), new ArrayList()));
                arrayList.addAll((java.util.Collection) Objects.requireNonNullElse((List) erqt.q(e2), new ArrayList()));
                arrayList.addAll((java.util.Collection) Objects.requireNonNullElse((List) erqt.q(e3), new ArrayList()));
                List.EL.sort(arrayList, ciyv.c);
                return engw.n(arrayList);
            }
        }, ciyvVar.e);
        ciyv ciyvVar2 = cizxVar.y;
        final ArrayList arrayList = new ArrayList();
        arrayList.add(ciyvVar2.b(c.Q(), e6, f.size()));
        if (ofNullable.isPresent()) {
            SelfIdentityId selfIdentityId = (SelfIdentityId) ofNullable.get();
            if (c.C()) {
                boolean z2 = ciyvVar2.n.a(c.V(), c.M(), 1) || (c.X() && ciyvVar2.o.d(c.M()));
                Bundle bundle = new Bundle();
                bundle.putString("conversation_id", c.Q().a());
                bundle.putString("self_id", selfIdentityId.b());
                bundle.putBoolean("requires_mms", z2);
                bundle.putBoolean("has_rbm_bot_recipient", c.W());
                bundle.putBoolean("via_notification", true);
                bundle.putBoolean("via_quickreply", true);
                ciuv m = ciuw.m(ciux.NAT_WEARABLE_QUICK_REPLY, IconCompat.h(ciyvVar2.d, R.drawable.ic_wear_reply), ciyvVar2.d.getString(R.string.im_notification_reply_prompt), Optional.of(bundle));
                cisq cisqVar = (cisq) m;
                cisqVar.f = Optional.of(new kns[]{new kns("android.intent.extra.TEXT", ciyvVar2.d.getString(R.string.im_notification_reply_prompt), ciyvVar2.d.getResources().getStringArray(R.array.notification_reply_choices), true, 0, new Bundle(), new HashSet())});
                cisqVar.d = Optional.of(true);
                cisqVar.e = Optional.of(1);
                e5 = elfo.e(m.a());
            } else {
                e5 = elfo.e(null);
            }
            arrayList.add(e5);
        } else {
            ((ensz) ((ensz) ciyv.a.j()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createWearableActions", 301, "IncomingMessageActionCreator.java")).q("Not creating wearable quick reply, no self id to reply on");
        }
        if (!((cghm) ciyvVar2.s.b()).b()) {
            Intent l = ciyvVar2.l.l(ciyvVar2.d, c.O(), ciyvVar2.k.a(c), true, c.W());
            l.setAction("com.google.android.apps.messaging.view_conversation");
            l.putExtra("conversation_id", c.Q().a());
            l.putExtra("account", ciyvVar2.a());
            l.putExtra("account_version", 2);
            l.putExtra("phone_number", (String) c.p().map(new Function() { // from class: ciyq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    entd entdVar = ciyv.a;
                    cfva cfvaVar = aoqm.a;
                    return ((aoku) obj2).p(((Boolean) new aopd().get()).booleanValue());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(null));
            arrayList.add(elfo.e(ciuw.p(ciux.NAT_WEARABLE_OPEN_CONVERSATION, IconCompat.h(ciyvVar2.d, R.drawable.ic_full_sms_white), ciyvVar2.d.getString(R.string.notification_view_conversation), l, true).a()));
        }
        if (c.X() || c.V() || !c.C()) {
            e4 = elfo.e(null);
        } else {
            ciph ciphVar = ciyvVar2.m;
            c.Q();
            Optional p = c.p();
            c.d.h();
            Intent b = ciphVar.b(p);
            b.setAction("com.google.android.apps.messaging.action_dial");
            Bundle bundle2 = new Bundle();
            bundle2.putString("conversation_id", c.Q().a());
            bundle2.putInt("account", ciyvVar2.a());
            bundle2.putInt("account_version", 2);
            bundle2.putString("phone_number", (String) c.p().map(new Function() { // from class: ciym
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    entd entdVar = ciyv.a;
                    cfva cfvaVar = aoqm.a;
                    return ((aoku) obj2).p(((Boolean) new aopd().get()).booleanValue());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(null));
            b.putExtras(bundle2);
            e4 = elfo.e(ciuw.p(ciux.NAT_WEARABLE_CALL, IconCompat.h(ciyvVar2.d, R.drawable.ic_full_call_white), ciyvVar2.d.getString(R.string.im_notification_call), b, false).a());
        }
        arrayList.add(e4);
        final elfl a3 = elfo.l(arrayList).a(new Callable() { // from class: ciyl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ensz enszVar4 = (ensz) ciyv.a.h();
                enszVar4.Y(csux.o, bcrs.this.Q().a());
                ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createWearableActions", 315, "IncomingMessageActionCreator.java")).q("Wearable notification actions created");
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ciuw ciuwVar = (ciuw) erqt.q((elfl) it.next());
                    if (ciuwVar != null) {
                        arrayList2.add(ciuwVar);
                    }
                }
                List.EL.sort(arrayList2, ciyv.c);
                return engw.n(arrayList2);
            }
        }, ciyvVar2.e);
        final boolean z3 = cjaxVar.d;
        final ConversationIdType d = cixzVar.d();
        final ConversationId O2 = cixzVar.c().O();
        final long b2 = cixzVar.b();
        final bcrs c2 = cixzVar.c();
        final engw f2 = cixzVar.f();
        final bcse bcseVar3 = (bcse) enjk.j(f2);
        final cjay e7 = cixzVar.e();
        final bcyl a4 = cizxVar.m.a(c2);
        if (cizxVar.g.isEmpty()) {
            h = elfo.e(Optional.empty());
        } else {
            elfl d2 = ((csll) cizxVar.g.get()).d(c2.s(), cizxVar.b, true, c2.c());
            cizxVar = this;
            d = d;
            h = d2.h(new emwl() { // from class: ciza
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    engw g3;
                    HashSet hashSet;
                    String P;
                    cizx cizxVar2 = cizx.this;
                    IconCompat iconCompat = (IconCompat) obj2;
                    csll csllVar = (csll) cizxVar2.g.get();
                    ConversationIdType conversationIdType2 = d;
                    String f3 = csllVar.f(conversationIdType2);
                    cslk cslkVar = (cslk) cizxVar2.h.b();
                    bcrs bcrsVar = c2;
                    int i = true != cslkVar.a(bcrsVar) ? 2147483646 : 0;
                    engw engwVar = f2;
                    String d3 = cizxVar2.m.d(bcrsVar, engwVar);
                    citq l2 = citr.l();
                    ciso cisoVar = (ciso) l2;
                    cisoVar.b = conversationIdType2;
                    ConversationId conversationId = O2;
                    l2.f(conversationId);
                    cisoVar.a = f3;
                    l2.d(d3);
                    l2.e(bcrsVar.X());
                    l2.g(bcrsVar.p());
                    l2.h(i);
                    if (engwVar.isEmpty()) {
                        g3 = enou.a;
                    } else {
                        HashSet hashSet2 = new HashSet();
                        engr engrVar = new engr();
                        int size = engwVar.size();
                        int i2 = 0;
                        while (i2 < size) {
                            bcse bcseVar4 = (bcse) engwVar.get(i2);
                            ParticipantsTable.BindData bindData = bcseVar4.d;
                            engw engwVar2 = engwVar;
                            long u2 = bindData.u();
                            String T = bindData.T();
                            Uri uri = null;
                            if (u2 > -1 && !TextUtils.isEmpty(T)) {
                                uri = ContactsContract.Contacts.getLookupUri(u2, T);
                            }
                            Uri uri2 = uri;
                            if (!bcseVar4.az() || uri2 == null || hashSet2.contains(uri2)) {
                                hashSet = hashSet2;
                            } else {
                                hashSet2.add(uri2);
                                ParticipantsTable.BindData bindData2 = bcseVar4.d;
                                String R = bindData2.R();
                                if (TextUtils.isEmpty(R)) {
                                    cjat cjatVar = cizxVar2.m;
                                    cfva cfvaVar = aoqm.a;
                                    if (((Boolean) new aooy().get()).booleanValue()) {
                                        hashSet = hashSet2;
                                        P = cjatVar.c.o(bindData2).G().a;
                                        P.getClass();
                                    } else {
                                        hashSet = hashSet2;
                                        P = bindData2.P();
                                    }
                                    R = TextUtils.isEmpty(P) ? cjatVar.a.getString(R.string.unknown_sender) : P;
                                } else {
                                    hashSet = hashSet2;
                                }
                                engrVar.h(cixt.e(R, bcseVar4.o(), uri2));
                            }
                            i2++;
                            engwVar = engwVar2;
                            hashSet2 = hashSet;
                        }
                        g3 = engrVar.g();
                    }
                    bcyl bcylVar = a4;
                    cisoVar.f = Optional.of(g3);
                    cisoVar.c = iconCompat;
                    cisoVar.d = Optional.of(ciwm.e(cizxVar2.f.k(cizxVar2.b, conversationId, null, bcylVar, null, bcrsVar.W()), false, Optional.empty(), Optional.empty()));
                    return Optional.of(l2.a());
                }
            }, cizxVar.s);
        }
        final elfl h3 = h.h(new emwl() { // from class: cizh
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:145:0x0462  */
            /* JADX WARN: Removed duplicated region for block: B:159:0x0467  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x013a  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0621  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x065a  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x06f3  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x06f8  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x0639  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0268  */
            /* JADX WARN: Type inference failed for: r5v34, types: [ffbr, java.lang.Object] */
            @Override // defpackage.emwl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r33) {
                /*
                    Method dump skipped, instructions count: 1853
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cizh.apply(java.lang.Object):java.lang.Object");
            }
        }, cizxVar.c);
        return elfo.m(h3, a2, a3).a(new Callable() { // from class: cizj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                entd entdVar = cizx.a;
                civk civkVar = (civk) erqt.q(elfl.this);
                civkVar.e(Optional.of((java.util.List) erqt.q(a2)));
                engw engwVar = (engw) erqt.q(a3);
                Optional.empty();
                Optional.empty();
                Optional.empty();
                civkVar.l(Optional.of(new citg(Optional.of(engwVar), Optional.empty())));
                ensz enszVar4 = (ensz) cizx.a.h();
                enszVar4.Y(csux.p, cixzVar.d());
                ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "createNotificationBuilderInfoFuture", 459, "IncomingMessageBlueprint.java")).q("Notification builder info created");
                return civkVar.a();
            }
        }, erpp.a);
    }

    @Override // defpackage.civa
    public final ciwq c() {
        return new cizw();
    }

    @Override // defpackage.civa
    public final cixf d() {
        return cixf.NT_INCOMING_MESSAGE;
    }

    @Override // defpackage.civa
    public final elfl e() {
        return elfo.e(true);
    }

    @Override // defpackage.civa
    public final Optional f() {
        return Optional.of(this.u.c());
    }

    @Override // defpackage.civa
    public final String g() {
        return "msg";
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Size;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class appg implements apnr {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory");
    private final bcwz b;
    private final apmr c;
    private final Context d;
    private final bdjs e;
    private final asvn f;
    private final askf g;
    private final aufn h;
    private final auol i;
    private final atwy j;
    private final atxb k;
    private final cqoh l;
    private final apqx m;
    private final apri n;

    public appg(Context context, cqoh cqohVar, bcwz bcwzVar, apqx apqxVar, apmr apmrVar, bdjs bdjsVar, asvn asvnVar, askf askfVar, aufn aufnVar, auol auolVar, atxb atxbVar, atwy atwyVar, apri apriVar) {
        this.d = context;
        this.l = cqohVar;
        this.b = bcwzVar;
        this.m = apqxVar;
        this.c = apmrVar;
        this.e = bdjsVar;
        this.f = asvnVar;
        this.g = askfVar;
        this.h = aufnVar;
        this.i = auolVar;
        this.k = atxbVar;
        this.j = atwyVar;
        this.n = apriVar;
    }

    private final apmq e(MessagesTable.BindData bindData, MessagePartData messagePartData, apug apugVar) {
        Rect s;
        Uri uri;
        dteh dtehVar;
        Duration duration;
        if (messagePartData.br()) {
            Uri t = messagePartData.t();
            String authority = t == null ? null : t.getAuthority();
            if (authority == null || authority.startsWith("mms")) {
                return g(bindData, messagePartData);
            }
        }
        if (w(bindData, messagePartData)) {
            int s2 = bindData.s();
            boolean z = false;
            if (this.e.b(this.d, s2) && !ctid.h(this.d)) {
                z = true;
            }
            boolean z2 = z;
            ensk h = a.h();
            h.Y(ente.a, "BugleMapi");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createPendingMmsContent", 595, "CoreBugleContentFactory.java")).L("Attachment is PendingContent messageId=%s status=%x canRedownload=%b contentType=%s uri=%s", bindData.D().b(), Integer.valueOf(s2), Boolean.valueOf(z2), messagePartData.V(), this.c.a(messagePartData.t(), messagePartData.v()));
            Uri uri2 = Uri.EMPTY;
            if (uri2 == null) {
                throw new NullPointerException("Null uri");
            }
            String V = messagePartData.V();
            V.getClass();
            return new apnj(V, uri2, messagePartData.p(), z2, p(bindData, messagePartData));
        }
        if (messagePartData.ba()) {
            if (messagePartData.t() == null) {
                ensk j = a.j();
                j.Y(ente.a, "BugleMapi");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createAudioContent", 615, "CoreBugleContentFactory.java")).q("Null Uri on audio message part");
            }
            Uri a2 = this.c.a(messagePartData.t(), messagePartData.v());
            ensk h2 = a.h();
            h2.Y(ente.a, "BugleMapi");
            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createAudioContent", 620, "CoreBugleContentFactory.java")).K("Attachment is Audio messageId=%s status=%x contentType=%s uri=%s", bindData.D().b(), Integer.valueOf(bindData.s()), messagePartData.V(), a2);
            apmv apmvVar = new apmv();
            apmvVar.e = null;
            apmvVar.f = null;
            apmvVar.a(dteh.a);
            apmvVar.f = (apdv) ((apsn) apugVar).h.getOrDefault(messagePartData.aa(), null);
            apmvVar.a(messagePartData.M());
            String V2 = messagePartData.V();
            V2.getClass();
            apmvVar.a = V2;
            Duration ofMillis = Duration.ofMillis(Math.max(0L, messagePartData.k()));
            if (ofMillis == null) {
                throw new NullPointerException("Null duration");
            }
            apmvVar.d = ofMillis;
            apmvVar.e = p(bindData, messagePartData);
            if (a2 == null) {
                throw new NullPointerException("Null uri");
            }
            apmvVar.b = a2;
            String str = apmvVar.a;
            if (str != null && (uri = apmvVar.b) != null && (dtehVar = apmvVar.c) != null && (duration = apmvVar.d) != null) {
                return new apmw(str, uri, dtehVar, duration, apmvVar.e, apmvVar.f);
            }
            StringBuilder sb = new StringBuilder();
            if (apmvVar.a == null) {
                sb.append(" contentType");
            }
            if (apmvVar.b == null) {
                sb.append(" uri");
            }
            if (apmvVar.c == null) {
                sb.append(" voiceMetadata");
            }
            if (apmvVar.d == null) {
                sb.append(" duration");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        if (messagePartData.bt()) {
            ufn n = ufo.n();
            n.b(messagePartData.N());
            uet uetVar = (uet) n;
            uetVar.b = new Size(messagePartData.c(), messagePartData.b());
            uetVar.c = emxe.b(messagePartData.ae());
            n.c(eobe.a);
            n.d(eobe.a);
            n.e(this.c.a(messagePartData.t(), messagePartData.v()));
            if (messagePartData.K() != null) {
                ensk h3 = a.h();
                h3.Y(ente.a, "BugleMapi");
                enrr enrrVar = (enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createRcsLocation", 573, "CoreBugleContentFactory.java");
                String b = messagePartData.B().b();
                LocationInformation K = messagePartData.K();
                K.getClass();
                Double valueOf = Double.valueOf(K.d);
                LocationInformation K2 = messagePartData.K();
                K2.getClass();
                enrrVar.J("Attachment is RcsLocation messageId=%s longitude=%f latitude=%f", b, valueOf, Double.valueOf(K2.c));
                LocationInformation K3 = messagePartData.K();
                K3.getClass();
                n.c(K3.d);
                LocationInformation K4 = messagePartData.K();
                K4.getClass();
                n.d(K4.c);
            } else {
                ensk j2 = a.j();
                j2.Y(ente.a, "BugleMapi");
                ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createRcsLocation", 582, "CoreBugleContentFactory.java")).t("Null location information in message with id=%s", messagePartData.B().b());
            }
            return n.a();
        }
        if (messagePartData.bo() || messagePartData.bj()) {
            return c(bindData, messagePartData, ((apsn) apugVar).e);
        }
        if (messagePartData.bC()) {
            Uri a3 = this.c.a(messagePartData.t(), messagePartData.v());
            ensk h4 = a.h();
            h4.Y(ente.a, "BugleMapi");
            ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createVCard", 451, "CoreBugleContentFactory.java")).J("Attachment is VCard messageId=%s source=%s uri=%s", bindData.D().b(), messagePartData.N(), a3);
            ufq h5 = ufr.h();
            h5.b(messagePartData.N());
            ((uew) h5).b = p(bindData, messagePartData);
            h5.d(a3);
            h5.c(messagePartData.l() <= 0 ? messagePartData.p() : messagePartData.l());
            return h5.a();
        }
        if (!messagePartData.bD()) {
            if (!messagePartData.bk()) {
                return g(bindData, messagePartData);
            }
            Uri a4 = this.c.a(messagePartData.t(), messagePartData.v());
            ensk h6 = a.h();
            h6.Y(ente.a, "BugleMapi");
            ((enrr) ((enrr) h6).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createFileContent", 640, "CoreBugleContentFactory.java")).K("Attachment is File messageId=%s status=%x contentType=%s uri=%s", bindData.D().b(), Integer.valueOf(bindData.s()), messagePartData.V(), a4);
            String V3 = messagePartData.V();
            V3.getClass();
            apra p = p(bindData, messagePartData);
            String b2 = emxe.b(messagePartData.Y());
            long p2 = messagePartData.l() <= 0 ? messagePartData.p() : messagePartData.l();
            if (a4 != null) {
                return new apmx(V3, a4, b2, p2, p);
            }
            throw new NullPointerException("Null uri");
        }
        if (messagePartData.t() == null) {
            ensk j3 = a.j();
            j3.Y(ente.a, "BugleMapi");
            ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createVideo", 408, "CoreBugleContentFactory.java")).q("Null Uri on photo/video message part");
        }
        apra p3 = p(bindData, messagePartData);
        Uri a5 = this.c.a(messagePartData.t(), messagePartData.v());
        Uri x = messagePartData.x();
        ufk o = GalleryContent.o();
        String V4 = messagePartData.V();
        V4.getClass();
        o.f(V4);
        o.e(messagePartData.N());
        uec uecVar = (uec) o;
        uecVar.a = new Size(messagePartData.c(), messagePartData.b());
        uecVar.d = messagePartData.v();
        o.i(messagePartData.m());
        o.h = p3;
        o.j(messagePartData.I());
        o.k(a5);
        uecVar.c = x;
        if ((a5 == null || a5.equals(Uri.EMPTY)) && x != null && (s = messagePartData.s()) != null) {
            uecVar.a = new Size(s.width(), s.height());
        }
        if (messagePartData.k() > 0) {
            o.g(messagePartData.k());
        }
        ensk h7 = a.h();
        h7.Y(ente.a, "BugleMapi");
        ((enrr) ((enrr) h7).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createVideo", 438, "CoreBugleContentFactory.java")).K("Attachment is Video messageId=%s uri=%s previewContentType=%s previewSize=%s", bindData.D().b(), a5, String.valueOf(messagePartData.ab()), messagePartData.s());
        return o.l();
    }

    private final apnm f(MessagesTable.BindData bindData) {
        String string = bindData.s() == 23 ? this.d.getString(R.string.deleted_breadcrumb_outgoing) : this.d.getString(R.string.deleted_breadcrumb_incoming);
        if (string != null) {
            return new apmu(string);
        }
        throw new NullPointerException("Null text");
    }

    private final apoo g(MessagesTable.BindData bindData, MessagePartData messagePartData) {
        apmr apmrVar = this.c;
        String V = messagePartData.V();
        Uri a2 = apmrVar.a(messagePartData.t(), messagePartData.v());
        ensk h = a.h();
        h.Y(ente.a, "BugleMapi");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createUnsupportedContent", 688, "CoreBugleContentFactory.java")).K("Attachment is UnsupportedContent messageId=%s status=%x contentType=%s uri=%s", bindData.D().b(), Integer.valueOf(bindData.s()), V, a2);
        if (V == null) {
            V = "*/*";
        }
        apon a3 = apoo.a();
        apnk apnkVar = (apnk) a3;
        apnkVar.a = V;
        apnkVar.b = p(bindData, messagePartData);
        a3.b(a2);
        return a3.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0154, code lost:
    
        if (r1.equals(com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_LEFT) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01cd, code lost:
    
        if (r2.equals(com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardLayoutInfo.WIDTH_SMALL) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.appj h(final com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r20, defpackage.engw r21, final defpackage.apug r22) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.appg.h(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, engw, apug):appj");
    }

    private final appj i(MessagesTable.BindData bindData, MessagePartData messagePartData, apug apugVar) {
        String str;
        engw engwVar;
        enru enruVar = a;
        ensk e = enruVar.e();
        e.Y(ente.a, "BugleMapi");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.b, bindData.D());
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "getSinglePart", 259, "CoreBugleContentFactory.java")).t("Message contentType=%s", String.valueOf(messagePartData.V()));
        if (!messagePartData.bA() || w(bindData, messagePartData)) {
            if (this.f.a() && messagePartData.bi()) {
                try {
                    return l(messagePartData);
                } catch (IllegalStateException e2) {
                    ensk j = a.j();
                    j.Y(ente.a, "BugleMapi");
                    ((enrr) ((enrr) ((enrr) j).g(e2)).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "getSinglePart", (char) 293, "CoreBugleContentFactory.java")).q("Failed to create end of emergency content");
                    return g(bindData, messagePartData);
                }
            }
            if (!messagePartData.by()) {
                return e(bindData, messagePartData, apugVar);
            }
            String str2 = messagePartData.g;
            if (!emxe.c(str2)) {
                apoe d = apof.d();
                d.c(str2);
                return d.a();
            }
            ensk j2 = enruVar.j();
            j2.Y(ente.a, "BugleMapi");
            ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "getSinglePart", 301, "CoreBugleContentFactory.java")).q("Suggestion response part with null display text.");
            return g(bindData, messagePartData);
        }
        boolean z = bindData.r() == 130;
        String s = s(messagePartData.ae());
        if (s == null) {
            ensk j3 = enruVar.j();
            j3.Y(ente.a, "BugleMapi");
            enrr enrrVar2 = (enrr) j3;
            enrrVar2.Y(csux.b, bindData.D());
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "getSinglePart", 270, "CoreBugleContentFactory.java")).r("Message text part with null text. status=%x", bindData.s());
            s = "";
        } else if (s.isEmpty()) {
            ensk j4 = enruVar.j();
            j4.Y(ente.a, "BugleMapi");
            enrr enrrVar3 = (enrr) j4;
            enrrVar3.Y(csux.b, bindData.D());
            ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "getSinglePart", 276, "CoreBugleContentFactory.java")).q("Message text part is empty.");
        }
        if (TextUtils.isEmpty(bindData.V()) && !z) {
            return m(s, apugVar);
        }
        ensk e3 = enruVar.e();
        e3.Y(ente.a, "BugleMapi");
        enrr enrrVar4 = (enrr) e3;
        enrrVar4.Y(csux.b, bindData.D());
        ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "getSinglePart", 283, "CoreBugleContentFactory.java")).q("Message text part has subject or is urgent.");
        String V = bindData.V();
        apnd apndVar = new apnd();
        int i = engw.d;
        apndVar.a(enou.a);
        apndVar.a = s;
        apndVar.c = V;
        apndVar.b = z;
        apndVar.e = (byte) 1;
        apndVar.a(((apsn) apugVar).f);
        if (apndVar.e == 1 && (str = apndVar.a) != null && (engwVar = apndVar.d) != null) {
            return new apne(str, apndVar.b, apndVar.c, engwVar);
        }
        StringBuilder sb = new StringBuilder();
        if (apndVar.a == null) {
            sb.append(" text");
        }
        if (apndVar.e == 0) {
            sb.append(" isUrgent");
        }
        if (apndVar.d == null) {
            sb.append(" annotations");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    private final appq j(MessagesTable.BindData bindData, MessagePartData messagePartData) {
        return c(bindData, messagePartData, null);
    }

    private final appq k(final MessagesTable.BindData bindData, engw engwVar, final int i) {
        return (appq) Collection.EL.stream(engwVar).filter(new Predicate() { // from class: apoy
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
                MessagePartData messagePartData = (MessagePartData) obj;
                if (messagePartData.N() == eohh.RICH_CARD_THUMBNAIL) {
                    return messagePartData.a() == i;
                }
                return false;
            }
        }).findFirst().map(new Function() { // from class: apoz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return appg.this.c(bindData, (MessagePartData) obj, null);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
    }

    private final appw l(MessagePartData messagePartData) {
        String s = s(messagePartData.ae());
        if (s == null) {
            throw new IllegalStateException("Text in end of emergency content cannot be null.");
        }
        try {
            cntb a2 = cnnw.a(s);
            Context context = this.d;
            apoe d = apof.d();
            cnsz cnszVar = a2.c;
            if (cnszVar == null) {
                cnszVar = cnsz.a;
            }
            cnsy b = cnsy.b(cnszVar.c);
            if (b == null) {
                b = cnsy.UNRECOGNIZED;
            }
            d.c(context.getString(b == cnsy.HELP_NOT_LONGER_NEED ? R.string.end_of_emergency_help_not_needed : R.string.end_of_emergency_help_needed));
            return d.a();
        } catch (cnnx e) {
            throw new IllegalStateException("Text in end of emergency content is malformed", e);
        }
    }

    private static appw m(String str, apug apugVar) {
        apoe d = apof.d();
        d.c(str);
        d.b(((apsn) apugVar).f);
        return d.a();
    }

    private static appw n(GeneralPurposeRichCard generalPurposeRichCard, apug apugVar) {
        if (emxe.c(generalPurposeRichCard.content.description)) {
            return null;
        }
        return m(generalPurposeRichCard.content.description, apugVar);
    }

    private static appw o(GeneralPurposeRichCard generalPurposeRichCard, apug apugVar) {
        if (emxe.c(generalPurposeRichCard.content.title)) {
            return null;
        }
        return m(generalPurposeRichCard.content.title, apugVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.apra p(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r8, com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r9) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.appg.p(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, com.google.android.apps.messaging.shared.datamodel.data.MessagePartData):apra");
    }

    private static engw q(MessagesTable.BindData bindData, GeneralPurposeRichCard generalPurposeRichCard) {
        ArrayList<ConversationSuggestion> arrayList = generalPurposeRichCard.content.suggestions;
        if (arrayList == null) {
            int i = engw.d;
            return enou.a;
        }
        Stream filter = Collection.EL.stream(arrayList).map(new appf(bindData)).filter(new Predicate() { // from class: appd
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
                return Objects.nonNull((RbmSuggestionData) obj);
            }
        });
        int i2 = engw.d;
        return (engw) filter.collect(endq.a);
    }

    private static Optional r(engw engwVar, final int i) {
        return Collection.EL.stream(engwVar).filter(new Predicate() { // from class: apov
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
                MessagePartData messagePartData = (MessagePartData) obj;
                if (messagePartData.N() == eohh.RICH_CARD_MEDIA) {
                    return messagePartData.a() == i;
                }
                return false;
            }
        }).findFirst();
    }

    private static String s(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\u0000", "");
    }

    private static boolean t(MessagesTable.BindData bindData, MessagePartData messagePartData) {
        int s = bindData.s();
        int l = bindData.l();
        if (l == 0) {
            if (bindData.v() != -1) {
                return v(s) || bindData.u() <= 0;
            }
            return false;
        }
        if (l == 2) {
            return true;
        }
        if (l != 3) {
            return false;
        }
        return (v(s) || bindData.u() <= 0) && messagePartData.aZ();
    }

    private static boolean u(int i) {
        return i == 117 || i == 23;
    }

    private static boolean v(int i) {
        if (bdjs.h(i)) {
            return true;
        }
        return i >= 200 && i <= 267;
    }

    private final boolean w(MessagesTable.BindData bindData, MessagePartData messagePartData) {
        if (bindData.l() == 3) {
            return false;
        }
        return this.j.a() ? t(bindData, messagePartData) && !bdjs.k(bindData.s()) : t(bindData, messagePartData) && this.e.e(this.d, bindData.s());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.apnr
    public final appj a(MessagesTable.BindData bindData, engw engwVar, apug apugVar) {
        String str;
        if (this.i.a() && u(bindData.s())) {
            return f(bindData);
        }
        if (engwVar.isEmpty()) {
            ensk j = a.j();
            j.Y(ente.a, "BugleMapi");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "create", 179, "CoreBugleContentFactory.java")).r("Message without any associated part. status=%x", bindData.s());
            apon a2 = apoo.a();
            ((apnk) a2).a = "*/*";
            a2.b(Uri.EMPTY);
            return a2.a();
        }
        if (engwVar.size() <= 1) {
            return i(bindData, this.b.e((PartsTable.BindData) engwVar.get(0)), apugVar);
        }
        if (this.g.a() && Collection.EL.stream(engwVar).anyMatch(new Predicate() { // from class: apox
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
                return Objects.equals(((PartsTable.BindData) obj).H(), RbmSpecificMessage.CONTENT_TYPE);
            }
        })) {
            return h(bindData, engwVar, apugVar);
        }
        engr engrVar = new engr();
        String str2 = null;
        for (int i = 0; i < engwVar.size(); i++) {
            MessagePartData e = this.b.e((PartsTable.BindData) engwVar.get(i));
            if (e.bA()) {
                str = s(e.ae());
            } else {
                if (this.f.a() && e.bi()) {
                    try {
                        str = ((apnc) l(e)).a;
                    } catch (IllegalStateException e2) {
                        ensk j2 = a.j();
                        j2.Y(ente.a, "BugleMapi");
                        ((enrr) ((enrr) ((enrr) j2).g(e2)).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "create", (char) 205, "CoreBugleContentFactory.java")).q("Failed to create end of emergency content");
                        engrVar.h(g(bindData, e));
                    }
                } else {
                    engrVar.h(e(bindData, e, apugVar));
                }
            }
            str2 = str;
        }
        engw g = engrVar.g();
        if (g != null) {
            return new apna(g, str2);
        }
        throw new NullPointerException("Null attachments");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.apnr
    public final engw b(MessagesTable.BindData bindData, engw engwVar, apug apugVar) {
        if (this.i.a() && u(bindData.s())) {
            return engw.r(f(bindData));
        }
        if (engwVar.isEmpty()) {
            ensk j = a.j();
            j.Y(ente.a, "BugleMapi");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createFlatten", 230, "CoreBugleContentFactory.java")).r("Message without any associated part. status=%x", bindData.s());
            apon a2 = apoo.a();
            ((apnk) a2).a = "*/*";
            a2.b(Uri.EMPTY);
            return engw.r(a2.a());
        }
        if (this.g.a() && Collection.EL.stream(engwVar).anyMatch(new Predicate() { // from class: apow
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
                return Objects.equals(((PartsTable.BindData) obj).H(), RbmSpecificMessage.CONTENT_TYPE);
            }
        })) {
            return engw.r(h(bindData, engwVar, apugVar));
        }
        engr engrVar = new engr();
        int size = engwVar.size();
        for (int i = 0; i < size; i++) {
            engrVar.h(i(bindData, this.b.e((PartsTable.BindData) engwVar.get(i)), apugVar));
        }
        return engrVar.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ec, code lost:
    
        if (r7 != 5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.apnx c(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r24, com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.appg.c(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, com.google.android.apps.messaging.shared.datamodel.data.MessagePartData, java.lang.String):apnx");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.apoq d(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r9, defpackage.engw r10, int r11, com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard r12, defpackage.apug r13) {
        /*
            r8 = this;
            apoq r0 = new apoq
            appw r1 = o(r12, r13)
            appw r13 = n(r12, r13)
            j$.util.Optional r2 = r(r10, r11)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L17
            r10 = 0
            goto Lab
        L17:
            appq r4 = r8.k(r9, r10, r11)
            java.lang.Object r10 = r2.get()
            com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r10 = (com.google.android.apps.messaging.shared.datamodel.data.MessagePartData) r10
            appq r5 = r8.j(r9, r10)
            apop r10 = new apop
            r11 = r2
            apny r2 = new apny
            java.lang.Object r3 = r11.get()
            com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r3 = (com.google.android.apps.messaging.shared.datamodel.data.MessagePartData) r3
            long r6 = r3.p()
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.Object r11 = r11.get()
            com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r11 = (com.google.android.apps.messaging.shared.datamodel.data.MessagePartData) r11
            java.lang.String r11 = r11.aa()
            long r6 = java.lang.Long.parseLong(r11)
            r2.<init>(r3, r4, r5, r6)
            com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardContent r11 = r12.content
            com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardMediaInfo r11 = r11.media
            java.lang.String r11 = r11.height
            boolean r3 = defpackage.emxe.c(r11)
            r4 = 1
            r3 = r3 ^ r4
            java.lang.String r5 = "Media height must be provided for a vertical rich card."
            defpackage.emxf.b(r3, r5)
            int r3 = r11.hashCode()
            r5 = -1616240335(0xffffffff9faa2131, float:-7.205271E-20)
            r6 = 0
            r7 = 2
            if (r3 == r5) goto L84
            r5 = -585750279(0xffffffffdd1628f9, float:-6.7626074E17)
            if (r3 == r5) goto L7a
            r5 = 1973327466(0x759e966a, float:4.020672E32)
            if (r3 == r5) goto L70
            goto L8e
        L70:
            java.lang.String r3 = "SHORT_HEIGHT"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L8e
            r3 = r6
            goto L8f
        L7a:
            java.lang.String r3 = "TALL_HEIGHT"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L8e
            r3 = r7
            goto L8f
        L84:
            java.lang.String r3 = "MEDIUM_HEIGHT"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L8e
            r3 = r4
            goto L8f
        L8e:
            r3 = -1
        L8f:
            if (r3 == 0) goto La8
            if (r3 == r4) goto La7
            if (r3 != r7) goto L97
            r4 = 3
            goto La8
        L97:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r6] = r11
            java.lang.String r11 = "Vertical rich card has an unexpected media height value: %s"
            java.lang.String r10 = java.lang.String.format(r11, r10)
            r9.<init>(r10)
            throw r9
        La7:
            r4 = r7
        La8:
            r10.<init>(r2, r4)
        Lab:
            engw r9 = q(r9, r12)
            r0.<init>(r1, r13, r10, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.appg.d(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, engw, int, com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard, apug):apoq");
    }
}

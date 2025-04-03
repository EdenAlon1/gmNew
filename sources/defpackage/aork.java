package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aork implements alxr, apco {
    private static final enru h = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage");
    private static final Duration i;
    public final MessageId a;
    public final ConversationId b;
    public final alya c;
    public final appj d;
    public final engw e;
    public final ffbr f;
    public Instant g;
    private final ffbr j;
    private final Context k;
    private final ffbr l;
    private final ffbr m;
    private final asnh n;
    private final alxj o;
    private final MessagesTable.BindData p;
    private final apug q;
    private final aqcm r;
    private final boolean s;
    private final auox t;
    private final cqoh u;
    private final aorg v;

    static {
        Duration ofMinutes = Duration.ofMinutes(15L);
        ofMinutes.getClass();
        i = ofMinutes;
    }

    public aork(ffbr ffbrVar, Context context, aorg aorgVar, ffbr ffbrVar2, ffbr ffbrVar3, asnh asnhVar, MessageId messageId, ConversationId conversationId, alxj alxjVar, MessagesTable.BindData bindData, alya alyaVar, appj appjVar, apug apugVar, aqcm aqcmVar, boolean z, engw engwVar, ffbr ffbrVar4, auox auoxVar, cqoh cqohVar) {
        ffbrVar.getClass();
        context.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        conversationId.getClass();
        alxjVar.getClass();
        bindData.getClass();
        apugVar.getClass();
        engwVar.getClass();
        cqohVar.getClass();
        this.j = ffbrVar;
        this.k = context;
        this.v = aorgVar;
        this.l = ffbrVar2;
        this.m = ffbrVar3;
        this.n = asnhVar;
        this.a = messageId;
        this.b = conversationId;
        this.o = alxjVar;
        this.p = bindData;
        this.c = alyaVar;
        this.d = appjVar;
        this.q = apugVar;
        this.r = aqcmVar;
        this.s = z;
        this.e = engwVar;
        this.f = ffbrVar4;
        this.t = auoxVar;
        this.u = cqohVar;
        Instant ofEpochMilli = Instant.ofEpochMilli(bindData.w());
        ofEpochMilli.getClass();
        this.g = ofEpochMilli;
    }

    @Override // defpackage.alxr
    public final apxv A() {
        return ((apsn) this.q).l;
    }

    @Override // defpackage.alxr
    public final int B() {
        int s = this.p.s();
        return ((s == 2 || s == 1 || s == 11 || s == 100) && (a() != alxq.b || E().k())) ? 3 : 2;
    }

    @Override // defpackage.alxr
    public final int C() {
        int i2 = ((apsn) this.q).m;
        if (i2 != 0) {
            return i2;
        }
        throw null;
    }

    @Override // defpackage.apco
    public final int D() {
        return this.p.l();
    }

    public final bdhg E() {
        bdhg G = this.p.G();
        G.getClass();
        return G;
    }

    @Override // defpackage.apco
    public final fjay F() {
        return this.p.aa();
    }

    @Override // defpackage.alxr
    public final alxq a() {
        alxq a = apvq.a(this.p.l());
        a.getClass();
        return a;
    }

    @Override // defpackage.alxr
    public final /* synthetic */ MessageId b() {
        return this.a;
    }

    @Override // defpackage.alxr
    public final alxz c() {
        return ((apsn) this.q).b;
    }

    @Override // defpackage.alxr
    public final alya d() {
        return this.c;
    }

    @Override // defpackage.alxr
    public final alyu e() {
        return ((apsn) this.q).d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aork) {
            aork aorkVar = (aork) obj;
            if (ffkj.e(this.a, aorkVar.a) && ffkj.e(this.b, aorkVar.b) && ((!this.t.a() || ffkj.e(this.o, aorkVar.o)) && this.s == aorkVar.s && ffkj.e(this.g, aorkVar.g) && ffkj.e(o(), aorkVar.o()) && ffkj.e(this.p, aorkVar.p) && ffkj.e(this.q, aorkVar.q) && ffkj.e(this.c, aorkVar.c) && ffkj.e(this.d, aorkVar.d) && ffkj.e(this.r, aorkVar.r) && ffkj.e(this.e, aorkVar.e))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.alxr
    public final ConversationId f() {
        return this.b;
    }

    @Override // defpackage.alxr
    public final /* synthetic */ appj g() {
        return this.d;
    }

    @Override // defpackage.alxr
    public final appu h() {
        return ((apsn) this.q).g;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.alxr
    public final apyd i() {
        if (this.s) {
            return null;
        }
        return ((apsn) this.q).c;
    }

    @Override // defpackage.alxr
    public final aqcm j() {
        return this.r;
    }

    @Override // defpackage.alxr
    public final aqge k(int i2) {
        akjn akjnVar = (akjn) this.l.b();
        return new aqaw((ffsk) akjnVar.a.a.a.aq.b(), (dtuu) akjnVar.a.a.a.ay.b(), (apuc) akjnVar.a.a.ke.b(), this.a, i2);
    }

    @Override // defpackage.alxr
    public final aqge l() {
        akjp akjpVar = (akjp) this.m.b();
        return new aqam((ffsk) akjpVar.a.a.a.aq.b(), (ffsk) akjpVar.a.a.a.p.b(), (ctbk) akjpVar.a.a.hi.b(), (becj) akjpVar.a.a.iE.b(), this.a);
    }

    @Override // defpackage.alxr
    public final elfl m() {
        return ((aozg) this.j.b()).a(this);
    }

    @Override // defpackage.alxr
    public final Instant n() {
        return this.g;
    }

    @Override // defpackage.alxr
    public final Instant o() {
        Instant ofEpochMilli = Instant.ofEpochMilli(this.p.y());
        ofEpochMilli.getClass();
        return ofEpochMilli;
    }

    @Override // defpackage.alxr
    public final Long p() {
        Long valueOf = Long.valueOf(this.p.A());
        if (valueOf.longValue() == 0) {
            return null;
        }
        return valueOf;
    }

    @Override // defpackage.alxr
    public final String q() {
        return ((apsn) this.q).e;
    }

    @Override // defpackage.alxr
    public final String r() {
        if (this.p.J() == byyw.CFS_AUTO_FALLBACK_ON_OUTGOING_FAILURE) {
            Context context = this.k;
            MessagesTable.BindData bindData = this.p;
            Resources resources = context.getResources();
            if (bindData.l() == 0) {
                String string = resources.getString(R.string.protocol_label_sms_auto_fallback_sent);
                string.getClass();
                return string;
            }
            if (this.p.l() == 1) {
                String string2 = resources.getString(R.string.protocol_label_mms_auto_fallback_sent);
                string2.getClass();
                return string2;
            }
        }
        Context context2 = this.k;
        MessagesTable.BindData bindData2 = this.p;
        asnh asnhVar = this.n;
        int l = bindData2.l();
        boolean a = asnhVar.a();
        switch (l) {
            case 0:
                return "SMS";
            case 1:
                return "MMS";
            case 2:
                return "MMS Push Notification";
            case 3:
                return "RCS";
            case 4:
                return "Cloud Sync";
            case 5:
                return "Tombstone";
            case 6:
                return "EMP";
            case 7:
                String string3 = a ? context2.getResources().getString(R.string.satellite) : context2.getResources().getString(R.string.protocol_satellite);
                string3.getClass();
                return string3;
            default:
                return "Unknown";
        }
    }

    @Override // defpackage.alxr
    public final boolean s(aqux aquxVar) {
        if (!ffdx.g(alxi.ONE_ON_ONE, alxi.GROUP).contains(this.o.b())) {
            ensk h2 = h.h();
            h2.Y(ente.a, "BugleMapi");
            enrr enrrVar = (enrr) h2;
            enrrVar.Y(csux.c, this.a);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "canBeDeletedForEveryone", 315, "BugleMessage.kt")).q("Not deletable for everyone reason: conversation is not 1:1 or group");
            return false;
        }
        if (a() != alxq.b) {
            ensk h3 = h.h();
            h3.Y(ente.a, "BugleMapi");
            enrr enrrVar2 = (enrr) h3;
            enrrVar2.Y(csux.c, this.a);
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "canBeDeletedForEveryone", 322, "BugleMessage.kt")).q("Not deletable for everyone reason: message is not rich");
            return false;
        }
        if (B() != 3) {
            ensk h4 = h.h();
            h4.Y(ente.a, "BugleMapi");
            enrr enrrVar3 = (enrr) h4;
            enrrVar3.Y(csux.c, this.a);
            ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "canBeDeletedForEveryone", 329, "BugleMessage.kt")).q("Not deletable for everyone reason: message is not fully interactable");
            return false;
        }
        alya alyaVar = this.c;
        if (!(alyaVar instanceof alyn)) {
            ensk h5 = h.h();
            h5.Y(ente.a, "BugleMapi");
            enrr enrrVar4 = (enrr) h5;
            enrrVar4.Y(csux.c, this.a);
            ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "canBeDeletedForEveryone", 336, "BugleMessage.kt")).q("Not deletable for everyone reason: message is not outgoing");
            return false;
        }
        if (!((alyn) alyaVar).c().w(aquxVar.g())) {
            ensk h6 = h.h();
            h6.Y(ente.a, "BugleMapi");
            enrr enrrVar5 = (enrr) h6;
            enrrVar5.Y(csux.c, this.a);
            ((enrr) enrrVar5.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "canBeDeletedForEveryone", 343, "BugleMessage.kt")).q("Not deletable for everyone reason: message has different self identity");
            return false;
        }
        if (!this.g.plus(i).isBefore(this.u.f())) {
            return true;
        }
        ensk h7 = h.h();
        h7.Y(ente.a, "BugleMapi");
        enrr enrrVar6 = (enrr) h7;
        enrrVar6.Y(csux.c, this.a);
        ((enrr) enrrVar6.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "canBeDeletedForEveryone", 350, "BugleMessage.kt")).q("Not deletable for everyone reason: message is too old");
        return false;
    }

    @Override // defpackage.alxr
    public final boolean t() {
        return aorg.a(this);
    }

    public final String toString() {
        return "BugleMessage(messageDetailsFactory=" + this.j + ", context=" + this.k + ", canForwardMessageUtil=" + this.v + ", replyIdsObservableSupplierFactoryProvider=" + this.l + ", replyCountObservableSupplierFactoryProvider=" + this.m + ", enableSwipeToShowTimestamps=" + this.n + ", id=" + this.a + ", conversationId=" + this.b + ", conversationProperties=" + this.o + ", messageRow=" + this.p + ", provenance=" + this.c + ", content=" + this.d + ", extensionState=" + this.q + ", status=" + this.r + ", ignoreReactions=" + this.s + ", recipients=" + this.e + ", editHistoryLoaderProvider=" + this.f + ", useIsEditableByApi=" + this.t + ", clock=" + this.u + ")";
    }

    @Override // defpackage.alxr
    public final boolean u(aqux aquxVar) {
        Instant instant;
        if (!ffdx.g(alxi.ONE_ON_ONE, alxi.GROUP).contains(this.o.b())) {
            ensk h2 = h.h();
            h2.Y(ente.a, "BugleMapi");
            enrr enrrVar = (enrr) h2;
            enrrVar.Y(csux.c, this.a);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "isEditableBy", 251, "BugleMessage.kt")).q("Not editable reason: conversation is not 1:1 or group");
            return false;
        }
        if (this.o.o() != v()) {
            ensk h3 = h.h();
            h3.Y(ente.a, "BugleMapi");
            enrr enrrVar2 = (enrr) h3;
            enrrVar2.Y(csux.c, this.a);
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "isEditableBy", 258, "BugleMessage.kt")).q("Not editable reason: conversation is encrypted does not match message");
            return false;
        }
        if (a() != alxq.b) {
            ensk h4 = h.h();
            h4.Y(ente.a, "BugleMapi");
            enrr enrrVar3 = (enrr) h4;
            enrrVar3.Y(csux.c, this.a);
            ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "isEditableBy", 265, "BugleMessage.kt")).q("Not editable reason: message is not rich");
            return false;
        }
        if (B() != 3) {
            ensk h5 = h.h();
            h5.Y(ente.a, "BugleMapi");
            enrr enrrVar4 = (enrr) h5;
            enrrVar4.Y(csux.c, this.a);
            ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "isEditableBy", 272, "BugleMessage.kt")).q("Not editable reason: message is not fully interactable");
            return false;
        }
        if (!(this.d instanceof appw)) {
            ensk h6 = h.h();
            h6.Y(ente.a, "BugleMapi");
            enrr enrrVar5 = (enrr) h6;
            enrrVar5.Y(csux.c, this.a);
            ((enrr) enrrVar5.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "isEditableBy", 279, "BugleMessage.kt")).q("Not editable reason: message is not text");
            return false;
        }
        alya alyaVar = this.c;
        if (!(alyaVar instanceof alyn)) {
            ensk h7 = h.h();
            h7.Y(ente.a, "BugleMapi");
            enrr enrrVar6 = (enrr) h7;
            enrrVar6.Y(csux.c, this.a);
            ((enrr) enrrVar6.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "isEditableBy", 286, "BugleMessage.kt")).q("Not editable reason: message is not outgoing");
            return false;
        }
        if (!((alyn) alyaVar).c().w(aquxVar.g())) {
            ensk h8 = h.h();
            h8.Y(ente.a, "BugleMapi");
            enrr enrrVar7 = (enrr) h8;
            enrrVar7.Y(csux.c, this.a);
            ((enrr) enrrVar7.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "isEditableBy", 293, "BugleMessage.kt")).q("Not editable reason: message has different self identity");
            return false;
        }
        apxv A = A();
        if (A == null || (instant = A.a()) == null) {
            instant = this.g;
        }
        if (!instant.plus(i).isBefore(this.u.f())) {
            return true;
        }
        ensk h9 = h.h();
        h9.Y(ente.a, "BugleMapi");
        enrr enrrVar8 = (enrr) h9;
        enrrVar8.Y(csux.c, this.a);
        ((enrr) enrrVar8.h("com/google/android/apps/messaging/shared/api/messaging/message/BugleMessage", "isEditableBy", 302, "BugleMessage.kt")).q("Not editable reason: message is too old");
        return false;
    }

    @Override // defpackage.alxr
    public final boolean v() {
        return this.p.n() != 0;
    }

    @Override // defpackage.alxr
    public final boolean w() {
        Map unmodifiableMap;
        fayz fayzVar;
        Map unmodifiableMap2;
        fayv N = this.p.N();
        String str = null;
        if (N != null && (unmodifiableMap = DesugarCollections.unmodifiableMap(N.b)) != null && (fayzVar = (fayz) unmodifiableMap.get(clbg.RCS_PENPAL_NAMESPACE.o)) != null && (unmodifiableMap2 = DesugarCollections.unmodifiableMap(fayzVar.b)) != null) {
            str = (String) unmodifiableMap2.get("jakgvfknopmmo");
        }
        return ffkj.e(str, "true");
    }

    @Override // defpackage.alxr
    public final boolean x() {
        return this.p.af();
    }

    @Override // defpackage.alxr
    public final boolean y() {
        return ((apsn) this.q).a;
    }

    @Override // defpackage.alxr
    public final aqdr z() {
        return ((apsn) this.q).k;
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxxc extends cxxd {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/conversation/LaunchConversationFragmentPeer");
    private final ffbr A;
    private final ffbr B;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final fazb g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ejwd l;
    public final ffbr m;
    public final ffbr n;
    private final Activity p;
    private final ffbr q;
    private final ffbr r;
    private final ffbr s;
    private final ffbr t;
    private final ffbr u;
    private final ffbr v;
    private final ffbr w;
    private final ejwd x;
    private bdiz y;
    private final ffbr z;

    public cxxc(cxwp cxwpVar, ffbr ffbrVar, Activity activity, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, fazb fazbVar, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21) {
        this.p = activity;
        this.q = ffbrVar2;
        this.r = ffbrVar3;
        this.b = ffbrVar4;
        this.c = ffbrVar5;
        this.d = ffbrVar6;
        this.e = ffbrVar7;
        this.f = ffbrVar8;
        this.g = fazbVar;
        this.h = ffbrVar9;
        this.i = ffbrVar10;
        this.s = ffbrVar11;
        this.t = ffbrVar12;
        this.j = ffbrVar13;
        this.k = ffbrVar14;
        this.u = ffbrVar15;
        this.v = ffbrVar16;
        this.w = ffbrVar19;
        this.l = new cxxa(fazbVar, cxwpVar);
        this.x = new cxxb(cxwpVar);
        this.m = ffbrVar17;
        this.z = ffbrVar18;
        this.B = ffbrVar;
        this.n = ffbrVar20;
        this.A = ffbrVar21;
    }

    public final void a(ConversationId conversationId, boolean z, Integer num) {
        ayfg ayfgVar = (ayfg) this.q.b();
        bdiz bdjaVar = ((atdn) this.w.b()).a() ? this.y : new bdja((MessageCoreData) this.y.a(new ffji() { // from class: cxwq
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return null;
            }
        }, new ffji() { // from class: cxwr
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                MessageCoreData messageCoreData = (MessageCoreData) obj;
                if (messageCoreData == null || !messageCoreData.co()) {
                    return null;
                }
                return messageCoreData;
            }
        }));
        boolean z2 = false;
        if (!((askf) this.m.b()).a() && z) {
            z2 = true;
        }
        ayfgVar.z(this.p, conversationId, num, bdjaVar, z2);
        this.p.finish();
    }

    public final void b() {
        engw engwVar;
        Intent intent = this.p.getIntent();
        String action = intent.getAction();
        if (!"android.intent.action.SENDTO".equals(intent.getAction()) && !"android.intent.action.VIEW".equals(intent.getAction())) {
            ensk j = a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/ui/conversation/LaunchConversationFragmentPeer", "processPhoneMode", 236, "LaunchConversationFragmentPeer.java")).t("Unsupported conversation intent action: %s.", action);
            return;
        }
        if (!((ctvs) this.t.b()).d()) {
            ((ayfg) this.q.b()).i(this.p);
            this.p.finish();
            return;
        }
        this.y = ((bdiw) this.r.b()).d(intent, "android.intent.action.SENDTO".equals(intent.getAction()) ? aygq.g : aygq.h);
        Optional b = ((ctbd) this.s.b()).b(intent);
        czoi czoiVar = (czoi) this.n.b();
        Optional a2 = czoiVar.a(intent);
        intent.getClass();
        Uri data = intent.getData();
        Optional empty = data == null ? Optional.empty() : Optional.ofNullable(czoh.a(data).getQueryParameter("bot-name"));
        Optional b2 = czoiVar.b(intent);
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "Bugle");
        Optional optional = empty;
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/ui/conversation/LaunchConversationFragmentPeer", "handleSendOrViewAction", 373, "LaunchConversationFragmentPeer.java")).J("botIdOptional: %s, botNameOptional: %s, shortCode: %s", a2.orElse("null"), empty.orElse("null"), cskt.b((CharSequence) b2.orElse("null")));
        boolean z = ((asmu) this.z.b()).a() && a2.isPresent();
        boolean isPresent = b2.isPresent();
        if (z || isPresent) {
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "Bugle");
            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/ui/conversation/LaunchConversationFragmentPeer", "handleSendOrViewAction", 383, "LaunchConversationFragmentPeer.java")).D("Navigate to OpenRbmDeepLinkActivity, SMS deep link: '%s'/'%s'", a2.orElse("null"), cskt.b((CharSequence) b2.orElse("null")));
            eldl.p(this.p, new Intent("android.intent.action.VIEW").setClassName((Context) this.B.b(), "com.google.android.apps.messaging.ui.conversation.rbm.OpenRbmDeepLinkActivity").setFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM).setData(intent.getData()));
            this.p.finish();
            return;
        }
        if (!b.isPresent() || (((atfj) this.A.b()).a() && ((String[]) b.get()).length == 0)) {
            a(InvalidConversationId.a, false, 2);
            return;
        }
        if (a2.isEmpty() && optional.isPresent()) {
            ((avjf) this.c.b()).d.c("Bugle.Rbm.ChatbotDirectory.StartConversationFromDeeplinkFailure");
            return;
        }
        if (a2.isPresent() && (((askf) this.m.b()).a() || optional.isPresent())) {
            engwVar = engw.r(((aqkp) this.k.b()).f(((aolr) this.j.b()).a((String) a2.get())));
        } else {
            Stream map = DesugarArrays.stream((String[]) b.get()).filter(new Predicate() { // from class: cxwu
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
                    return !emxe.c((String) obj);
                }
            }).map(new Function() { // from class: cxwv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((aolr) cxxc.this.j.b()).n((String) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: cxww
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((aqkp) cxxc.this.k.b()).f((aoku) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            engwVar = (engw) map.collect(endq.a);
        }
        engw engwVar2 = engwVar;
        final int intExtra = intent.getIntExtra("simSlot", -1);
        Optional findFirst = Collection.EL.stream(((ctwb) this.v.b()).m()).filter(new Predicate() { // from class: cxwx
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
                return ((ctwi) obj).d() == intExtra;
            }
        }).map(new Function() { // from class: cxwy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((ctwi) obj).a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).findFirst();
        ejwl ejwlVar = (ejwl) this.f.b();
        vxu vxuVar = (vxu) this.u.b();
        cqoh cqohVar = (cqoh) vxuVar.a.b();
        cqohVar.getClass();
        errl errlVar = (errl) vxuVar.b.b();
        errlVar.getClass();
        errl errlVar2 = (errl) vxuVar.c.b();
        errlVar2.getClass();
        alxl alxlVar = (alxl) vxuVar.d.b();
        alxlVar.getClass();
        ffbr ffbrVar = vxuVar.e;
        ffbr ffbrVar2 = vxuVar.f;
        engwVar2.getClass();
        findFirst.getClass();
        ejwlVar.b(new vxt(cqohVar, errlVar, errlVar2, alxlVar, ffbrVar, ffbrVar2, engwVar2, findFirst), this.x);
    }
}

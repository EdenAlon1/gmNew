package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amkx implements amhs, amev {
    public static final entd a = entd.c("BugleConversation");
    private final ffbr A;
    private final ffbr B;
    private final ffbr C;
    private final ffbr D;
    private final ffbr E;
    private final errl F;
    private final ffbr G;
    private final ffbr H;
    private final ffbr I;
    private final ffbr J;
    private final ffbr K;
    private final ffbr L;
    private final ffbr M;
    private final ffbr N;
    private final cbwj O;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final cqoh l;
    public final errl m;
    public final errl n;
    public final ckqj o;
    public final ffbr p;
    public final ffbr q;
    public final ffbr r;
    public final ffbr s;
    public final ffbr t;
    public final ffbr u;
    public final atbw v;
    public final ffbr w;
    private final amiz x;
    private final ampj y;
    private final ffbr z;

    public amkx(amiz amizVar, ffbr ffbrVar, ampj ampjVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, cqoh cqohVar, errl errlVar, errl errlVar2, errl errlVar3, cbwj cbwjVar, ckqj ckqjVar, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, amsk amskVar, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23, ffbr ffbrVar24, ffbr ffbrVar25, ffbr ffbrVar26, ffbr ffbrVar27, ffbr ffbrVar28, ffbr ffbrVar29, ffbr ffbrVar30, atbw atbwVar, ffbr ffbrVar31) {
        this.x = amizVar;
        this.h = ffbrVar;
        this.y = ampjVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
        this.f = ffbrVar6;
        this.z = ffbrVar7;
        this.A = ffbrVar8;
        this.g = ffbrVar9;
        this.B = ffbrVar10;
        this.i = ffbrVar11;
        this.j = ffbrVar12;
        this.C = ffbrVar13;
        this.D = ffbrVar14;
        this.E = ffbrVar15;
        this.k = ffbrVar16;
        this.l = cqohVar;
        this.m = errlVar;
        this.n = errlVar2;
        this.F = errlVar3;
        this.O = cbwjVar;
        this.o = ckqjVar;
        this.G = ffbrVar17;
        this.H = ffbrVar18;
        this.I = ffbrVar19;
        amskVar.a();
        this.J = ffbrVar20;
        this.K = ffbrVar21;
        this.p = ffbrVar22;
        this.L = ffbrVar23;
        this.M = ffbrVar24;
        this.q = ffbrVar25;
        this.r = ffbrVar26;
        this.N = ffbrVar27;
        this.s = ffbrVar28;
        this.t = ffbrVar29;
        this.u = ffbrVar30;
        this.v = atbwVar;
        this.w = ffbrVar31;
    }

    public static /* synthetic */ ffcu O() {
        ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "getOrCreateConversationInternal", 542, "DefaultConversationRepository.java")).q("get or create conversation timeout.");
        return ffcu.a;
    }

    private final void Q(final DefaultConversation defaultConversation, final alxk alxkVar) {
        Stream map = Collection.EL.stream((Set) this.E.b()).map(new Function() { // from class: amke
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final amlb amlbVar = (amlb) obj;
                ekzz a2 = amlbVar.a();
                final DefaultConversation defaultConversation2 = defaultConversation;
                amkx amkxVar = amkx.this;
                final alxk alxkVar2 = alxkVar;
                try {
                    elfl h = elfo.h(new erog() { // from class: amkn
                        @Override // defpackage.erog
                        public final ListenableFuture a() {
                            entd entdVar = amkx.a;
                            return amlb.this.b(defaultConversation2, alxkVar2);
                        }
                    }, amkxVar.m);
                    a2.b(h);
                    a2.close();
                    return h;
                } catch (Throwable th) {
                    try {
                        a2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        engw engwVar = (engw) map.collect(endq.a);
        if (engwVar.isEmpty()) {
            return;
        }
        ekzz f = eleg.f("OpenConversationNotify");
        try {
            elfl a2 = elfo.a(engwVar);
            f.b(a2);
            axnw.h(a2);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxl
    public final elfl A(final ConversationId conversationId, final Uri uri) {
        ekzz f = eleg.f("ConversationRepository#updateGroupIcon");
        try {
            emxf.a(conversationId instanceof BugleConversationId);
            elfl i = ((amhp) this.B.b()).a((BugleConversationId) conversationId).b().i(new eroh() { // from class: amjz
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    amfx amfxVar = (amfx) obj;
                    if (amfxVar.u()) {
                        ((ensz) ((ensz) amkx.a.j()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "updateGroupIcon", 846, "DefaultConversationRepository.java")).t("conversation no longer exists, skipping rename on conversation id = %s.", conversationId.b());
                        return elfo.e(true);
                    }
                    Uri uri2 = uri;
                    amkx amkxVar = amkx.this;
                    emxf.b(byyr.d(amfxVar.v()), "Only RCS groups are supported for updating icon.");
                    return ((amtm) amkxVar.r.b()).a(amfxVar, uri2);
                }
            }, this.m);
            f.close();
            return i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxl
    public final elfl B(ConversationId conversationId) {
        if (!(conversationId instanceof BugleConversationId)) {
            return elfo.d(new IllegalArgumentException("conversationId should be BugleConversationId."));
        }
        return ((amvk) this.J.b()).b(H((BugleConversationId) conversationId, false));
    }

    @Override // defpackage.alxl
    public final elfl C(ConversationId conversationId, eoko eokoVar) {
        ekzz f = eleg.f("ConversationRepository#deleteConversation");
        try {
            emxf.a(conversationId instanceof BugleConversationId);
            long epochMilli = this.l.f().toEpochMilli();
            ayfy ayfyVar = (ayfy) this.z.b();
            aygb f2 = aygc.f();
            f2.b(((BugleConversationId) conversationId).a);
            f2.f(eokoVar);
            f2.d(SuperSortLabel.UNKNOWN);
            f2.c(epochMilli);
            f2.e(false);
            elfl a2 = ayfyVar.a(f2.a());
            f.close();
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

    @Override // defpackage.alxl
    public final aqge D(int i) {
        amlj amljVar = (amlj) this.D.b();
        ffsk ffskVar = (ffsk) amljVar.a.b();
        ffskVar.getClass();
        ((amof) amljVar.b.b()).getClass();
        becj becjVar = (becj) amljVar.c.b();
        becjVar.getClass();
        amon amonVar = (amon) amljVar.d.b();
        amonVar.getClass();
        return new amli(ffskVar, becjVar, amonVar, i);
    }

    @Override // defpackage.alxl
    public final elfl E(engw engwVar, int i) {
        ekzz f = eleg.f("ConversationRepository#markConversationsAsRead");
        try {
            elfl a2 = ((amuc) this.C.b()).a(engwVar, i);
            f.close();
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

    @Override // defpackage.alxl
    public final elfl F(engw engwVar, int i) {
        ekzz f = eleg.f("ConversationRepository#markConversationsAsUnread");
        try {
            elfl b = ((amuc) this.C.b()).b(engwVar, i);
            f.close();
            return b;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.amev
    public final ConversationId G(amwl amwlVar) {
        amwk b = amwk.b(amwlVar.b);
        if (b == null) {
            b = amwk.UNRECOGNIZED;
        }
        emxf.a(b == amwk.BUGLE);
        return new BugleConversationId(amwlVar.c);
    }

    @Override // defpackage.amhs
    public final BugleConversation H(BugleConversationId bugleConversationId, boolean z) {
        return this.x.a(bugleConversationId, z);
    }

    @Override // defpackage.amhs
    public final elfl I(ConversationId conversationId, final int i) {
        ekzz f = eleg.f("ConversationRepository#updateConversationJoinState");
        try {
            emxf.a(conversationId instanceof BugleConversationId);
            final ConversationIdType conversationIdType = ((BugleConversationId) conversationId).a;
            elfl g = elfo.g(new Callable() { // from class: amkt
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    amkx amkxVar = amkx.this;
                    bczy bczyVar = (bczy) amkxVar.f.b();
                    String[] strArr = bsom.a;
                    bsoe bsoeVar = new bsoe();
                    bsoeVar.A(i);
                    ConversationIdType conversationIdType2 = conversationIdType;
                    if (!bczyVar.ak(conversationIdType2, bsoeVar) || !((audx) amkxVar.b.b()).a()) {
                        return null;
                    }
                    ((cbgf) amkxVar.d.b()).d(conversationIdType2);
                    return null;
                }
            }, this.F);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.amhs
    public final elfl J(ConversationId conversationId, eoxn eoxnVar) {
        int i;
        ekzz f = eleg.f("ConversationRepository#updateConversationSendMode");
        try {
            emxf.a(conversationId instanceof BugleConversationId);
            final ConversationIdType conversationIdType = ((BugleConversationId) conversationId).a;
            String[] strArr = bsom.a;
            final bsoe bsoeVar = new bsoe();
            if (eoxnVar == eoxn.SEND_MODE_AUTO) {
                i = 0;
            } else if (eoxnVar == eoxn.SEND_MODE_XMS) {
                i = 1;
            } else {
                if (eoxnVar != eoxn.SEND_MODE_XMS_LATCH) {
                    throw new IllegalArgumentException("Value of sendMode is invalid");
                }
                i = 2;
            }
            bsoeVar.V(i);
            elfl g = elfo.g(new Callable() { // from class: amkl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ((bczy) amkx.this.f.b()).ak(conversationIdType, bsoeVar);
                    return null;
                }
            }, this.F);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.amhs
    public final elfl K(ConversationId conversationId, final azcr azcrVar) {
        ekzz f = eleg.f("ConversationRepository#setDestinationToken");
        try {
            emxf.a(conversationId instanceof BugleConversationId);
            final ConversationIdType conversationIdType = ((BugleConversationId) conversationId).a;
            elfl f2 = elfo.f(new Runnable() { // from class: amjh
                @Override // java.lang.Runnable
                public final void run() {
                    entd entdVar = amkx.a;
                    String[] strArr = bsom.a;
                    bsoe bsoeVar = new bsoe();
                    bsoeVar.p(azcr.this);
                    ConversationIdType conversationIdType2 = conversationIdType;
                    if (bsoeVar.f(conversationIdType2)) {
                        return;
                    }
                    ensz enszVar = (ensz) amkx.a.j();
                    enszVar.Y(csux.p, conversationIdType2);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "setDestinationToken", 1508, "DefaultConversationRepository.java")).q("Failed to update conversation with destination token.");
                }
            }, this.F);
            f.close();
            return f2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.amhs
    public final elfl L(final BugleConversationId bugleConversationId, final String str) {
        return elfo.g(new Callable() { // from class: amko
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] strArr = bsom.a;
                bsoe bsoeVar = new bsoe();
                bsoeVar.C(str);
                bsoeVar.D(byyy.NAME_IS_MANUAL);
                ConversationIdType conversationIdType = bugleConversationId.a;
                boolean f = bsoeVar.f(conversationIdType);
                if (f) {
                    amkx amkxVar = amkx.this;
                    if (((audx) amkxVar.b.b()).a()) {
                        ((cbgf) amkxVar.d.b()).d(conversationIdType);
                    }
                }
                return Boolean.valueOf(f);
            }
        }, this.n);
    }

    @Override // defpackage.amhs
    public final BugleConversation M(BugleConversationId bugleConversationId, alxk alxkVar, aorw aorwVar) {
        ekzz f = eleg.f("ConversationRepository#openConversationForDelegation");
        try {
            boolean z = alxkVar == alxk.FOR_DISPLAY;
            amiz amizVar = this.x;
            errl errlVar = (errl) amizVar.a.b();
            errlVar.getClass();
            aqkp aqkpVar = (aqkp) amizVar.b.b();
            aqkpVar.getClass();
            aqvh aqvhVar = (aqvh) amizVar.c.b();
            aqvhVar.getClass();
            amhp amhpVar = (amhp) amizVar.d.b();
            amhpVar.getClass();
            ffbr ffbrVar = amizVar.e;
            aotm aotmVar = (aotm) amizVar.f.b();
            aotmVar.getClass();
            aqgc aqgcVar = (aqgc) amizVar.g.b();
            aqgcVar.getClass();
            DefaultConversation defaultConversation = new DefaultConversation(errlVar, aqkpVar, aqvhVar, amhpVar, ffbrVar, aotmVar, aqgcVar, amizVar.h, amizVar.i, amizVar.j, amizVar.k, amizVar.l, bugleConversationId, z, aorwVar);
            if (z) {
                defaultConversation.o();
            } else {
                Q(defaultConversation, alxkVar);
            }
            f.close();
            return defaultConversation;
        } catch (Throwable th) {
            try {
                f.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final DefaultConversation N(ConversationIdType conversationIdType) {
        if (conversationIdType.b()) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "createConversationFromIdString", 558, "DefaultConversationRepository.java")).q("Null conversationId after getOrCreateConversation.");
            throw new IllegalStateException("Null conversationId after getOrCreateConversation.");
        }
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "createConversationFromIdString", 562, "DefaultConversationRepository.java")).t("Returning conversation with id = %s.", conversationIdType.a());
        return this.x.a(new BugleConversationId(conversationIdType), false);
    }

    public final elfl P(ConversationId conversationId, final boolean z) {
        emxf.a(conversationId instanceof BugleConversationId);
        if (((atrz) this.L.b()).a()) {
            return ((amid) this.M.b()).a(H((BugleConversationId) conversationId, false), true != z ? 2 : 1);
        }
        final BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
        final long epochMilli = this.l.f().toEpochMilli();
        return ((amhp) this.B.b()).a(bugleConversationId).b().i(new eroh() { // from class: amjc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!byyr.d(((amfx) obj).v())) {
                    return elfo.d(new UnsupportedOperationException("Operation not supported"));
                }
                boolean z2 = z;
                long j = epochMilli;
                BugleConversationId bugleConversationId2 = bugleConversationId;
                amkx amkxVar = amkx.this;
                ckqf ckqfVar = (ckqf) ckqh.a.createBuilder();
                String a2 = bugleConversationId2.a.a();
                ckqfVar.copyOnWrite();
                ckqh ckqhVar = (ckqh) ckqfVar.instance;
                a2.getClass();
                ckqhVar.c = a2;
                ckqg ckqgVar = ckqg.DO_NOT_DELETE;
                ckqfVar.copyOnWrite();
                ((ckqh) ckqfVar.instance).d = ckqgVar.a();
                eyja d = eykm.d(j);
                ckqfVar.copyOnWrite();
                ckqh ckqhVar2 = (ckqh) ckqfVar.instance;
                d.getClass();
                ckqhVar2.e = d;
                ckqhVar2.b |= 1;
                ckqfVar.copyOnWrite();
                ckqh ckqhVar3 = (ckqh) ckqfVar.instance;
                ckqhVar3.b |= 2;
                ckqhVar3.f = !z2;
                return amkxVar.o.a((ckqh) ckqfVar.build()).i(new eroh() { // from class: amjw
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return ((cevg) obj2).a();
                    }
                }, amkxVar.m).h(new emwl() { // from class: amjx
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return Boolean.valueOf(((ceyt) obj2).e());
                    }
                }, amkxVar.m);
            }
        }, this.m);
    }

    @Override // defpackage.alxl
    public final Conversation a(ConversationId conversationId, alxk alxkVar) {
        ekzz f = eleg.f("ConversationRepository#openConversation");
        try {
            emxf.a(conversationId instanceof BugleConversationId);
            BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
            boolean z = alxkVar == alxk.FOR_DISPLAY;
            DefaultConversation a2 = this.x.a(bugleConversationId, z);
            if (z) {
                a2.o();
            } else {
                Q(a2, alxkVar);
            }
            f.close();
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

    @Override // defpackage.alxl
    public final /* synthetic */ ConversationId b(amwl amwlVar) {
        return ameu.a();
    }

    @Override // defpackage.alxl
    public final /* synthetic */ ConversationId c(byte[] bArr) {
        return ameu.b();
    }

    @Override // defpackage.alxl
    public final aqge d(ConversationId conversationId) {
        return this.y.a(conversationId);
    }

    @Override // defpackage.alxl
    public final elfl e(ConversationId conversationId, final eoko eokoVar) {
        ekzz f = eleg.f("ConversationRepository#archiveConversation");
        try {
            emxf.a(conversationId instanceof BugleConversationId);
            final BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
            elfl g = elfo.g(new Callable() { // from class: amja
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(((croc) amkx.this.g.b()).a(bugleConversationId.a, byyt.ARCHIVED, eokoVar));
                }
            }, this.n);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxl
    public final elfl f(ConversationId conversationId) {
        ekzz f = eleg.f("ConversationRepository#clearDraftSnippet");
        try {
            emxf.a(conversationId instanceof BugleConversationId);
            final ConversationIdType conversationIdType = ((BugleConversationId) conversationId).a;
            elfl a2 = this.O.a("DefaultConversationRepository#clearDraftSnippet", new emyl() { // from class: amjd
                @Override // defpackage.emyl
                public final Object get() {
                    String[] strArr = bsom.a;
                    bsoe bsoeVar = new bsoe();
                    bsoeVar.ap("clearDraftSnippet");
                    bsoeVar.W(false);
                    bsoeVar.a.putNull("draft_snippet_text");
                    bsoeVar.a.putNull("draft_subject_text");
                    bsoeVar.a.putNull("draft_preview_content_type");
                    bsoeVar.t();
                    amkx amkxVar = amkx.this;
                    bczy bczyVar = (bczy) amkxVar.f.b();
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    bsoeVar.Z(((Long) bczyVar.H(conversationIdType2).orElse(Long.valueOf(amkxVar.l.f().toEpochMilli()))).longValue());
                    bsoeVar.ad(new Function() { // from class: amka
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsol bsolVar = (bsol) obj;
                            entd entdVar = amkx.a;
                            bsolVar.q(ConversationIdType.this);
                            bsolVar.aq(new dtwe("conversations.show_draft", 1, 1));
                            return bsolVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return Boolean.valueOf(bsoeVar.b().e() > 0);
                }
            });
            f.close();
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

    @Override // defpackage.alxl
    public final elfl g(anvc anvcVar) {
        ekzz f = eleg.f("ConversationRepository#findConversation");
        try {
            elfl a2 = ((amyl) this.K.b()).a(anvcVar);
            f.close();
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

    @Override // defpackage.alxl
    public final elfl h(azcr azcrVar) {
        return ((amnt) this.N.b()).a(azcrVar).h(new emwl() { // from class: amjm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ConversationIdType conversationIdType = (ConversationIdType) obj;
                if (conversationIdType == null || conversationIdType.b()) {
                    return null;
                }
                return amkx.this.N(conversationIdType).a;
            }
        }, this.m);
    }

    @Override // defpackage.alxl
    public final elfl i(engw engwVar) {
        elfl h;
        ekzz f = eleg.f("ConversationRepository#findConversation");
        try {
            if (engwVar.isEmpty()) {
                ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "findConversation", 373, "DefaultConversationRepository.java")).q("Unable to findConversation: Empty recipient list.");
                h = elfo.d(new IllegalArgumentException("Unable to findConversation: Empty recipient list."));
            } else {
                h = ((ayif) this.H.b()).k((engw) Collection.EL.stream(engwVar).map(new Function() { // from class: amki
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((Recipient) obj).g();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).distinct().filter(new Predicate() { // from class: amkj
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
                        entd entdVar = amkx.a;
                        ((aoku) obj).o();
                        return true;
                    }
                }).collect(endq.a)).h(new emwl() { // from class: amkk
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        entd entdVar = amkx.a;
                        return ((Optional) obj).map(new Function() { // from class: amjk
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                entd entdVar2 = amkx.a;
                                return new BugleConversationId(((bseh) obj2).C());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }
                }, this.m);
            }
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

    @Override // defpackage.alxl
    public final elfl j() {
        return ((amvk) this.J.b()).a();
    }

    @Override // defpackage.alxl
    public final elfl k(engw engwVar, String str) {
        return m(Optional.empty(), engwVar, str);
    }

    @Override // defpackage.alxl
    public final elfl l(azcr azcrVar, final aqux aquxVar, amer amerVar) {
        return ((amnt) this.N.b()).b(azcrVar, amerVar).h(new emwl() { // from class: amkb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return amkx.this.N((ConversationIdType) obj).a;
            }
        }, this.m).i(new eroh() { // from class: amkc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                amkx amkxVar = amkx.this;
                final ConversationId conversationId = (ConversationId) obj;
                return amkxVar.t(conversationId, aquxVar).h(new emwl() { // from class: amks
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        entd entdVar = amkx.a;
                        return ConversationId.this;
                    }
                }, amkxVar.m);
            }
        }, this.m);
    }

    @Override // defpackage.alxl
    public final elfl m(final Optional optional, final engw engwVar, final String str) {
        elfl i;
        elfl a2;
        ekzz f = eleg.f("ConversationRepository#getOrCreateConversation");
        try {
            if (engwVar.isEmpty()) {
                ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "getOrCreateConversation", 292, "DefaultConversationRepository.java")).q("Unable to getOrCreateConversation: Empty recipient list.");
                i = elfo.d(new IllegalArgumentException("Unable to getOrCreateConversation: Empty recipient list."));
            } else {
                elfl e = elfo.e(false);
                if (engwVar.size() > 1) {
                    entd entdVar = a;
                    ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "getOrCreateConversation", 300, "DefaultConversationRepository.java")).q("Attempting to create an RCS group conversation, verifying cached RCS availabilityfor participants.");
                    engw engwVar2 = (engw) Collection.EL.stream(engwVar).map(new Function() { // from class: amju
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            Recipient recipient = (Recipient) obj;
                            aoku g = recipient.g();
                            return (g.s() && g.e().isPresent() && ((djrv) amkx.this.k.b()).w(((awui) g.e().get()).d)) ? elfo.e(true) : recipient.K();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(endq.a);
                    if (optional.isEmpty()) {
                        ((ensz) ((ensz) entdVar.j()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "isRcsConversationCreationEnabledForSelfIdentity", 570, "DefaultConversationRepository.java")).q("Missing self identity when determining isRcsConversationCreationEnabled.");
                        a2 = elfo.e(false);
                    } else {
                        final elfl l = ((aqux) optional.get()).l(alyx.RICH);
                        final elfl b = ((aqux) optional.get()).e().b();
                        a2 = elfo.k(l, b).a(new Callable() { // from class: amkh
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                entd entdVar2 = amkx.a;
                                boolean z = false;
                                if (((Boolean) erqt.q(elfl.this)).booleanValue() && ((aqys) erqt.q(b)).a()) {
                                    z = true;
                                }
                                return Boolean.valueOf(z);
                            }
                        }, this.n);
                    }
                    engr engrVar = new engr();
                    engrVar.j(engwVar2);
                    engrVar.h(a2);
                    e = elfl.g(erqt.o(engrVar.g())).i(new eroh() { // from class: amkf
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            entd entdVar2 = amkx.a;
                            boolean noneMatch = Collection.EL.stream((List) obj).noneMatch(new Predicate() { // from class: amjg
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
                                public final boolean test(Object obj2) {
                                    Boolean bool = (Boolean) obj2;
                                    entd entdVar3 = amkx.a;
                                    return bool == null || !bool.booleanValue();
                                }
                            });
                            ensz enszVar = (ensz) ((ensz) amkx.a.h()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "getOrCreateConversation", 320, "DefaultConversationRepository.java");
                            Boolean valueOf = Boolean.valueOf(noneMatch);
                            enszVar.t("Verified cached RCS availability for the participants, isGroupRcs = %b.", valueOf);
                            return elfo.e(valueOf);
                        }
                    }, this.m);
                }
                i = e.i(new eroh() { // from class: amkm
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        elfl g;
                        elfl c;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        ekzz f2 = eleg.f("ConversationRepository#getOrCreateConversationInternal");
                        try {
                            ((ensz) ((ensz) amkx.a.h()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "getOrCreateConversationInternal", 511, "DefaultConversationRepository.java")).q("Starting getOrCreateConversationForService.");
                            final amkx amkxVar = amkx.this;
                            axad b2 = booleanValue ? ((cknc) amkxVar.p.b()).b() : null;
                            boolean a3 = ((audx) amkxVar.b.b()).a();
                            String str2 = str;
                            engw engwVar3 = engwVar;
                            Optional optional2 = optional;
                            if (a3) {
                                g = ((ammw) amkxVar.c.b()).d((aqux) optional2.orElse(null), engwVar3, booleanValue, str2, b2);
                            } else {
                                bbeq bbeqVar = (bbeq) amkxVar.e.b();
                                Stream map = Collection.EL.stream(engwVar3).map(new Function() { // from class: bben
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return ((aqkx) ((Recipient) obj2)).n();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int i2 = engw.d;
                                g = elfl.g(bbeqVar.a(optional2, (List) map.collect(endq.a), booleanValue, str2, b2).s());
                            }
                            elfl elflVar = g;
                            cgaz cgazVar = (cgaz) amkxVar.i.b();
                            ffix ffixVar = new ffix() { // from class: amje
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    return amkx.O();
                                }
                            };
                            Duration ofMillis = Duration.ofMillis(((Long) ((cfup) axuk.a.get()).e()).longValue());
                            amkw amkwVar = new amkw();
                            elflVar.getClass();
                            ofMillis.getClass();
                            c = axol.c(cgazVar.a, ffhe.a, ffsm.a, new cgay(cgazVar, elflVar, ffixVar, ofMillis, amkwVar, null));
                            axnw.h(c);
                            elfl i3 = elflVar.i(new eroh() { // from class: amjf
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    return elfo.e(amkx.this.N((ConversationIdType) obj2));
                                }
                            }, amkxVar.m);
                            f2.close();
                            return i3;
                        } finally {
                        }
                    }
                }, this.m);
            }
            f.close();
            return i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxl
    public final elfl n(ConversationId conversationId, ampp amppVar, Recipient recipient) {
        ekzz f = eleg.f("ConversationRepository#incomingRichThemeUpdate");
        try {
            elfl a2 = ((ampq) ((Optional) this.G.b()).orElseThrow()).a(H((BugleConversationId) conversationId, false), amppVar, recipient);
            f.close();
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

    @Override // defpackage.alxl
    public final elfl o(ConversationId conversationId) {
        ekzz f = eleg.f("ConversationRepository#leaveConversation");
        try {
            elfl P = P(conversationId, true);
            f.close();
            return P;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxl
    public final elfl p(engw engwVar) {
        ekzz f = eleg.f("ConversationRepository#leaveConversations");
        try {
            Stream map = Collection.EL.stream(engwVar).map(new Function() { // from class: amkp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return amkx.this.P((ConversationId) obj, false);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            elfl h = elfo.a((Iterable) map.collect(endq.a)).h(new emwl() { // from class: amkq
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    entd entdVar = amkx.a;
                    return Boolean.valueOf(Collection.EL.stream((List) obj).allMatch(new Predicate() { // from class: amjl
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
                        public final boolean test(Object obj2) {
                            return ((Boolean) obj2).booleanValue();
                        }
                    }));
                }
            }, erpp.a);
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

    @Override // defpackage.alxl
    public final elfl q(ConversationId conversationId, ampp amppVar) {
        elfl b;
        ekzz f = eleg.f("ConversationRepository#outgoingRichThemeUpdate");
        try {
            if (conversationId instanceof BugleConversationId) {
                b = ((ampq) ((Optional) this.G.b()).orElseThrow()).b(H((BugleConversationId) conversationId, false), amppVar);
            } else {
                b = elfo.d(new UnsupportedOperationException("ConversationId must be type BugleConversationId"));
            }
            f.close();
            return b;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxl
    public final elfl r(final Recipient recipient) {
        ekzz f = eleg.f("ConversationRepository#refreshAllConversationIconsForRecipient");
        try {
            elfl g = elfo.g(new Callable() { // from class: amkg
                /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient] */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ((bczy) amkx.this.f.b()).R(recipient.F().a);
                    return true;
                }
            }, this.F);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxl
    public final elfl s(final ConversationId conversationId, final String str) {
        elfl i;
        ekzz f = eleg.f("ConversationRepository#renameConversation");
        try {
            if (TextUtils.isEmpty(str)) {
                i = elfo.d(new IllegalArgumentException("Unable to rename a conversation: Empty name."));
            } else {
                emxf.a(conversationId instanceof BugleConversationId);
                final BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
                i = ((amhp) this.B.b()).a(bugleConversationId).b().i(new eroh() { // from class: amjn
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        amfx amfxVar = (amfx) obj;
                        boolean u = amfxVar.u();
                        final ConversationId conversationId2 = conversationId;
                        if (u) {
                            ((ensz) ((ensz) amkx.a.j()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "renameConversation", 740, "DefaultConversationRepository.java")).t("conversation no longer exists, skipping rename on conversation id = %s.", conversationId2.b());
                            return elfo.e(true);
                        }
                        final String str2 = str;
                        if (Objects.equals(amfxVar.i(), str2)) {
                            ((ensz) ((ensz) amkx.a.h()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "renameConversation", 746, "DefaultConversationRepository.java")).t("Same name, skipping rename on conversation id = %s.", conversationId2.b());
                            return elfo.e(true);
                        }
                        final BugleConversationId bugleConversationId2 = bugleConversationId;
                        final amkx amkxVar = amkx.this;
                        if (!byyr.d(amfxVar.v())) {
                            return amkxVar.L(bugleConversationId2, str2).h(new emwl() { // from class: amjj
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    Boolean bool = (Boolean) obj2;
                                    if (bool.booleanValue()) {
                                        ((cbur) ((Optional) amkx.this.j.b()).orElseThrow()).f(bugleConversationId2.a, str2);
                                    }
                                    return bool;
                                }
                            }, amkxVar.n);
                        }
                        if (((auac) amkxVar.q.b()).a()) {
                            return ((amtm) amkxVar.r.b()).b(amfxVar, str2);
                        }
                        aqux f2 = amfxVar.f();
                        f2.getClass();
                        final cksh a2 = ((ckrx) amkxVar.h.b()).a((awui) f2.m().flatMap(new Function() { // from class: amjb
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((aoku) obj2).e();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).orElseThrow());
                        final ConversationIdType conversationIdType = bugleConversationId2.a;
                        final Instant f3 = a2.d.f();
                        return elfo.g(new Callable() { // from class: cksd
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                final cksh ckshVar = cksh.this;
                                return (awwf) bsom.i(conversationIdType, new Function() { // from class: ckry
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        bseh bsehVar = (bseh) obj2;
                                        if (!bsehVar.K().d(ckng.NAME_CHANGE)) {
                                            throw new IllegalArgumentException("Conversation does not support RCS name changes");
                                        }
                                        cksh ckshVar2 = cksh.this;
                                        return ckshVar2.b.a(emxe.b(bsehVar.ad()), emxe.b(bsehVar.ac()));
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }, new Supplier() { // from class: ckrz
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        throw new IllegalArgumentException("Conversation not found");
                                    }
                                });
                            }
                        }, a2.g).i(new eroh() { // from class: ckse
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                final awwf awwfVar = (awwf) obj2;
                                final String uuid = UUID.randomUUID().toString();
                                csjb a3 = awhi.a.a();
                                a3.I("Starting update group operation for subject change");
                                a3.A("operationId", uuid);
                                a3.r();
                                uuid.getClass();
                                cksh ckshVar = cksh.this;
                                final awhi awhiVar = ckshVar.c;
                                cknc.r(awhiVar.d, 22, 0, uuid, null, null, null, 58);
                                final String str3 = str2;
                                final awui awuiVar = ckshVar.i;
                                elfl h = elfl.g(kfg.a(new kfd() { // from class: awhd
                                    @Override // defpackage.kfd
                                    public final Object a(final kfb kfbVar) {
                                        Consumer consumer = new Consumer() { // from class: awhg
                                            @Override // java.util.function.Consumer
                                            /* renamed from: accept */
                                            public final void o(Object obj3) {
                                                kfb.this.b((awud) obj3);
                                            }

                                            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                                return Consumer$CC.$default$andThen(this, consumer2);
                                            }
                                        };
                                        final awhi awhiVar2 = awhi.this;
                                        ConcurrentMap concurrentMap = awhiVar2.b;
                                        final String str4 = uuid;
                                        concurrentMap.put(str4, consumer);
                                        kfbVar.a(new Runnable() { // from class: awhh
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                awhi.this.b.remove(str4);
                                            }
                                        }, awhiVar2.e);
                                        axam axamVar = (axam) axan.a.createBuilder();
                                        axamVar.copyOnWrite();
                                        axan axanVar = (axan) axamVar.instance;
                                        str4.getClass();
                                        axanVar.b |= 1;
                                        axanVar.c = str4;
                                        awwf awwfVar2 = awwfVar;
                                        String str5 = awwfVar2.c;
                                        axamVar.copyOnWrite();
                                        axan axanVar2 = (axan) axamVar.instance;
                                        str5.getClass();
                                        axanVar2.b |= 2;
                                        axanVar2.d = str5;
                                        axap axapVar = (axap) axaq.a.createBuilder();
                                        axapVar.copyOnWrite();
                                        axaq axaqVar = (axaq) axapVar.instance;
                                        awwfVar2.getClass();
                                        axaqVar.c = awwfVar2;
                                        axaqVar.b |= 1;
                                        axapVar.copyOnWrite();
                                        axaq axaqVar2 = (axaq) axapVar.instance;
                                        String str6 = str3;
                                        str6.getClass();
                                        axaqVar2.b |= 2;
                                        axaqVar2.d = str6;
                                        eyee byteString = ((axan) axamVar.build()).toByteString();
                                        axapVar.copyOnWrite();
                                        axaq axaqVar3 = (axaq) axapVar.instance;
                                        axaqVar3.b |= 4;
                                        axaqVar3.e = byteString;
                                        axapVar.copyOnWrite();
                                        axaq axaqVar4 = (axaq) axapVar.instance;
                                        awui awuiVar2 = awuiVar;
                                        awuiVar2.getClass();
                                        axaqVar4.f = awuiVar2;
                                        axaqVar4.b |= 8;
                                        try {
                                            awhiVar2.c.g((axaq) axapVar.build()).h(new emwl() { // from class: awhf
                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj3) {
                                                    awud awudVar = ((axat) obj3).c;
                                                    if (awudVar == null) {
                                                        awudVar = awud.a;
                                                    }
                                                    awuc awucVar = awuc.PENDING;
                                                    awuc b = awuc.b(awudVar.c);
                                                    if (b == null) {
                                                        b = awuc.UNKNOWN_STATUS;
                                                    }
                                                    if (!awucVar.equals(b)) {
                                                        String str7 = str4;
                                                        awhi awhiVar3 = awhi.this;
                                                        awhiVar3.a(str7, awudVar);
                                                        awhiVar3.d.i(str7, awudVar);
                                                    }
                                                    return awudVar;
                                                }
                                            }, awhiVar2.e).k(axnw.b(), erpp.a);
                                        } catch (IllegalArgumentException e) {
                                            csjb e2 = awhi.a.e();
                                            e2.I("Fail to start update group operation");
                                            e2.A("operationId", str4);
                                            e2.s(e);
                                            awty awtyVar = (awty) awud.a.createBuilder();
                                            awuc awucVar = awuc.FAILED_PERMANENTLY;
                                            awtyVar.copyOnWrite();
                                            awud awudVar = (awud) awtyVar.instance;
                                            awudVar.c = awucVar.f;
                                            awudVar.b |= 1;
                                            awud awudVar2 = (awud) awtyVar.build();
                                            awhiVar2.a(str4, awudVar2);
                                            awhiVar2.d.i(str4, awudVar2);
                                        }
                                        return "sendGroupNameChange#".concat(String.valueOf(str4));
                                    }
                                })).j(ckshVar.e.a().toMillis(), TimeUnit.MILLISECONDS, ckshVar.f).h(new emwl() { // from class: cksb
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        awuc b = awuc.b(((awud) obj3).c);
                                        if (b == null) {
                                            b = awuc.UNKNOWN_STATUS;
                                        }
                                        int ordinal = b.ordinal();
                                        if (ordinal != 0) {
                                            if (ordinal == 1) {
                                                return ckrw.SUCCESS;
                                            }
                                            if (ordinal != 2) {
                                                return ordinal != 3 ? ordinal != 4 ? ckrw.UNKNOWN_RESULT : ckrw.SERVER_RETURNED_UNSUCCESSFUL : ckrw.CLIENT_FAILED_TO_SEND_REQUEST;
                                            }
                                        }
                                        return ckrw.UNKNOWN_RESULT;
                                    }
                                }, ckshVar.f);
                                final ConversationIdType conversationIdType2 = conversationIdType;
                                return h.e(TimeoutException.class, new emwl() { // from class: cksc
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        csjb e = cksh.a.e();
                                        e.I("Timeout while waiting for the group subject update result");
                                        e.c(ConversationIdType.this);
                                        e.s((TimeoutException) obj3);
                                        return ckrw.TIMEOUT;
                                    }
                                }, ckshVar.f);
                            }
                        }, a2.h).e(IllegalArgumentException.class, new emwl() { // from class: cksf
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                csjb e = cksh.a.e();
                                e.I("Failed to change group name because invalid RCS group");
                                e.c(ConversationIdType.this);
                                e.s((IllegalArgumentException) obj2);
                                return ckrw.INVALID_RCS_GROUP;
                            }
                        }, a2.f).i(new eroh() { // from class: cksg
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                elfl e;
                                cksh ckshVar = cksh.this;
                                ConversationIdType conversationIdType2 = conversationIdType;
                                final ckrw ckrwVar = (ckrw) obj2;
                                if (ckrwVar == ckrw.TIMEOUT) {
                                    final ckra ckraVar = ckshVar.j;
                                    e = ckraVar.a(conversationIdType2).i(new eroh() { // from class: ckqs
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj3) {
                                            ckra ckraVar2 = ckra.this;
                                            ckrd ckrdVar = ckraVar2.b;
                                            final String str3 = (String) obj3;
                                            final Duration a3 = ckraVar2.d.a();
                                            final ckrs ckrsVar = (ckrs) ckrdVar;
                                            return ckrsVar.b().h(new emwl() { // from class: ckrf
                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj4) {
                                                    String str4 = (String) obj4;
                                                    epbt epbtVar = (epbt) epbu.a.createBuilder();
                                                    long millis = Duration.this.toMillis();
                                                    epbtVar.copyOnWrite();
                                                    epbu epbuVar = (epbu) epbtVar.instance;
                                                    epbuVar.b |= 4;
                                                    epbuVar.e = millis;
                                                    str4.getClass();
                                                    epbtVar.copyOnWrite();
                                                    epbu epbuVar2 = (epbu) epbtVar.instance;
                                                    epbuVar2.b |= 1;
                                                    epbuVar2.c = str4;
                                                    epbtVar.copyOnWrite();
                                                    epbu epbuVar3 = (epbu) epbtVar.instance;
                                                    epbuVar3.b |= 8;
                                                    epbuVar3.f = true;
                                                    return (epbu) epbtVar.build();
                                                }
                                            }, ckrsVar.e).i(new eroh() { // from class: ckrh
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj4) {
                                                    return ckrs.this.a(str3, (epbu) obj4);
                                                }
                                            }, ckrsVar.e).i(new ckrl(ckrsVar), ckrsVar.e);
                                        }
                                    }, ckraVar.f).e(Exception.class, new emwl() { // from class: ckqt
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj3) {
                                            ckra.a.s("Failed to log group name change timeout.", (Exception) obj3);
                                            return null;
                                        }
                                    }, ckraVar.f);
                                } else {
                                    Instant instant = f3;
                                    final ckra ckraVar2 = ckshVar.j;
                                    final int ordinal = ckrwVar.ordinal();
                                    final Duration between = Duration.between(instant, ckshVar.d.f());
                                    e = ckraVar2.a(conversationIdType2).i(new eroh() { // from class: ckqu
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj3) {
                                            final String str3 = (String) obj3;
                                            final ckrs ckrsVar = (ckrs) ckra.this.b;
                                            elfl b = ckrsVar.b();
                                            final Duration duration = between;
                                            final int i2 = ordinal;
                                            return b.h(new emwl() { // from class: ckrg
                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj4) {
                                                    String str4 = (String) obj4;
                                                    epbt epbtVar = (epbt) epbu.a.createBuilder();
                                                    long millis = Duration.this.toMillis();
                                                    epbtVar.copyOnWrite();
                                                    epbu epbuVar = (epbu) epbtVar.instance;
                                                    epbuVar.b |= 4;
                                                    epbuVar.e = millis;
                                                    str4.getClass();
                                                    epbtVar.copyOnWrite();
                                                    epbu epbuVar2 = (epbu) epbtVar.instance;
                                                    epbuVar2.b |= 1;
                                                    epbuVar2.c = str4;
                                                    epbtVar.copyOnWrite();
                                                    epbu epbuVar3 = (epbu) epbtVar.instance;
                                                    epbuVar3.b |= 2;
                                                    epbuVar3.d = i2;
                                                    epbtVar.copyOnWrite();
                                                    epbu epbuVar4 = (epbu) epbtVar.instance;
                                                    epbuVar4.b |= 8;
                                                    epbuVar4.f = false;
                                                    return (epbu) epbtVar.build();
                                                }
                                            }, ckrsVar.e).i(new eroh() { // from class: ckrn
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj4) {
                                                    return ckrs.this.a(str3, (epbu) obj4);
                                                }
                                            }, ckrsVar.e).i(new ckrl(ckrsVar), ckrsVar.e);
                                        }
                                    }, ckraVar2.f).e(Exception.class, new emwl() { // from class: ckqv
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj3) {
                                            ckra.a.s("Failed to log group name change response.", (Exception) obj3);
                                            return null;
                                        }
                                    }, ckraVar2.f);
                                }
                                return e.h(new emwl() { // from class: cksa
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        return ckrw.this;
                                    }
                                }, ckshVar.f);
                            }
                        }, a2.f).h(new emwl() { // from class: amjt
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                ckrw ckrwVar = (ckrw) obj2;
                                entd entdVar = amkx.a;
                                if (ckrwVar == ckrw.SUCCESS) {
                                    return true;
                                }
                                ((ensz) ((ensz) amkx.a.j()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "renameConversation", 769, "DefaultConversationRepository.java")).D("group renaming on conversation id = %s failed, reason: %s", ConversationId.this.b(), ckrwVar.name());
                                return false;
                            }
                        }, amkxVar.m);
                    }
                }, this.m);
            }
            f.close();
            return i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxl
    public final elfl t(final ConversationId conversationId, final aqux aquxVar) {
        elfl i;
        ekzz f = eleg.f("ConversationRepository#setActiveSelfIdentity");
        try {
            emxf.a(conversationId instanceof BugleConversationId);
            final ConversationIdType conversationIdType = ((BugleConversationId) conversationId).a;
            if (aquxVar.t()) {
                String[] strArr = bsom.a;
                bsoe bsoeVar = new bsoe();
                bsoeVar.ap("setActiveSelfIdentity");
                bsoeVar.ad(new Function() { // from class: amjr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsol bsolVar = (bsol) obj;
                        entd entdVar = amkx.a;
                        bsolVar.q(ConversationIdType.this);
                        return bsolVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsoeVar.n(aquxVar.g().c());
                i = bsoeVar.b().i().i(new eroh() { // from class: amjs
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        boolean z = ((Integer) obj).intValue() > 0;
                        final amkx amkxVar = amkx.this;
                        final ConversationIdType conversationIdType2 = conversationIdType;
                        final aqux aquxVar2 = aquxVar;
                        if (z) {
                            Stream map = Collection.EL.stream((Set) amkxVar.u.b()).map(new Function() { // from class: amkr
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    final bczl bczlVar = (bczl) obj2;
                                    ekzz a2 = bczlVar.a();
                                    final ConversationIdType conversationIdType3 = conversationIdType2;
                                    amkx amkxVar2 = amkx.this;
                                    final aqux aquxVar3 = aquxVar2;
                                    try {
                                        elfl h = elfo.h(new erog() { // from class: amjo
                                            @Override // defpackage.erog
                                            public final ListenableFuture a() {
                                                entd entdVar = amkx.a;
                                                return bczl.this.b(conversationIdType3, aquxVar3);
                                            }
                                        }, amkxVar2.m);
                                        a2.b(h);
                                        a2.close();
                                        return h;
                                    } catch (Throwable th) {
                                        try {
                                            a2.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i2 = engw.d;
                            engw engwVar = (engw) map.collect(endq.a);
                            if (!engwVar.isEmpty()) {
                                ekzz f2 = eleg.f("DefaultConversationRepository#notifyConversationActiveIdentityChangedListeners");
                                try {
                                    elfl a2 = elfo.a(engwVar);
                                    f2.b(a2);
                                    axnw.h(a2);
                                    f2.close();
                                } catch (Throwable th) {
                                    try {
                                        f2.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        } else {
                            ConversationId conversationId2 = conversationId;
                            ensz enszVar = (ensz) amkx.a.j();
                            enszVar.Y(csux.q, conversationId2);
                            enszVar.Y(csux.v, aquxVar2.g());
                            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "setActiveSelfIdentity", 970, "DefaultConversationRepository.java")).q("Self identity could not be set in conversation.");
                        }
                        return (amkxVar.v.a() && ((Optional) amkxVar.w.b()).isPresent() && z) ? ((cbun) ((Optional) amkxVar.w.b()).get()).a(conversationIdType2, aquxVar2) : elfo.e(Boolean.valueOf(z));
                    }
                }, erpp.a);
            } else {
                i = elfo.e(false);
            }
            f.close();
            return i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0006, B:9:0x0017, B:11:0x001c, B:13:0x0027, B:15:0x0046, B:16:0x004c, B:18:0x0051, B:19:0x0055), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0006, B:9:0x0017, B:11:0x001c, B:13:0x0027, B:15:0x0046, B:16:0x004c, B:18:0x0051, B:19:0x0055), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    @Override // defpackage.alxl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.elfl u(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5, java.lang.String r6, java.lang.String r7, defpackage.apmq r8) {
        /*
            r4 = this;
            java.lang.String r0 = "ConversationRepository#setDraftSnippet"
            ekzz r0 = defpackage.eleg.f(r0)
            boolean r1 = r5 instanceof com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId     // Catch: java.lang.Throwable -> L84
            defpackage.emxf.a(r1)     // Catch: java.lang.Throwable -> L84
            r1 = 0
            r2 = 1
            if (r6 != 0) goto L16
            if (r7 != 0) goto L16
            if (r8 == 0) goto L14
            goto L16
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            defpackage.emxf.a(r3)     // Catch: java.lang.Throwable -> L84
            if (r8 == 0) goto L26
            java.lang.String r3 = r8.b()     // Catch: java.lang.Throwable -> L84
            boolean r3 = defpackage.le.q(r3)     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L27
        L26:
            r1 = r2
        L27:
            defpackage.emxf.a(r1)     // Catch: java.lang.Throwable -> L84
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r5 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId) r5     // Catch: java.lang.Throwable -> L84
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r5.a     // Catch: java.lang.Throwable -> L84
            java.lang.String[] r1 = defpackage.bsom.a     // Catch: java.lang.Throwable -> L84
            bsoe r1 = new bsoe     // Catch: java.lang.Throwable -> L84
            r1.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = "setDraftSnippet"
            r1.ap(r3)     // Catch: java.lang.Throwable -> L84
            r1.W(r2)     // Catch: java.lang.Throwable -> L84
            r1.u(r6)     // Catch: java.lang.Throwable -> L84
            r1.v(r7)     // Catch: java.lang.Throwable -> L84
            r6 = 0
            if (r8 == 0) goto L4b
            java.lang.String r7 = r8.b()     // Catch: java.lang.Throwable -> L84
            goto L4c
        L4b:
            r7 = r6
        L4c:
            r1.r(r7)     // Catch: java.lang.Throwable -> L84
            if (r8 == 0) goto L55
            android.net.Uri r6 = r8.e()     // Catch: java.lang.Throwable -> L84
        L55:
            r1.s(r6)     // Catch: java.lang.Throwable -> L84
            cqoh r6 = r4.l     // Catch: java.lang.Throwable -> L84
            j$.time.Instant r6 = r6.f()     // Catch: java.lang.Throwable -> L84
            long r6 = r6.toEpochMilli()     // Catch: java.lang.Throwable -> L84
            r1.Z(r6)     // Catch: java.lang.Throwable -> L84
            amjp r6 = new amjp     // Catch: java.lang.Throwable -> L84
            r6.<init>()     // Catch: java.lang.Throwable -> L84
            r1.ad(r6)     // Catch: java.lang.Throwable -> L84
            bsod r5 = r1.b()     // Catch: java.lang.Throwable -> L84
            elfl r5 = r5.i()     // Catch: java.lang.Throwable -> L84
            amjq r6 = new amjq     // Catch: java.lang.Throwable -> L84
            r6.<init>()     // Catch: java.lang.Throwable -> L84
            erpp r7 = defpackage.erpp.a     // Catch: java.lang.Throwable -> L84
            elfl r5 = r5.h(r6, r7)     // Catch: java.lang.Throwable -> L84
            r0.close()
            return r5
        L84:
            r5 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L89
            goto L8d
        L89:
            r6 = move-exception
            r5.addSuppressed(r6)
        L8d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amkx.u(com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, java.lang.String, java.lang.String, apmq):elfl");
    }

    @Override // defpackage.alxl
    public final elfl v(ConversationId conversationId, final String str, final Uri uri) {
        ekzz f = eleg.f("ConversationRepository#setNameAndIcon");
        try {
            emxf.a(conversationId instanceof BugleConversationId);
            final ConversationIdType conversationIdType = ((BugleConversationId) conversationId).a;
            elfl g = elfo.g(new Callable() { // from class: amjv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    entd entdVar = amkx.a;
                    String[] strArr = bsom.a;
                    bsoe bsoeVar = new bsoe();
                    bsoeVar.C(str);
                    bsoeVar.z(uri.toString());
                    return Boolean.valueOf(bsoeVar.f(conversationIdType));
                }
            }, this.F);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxl
    public final elfl w(ConversationId conversationId, amny amnyVar) {
        return ((amoe) this.I.b()).a(conversationId, amnyVar);
    }

    @Override // defpackage.alxl
    public final elfl x(ConversationId conversationId, final cuea cueaVar) {
        elfl h;
        ekzz f = eleg.f("ConversationRepository#subscribeToConversation");
        try {
            if (!((Boolean) ((cfup) cudz.a.get()).e()).booleanValue()) {
                h = elfo.e(false);
            } else if (conversationId instanceof BugleConversationId) {
                BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
                BugleConversation H = H(bugleConversationId, false);
                final ConversationIdType conversationIdType = bugleConversationId.a;
                h = ((cudn) ((Optional) this.s.b()).orElseThrow()).a(H).h(new emwl() { // from class: amkd
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Boolean bool = (Boolean) obj;
                        boolean equals = Objects.equals(bool, Boolean.TRUE);
                        amkx amkxVar = amkx.this;
                        cuef c = equals ? ((cudn) ((Optional) amkxVar.s.b()).orElseThrow()).c(cuff.SUBSCRIBE) : cuef.SUBSCRIBE_ERROR;
                        ((cbuo) ((Optional) amkxVar.t.b()).orElseThrow()).b(conversationIdType, c, cueaVar);
                        return bool;
                    }
                }, this.n);
            } else {
                h = elfo.d(new UnsupportedOperationException("ConversationId must be type BugleConversationId"));
            }
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

    @Override // defpackage.alxl
    public final elfl y(ConversationId conversationId, final eoko eokoVar) {
        ekzz f = eleg.f("ConversationRepository#unarchiveConversation");
        try {
            emxf.a(conversationId instanceof BugleConversationId);
            final BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
            elfl g = elfo.g(new Callable() { // from class: amjy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(((croc) amkx.this.g.b()).a(bugleConversationId.a, byyt.UNARCHIVED, eokoVar));
                }
            }, this.n);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxl
    public final elfl z(ConversationId conversationId, cuex cuexVar, String str, boolean z, final cuea cueaVar) {
        elfl b;
        ekzz f = eleg.f("ConversationRepository#unsubscribeFromConversation");
        try {
            if (!((Boolean) ((cfup) cudz.a.get()).e()).booleanValue()) {
                b = elfo.e(false);
            } else if (conversationId instanceof BugleConversationId) {
                BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
                BugleConversation H = H(bugleConversationId, false);
                final elfl h = ((DefaultConversation) H).d.b().h(new emwl() { // from class: amku
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        engw engwVar = (engw) obj;
                        entd entdVar = amkx.a;
                        boolean z2 = false;
                        if (engwVar != null && engwVar.size() <= 1 && Collection.EL.stream(engwVar).anyMatch(new Predicate() { // from class: amji
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
                            public final boolean test(Object obj2) {
                                return ((ResolvedRecipient) obj2).B();
                            }
                        })) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                }, this.n);
                final ConversationIdType conversationIdType = bugleConversationId.a;
                final elfl b2 = ((cudn) ((Optional) this.s.b()).orElseThrow()).b(H, cuexVar, str, cueaVar);
                elfl e = elfo.e(crsn.a);
                if (z) {
                    if (cubs.a().booleanValue()) {
                        crrt crrtVar = (crrt) this.A.b();
                        crse o = crsf.o();
                        ((crrr) o).e = conversationId;
                        ((crrr) o).b = true;
                        ((crrr) o).h = eoko.CONVERSATION_FROM_CHATBOT_UNSUBSCRIBE_ACTION;
                        ((crrr) o).j = 3;
                        ((crrr) o).k = 16;
                        e = crrtVar.a(o.a().n());
                    } else {
                        crrt crrtVar2 = (crrt) this.A.b();
                        crse o2 = crsf.o();
                        ((crrr) o2).d = conversationIdType;
                        ((crrr) o2).b = true;
                        ((crrr) o2).h = eoko.CONVERSATION_FROM_CHATBOT_UNSUBSCRIBE_ACTION;
                        ((crrr) o2).j = 3;
                        ((crrr) o2).k = 16;
                        e = crrtVar2.a(o2.a().n());
                    }
                }
                b = elfo.m(h, b2, e).b(new erog() { // from class: amkv
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        if (!((Boolean) erqt.q(h)).booleanValue()) {
                            return elfo.e(false);
                        }
                        elfl elflVar = b2;
                        amkx amkxVar = amkx.this;
                        cuef c = ((Boolean) erqt.q(elflVar)).booleanValue() ? ((cudn) ((Optional) amkxVar.s.b()).orElseThrow()).c(cuff.UNSUBSCRIBE) : cuef.UNSUBSCRIBE_ERROR;
                        ((cbuo) ((Optional) amkxVar.t.b()).orElseThrow()).b(conversationIdType, c, cueaVar);
                        return elfo.e((Boolean) erqt.q(elflVar));
                    }
                }, this.n);
            } else {
                b = elfo.d(new UnsupportedOperationException("ConversationId must be type BugleConversationId"));
            }
            f.close();
            return b;
        } catch (Throwable th) {
            try {
                f.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}

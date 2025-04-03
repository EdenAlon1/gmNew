package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.screen.ConversationActivityUiState;
import com.google.android.apps.messaging.conversation.screen.ConversationActivityUsageStatisticsState;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.main.MainActivity;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahqt extends ahqw implements ahra, aeac, vjt, ahpk, czff, ajjm {
    public static final enru a = enru.c("com/google/android/apps/messaging/main/MainActivityPeer");
    public aedh A;
    public ConversationActivityUiState B;
    public ConversationActivityUsageStatisticsState C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public sfr K;
    public boolean L;
    public MessageCoreData M;
    public int N;
    private final ffbr P;
    private final ffbr Q;
    private final ffbr R;
    private final ffbr S;
    private final ffbr T;
    private final ffbr U;
    private final ffbr V;
    private final ffbr W;
    private final Optional X;
    private final ffbr Y;
    private final ffbr Z;
    private final ffbr aa;
    private final ffbr ab;
    private final ffbr ac;
    private final Optional ad;
    private final ffbr ae;
    private final ffbr af;
    private final ffbr ag;
    private final ffsk ah;
    private final ffbr ai;
    private final ffbr aj;
    private final ffbr ak;
    private final ffbr al;
    private final ffbr am;
    private final ffbr an;
    private final ffbr ao;
    private final ffbr ap;
    private final ffbr aq;
    private final asqd ar;
    private final ffbz as;
    private final ffbz at;
    private final ffbz au;
    private Toolbar av;
    private boolean aw;
    private abo ax;
    private abo ay;
    private bcyl az;
    public final MainActivity b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final elbx g;
    public final ffbr h;
    public final tam i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final set m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    public final ffbr r;
    public final ffbr s;
    public final ffbr t;
    public final ffbr u;
    public final Optional v;
    public final ffbr w;
    public final ffbr x;
    public final ffbr y;
    public final cskc z;

    public ahqt(MainActivity mainActivity, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, elbx elbxVar, ffbr ffbrVar13, tam tamVar, uxv uxvVar, ffbr ffbrVar14, ffbr ffbrVar15, Optional optional, ffbr ffbrVar16, ffbr ffbrVar17, set setVar, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23, ffbr ffbrVar24, ffbr ffbrVar25, ffbr ffbrVar26, ffbr ffbrVar27, ffbr ffbrVar28, ffbr ffbrVar29, Optional optional2, ffbr ffbrVar30, ffbr ffbrVar31, Optional optional3, ffbr ffbrVar32, ffbr ffbrVar33, ffbr ffbrVar34, ffbr ffbrVar35, ffsk ffskVar, ffbr ffbrVar36, ffbr ffbrVar37, ffbr ffbrVar38, ffbr ffbrVar39, ffbr ffbrVar40, ffbr ffbrVar41, ffbr ffbrVar42, ffbr ffbrVar43, ffbr ffbrVar44, ffbr ffbrVar45, ffbr ffbrVar46, asqd asqdVar) {
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar11.getClass();
        elbxVar.getClass();
        tamVar.getClass();
        uxvVar.getClass();
        ffbrVar16.getClass();
        setVar.getClass();
        ffbrVar22.getClass();
        ffbrVar26.getClass();
        ffbrVar29.getClass();
        ffbrVar34.getClass();
        ffbrVar35.getClass();
        ffskVar.getClass();
        ffbrVar38.getClass();
        ffbrVar39.getClass();
        ffbrVar40.getClass();
        ffbrVar41.getClass();
        ffbrVar42.getClass();
        ffbrVar43.getClass();
        ffbrVar44.getClass();
        ffbrVar45.getClass();
        asqdVar.getClass();
        this.b = mainActivity;
        this.P = ffbrVar;
        this.Q = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.R = ffbrVar5;
        this.e = ffbrVar6;
        this.S = ffbrVar7;
        this.f = ffbrVar8;
        this.T = ffbrVar9;
        this.U = ffbrVar10;
        this.V = ffbrVar11;
        this.W = ffbrVar12;
        this.g = elbxVar;
        this.h = ffbrVar13;
        this.i = tamVar;
        this.j = ffbrVar14;
        this.k = ffbrVar15;
        this.X = optional;
        this.Y = ffbrVar16;
        this.l = ffbrVar17;
        this.m = setVar;
        this.n = ffbrVar20;
        this.o = ffbrVar21;
        this.Z = ffbrVar22;
        this.aa = ffbrVar23;
        this.p = ffbrVar24;
        this.q = ffbrVar25;
        this.ab = ffbrVar26;
        this.r = ffbrVar27;
        this.s = ffbrVar28;
        this.ac = ffbrVar29;
        this.ad = optional2;
        this.t = ffbrVar30;
        this.u = ffbrVar31;
        this.v = optional3;
        this.ae = ffbrVar32;
        this.af = ffbrVar33;
        this.w = ffbrVar34;
        this.ag = ffbrVar35;
        this.ah = ffskVar;
        this.x = ffbrVar36;
        this.ai = ffbrVar37;
        this.aj = ffbrVar38;
        this.y = ffbrVar39;
        this.ak = ffbrVar40;
        this.al = ffbrVar41;
        this.am = ffbrVar42;
        this.an = ffbrVar43;
        this.ao = ffbrVar44;
        this.ap = ffbrVar45;
        this.aq = ffbrVar46;
        this.ar = asqdVar;
        this.as = ffca.a(new ffix() { // from class: ahpl
            @Override // defpackage.ffix
            public final Object invoke() {
                return (ahqx) new lmw(ahqt.this.b).a(ahqx.class);
            }
        });
        this.z = cskc.g("Bugle", "MainActivity");
        this.at = ffca.a(new ffix() { // from class: ahpv
            @Override // defpackage.ffix
            public final Object invoke() {
                return ahpe.a(new ahqk(ahqt.this));
            }
        });
        this.au = ffca.a(new ffix() { // from class: ahpw
            @Override // defpackage.ffix
            public final Object invoke() {
                return (ahpb) ahqt.this.t.b();
            }
        });
        ekzz f = eleg.f("MainActivityPeer#init");
        try {
            ecqk.a.c(ecjl.d());
            if (!this.v.isEmpty()) {
                ensk h = a.h();
                h.Y(ente.a, "Bugle");
                ((enrr) h.h("com/google/android/apps/messaging/main/MainActivityPeer", "<init>", 356, "MainActivityPeer.kt")).q("MainActivityShell is present, using MainActivityShell.");
            } else if (adhu.a()) {
                final eito eitoVar = (eito) this.l.b();
                eiwy e = eiwz.e(this.b);
                set setVar2 = this.m;
                ekzz g = eleg.g("DefaultAccountPrefetchedSelector::prefetchDefaultAccount", elad.a);
                try {
                    ListenableFuture d = setVar2.b.a.d();
                    g.b(d);
                    ffig.a(g, null);
                    setVar2.c = elfl.g(d);
                    e.d(set.class);
                    eitoVar.e(new ejgb(this.m.a));
                    if (adhu.b() || adhu.a()) {
                        Optional optional4 = (Optional) this.r.b();
                        final ffji ffjiVar = new ffji() { // from class: ahpx
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj) {
                                adht adhtVar = (adht) obj;
                                adhtVar.getClass();
                                eito.this.e(new adhs(adhtVar));
                                return ffcu.a;
                            }
                        };
                        optional4.ifPresent(new Consumer() { // from class: ahpy
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                ffji.this.invoke(obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                    eitoVar.e((eivv) ffbrVar18.b());
                    if (cubs.f()) {
                        eitoVar.e((eivv) ffbrVar19.b());
                    }
                    eitoVar.e(new ahqh(this));
                    e.d(ejed.class);
                    eitoVar.g(e.a());
                    if (((Optional) this.ae.b()).isPresent()) {
                        ((eito) ((adkl) ((Optional) this.ae.b()).get()).a.b()).f(adjr.g);
                    }
                } finally {
                }
            } else {
                eito eitoVar2 = (eito) this.l.b();
                eiwy e2 = eiwz.e(this.b);
                e2.d(seu.class);
                eitoVar2.e((eivv) ffbrVar18.b());
                eitoVar2.e(new ahqh(this));
                eitoVar2.g(e2.a());
                Optional optional5 = this.ad;
                final ffji ffjiVar2 = new ffji() { // from class: ahpz
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ses sesVar = (ses) obj;
                        sesVar.getClass();
                        sesVar.a();
                        return ffcu.a;
                    }
                };
                optional5.ifPresent(new Consumer() { // from class: ahqa
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ffji.this.invoke(obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            ffig.a(f, null);
        } finally {
        }
    }

    private final ea P() {
        vxl q = q();
        if (q != null) {
            return q.b();
        }
        return null;
    }

    private final fr Q() {
        vxl q = q();
        if (q == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        fr c = q.c();
        c.getClass();
        return c;
    }

    private final adzq R() {
        lkr h = this.b.a().h("conversation_list_root_fragment_tag");
        if (true != (h instanceof ea)) {
            h = null;
        }
        ekhu ekhuVar = h instanceof ekhu ? (ekhu) h : null;
        Object H = ekhuVar != null ? ekhuVar.H() : null;
        if (H instanceof adzq) {
            return (adzq) H;
        }
        return null;
    }

    private final ahpb S() {
        return (ahpb) this.au.a();
    }

    private final ahqx T() {
        return (ahqx) this.as.a();
    }

    private final void U(ea eaVar) {
        cg cgVar = new cg(this.b.a());
        cgVar.x(R.id.conversation_root_container, eaVar, "conversation_root_fragment_tag");
        cgVar.c();
    }

    private final void V() {
        this.b.getIntent().removeExtra("via_start_chat_intent");
        this.b.getIntent().removeExtra("render_add_recipient_button");
        this.b.getIntent().removeExtra("delete_empty_conversation_on_back");
    }

    private final void W(ConversationId conversationId, MessageIdType messageIdType) {
        ea P;
        if (n().b != 16) {
            V();
        }
        if (!N() && (P = P()) != null) {
            MainActivity mainActivity = this.b;
            tam tamVar = this.i;
            vvn z = vvn.z(P);
            if (ahpj.a(mainActivity, tamVar.a) && ffkj.e(w(conversationId), z.M)) {
                return;
            }
            cg cgVar = new cg(Q());
            cgVar.n(P);
            cgVar.c();
            ensk h = a.h();
            h.Y(ente.a, "Bugle");
            ((enrr) h.h("com/google/android/apps/messaging/main/MainActivityPeer", "launchConversationInternal", 2429, "MainActivityPeer.kt")).H("MainActivity#launchConversation: fragment isAdd: %s, isBound: %s", P.aF(), Boolean.valueOf(z.aY()));
        }
        n().b = 1;
        n().c = conversationId;
        if (!N() || !messageIdType.c()) {
            this.b.getIntent().putExtra("message_id", messageIdType.b());
        }
        O();
    }

    private final void X() {
        this.z.p("\n        Conversation 2 from MainActivity disabled.\n        Conversation 1 override: " + T().a + "\n        ");
    }

    private final void Y() {
        vxl q = q();
        if (q == null) {
            throw new IllegalArgumentException("ConversationRootFragment must be attached already");
        }
        eisx e = q.e();
        e.getClass();
        x(e);
    }

    private final void Z() {
        if (T().a) {
            T().a = false;
            Y();
        }
    }

    public final void A(ConversationIdType conversationIdType, final vvn vvnVar, bcyl bcylVar, MessageCoreData messageCoreData) {
        vvnVar.cC = this;
        bcqt bcqtVar = (bcqt) this.Q.b();
        ffbr ffbrVar = bcqtVar.a;
        bdtd bdtdVar = (bdtd) bcqtVar.b.b();
        bdtdVar.getClass();
        ffbr ffbrVar2 = bcqtVar.c;
        bctx bctxVar = (bctx) bcqtVar.d.b();
        bctxVar.getClass();
        bcxo bcxoVar = (bcxo) bcqtVar.e.b();
        bcxoVar.getClass();
        final bcqs bcqsVar = new bcqs(ffbrVar, bdtdVar, ffbrVar2, bctxVar, bcxoVar, conversationIdType, bcylVar, bcqtVar.f);
        if (vvnVar.cA.g()) {
            emxf.l(((bcqs) vvnVar.cA.a()).e.equals(bcqsVar.e));
        } else {
            ensk e = vvn.a.e();
            e.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.p, vvnVar.M);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "setConversationInfo", 4604, "ConversationFragmentPeer.java")).q("ConversationFragment: Setting conversation info");
            vvnVar.cy = messageCoreData;
            vvnVar.cA.c(bcqsVar);
            uuy uuyVar = vvnVar.cx;
            if (uuyVar != null) {
                uuyVar.A();
            }
            vvnVar.U(new Consumer() { // from class: vml
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    uav uavVar = (uav) obj;
                    uavVar.getClass();
                    uavVar.k(new bcpw(vvn.this.cA));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: vmm
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                    if (composeMessageView != null) {
                        bcqs bcqsVar2 = bcqsVar;
                        vvn vvnVar2 = vvn.this;
                        composeMessageView.H().x(vvnVar2.aa.a(bcqsVar2.e, bcqsVar2.q()), vvnVar2.A());
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        vvnVar.bq();
    }

    public final void B() {
        ConversationActivityUsageStatisticsState o = o();
        if (o.b < 0 || o.c <= 0 || !this.H) {
            return;
        }
        altk altkVar = (altk) this.V.b();
        ConversationId conversationId = n().c;
        altkVar.ax(conversationId != null ? w(conversationId) : null, o.a, o.b, o.c, o.e, o.f, o.g, false, o.i, o.k, o.h, o.l, o().j, o().m);
        boolean z = o.e;
        if (((Boolean) ((cfup) alwj.c.get()).e()).booleanValue()) {
            ((alwf) this.ac.b()).c(z);
        }
    }

    public final void C(boolean z, boolean z2, boolean z3) {
        ConversationActivityUsageStatisticsState o = o();
        if (o.f != null || n().c()) {
            return;
        }
        o.g = z;
        o.f = Boolean.valueOf(z2);
        o.j = z3;
        this.H = true;
        B();
    }

    @Override // defpackage.ahqw
    public final void D(Bundle bundle) {
        ekzz f = eleg.f("MainActivity#onCreate");
        try {
            if (this.ar.a() && Build.VERSION.SDK_INT >= 35) {
                this.b.getWindow().setColorMode(2);
            }
            this.v.isPresent();
            ((alrv) this.f.b()).e(alrv.z);
            Intent intent = this.b.getIntent();
            boolean z = bundle == null && intent != null && intent.getBooleanExtra("via_notification", false);
            if (z) {
                ((alrv) this.f.b()).e(alrv.s);
            }
            enru enruVar = a;
            ensk h = enruVar.h();
            h.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/main/MainActivityPeer", "onCreate", 608, "MainActivityPeer.kt");
            intent.getClass();
            boolean z2 = z;
            enrrVar.J("DRAFTBUG(b/348065860): onCreate: intent conversationId: %s, timestamp: %d, via notification: %s", u(intent), Long.valueOf(intent.getLongExtra("intent_timestamp", 0L)), Boolean.valueOf(z2));
            f = eleg.f("MainActivity#preOnCreate");
            try {
                G(intent, bundle, false);
                ffig.a(f, null);
                if (((acpf) this.Z.b()).b()) {
                    this.z.p("Try to launch Ditto.");
                    Object b = this.aa.b();
                    b.getClass();
                    Optional optional = (Optional) b;
                    if (optional.isPresent() && ((acio) optional.get()).m()) {
                        this.z.p("Launching Ditto.");
                        super.D(bundle);
                        ((acio) optional.get()).c();
                        this.b.finish();
                        ffig.a(f, null);
                        return;
                    }
                } else {
                    this.z.p("Device is SMS Capable");
                }
                axol.k(this.ah, null, new ahqo(this, null), 3);
                super.D(bundle);
                if (((auxx) this.aq.b()).a()) {
                    abh.a(this.b);
                }
                if (!((askf) this.ag.b()).a() && intent.getBooleanExtra("force_conversation_1", false)) {
                    T().a = true;
                }
                ensk h2 = enruVar.h();
                h2.Y(ente.a, "Bugle");
                ((enrr) h2.h("com/google/android/apps/messaging/main/MainActivityPeer", "onCreate", 649, "MainActivityPeer.kt")).t("viewModel.conversation1Override: %s", Boolean.valueOf(T().a));
                this.G = ahpj.a(this.b, this.i.a);
                adhu.a();
                f = eleg.f("setContentView");
                try {
                    this.b.setContentView(true != this.G ? R.layout.main_activity_full_view : R.layout.main_activity_with_home_container_split_view);
                    ffig.a(f, null);
                    if (n().e()) {
                        ((alrv) this.f.b()).e(alrv.y);
                        aemg aemgVar = (aemg) this.af.b();
                        ((ecrj) aemgVar.k.b()).e(aemg.b);
                        ((ecrj) aemgVar.k.b()).e(aemg.a);
                        ((ecrj) aemgVar.k.b()).e(aemg.d);
                        ((ecrj) aemgVar.k.b()).e(aemg.c);
                    }
                    f = eleg.f("MainActivity#onBackPressCallbacks");
                    try {
                        this.ax = new ahqg(this);
                        aca gE = this.b.gE();
                        MainActivity mainActivity = this.b;
                        abo aboVar = this.ax;
                        aboVar.getClass();
                        gE.b(mainActivity, aboVar);
                        this.ay = new ahqf(this);
                        aca gE2 = this.b.gE();
                        MainActivity mainActivity2 = this.b;
                        abo aboVar2 = this.ay;
                        aboVar2.getClass();
                        gE2.b(mainActivity2, aboVar2);
                        ffig.a(f, null);
                        this.z.m("OnCreate#hasNewIntent:" + this.L);
                        s().a(new ahpg());
                        f = eleg.f("MainActivity#postOnCreate");
                        try {
                            F(intent, z2);
                            ffig.a(f, null);
                            ffig.a(f, null);
                        } finally {
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
        }
    }

    public final void E() {
        this.v.isPresent();
        vvn p = p();
        L();
        if (n().c() && m() != null) {
            twk.e((twk) this.ab.b(), 10, 0, n().f(this.N), 10);
        }
        if (this.I) {
            this.N = 2;
        }
        if (p != null) {
            p.O();
            if (((Boolean) p.J(new Function() { // from class: vmr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ((ugg) obj).v();
                    return false;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: vms
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    czgj czgjVar = (czgj) obj;
                    enru enruVar = vvn.a;
                    boolean z = false;
                    if (czgjVar != null) {
                        if (!czgjVar.m || (!czgjVar.d.n() && !czgjVar.p)) {
                            int i = 0;
                            while (true) {
                                czgd[] czgdVarArr = czgjVar.f;
                                int length = czgdVarArr.length;
                                if (i >= 2) {
                                    break;
                                }
                                czgd czgdVar = czgdVarArr[i];
                                i++;
                            }
                        } else if (czgjVar.x()) {
                            z = true;
                        }
                    }
                    return Boolean.valueOf(z);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            })).booleanValue()) {
                return;
            }
        }
        d();
    }

    public final void F(final Intent intent, boolean z) {
        SidecarCompat sidecarCompat;
        pgv b;
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        ConversationId conversationId;
        if (n().e()) {
            ((aemc) this.p.b()).b = true;
            MainActivity mainActivity = this.b;
            ffbr ffbrVar = this.p;
            lkk P = mainActivity.P();
            Object b2 = ffbrVar.b();
            b2.getClass();
            P.c((lkq) b2);
        } else if (n().d()) {
            MainActivity mainActivity2 = this.b;
            ffbr ffbrVar2 = this.q;
            lkk P2 = mainActivity2.P();
            Object b3 = ffbrVar2.b();
            b3.getClass();
            P2.c((lkq) b3);
        }
        ensk h = a.h();
        h.Y(ente.a, "Bugle");
        ((enrr) h.h("com/google/android/apps/messaging/main/MainActivityPeer", "postOnCreate", 704, "MainActivityPeer.kt")).t("DRAFTBUG(b/348065860): postOnCreate: tempDraftMessageData cleared. openedFromNotification: %s", Boolean.valueOf(z));
        this.M = null;
        final cwqc cwqcVar = (cwqc) this.W.b();
        final MainActivity mainActivity3 = this.b;
        final boolean z2 = this.i.a;
        elfo.f(new Runnable() { // from class: cwqb
            @Override // java.lang.Runnable
            public final void run() {
                cwqc cwqcVar2 = cwqc.this;
                boolean a2 = ((audg) cwqcVar2.f.b()).a();
                Intent intent2 = intent;
                eoiv eoivVar = a2 ? cwqc.c(intent2) ? eoiv.VIA_ASSISTANT_APP_CONTROL : intent2.getBooleanExtra("via_shortcut", false) ? eoiv.VIA_SHORTCUT : intent2.getBooleanExtra("via_notification", false) ? eoiv.VIA_NOTIFICATION : intent2.getBooleanExtra("via_share_intent", false) ? eoiv.VIA_SHARING_INTENT : cwqc.d(intent2) ? eoiv.VIA_LAUNCH_ICON : eoiv.VIA_DEFAULT : cwqc.c(intent2) ? eoiv.VIA_ASSISTANT_APP_CONTROL : cwqc.d(intent2) ? eoiv.VIA_LAUNCH_ICON : intent2.getBooleanExtra("via_notification", false) ? eoiv.VIA_NOTIFICATION : intent2.getBooleanExtra("via_share_intent", false) ? eoiv.VIA_SHARING_INTENT : intent2.getBooleanExtra("via_widget", false) ? eoiv.VIA_WIDGET : intent2.getBooleanExtra("via_shortcut", false) ? eoiv.VIA_SHORTCUT : intent2.getBooleanExtra("launch_from_trampoline", false) ? eoiv.VIA_TRAMPOLINE : eoiv.VIA_DEFAULT;
                boolean z3 = z2;
                Activity activity = mainActivity3;
                ((altk) cwqcVar2.a.b()).m(eoivVar);
                ((akzt) cwqcVar2.g.b()).g("Bugle.MainActivity.OnCreate.Count", true != ahpj.a(activity, z3) ? 0L : 1L);
            }
        }, cwqcVar.c);
        Optional optional = (Optional) this.ai.b();
        final ffji ffjiVar = new ffji() { // from class: ahqb
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                akes akesVar = (akes) obj;
                akesVar.getClass();
                akesVar.a();
                return ffcu.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: ahqc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (z && (conversationId = n().c) != null && (conversationId instanceof BugleConversationId)) {
            ((altk) this.V.b()).aE(eoqn.INCOMING_MSG_NOTIFICATION, 4, engw.r(((BugleConversationId) conversationId).a));
        }
        View findViewById = this.b.findViewById(true != this.G ? R.id.conversation_and_compose_container_full_view : R.id.conversation_and_compose_container_split_view);
        findViewById.getClass();
        if (ahpj.a(this.b, this.i.a)) {
            ConstraintLayout constraintLayout = findViewById instanceof ConstraintLayout ? (ConstraintLayout) findViewById : null;
            if (constraintLayout != null) {
                int i = plx.a;
                MainActivity mainActivity4 = this.b;
                pmi pmiVar = (pmi) plw.a.a();
                if (pmiVar == null) {
                    if (pnh.a == null) {
                        ReentrantLock reentrantLock = pnh.b;
                        reentrantLock.lock();
                        try {
                            if (pnh.a == null) {
                                try {
                                    b = pnb.b();
                                } catch (Throwable unused) {
                                }
                                if (b == null) {
                                    sidecarCompat = null;
                                } else {
                                    if (b.compareTo(pgv.a) >= 0) {
                                        sidecarCompat = new SidecarCompat(mainActivity4);
                                        SidecarInterface sidecarInterface = sidecarCompat.a;
                                        Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
                                        Class<?> returnType = method != null ? method.getReturnType() : null;
                                        if (!ffkj.e(returnType, Void.TYPE)) {
                                            throw new NoSuchMethodException(a.n(returnType, "Illegal return type for 'setSidecarCallback': "));
                                        }
                                        SidecarInterface sidecarInterface2 = sidecarCompat.a;
                                        if (sidecarInterface2 != null) {
                                            sidecarInterface2.getDeviceState();
                                        }
                                        SidecarInterface sidecarInterface3 = sidecarCompat.a;
                                        if (sidecarInterface3 != null) {
                                            sidecarInterface3.onDeviceStateListenersChanged(true);
                                        }
                                        SidecarInterface sidecarInterface4 = sidecarCompat.a;
                                        Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
                                        Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
                                        if (!ffkj.e(returnType2, SidecarWindowLayoutInfo.class)) {
                                            throw new NoSuchMethodException(a.n(returnType2, "Illegal return type for 'getWindowLayoutInfo': "));
                                        }
                                        SidecarInterface sidecarInterface5 = sidecarCompat.a;
                                        Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
                                        Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
                                        if (!ffkj.e(returnType3, Void.TYPE)) {
                                            throw new NoSuchMethodException(a.n(returnType3, "Illegal return type for 'onWindowLayoutChangeListenerAdded': "));
                                        }
                                        SidecarInterface sidecarInterface6 = sidecarCompat.a;
                                        Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
                                        Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
                                        if (!ffkj.e(returnType4, Void.TYPE)) {
                                            throw new NoSuchMethodException(a.n(returnType4, "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "));
                                        }
                                        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                                        try {
                                            sidecarDeviceState.posture = 3;
                                        } catch (NoSuchFieldError unused2) {
                                            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                                            Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                                            invoke.getClass();
                                            if (((Integer) invoke).intValue() != 3) {
                                                throw new Exception("Invalid device posture getter/setter");
                                            }
                                        }
                                        SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
                                        Rect rect = sidecarDisplayFeature.getRect();
                                        rect.getClass();
                                        sidecarDisplayFeature.setRect(rect);
                                        sidecarDisplayFeature.getType();
                                        sidecarDisplayFeature.setType(1);
                                        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
                                        try {
                                            List list = sidecarWindowLayoutInfo.displayFeatures;
                                        } catch (NoSuchFieldError unused3) {
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(sidecarDisplayFeature);
                                            SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                                            Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                                            invoke2.getClass();
                                            if (!ffkj.e(arrayList, (List) invoke2)) {
                                                throw new Exception("Invalid display feature getter/setter");
                                            }
                                        }
                                    }
                                    sidecarCompat = null;
                                }
                                pnh.a = new pnh(sidecarCompat);
                            }
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                    pmiVar = pnh.a;
                    pmiVar.getClass();
                }
                new pmh(null);
                new pgk();
                ffxn ffxnVar = new ffxn(new pmb(new pmc(pmiVar), this.b, null));
                ffsd ffsdVar = fftc.a;
                axol.k(lks.a(this.b), null, new ahqn(new fgch(ffyo.b(ffxnVar, fghh.a), dslh.d(constraintLayout), new ahql(this, null)), constraintLayout, null), 3);
            }
        }
        String stringExtra = intent.getStringExtra("attachment_uri");
        if (!TextUtils.isEmpty(stringExtra)) {
            String stringExtra2 = intent.getStringExtra("attachment_type");
            ((csmj) this.S.b()).g(findViewById);
            ConversationId conversationId2 = n().c;
            if (le.n(stringExtra2) && conversationId2 != null) {
                ((akvg) this.U.b()).V(this.b, Uri.parse(stringExtra), bcqc.a(this.b, w(conversationId2)));
                ((altk) this.V.b()).T(1);
            } else if (le.A(stringExtra2)) {
                ((akvg) this.U.b()).E(this.b, Uri.parse(stringExtra), stringExtra2);
                ((altk) this.V.b()).ad(1);
            }
        }
        lkr k = k();
        if (k != null) {
            boolean g = ((vxl) ((ekhu) k).H()).g();
            if (((audh) this.ap.b()).a() && ((N() && !g) || (!N() && g))) {
                ensk h2 = a.h();
                h2.Y(ente.a, "Bugle");
                ((enrr) h2.h("com/google/android/apps/messaging/main/MainActivityPeer", "maybeReattachConversationRootFragmentAfterConfigurationChange", 2305, "MainActivityPeer.kt")).D("MainActivityPeer#maybeReattachConversationRootFragment reattaching. useConversation2(): %s, rootFragmentSupportsConversation2: %s", new ecda(true != N() ? "false" : "true"), new ecda(true == g ? "true" : "false"));
                Y();
            } else if (g) {
                ensk g2 = a.g();
                g2.Y(ente.a, "Bugle");
                ((enrr) g2.h("com/google/android/apps/messaging/main/MainActivityPeer", "maybeReattachConversationRootFragmentAfterConfigurationChange", 2317, "MainActivityPeer.kt")).q("MainActivityPeer#maybeReattachConversationRootFragment not reattaching");
            } else {
                ensk h3 = a.h();
                h3.Y(ente.a, "Bugle");
                ((enrr) h3.h("com/google/android/apps/messaging/main/MainActivityPeer", "maybeReattachConversationRootFragmentAfterConfigurationChange", 2312, "MainActivityPeer.kt")).q("MainActivityPeer#maybeReattachConversationRootFragment reattaching");
                Y();
            }
            O();
        }
    }

    public final void G(Intent intent, Bundle bundle, boolean z) {
        ConversationActivityUiState conversationActivityUiState;
        this.z.p(a.q(adhu.a(), "isBugleAccountEnabled: "));
        if (bundle != null) {
            ConversationActivityUiState conversationActivityUiState2 = (ConversationActivityUiState) bundle.getParcelable("uistate");
            if (conversationActivityUiState2 != null) {
                ensk h = a.h();
                h.Y(ente.a, "Bugle");
                ((enrr) h.h("com/google/android/apps/messaging/main/MainActivityPeer", "preOnCreate", 484, "MainActivityPeer.kt")).t("DRAFTBUG(b/348065860): preOnCreate: savedUiState is not null. shouldShowConversation: %s", Boolean.valueOf(conversationActivityUiState2.d()));
                this.B = conversationActivityUiState2;
            }
            ConversationActivityUsageStatisticsState conversationActivityUsageStatisticsState = (ConversationActivityUsageStatisticsState) bundle.getParcelable("usstate");
            if (conversationActivityUsageStatisticsState != null) {
                this.C = conversationActivityUsageStatisticsState;
            }
            this.H = bundle.getBoolean("rcscapabilityupdate");
            this.I = bundle.getBoolean("shouldclearactivitystack");
        }
        int i = 1;
        if (z || this.B == null) {
            ConversationId u = u(intent);
            int intExtra = intent.getIntExtra("conversation_state", 1);
            ensk h2 = a.h();
            h2.Y(ente.a, "Bugle");
            ((enrr) h2.h("com/google/android/apps/messaging/main/MainActivityPeer", "preOnCreate", 517, "MainActivityPeer.kt")).F("DRAFTBUG(b/348065860): preOnCreate: getStateFromNewIntent: %s, state: %d", z, intExtra);
            if (u != null) {
                conversationActivityUiState = new ConversationActivityUiState(u, intExtra);
            } else if (intExtra == 2) {
                conversationActivityUiState = new ConversationActivityUiState(2);
            } else {
                conversationActivityUiState = new ConversationActivityUiState(0);
            }
            this.B = conversationActivityUiState;
        }
        ensk h3 = a.h();
        h3.Y(ente.a, "Bugle");
        ((enrr) h3.h("com/google/android/apps/messaging/main/MainActivityPeer", "preOnCreate", 535, "MainActivityPeer.kt")).I("DRAFTBUG(b/348065860): preOnCreate: getStateFromNewIntent: %s, hasComposeRowState: %s", z, aygl.e(intent));
        this.i.a = n().b();
        if (z || this.C == null) {
            eoko eokoVar = eoko.CONVERSATION_FROM_LIST;
            if (n().b()) {
                eokoVar = eoko.CONVERSATION_FROM_BUBBLE;
            }
            this.C = new ConversationActivityUsageStatisticsState(eokoVar);
        }
        boolean booleanExtra = intent.getBooleanExtra("should_launch_home_on_back", false);
        boolean booleanExtra2 = intent.getBooleanExtra("via_share_intent", false);
        if (booleanExtra || booleanExtra2) {
            i = intent.hasExtra("FOCUS_ON_FIELD") ? 3 : 2;
        } else if (intent.getBooleanExtra("via_start_chat_intent", false)) {
            o().a = eoko.CONVERSATION_FROM_COMPOSE;
            i = 4;
        }
        this.N = i;
        this.D = false;
    }

    public final void H() {
        this.v.isPresent();
        Optional a2 = a();
        final ffji ffjiVar = new ffji() { // from class: ahpr
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ActionMode actionMode = (ActionMode) obj;
                actionMode.getClass();
                actionMode.finish();
                return ffcu.a;
            }
        };
        a2.ifPresent(new Consumer() { // from class: ahps
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.O.N();
    }

    public final void I() {
        if (!this.b.isTaskRoot()) {
            this.b.finishAfterTransition();
        } else {
            n().b = 0;
            O();
        }
    }

    public final void J(Toolbar toolbar) {
        this.v.isPresent();
        if (n().e() || N() || n().c()) {
            if (toolbar != null) {
                toolbar.setVisibility(8);
            } else {
                toolbar = null;
            }
            this.av = toolbar;
            return;
        }
        this.O.O(toolbar);
        if (toolbar != null) {
            toolbar.setVisibility(0);
        }
    }

    public final void K() {
        abo aboVar = this.ax;
        if (aboVar != null) {
            boolean z = true;
            if (!n().c() && !n().d()) {
                z = false;
            }
            aboVar.h(z);
        }
    }

    public final void L() {
        vvn p = p();
        if (p != null) {
            ensk h = a.h();
            h.Y(ente.a, "Bugle");
            ((enrr) h.h("com/google/android/apps/messaging/main/MainActivityPeer", "writeDraftMessage", 1213, "MainActivityPeer.kt")).q("DRAFTBUG(b/348065860): writeDraftMessage invoked");
            p.aW();
        }
    }

    public final boolean M() {
        this.v.isPresent();
        return n().e();
    }

    public final boolean N() {
        return !T().a;
    }

    public final void O() {
        boolean z;
        Toolbar toolbar;
        ffji ffjiVar;
        ffji ffjiVar2;
        final ffmq ahqsVar;
        final vxl q = q();
        if (q == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ffjn ffjnVar = new ffjn() { // from class: ahqd
            @Override // defpackage.ffjn
            public final Object a(Object obj, Object obj2, Object obj3) {
                gg ggVar = (gg) obj;
                ConversationId conversationId = (ConversationId) obj2;
                ggVar.getClass();
                conversationId.getClass();
                return vxl.this.a(ggVar, conversationId, SuperSortLabel.UNKNOWN, (MessageCoreData) obj3);
            }
        };
        ffji ffjiVar3 = new ffji() { // from class: ahpm
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                gg ggVar = (gg) obj;
                ggVar.getClass();
                vxl.this.h(ggVar);
                return ffcu.a;
            }
        };
        ffji ffjiVar4 = new ffji() { // from class: ahpn
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                gg ggVar = (gg) obj;
                ggVar.getClass();
                ahqt ahqtVar = this;
                vxl.this.i(ggVar, ahqtVar.n().f(ahqtVar.N));
                return ffcu.a;
            }
        };
        if (this.D || this.F) {
            this.z.n("skipping ui state update because the activity is stopped or state has already been saved");
            return;
        }
        Intent intent = this.b.getIntent();
        ConversationId conversationId = n().c;
        cg cgVar = new cg(Q());
        boolean d = n().d();
        boolean c = n().c();
        ea P = P();
        vvn p = p();
        ea l = l();
        if (P == null || d) {
            z = d;
        } else {
            if (p == null || !c) {
                z = d;
            } else {
                p.cH = true;
                ensk h = a.h();
                z = d;
                h.Y(ente.a, "Bugle");
                ((enrr) h.h("com/google/android/apps/messaging/main/MainActivityPeer", "updateUiStateBase", 1589, "MainActivityPeer.kt")).q("DRAFTBUG(b/348065860): updateUiStateBase setting tempDraftMessageData");
                this.M = n().b == 2 ? null : p.G();
            }
            cgVar.n(P);
        }
        if (!N() && !n().e() && this.b.k() == null) {
            J(this.av);
        } else if (n().c() && this.b.k() != null && (toolbar = this.av) != null) {
            toolbar.setVisibility(8);
        }
        if (z) {
            bcyl bcylVar = this.az;
            if (bcylVar == null) {
                bcylVar = new bcyl(intent.getExtras());
            }
            this.az = null;
            if (conversationId == null) {
                throw new IllegalStateException("Required value was null.");
            }
            aedh aedhVar = this.A;
            if (aedhVar != null) {
                aedhVar.i().Q(conversationId);
            }
            intent.getClass();
            MessageCoreData v = v(intent, new ecgk("updateUiStateBase"));
            MessageCoreData messageCoreData = v == null ? this.M : v;
            enru enruVar = a;
            ensk h2 = enruVar.h();
            ffjiVar2 = ffjiVar4;
            h2.Y(ente.a, "Bugle");
            ffjiVar = ffjiVar3;
            ((enrr) h2.h("com/google/android/apps/messaging/main/MainActivityPeer", "updateUiStateBase", 1615, "MainActivityPeer.kt")).J("DRAFTBUG(b/348065860): updateUiStateBase using draftData with length: %s. intentDraftData was %s. tempDraftMessageData was %s", messageCoreData, v, this.M);
            if (!c && v != null) {
                ahqe.a(intent);
            }
            if (intent.getBooleanExtra("open_keyboard", false)) {
                n().e = true;
            }
            if (N()) {
                ffjnVar.a(cgVar, conversationId, messageCoreData);
                this.b.Z();
                ensk h3 = enruVar.h();
                h3.Y(ente.a, "Bugle");
                ((enrr) h3.h("com/google/android/apps/messaging/main/MainActivityPeer", "updateUiStateBase", 1636, "MainActivityPeer.kt")).q("Conversation 2 from MainActivity enabled.");
            } else if (((asvn) this.am.b()).a() && (conversationId instanceof EmergencySosConversationId)) {
                X();
                ensk i = enruVar.i();
                i.Y(ente.a, "Bugle");
                enrr enrrVar = (enrr) i;
                enrrVar.Y(csux.p, ((EmergencySosConversationId) conversationId).a);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/main/MainActivityPeer", "updateUiStateBase", 1647, "MainActivityPeer.kt")).q("EmergencySosConversation is not supported as Conversation 2 flag is disabled, navigate to home screen.");
                n().b = 0;
            } else {
                X();
                if (p != null) {
                    ConversationIdType w = w(conversationId);
                    w.getClass();
                    A(w, p, bcylVar, messageCoreData);
                    p.bq();
                    if (intent.getBooleanExtra("scroll_to_bottom", false)) {
                        p.at();
                        this.b.getIntent().removeExtra("scroll_to_bottom");
                    }
                } else {
                    ea eaVar = (ea) ffjnVar.a(cgVar, conversationId, messageCoreData);
                    eaVar.P().c(new ahqp(this, conversationId, eaVar, bcylVar, messageCoreData));
                    eaVar.P().c(new ahqq(this, eaVar));
                }
            }
            Intent intent2 = this.b.getIntent();
            intent2.getClass();
            ahqe.a(intent2);
            ensk h4 = enruVar.h();
            h4.Y(ente.a, "Bugle");
            ((enrr) h4.h("com/google/android/apps/messaging/main/MainActivityPeer", "updateUiStateBase", 1716, "MainActivityPeer.kt")).q("DRAFTBUG(b/348065860): updateUiStateBase clearing tempDraftMessageData");
            this.M = null;
        } else {
            ffjiVar = ffjiVar3;
            ffjiVar2 = ffjiVar4;
        }
        this.v.isPresent();
        ea k = k();
        k.getClass();
        ea h5 = k.I().h("conversation_placeholder");
        uxt uxtVar = h5 instanceof uxt ? (uxt) h5 : null;
        if (true != (uxtVar instanceof uxt)) {
            uxtVar = null;
        }
        if (n().e()) {
            if (uxtVar == null && ahpj.a(this.b, this.i.a)) {
                ffjiVar.invoke(cgVar);
            } else if (uxtVar != null && !ahpj.a(this.b, this.i.a)) {
                cgVar.n(uxtVar);
            }
            c();
        } else if (uxtVar != null) {
            cgVar.n(uxtVar);
        }
        tvt m = m();
        if (c) {
            if (m == null) {
                ffjiVar2.invoke(cgVar);
            }
            ((csll) this.T.b()).h(this.b);
            ahqsVar = new ahqr(this);
        } else {
            if (m != null) {
                cgVar.n(m.a());
                if (p != null) {
                    p.bq();
                }
            }
            ahqsVar = new ahqs(this);
        }
        cgVar.y(new Runnable() { // from class: ahpq
            @Override // java.lang.Runnable
            public final void run() {
                ((ffix) ffmq.this).invoke();
            }
        });
        if (!cgVar.i()) {
            cgVar.c();
            if (this.aw) {
                this.aw = false;
                vvn p2 = p();
                if (n().d() && p2 != null) {
                    p2.Q();
                }
            }
        }
        if (n().e() || ahpj.a(this.b, this.i.a)) {
            if (l == null) {
                adzq R = R();
                R.getClass();
                R.b();
            }
            aedh r = r();
            r.getClass();
            r.aM = this;
            this.A = r;
        } else if (l != null) {
            adzq R2 = R();
            R2.getClass();
            R2.c();
            this.A = null;
            if (N()) {
                ((dvvb) this.e.b()).a(((adsg) this.h.b()).a(this.b, null));
            }
        }
        K();
    }

    @Override // defpackage.aeac
    public final Optional a() {
        this.v.isPresent();
        return this.b.W();
    }

    @Override // defpackage.vjt
    public final void ad() {
        this.v.isPresent();
        emxf.l(!ConversationActivityUiState.a.contains(Integer.valueOf(n().b)));
    }

    @Override // defpackage.vjt
    public final void ae() {
        this.v.isPresent();
        n().e = false;
    }

    @Override // defpackage.vjt
    public final void af() {
        this.v.isPresent();
        this.aw = true;
    }

    @Override // defpackage.vjt
    public final boolean ag() {
        this.v.isPresent();
        return n().e;
    }

    @Override // defpackage.aeac
    public final void b() {
        if (a().isEmpty()) {
            this.z.m("Bypassing dismissActionMode call, since action mode was not started");
            return;
        }
        this.z.m("dismissActionMode");
        this.v.isPresent();
        abo aboVar = this.ay;
        if (aboVar != null) {
            aboVar.h(false);
        }
        ahpb S = S();
        Window window = S.a.getWindow();
        Integer num = S.b;
        window.setStatusBarColor(num != null ? num.intValue() : 0);
        S.b = null;
        this.b.X();
    }

    @Override // defpackage.aeac
    public final void c() {
        this.v.isPresent();
        this.b.Z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vjt, defpackage.ahpk
    public final void d() {
        this.v.isPresent();
        V();
        ae();
        this.b.getIntent().replaceExtras((Bundle) null);
        engw engwVar = ayfh.a;
        engwVar.getClass();
        enqv it = engwVar.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (this.b.getIntent().hasExtra(str)) {
                this.b.getIntent().removeExtra(str);
            }
        }
        I();
    }

    @Override // defpackage.aeac
    public final /* synthetic */ void e(ConversationId conversationId, bcyl bcylVar, boolean z) {
        aeab.a(this, conversationId, bcylVar, z);
    }

    @Override // defpackage.aeac
    public final void f(ConversationId conversationId, MessageIdType messageIdType, bcyl bcylVar, boolean z) {
        conversationId.getClass();
        this.v.isPresent();
        this.az = bcylVar;
        this.v.isPresent();
        if (!z || ((askf) this.ag.b()).a()) {
            Z();
        } else if (!T().a) {
            T().a = true;
            Y();
        }
        W(conversationId, messageIdType);
    }

    @Override // defpackage.aeac
    public final void g() {
        if (M()) {
            this.b.aa();
        }
    }

    @Override // defpackage.aeac
    public final void h(ActionMode.Callback callback, View view, String str) {
        callback.getClass();
        this.v.isPresent();
        abo aboVar = this.ay;
        if (aboVar != null) {
            aboVar.h(true);
        }
        if (callback instanceof czyz) {
            I();
        }
        this.b.ab(callback, view, str);
        ahpb S = S();
        Window window = S.a.getWindow();
        S.b = Integer.valueOf(window.getStatusBarColor());
        window.setStatusBarColor(((Number) S.c.a()).intValue());
    }

    @Override // defpackage.aeac
    public final void i() {
        this.v.isPresent();
        L();
        Intent intent = this.b.getIntent();
        intent.getClass();
        ahqe.a(intent);
        if (a().isPresent()) {
            b();
        }
        n().c = null;
        n().b = 2;
        O();
    }

    @Override // defpackage.ahpk
    public final void j(aijp aijpVar) {
        this.v.isPresent();
        Z();
        this.az = null;
        if (aijpVar.i == 2) {
            o().a = eoko.CONVERSATION_FROM_COMPOSE;
            n().b = 16;
        } else if (((dixm) this.an.b()).a() && aijpVar.i == 7) {
            o().a = eoko.CONVERSATION_FROM_RBM_SUGGESTED_ACTION;
        }
        MainActivity mainActivity = this.b;
        boolean z = aijpVar.b;
        Intent intent = mainActivity.getIntent();
        intent.putExtra("render_add_recipient_button", z);
        intent.putExtra("delete_empty_conversation_on_back", aijpVar.c);
        intent.putExtra("via_start_chat_intent", aijpVar.i == 2);
        if (((atdn) this.ao.b()).a()) {
            ComposeRowState composeRowState = aijpVar.d;
            if (composeRowState != null) {
                ensk h = a.h();
                h.Y(ente.a, "Bugle");
                ((enrr) h.h("com/google/android/apps/messaging/main/MainActivityPeer", "argumentsToExtras", 2244, "MainActivityPeer.kt")).q("DRAFTBUG(b/348065860): argumentsToExtras setting ComposeRowState");
                intent.getClass();
                aygl.f(intent, composeRowState);
            }
        } else if (((dixm) this.an.b()).a()) {
            ComposeRowState composeRowState2 = aijpVar.d;
            if (composeRowState2 != null) {
                ensk h2 = a.h();
                h2.Y(ente.a, "Bugle");
                ((enrr) h2.h("com/google/android/apps/messaging/main/MainActivityPeer", "argumentsToExtras", 2249, "MainActivityPeer.kt")).q("DRAFTBUG(b/348065860): argumentsToExtras setting ComposeRowState");
                intent.getClass();
                aygl.f(intent, composeRowState2);
            }
            IncomingDraft incomingDraft = aijpVar.f;
            if (incomingDraft != null) {
                ensk h3 = a.h();
                h3.Y(ente.a, "Bugle");
                ((enrr) h3.h("com/google/android/apps/messaging/main/MainActivityPeer", "argumentsToExtras", 2255, "MainActivityPeer.kt")).t("DRAFTBUG(b/348065860): argumentsToExtras setting incoming draft. Draft text:", incomingDraft.toString());
                intent.getClass();
                aygy.b(intent, incomingDraft);
            }
        }
        W(aijpVar.a, bdhb.a);
    }

    public final ea k() {
        ea h = this.b.a().h("conversation_root_fragment_tag");
        if (h instanceof ea) {
            return h;
        }
        return null;
    }

    public final ea l() {
        this.v.isPresent();
        adzq R = R();
        if (R != null) {
            return R.a();
        }
        return null;
    }

    public final tvt m() {
        this.v.isPresent();
        vxl q = q();
        if (q != null) {
            return q.d();
        }
        return null;
    }

    public final ConversationActivityUiState n() {
        ConversationActivityUiState conversationActivityUiState = this.B;
        if (conversationActivityUiState != null) {
            return conversationActivityUiState;
        }
        ffkj.c("uiState");
        return null;
    }

    public final ConversationActivityUsageStatisticsState o() {
        ConversationActivityUsageStatisticsState conversationActivityUsageStatisticsState = this.C;
        if (conversationActivityUsageStatisticsState != null) {
            return conversationActivityUsageStatisticsState;
        }
        ffkj.c("usageStatisticsState");
        return null;
    }

    public final vvn p() {
        this.v.isPresent();
        if (!N()) {
            vxl q = q();
            ea b = q != null ? q.b() : null;
            if (((aude) this.aj.b()).a() && q != null && !(q instanceof vxn)) {
                ((enrr) this.z.j().h("com/google/android/apps/messaging/main/MainActivityPeer", "findConversationOneFragmentPeer", 1332, "MainActivityPeer.kt")).D("ConversationFragmentPeer should have been a conversation 1 root. Class was: %s. conversation1Override: %s", ecda.b(q.getClass()), new ecda(true != T().a ? "false" : "true"));
            }
            if (b != null) {
                return vvn.z(b);
            }
        }
        return null;
    }

    public final vxl q() {
        lkr k = k();
        ekhu ekhuVar = k instanceof ekhu ? (ekhu) k : null;
        Object H = ekhuVar != null ? ekhuVar.H() : null;
        if (H instanceof vxl) {
            return (vxl) H;
        }
        return null;
    }

    public final aedh r() {
        this.v.isPresent();
        ea l = l();
        if (l instanceof adzz) {
            return ((adzz) l).H();
        }
        return null;
    }

    public final ahpi s() {
        return (ahpi) this.at.a();
    }

    public final ConversationId t() {
        this.v.isPresent();
        return n().c;
    }

    public final ConversationId u(Intent intent) {
        return ((amet) this.x.b()).a(intent);
    }

    public final MessageCoreData v(Intent intent, ecgi ecgiVar) {
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "Bugle");
        ((enrr) h.h("com/google/android/apps/messaging/main/MainActivityPeer", "getDraftMessageData", 1838, "MainActivityPeer.kt")).t("DRAFTBUG(b/348065860): getDraftMessageData invoked from: %s", ecgiVar);
        if (ctid.b && intent.hasExtra("android.remoteInputDraft")) {
            String stringExtra = intent.getStringExtra("android.remoteInputDraft");
            ConversationId conversationId = n().c;
            bcvr a2 = ((bcvs) this.R.b()).a(bdgq.b(conversationId != null ? conversationId.b() : null), false);
            a2.S(stringExtra);
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "Bugle");
            ((enrr) h2.h("com/google/android/apps/messaging/main/MainActivityPeer", "getDraftMessageData", 1850, "MainActivityPeer.kt")).q("DRAFTBUG(b/348065860): getDraftMessageData had remote input extra.");
            return a2.v(((cqoh) this.P.b()).f().toEpochMilli());
        }
        if (intent.hasExtra("draft_data")) {
            ensk h3 = enruVar.h();
            h3.Y(ente.a, "Bugle");
            ((enrr) h3.h("com/google/android/apps/messaging/main/MainActivityPeer", "getDraftMessageData", 1854, "MainActivityPeer.kt")).q("DRAFTBUG(b/348065860): getDraftMessageData had DRAFT_DATA extra");
            return (MessageCoreData) intent.getParcelableExtra("draft_data");
        }
        ensk h4 = enruVar.h();
        h4.Y(ente.a, "Bugle");
        ((enrr) h4.h("com/google/android/apps/messaging/main/MainActivityPeer", "getDraftMessageData", 1857, "MainActivityPeer.kt")).q("DRAFTBUG(b/348065860): getDraftMessageData returned null");
        return null;
    }

    public final ConversationIdType w(ConversationId conversationId) {
        return ((askf) this.ag.b()).a() ? amic.a(conversationId) : ((BugleConversationId) conversationId).a;
    }

    public final void x(eisx eisxVar) {
        if (!N()) {
            vxk vxkVar = new vxk();
            fbae.e(vxkVar);
            ekky.b(vxkVar, eisxVar);
            U(vxkVar);
            return;
        }
        wqk wqkVar = new wqk();
        fbae.e(wqkVar);
        ekky.b(wqkVar, eisxVar);
        U(wqkVar);
    }

    public final void y(int i) {
        View findViewById = this.b.findViewById(R.id.contact_picker_fragment_container);
        if (findViewById == null) {
            this.b.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ahqi(this, i));
        } else if (findViewById.getVisibility() != i) {
            findViewById.setVisibility(i);
        }
    }

    @Override // defpackage.czff
    public final void z(int i) {
        this.v.isPresent();
        this.b.getWindow().setSoftInputMode(i);
    }
}

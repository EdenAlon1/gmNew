package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.messagelist.MessageListRecyclerView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.common.PinnedLinearLayoutManager;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import defpackage.ekkz;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.IntPredicate$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class urp extends uwq implements ekhu, fbas, ekhq, ekkk, elar, ellr {
    private uuy a;
    private boolean ah;
    private Context d;
    private final lkv e = new lkv(this);
    private final ells ag = new ells();

    @Deprecated
    public urp() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return uuy.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            uuy H = H();
            View inflate = layoutInflater.inflate(R.layout.message_list_fragment, viewGroup, false);
            H.az = (MessageListRecyclerView) inflate.findViewById(android.R.id.list);
            H.az.aq((we) H.Z.b());
            if (inflate == null) {
                uvn.a(this, H());
            }
            ekyf.q();
            return inflate;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.e;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final uuy H() {
        uuy uuyVar = this.a;
        if (uuyVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return uuyVar;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.d == null) {
            this.d = new ekkn(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ae(Bundle bundle) {
        this.c.k();
        try {
            aU(bundle);
            final uuy H = H();
            if (((Boolean) cnvu.a.e()).booleanValue()) {
                H.E.ifPresent(new Consumer() { // from class: urt
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        uuy uuyVar = uuy.this;
                        uuyVar.D.b(((coja) obj).a(uuyVar.e.P(), uuyVar.ap), uuyVar.af);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            H.w.ifPresent(new Consumer() { // from class: uru
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    final ddkk ddkkVar = (ddkk) obj;
                    uuy uuyVar = uuy.this;
                    final ConversationIdType conversationIdType = uuyVar.ap;
                    uuyVar.D.b(new ejuy(ddkkVar.a, new eros() { // from class: ddkh
                        @Override // defpackage.eros
                        public final erph a(erpc erpcVar) {
                            final ConversationIdType conversationIdType2 = conversationIdType;
                            return new erph(ddkk.this.c.submit(eldl.m(new Callable() { // from class: ddkg
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    bxco c = bxct.c();
                                    c.z("getMessageIdsWithReminderInConversation");
                                    final ConversationIdType conversationIdType3 = ConversationIdType.this;
                                    c.e(new Function() { // from class: ddki
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            bxcs bxcsVar = (bxcs) obj2;
                                            int intValue = bxct.e().intValue();
                                            if (intValue < 35070) {
                                                dtub.w("conversation_id", intValue);
                                            }
                                            bxcsVar.aq(new dtrt("reminders.conversation_id", 1, Long.valueOf(bdgq.a(ConversationIdType.this))));
                                            return bxcsVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    return c.b().x(new emwl() { // from class: ddkj
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            bxca bxcaVar = (bxca) obj2;
                                            cnle createBuilder = cnlf.a.createBuilder();
                                            String b = bxcaVar.e().b();
                                            createBuilder.copyOnWrite();
                                            cnlf cnlfVar = (cnlf) createBuilder.instance;
                                            b.getClass();
                                            cnlfVar.b |= 1;
                                            cnlfVar.c = b;
                                            long c2 = bxcaVar.c();
                                            createBuilder.copyOnWrite();
                                            cnlf cnlfVar2 = (cnlf) createBuilder.instance;
                                            cnlfVar2.b |= 2;
                                            cnlfVar2.d = c2;
                                            return createBuilder.build();
                                        }
                                    });
                                }
                            })));
                        }
                    }, "reminders_key".concat(String.valueOf(String.valueOf(conversationIdType)))), uuyVar.ae);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (H.ar.b()) {
                final cvom cvomVar = (cvom) H.G.b();
                H.D.b(new ejuy((ejvb) cvomVar.d.b(), new eros() { // from class: cvok
                    @Override // defpackage.eros
                    public final erph a(erpc erpcVar) {
                        final cvom cvomVar2 = cvom.this;
                        return new erph(elfo.g(new Callable() { // from class: cvol
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                cvom cvomVar3 = cvom.this;
                                boolean z = false;
                                if (!cufg.a() ? ((culz) cvomVar3.a.b()).e() : ((culw) cvomVar3.b.b()).e()) {
                                    if (((ahor) cvomVar3.c.b()).c()) {
                                        z = true;
                                    }
                                }
                                return Boolean.valueOf(z);
                            }
                        }, (Executor) cvomVar2.e.b()));
                    }
                }, "SafeUrlSettingCacheCallback_DATASOURCE_KEY"), cvomVar);
            }
            if (H.at.b() && ((Optional) H.T.b()).isPresent()) {
                H.D.b(((cymq) ((Optional) H.T.b()).get()).a(), H.ag);
            }
            H.D.b(((ahns) H.aw.b()).a(H.f), new uuf(H));
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        elav f = this.c.f();
        try {
            aV(i, i2, intent);
            uuy H = H();
            if (i2 == -1) {
                Map map = H.y.b;
                Integer valueOf = Integer.valueOf(i);
                if (map.containsKey(valueOf) && intent != null && intent.getData() != null) {
                    urn urnVar = H.y;
                    Uri data = intent.getData();
                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) urnVar.b.get(valueOf);
                    if (messagePartCoreData != null && data != null) {
                        Uri t = messagePartCoreData.t();
                        String V = messagePartCoreData.V();
                        if (t != null && V != null) {
                            sfx a = urnVar.a.a("Bugle.Async.ConversationFragment.ActionMode.Callback.onActionItemClicked.Duration");
                            a.c(t, data, V);
                            a.e(new Void[0]);
                        }
                        urnVar.b.remove(valueOf);
                    }
                    H.ay.l();
                }
            }
            if (i == 100) {
                H.s();
            }
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

    @Override // defpackage.uwq, defpackage.efaf, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ai() {
        wc wcVar;
        elav b = this.c.b();
        try {
            ba();
            uuy H = H();
            ValueAnimator valueAnimator = H.aN;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                H.aN = null;
            }
            MessageListRecyclerView messageListRecyclerView = H.az;
            if (messageListRecyclerView != null && (wcVar = H.aF) != null) {
                messageListRecyclerView.ai(wcVar);
            }
            wgh wghVar = H.C;
            if (wghVar != null) {
                wghVar.f = true;
            }
            uuw uuwVar = H.ay;
            if (uuwVar != null) {
                uuwVar.l();
            }
            uxa uxaVar = H.h;
            if (uxaVar != null && uxaVar.f > 0) {
                eqku eqkuVar = (eqku) eqkv.a.createBuilder();
                eqkw eqkwVar = (eqkw) eqkx.a.createBuilder();
                long j = uxaVar.g;
                eqkwVar.copyOnWrite();
                eqkx eqkxVar = (eqkx) eqkwVar.instance;
                eqkxVar.b = 1 | eqkxVar.b;
                eqkxVar.c = j;
                eqkx eqkxVar2 = (eqkx) eqkwVar.build();
                eqkuVar.copyOnWrite();
                eqkv eqkvVar = (eqkv) eqkuVar.instance;
                eqkxVar2.getClass();
                eqkvVar.d = eqkxVar2;
                eqkvVar.c |= 2;
                ((aleq) uxaVar.d.b()).a(174017, (eqkv) eqkuVar.build());
                uxaVar.f = 0L;
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void al(boolean z) {
        uqc uqcVar;
        uuy H = H();
        if (z || (uqcVar = H.aC) == null) {
            return;
        }
        uqcVar.b.clear();
        uqcVar.e = true;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void am() {
        this.c.k();
        try {
            bh();
            uuy H = H();
            vx vxVar = H.az.o;
            if (vxVar == null) {
                throw new IllegalStateException("RecyclerView has no LayoutManager during onPause().");
            }
            H.d = vxVar.R();
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        url urlVar;
        this.c.k();
        try {
            ellg.b(this).b = view;
            H();
            uvn.a(this, H());
            bm(view, bundle);
            final uuy H = H();
            H.aB.e.a = true;
            H.az = (MessageListRecyclerView) view.findViewById(android.R.id.list);
            if (!H.at.b()) {
                uvr H2 = H.az.H();
                Context z = H.e.z();
                z.getClass();
                H2.a = new ScaleGestureDetector(z, (ScaleGestureDetector.OnScaleGestureListener) H.H.b());
            }
            H.az.aL();
            H.az.ap(H.aA);
            H.az.am(H.aB.f);
            H.aF = new elhl(H.N, new uue(H));
            H.az.z(H.aF);
            wgh wghVar = H.C;
            eisx eisxVar = H.f;
            eg G = H.e.G();
            MessageListRecyclerView messageListRecyclerView = H.az;
            eisxVar.getClass();
            messageListRecyclerView.getClass();
            messageListRecyclerView.getViewTreeObserver().addOnPreDrawListener(new wgg(wghVar, messageListRecyclerView, eisxVar, G));
            H.aM = ViewConfiguration.get(H.e.fe()).getScaledTouchSlop();
            if (((Boolean) cful.ak.e()).booleanValue()) {
                if (((Boolean) cful.ap.e()).booleanValue()) {
                    urm urmVar = H.q;
                    MessageListRecyclerView messageListRecyclerView2 = H.az;
                    Context context = (Context) urmVar.a.b();
                    context.getClass();
                    cqoh cqohVar = (cqoh) urmVar.b.b();
                    cqohVar.getClass();
                    Optional optional = (Optional) urmVar.c.b();
                    optional.getClass();
                    messageListRecyclerView2.getClass();
                    urlVar = new url(context, cqohVar, optional, messageListRecyclerView2, H, 0);
                } else {
                    urm urmVar2 = H.q;
                    MessageListRecyclerView messageListRecyclerView3 = H.az;
                    Context context2 = (Context) urmVar2.a.b();
                    context2.getClass();
                    cqoh cqohVar2 = (cqoh) urmVar2.b.b();
                    cqohVar2.getClass();
                    Optional optional2 = (Optional) urmVar2.c.b();
                    optional2.getClass();
                    messageListRecyclerView3.getClass();
                    urlVar = new url(context2, cqohVar2, optional2, messageListRecyclerView3, H, 217);
                }
                H.az.an(urlVar);
            }
            uqd uqdVar = H.x;
            MessageListRecyclerView messageListRecyclerView4 = H.az;
            boolean d = H.p.d();
            cxqh cxqhVar = (cxqh) uqdVar.a.b();
            cxqhVar.getClass();
            csrh csrhVar = (csrh) uqdVar.b.b();
            csrhVar.getClass();
            messageListRecyclerView4.getClass();
            uqc uqcVar = new uqc(cxqhVar, csrhVar, messageListRecyclerView4, d ? 1 : 0);
            uqcVar.a.addOnLayoutChangeListener(uqcVar);
            uqcVar.a.z(uqcVar);
            uqcVar.a.y(uqcVar);
            vk vkVar = uqcVar.a.n;
            if (vkVar != null) {
                vkVar.A(new uqb(uqcVar));
            }
            uqcVar.f();
            uqcVar.e(false);
            uqcVar.c.setAlpha(0.0f);
            H.aC = uqcVar;
            if (bundle != null) {
                H.aK = bundle.getParcelableArrayList("attachmentDataToSaveKey");
                H.d = bundle.getParcelable("conversationViewState");
            }
            H.aD = new uqy(H.az, new IntPredicate() { // from class: utt
                public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                    return IntPredicate$CC.$default$and(this, intPredicate);
                }

                public final /* synthetic */ IntPredicate negate() {
                    return IntPredicate$CC.$default$negate(this);
                }

                public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                    return IntPredicate$CC.$default$or(this, intPredicate);
                }

                @Override // java.util.function.IntPredicate
                public final boolean test(int i) {
                    return uuy.this.E(i);
                }
            }, H.P);
            H.az.al(H.aD);
            H.F.f(H.az, alrv.q, null);
            ((arcs) H.ac.b()).d();
            H.aE = new czqa() { // from class: utu
                @Override // defpackage.czqa
                public final void a(czpz czpzVar) {
                    czpt czptVar = (czpt) czpzVar;
                    boolean z2 = czptVar.a;
                    uuy uuyVar = uuy.this;
                    if (!z2) {
                        uuyVar.x(null, null);
                        return;
                    }
                    uuyVar.x(czptVar.c, czptVar.b);
                    MessageIdType messageIdType = czptVar.e;
                    if (messageIdType.c()) {
                        return;
                    }
                    uuyVar.n(messageIdType, false);
                }
            };
            H.aZ = (Optional) H.ad.b();
            H.aZ.ifPresent(new Consumer() { // from class: utb
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ajvi ajviVar = (ajvi) obj;
                    aai aaiVar = new aai(ajviVar.a());
                    uuy uuyVar = uuy.this;
                    aaiVar.f(uuyVar.az);
                    ajviVar.d(uuyVar.az);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        emxf.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
    }

    @Override // defpackage.uwq
    protected final /* bridge */ /* synthetic */ ekky b() {
        return new ekkt(this, true);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final elds bb() {
        return this.c.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.c.e(eldsVar, z);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void be(elds eldsVar) {
        this.c.b = eldsVar;
    }

    @Override // defpackage.ellr
    public final elli e(ellf ellfVar) {
        return this.ag.a(ellfVar);
    }

    @Override // defpackage.ellr
    public final void f(Class cls, ellh ellhVar) {
        this.ag.b(cls, ellhVar);
    }

    @Override // defpackage.uwq, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    Object aX = aX();
                    eisx eisxVar = (eisx) ((akgo) aX).b.b.b();
                    ea eaVar = (ea) ((fbbb) ((akgo) aX).e).a;
                    ((akgo) aX).A();
                    czmw czmwVar = new czmw();
                    adtn adtnVar = (adtn) ((akgo) aX).a.nX.b();
                    czlc czlcVar = new czlc(czmwVar, adtnVar);
                    Optional optional = (Optional) ((akgo) aX).a.a.nl.b();
                    altk altkVar = (altk) ((akgo) aX).a.a.fP.b();
                    errl errlVar = (errl) ((akgo) aX).a.t.b();
                    errl errlVar2 = (errl) ((akgo) aX).a.p.b();
                    akzt akztVar = (akzt) ((akgo) aX).a.a.f.b();
                    aqgi aqgiVar = (aqgi) ((akgo) aX).A.b();
                    wpk wpkVar = (wpk) ((akgo) aX).v.b();
                    akis akisVar = ((akgo) aX).a;
                    uxa uxaVar = new uxa(errlVar, errlVar2, akztVar, aqgiVar, wpkVar, akisVar.a.lO, akisVar.cz);
                    deaj deajVar = (deaj) ((akgo) aX).u.b();
                    czkq czkqVar = (czkq) ((akgo) aX).a.b.hX.b();
                    upy upyVar = new upy(((akgo) aX).aZ, ((akgo) aX).a.cz, ((akgo) aX).ba, ((akgo) aX).bb, ((akgo) aX).bc, ((akgo) aX).bd);
                    alrv alrvVar = (alrv) ((akgo) aX).a.a.ej.b();
                    cuxz cuxzVar = (cuxz) ((akgo) aX).a.kf.b();
                    cuxh cuxhVar = (cuxh) ((akgo) aX).a.a.ae.b();
                    akis akisVar2 = ((akgo) aX).a;
                    urm urmVar = new urm(akisVar2.q, akisVar2.cz, ((akgo) aX).be);
                    ctud ctudVar = (ctud) ((akgo) aX).a.cT.b();
                    fbbf fbbfVar = ((akgo) aX).d.r;
                    ctwb ctwbVar = (ctwb) ((akgo) aX).a.a.c.b();
                    cqoh cqohVar = (cqoh) ((akgo) aX).a.cz.b();
                    akis akisVar3 = ((akgo) aX).a;
                    fbbf fbbfVar2 = akisVar3.a.Px;
                    axul axulVar = (axul) akisVar3.b.id.b();
                    Optional of = Optional.of((upl) ((akgo) aX).bk.b());
                    vyw vywVar = (vyw) ((akgo) aX).d.t.b();
                    bzqa bzqaVar = (bzqa) ((akgo) aX).a.cI.b();
                    Optional of2 = Optional.of((ddkk) ((akgo) aX).a.ob.b());
                    ejwl ejwlVar = (ejwl) ((akgo) aX).g.b();
                    ddxs ddxsVar = (ddxs) ((akgo) aX).bm.b();
                    bajc bajcVar = (bajc) ((akgo) aX).b.fE.b();
                    akkp akkpVar = ((akgo) aX).a.a;
                    uqd uqdVar = new uqd(akkpVar.af, akkpVar.xi);
                    sfy sfyVar = (sfy) ((akgo) aX).a.a.Pv.b();
                    urn urnVar = new urn((csuv) ((akgo) aX).a.b.f6if.b(), (sfy) ((akgo) aX).a.a.Pv.b());
                    Optional optional2 = (Optional) ((akgo) aX).b.fJ.b();
                    awti awtiVar = (awti) ((akgo) aX).a.ju.b();
                    cqtw cqtwVar = (cqtw) ((akgo) aX).a.jO.b();
                    errm errmVar = (errm) ((akgo) aX).a.p.b();
                    ejlq ejlqVar = (ejlq) ((akgo) aX).f.b();
                    ejxn ejxnVar = (ejxn) ((akgo) aX).n.b();
                    elhn V = ((akgo) aX).V();
                    Optional optional3 = (Optional) ((akgo) aX).bn.b();
                    Optional optional4 = (Optional) ((akgo) aX).bo.b();
                    Optional optional5 = (Optional) ((akgo) aX).b.fr.b();
                    elbx elbxVar = (elbx) ((akgo) aX).b.ap.b();
                    fbbf fbbfVar3 = ((akgo) aX).b.fo;
                    fbbf fbbfVar4 = ((akgo) aX).bt;
                    fbbf fbbfVar5 = ((akgo) aX).bw;
                    akkp akkpVar2 = ((akgo) aX).a.a;
                    cxom cxomVar = new cxom(akkpVar2.Px, akkpVar2.fP, Optional.of(new cxpi()));
                    fbbf fbbfVar6 = ((akgo) aX).bx;
                    fazb a = fbaz.a(((akgo) aX).bz);
                    ecmt ecmtVar = (ecmt) ((akgo) aX).a.fK.b();
                    wgh wghVar = new wgh((elbx) ((akgo) aX).b.ap.b(), ((akgo) aX).a.a.ej, (wpk) ((akgo) aX).v.b());
                    akis akisVar4 = ((akgo) aX).a;
                    uqp uqpVar = new uqp(akisVar4.t, akisVar4.p, ((akgo) aX).v, ((akgo) aX).A, akisVar4.cI, akisVar4.kk);
                    Context context2 = (Context) ((akgo) aX).a.q.b();
                    ea eaVar2 = (ea) ((fbbb) ((akgo) aX).e).a;
                    ejlq ejlqVar2 = (ejlq) ((akgo) aX).f.b();
                    cvqc A = ((akgo) aX).d.A();
                    aqcc aU = ((akgo) aX).a.a.aU();
                    wfj h = ((wff) ((fbas) ((ekki) ((akgo) aX).d.j.b()).a).aX()).h();
                    h.getClass();
                    Optional of3 = Optional.of(new wfz(context2, eaVar2, ejlqVar2, A, aU, h));
                    Optional of4 = Optional.of(new cztp());
                    fbbf fbbfVar7 = ((akgo) aX).bA;
                    uaj b = ((akgo) aX).b();
                    fbbf fbbfVar8 = ((akgo) aX).a.a.fo;
                    fazb a2 = fbaz.a(((akgo) aX).bC);
                    fazb a3 = fbaz.a(((akgo) aX).bD);
                    fbbf fbbfVar9 = ((akgo) aX).d.u;
                    adgn adgnVar = (adgn) ((akgo) aX).x.b();
                    fbbf fbbfVar10 = ((akgo) aX).t;
                    fazb a4 = fbaz.a(((akgo) aX).bE);
                    Optional of5 = Optional.of(new ajuf());
                    fazb a5 = fbaz.a(((akgo) aX).a.a.ap);
                    fbbf fbbfVar11 = ((akgo) aX).bF;
                    fbbf fbbfVar12 = ((akgo) aX).bG;
                    fbbf fbbfVar13 = ((akgo) aX).bH;
                    akhy akhyVar = ((akgo) aX).b;
                    this.a = new uuy(eisxVar, eaVar, czlcVar, optional, altkVar, uxaVar, deajVar, czkqVar, upyVar, alrvVar, cuxzVar, cuxhVar, urmVar, ctudVar, fbbfVar, ctwbVar, cqohVar, fbbfVar2, axulVar, of, vywVar, bzqaVar, of2, ejwlVar, ddxsVar, bajcVar, uqdVar, sfyVar, urnVar, optional2, awtiVar, cqtwVar, errmVar, ejlqVar, ejxnVar, V, optional3, optional4, optional5, elbxVar, fbbfVar3, fbbfVar4, fbbfVar5, cxomVar, fbbfVar6, a, ecmtVar, wghVar, uqpVar, of3, of4, fbbfVar7, b, fbbfVar8, a2, a3, fbbfVar9, adgnVar, fbbfVar10, a4, of5, a5, fbbfVar11, fbbfVar12, fbbfVar13, akhyVar.cR, ((akgo) aX).a.b.f21io, ((akgo) aX).bI, ((akgo) aX).bJ, akhyVar.gR, ((akgo) aX).bK, ((akgo) aX).aa(), (asix) ((akgo) aX).a.a.pR.b(), ((akgo) aX).a.a.nV);
                    this.Z.c(new ekkg(this.c, this.e));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aO = aO();
            LayoutInflater cloneInContext = aO.cloneInContext(new ekkz.a(aO, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new ekkn(this, cloneInContext));
            ekyf.q();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void h(Bundle bundle) {
        ejxi axoqVar;
        ejxi axoqVar2;
        this.c.k();
        try {
            aY(bundle);
            final uuy H = H();
            H.ar.c(bundle);
            H.as.c(bundle);
            H.at.c(bundle);
            H.au.c(bundle);
            H.av.c(bundle);
            wgh wghVar = H.C;
            if (bundle == null) {
                ((alrv) wghVar.b.b()).e(alrv.w);
            }
            H.M.g(R.id.outgoing_reactions_count_subscription, new vez((vfa) H.B.b()), new uua(H));
            final boolean z = true;
            final boolean z2 = ((Boolean) ((cfup) czur.a.get()).e()).booleanValue() && ((Optional) H.V.b()).isPresent();
            ejxn ejxnVar = H.M;
            if (z2) {
                axoqVar = ((czvg) ((Optional) H.V.b()).get()).b();
            } else {
                axoqVar = new axoq(false);
            }
            ejxnVar.g(R.id.suggestion_shortcut_dialog_subscription, axoqVar, new ejxk() { // from class: urq
                @Override // defpackage.ejxk
                public final /* synthetic */ void a(Throwable th) {
                    ejxj.a(th);
                }

                @Override // defpackage.ejxk
                public final void b(Object obj) {
                    Boolean bool = (Boolean) obj;
                    if (z2) {
                        uuy uuyVar = uuy.this;
                        if (uuyVar.au.b() || !Boolean.TRUE.equals(bool)) {
                            return;
                        }
                        czum czumVar = new czum();
                        fbae.e(czumVar);
                        czumVar.t(uuyVar.e.I(), "SuggestionShortcutDialogFragment");
                        ((czvg) ((Optional) uuyVar.V.b()).get()).e();
                        uuyVar.au.d();
                    }
                }
            });
            if (!((Boolean) ((cfup) czur.a.get()).e()).booleanValue() || !((Optional) H.V.b()).isPresent()) {
                z = false;
            }
            ejxn ejxnVar2 = H.M;
            if (z) {
                axoqVar2 = ((czvg) ((Optional) H.V.b()).get()).a();
            } else {
                axoqVar2 = new axoq("");
            }
            ejxnVar2.g(R.id.star_toolstone_subscription, axoqVar2, new ejxk() { // from class: usm
                @Override // defpackage.ejxk
                public final /* synthetic */ void a(Throwable th) {
                    ejxj.a(th);
                }

                @Override // defpackage.ejxk
                public final void b(Object obj) {
                    String str = (String) obj;
                    if (z && ((Boolean) ((cfup) czur.b.get()).e()).booleanValue()) {
                        uuy uuyVar = uuy.this;
                        if (uuyVar.av.b() || TextUtils.isEmpty(str)) {
                            return;
                        }
                        axnw.h(((crlo) uuyVar.X.b()).e(uuyVar.ap, bdhb.b(str)));
                        ((czvg) ((Optional) uuyVar.V.b()).get()).f();
                        uuyVar.av.d();
                    }
                }
            });
            final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: utj
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConversationMessageView conversationMessageView = (ConversationMessageView) view.getTag(R.id.conversation_message_view_clickable_tag);
                    uuy uuyVar = uuy.this;
                    if (!uuyVar.v.f()) {
                        if (conversationMessageView != null) {
                            uuyVar.I(conversationMessageView.e, 2);
                            uuyVar.o(conversationMessageView);
                            return;
                        } else {
                            if (!(view instanceof czid)) {
                                return;
                            }
                            if (view instanceof ConversationMessageView) {
                                uuyVar.k();
                                uuyVar.l();
                                return;
                            }
                        }
                    }
                    if (view.getTag(R.id.reply_snippet_tag) != null) {
                        MessageIdType b = bdhb.b((String) view.getTag(R.id.reply_snippet_tag));
                        if (b.c()) {
                            return;
                        }
                        uuyVar.n(b, true);
                        return;
                    }
                    if (view instanceof ConversationMessageView) {
                        czid czidVar = (czid) view;
                        uuyVar.I(czidVar.c(), 2);
                        uuyVar.o(czidVar);
                    } else if (conversationMessageView != null) {
                        uuyVar.I(conversationMessageView.e, 2);
                        uuyVar.o(conversationMessageView);
                    }
                }
            };
            elay elayVar = new elay(H.P, "MessageListFragmentPeer#onCreate.onClick", new View.OnClickListener() { // from class: utk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cfup cfupVar = uuy.a;
                    onClickListener.onClick(view);
                }
            });
            final View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: utl
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    ConversationMessageView conversationMessageView = (ConversationMessageView) view.getTag(R.id.conversation_message_view_clickable_tag);
                    uuy uuyVar = uuy.this;
                    if (conversationMessageView != null) {
                        uuyVar.C(conversationMessageView);
                        uuyVar.D(conversationMessageView);
                        uuyVar.w(conversationMessageView.e);
                        view.performHapticFeedback(0);
                        return true;
                    }
                    if (!(view instanceof czid)) {
                        return false;
                    }
                    if (!(view instanceof ConversationMessageView)) {
                        uuyVar.w(((czid) view).c());
                        return true;
                    }
                    uuyVar.k();
                    uuyVar.l();
                    return true;
                }
            };
            elbv elbvVar = new elbv(H.P, "MessageListFragmentPeer#onCreate.onLongClick", new View.OnLongClickListener() { // from class: utm
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    cfup cfupVar = uuy.a;
                    return onLongClickListener.onLongClick(view);
                }
            });
            H.e.fe();
            H.aA = new PinnedLinearLayoutManager();
            upy upyVar = H.m;
            eg fe = H.e.fe();
            PinnedLinearLayoutManager pinnedLinearLayoutManager = H.aA;
            uqz uqzVar = (uqz) upyVar.a.b();
            uqzVar.getClass();
            cqoh cqohVar = (cqoh) upyVar.b.b();
            cqohVar.getClass();
            ups upsVar = (ups) upyVar.c.b();
            upsVar.getClass();
            uqj uqjVar = (uqj) upyVar.d.b();
            uqjVar.getClass();
            ffbr ffbrVar = upyVar.e;
            Optional optional = (Optional) upyVar.f.b();
            optional.getClass();
            pinnedLinearLayoutManager.getClass();
            H.aB = new upx(uqzVar, cqohVar, upsVar, uqjVar, ffbrVar, optional, fe, pinnedLinearLayoutManager, H, elayVar, elbvVar);
            ((ddya) H.Z.b()).h(((Integer) uvp.d.e()).intValue(), R.layout.conversation_message_view);
            Context z3 = H.e.z();
            z3.getClass();
            ddxz ddxzVar = new ddxz(z3, new ddxy() { // from class: utn
                @Override // defpackage.ddxy
                public final wr a(ViewGroup viewGroup, int i, LayoutInflater layoutInflater) {
                    uuy uuyVar = uuy.this;
                    return new cxqa((cxqb) uuyVar.aB.f.a.get(i), uuyVar.aB.c.G(viewGroup, i, layoutInflater));
                }
            });
            we weVar = (we) H.Z.b();
            Context z4 = H.e.z();
            z4.getClass();
            ((ddyf) H.aa.b()).g(new ddye(ddxzVar, weVar, z4, ((Integer) uvp.d.e()).intValue(), R.layout.conversation_message_view, 3));
            H.e.P().c((lkq) H.aa.b());
            H.e.P().c(H.aB);
            H.L.k(H.ah);
            H.L.k(H.ai);
            H.L.k(H.aj);
            H.L.k(H.ak);
            H.L.k(H.al);
            H.L.k(H.am);
            H.L.k(H.an);
            ((Optional) H.k.b()).ifPresent(new Consumer() { // from class: uto
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    uuy uuyVar = uuy.this;
                    ((ahjw) obj).b(uuyVar.aB.c, new uts(uuyVar));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ((Optional) H.l.b()).ifPresent(new Consumer() { // from class: utp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    uuy uuyVar = uuy.this;
                    ((aivc) obj).b(uuyVar.aB.c, new ute(uuyVar), uuyVar.as.b());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            H.M.g(R.id.typing_indicator_data_local_subscription, new awtg(H.z), new uuc(H));
            H.M.g(R.id.file_transfer_progress_data_local_subscription, new cqtv(H.A), new uub(H));
            H.u.ifPresent(new Consumer() { // from class: utq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    Iterator it = ((upl) obj).a.iterator();
                    while (it.hasNext()) {
                        ((upk) it.next()).d(uuy.this.e);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            H.R.ifPresent(new Consumer() { // from class: utr
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((wfv) obj).a();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            H.L.k(((arcs) H.ac.b()).d);
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.efaf, defpackage.ea
    public final void j() {
        elav a = this.c.a();
        try {
            bg();
            this.ah = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void k(Bundle bundle) {
        this.c.k();
        try {
            bj(bundle);
            uuy H = H();
            ArrayList<? extends Parcelable> arrayList = H.aK;
            if (arrayList != null) {
                bundle.putParcelableArrayList("attachmentDataToSaveKey", arrayList);
            }
            Parcelable parcelable = H.d;
            if (parcelable != null) {
                bundle.putParcelable("conversationViewState", parcelable);
            }
            H.ar.a(bundle);
            H.as.a(bundle);
            H.at.a(bundle);
            H.au.a(bundle);
            H.av.a(bundle);
            H.u.ifPresent(new Consumer() { // from class: usb
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cfup cfupVar = uuy.a;
                    Iterator it = ((upl) obj).a.iterator();
                    while (it.hasNext()) {
                        ((upk) it.next()).e();
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void l() {
        this.c.k();
        try {
            bk();
            final uuy H = H();
            H.i.a(H.az);
            H.O.ifPresent(new Consumer() { // from class: usx
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    czqb czqbVar = (czqb) obj;
                    czqa czqaVar = uuy.this.aE;
                    if (czqaVar != null) {
                        czqbVar.a(czqaVar);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void m() {
        this.c.k();
        try {
            bl();
            final uuy H = H();
            ArrayList arrayList = new ArrayList();
            baae baaeVar = H.i.a;
            baaeVar.a.lock();
            try {
                for (baad baadVar : baaeVar.b.values()) {
                    if (baadVar.c == 2) {
                        arrayList.add(baadVar);
                    }
                }
                baaeVar.b.clear();
                baaeVar.a.unlock();
                baaeVar.a(arrayList);
                H.O.ifPresent(new Consumer() { // from class: usw
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        czqb czqbVar = (czqb) obj;
                        czqa czqaVar = uuy.this.aE;
                        if (czqaVar != null) {
                            czqbVar.d(czqaVar);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                ekyf.q();
            } catch (Throwable th) {
                baaeVar.a.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                ekyf.q();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.uwq, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

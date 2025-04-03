package com.google.android.apps.messaging.main;

import android.app.Activity;
import android.app.assist.AssistContent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import defpackage.a;
import defpackage.adhm;
import defpackage.adhu;
import defpackage.adsg;
import defpackage.adzz;
import defpackage.aedh;
import defpackage.ahpd;
import defpackage.ahpj;
import defpackage.ahqe;
import defpackage.ahqj;
import defpackage.ahqt;
import defpackage.ahqu;
import defpackage.ahqv;
import defpackage.aijd;
import defpackage.akgb;
import defpackage.akis;
import defpackage.akko;
import defpackage.akkp;
import defpackage.amet;
import defpackage.asqd;
import defpackage.athn;
import defpackage.ayfg;
import defpackage.aygl;
import defpackage.bcqs;
import defpackage.ctvs;
import defpackage.cwml;
import defpackage.dvvb;
import defpackage.ea;
import defpackage.ecda;
import defpackage.ecgk;
import defpackage.ecqk;
import defpackage.eg;
import defpackage.ekhr;
import defpackage.ekht;
import defpackage.ekhu;
import defpackage.ekke;
import defpackage.ekkf;
import defpackage.ekks;
import defpackage.ekwr;
import defpackage.ekyf;
import defpackage.ekzm;
import defpackage.ekzz;
import defpackage.elav;
import defpackage.elay;
import defpackage.elbx;
import defpackage.eldl;
import defpackage.eleg;
import defpackage.ellg;
import defpackage.ellj;
import defpackage.ellt;
import defpackage.emye;
import defpackage.enrr;
import defpackage.ensk;
import defpackage.ente;
import defpackage.fazw;
import defpackage.fbaz;
import defpackage.fbbf;
import defpackage.ffig;
import defpackage.ffji;
import defpackage.ffkj;
import defpackage.ffsk;
import defpackage.ik;
import defpackage.im;
import defpackage.lkk;
import defpackage.lkv;
import defpackage.set;
import defpackage.sfl;
import defpackage.sfr;
import defpackage.tam;
import defpackage.tvt;
import defpackage.typ;
import defpackage.uxv;
import defpackage.vvb;
import defpackage.vvn;
import defpackage.vxl;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Consumer;
import java.util.function.Function;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MainActivity extends ahpd implements ekhu, ekhr, ekke {
    private boolean L;
    private Context M;
    private lkv O;
    private boolean P;
    private ahqt n;
    private final ekwr K = new ekwr(this, this);
    private final long N = SystemClock.elapsedRealtime();

    private final ahqt af() {
        ag();
        return this.n;
    }

    private final void ag() {
        Throwable th;
        if (this.n != null) {
            return;
        }
        if (!this.L) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        }
        if (this.P && !isFinishing()) {
            throw new IllegalStateException("createPeer() called after destroyed.");
        }
        ekzz f = eleg.f("CreateComponent");
        try {
            aX();
            f.close();
            ekzz f2 = eleg.f("CreatePeer");
            try {
                try {
                    try {
                        Object aX = aX();
                        Activity activity = (Activity) ((akgb) aX).d.b();
                        if (!(activity instanceof MainActivity)) {
                            throw new IllegalStateException(a.I(activity, ahqt.class, "Attempt to inject a Activity wrapper of type "));
                        }
                        MainActivity mainActivity = (MainActivity) activity;
                        mainActivity.getClass();
                        akis akisVar = ((akgb) aX).b;
                        fbbf fbbfVar = akisVar.cz;
                        fbbf fbbfVar2 = ((akgb) aX).as;
                        akkp akkpVar = akisVar.a;
                        fbbf fbbfVar3 = akkpVar.nW;
                        fbbf fbbfVar4 = akkpVar.f;
                        fbbf fbbfVar5 = ((akgb) aX).au;
                        fbbf fbbfVar6 = akisVar.gy;
                        fbbf fbbfVar7 = akisVar.b.le;
                        fbbf fbbfVar8 = akkpVar.ej;
                        fbbf fbbfVar9 = ((akgb) aX).c.e;
                        fbbf fbbfVar10 = akkpVar.Px;
                        fbbf fbbfVar11 = akkpVar.fP;
                        fbbf fbbfVar12 = ((akgb) aX).e;
                        elbx elbxVar = (elbx) akisVar.aJ.b();
                        fbbf fbbfVar13 = ((akgb) aX).ay;
                        tam tamVar = (tam) ((akgb) aX).m.b();
                        uxv uxvVar = (uxv) ((akgb) aX).az.b();
                        fbbf fbbfVar14 = ((akgb) aX).x;
                        fbbf fbbfVar15 = ((akgb) aX).aB;
                        Optional of = Optional.of(((akgb) aX).b.b.ok);
                        akko akkoVar = ((akgb) aX).b.b;
                        fbbf fbbfVar16 = akkoVar.c;
                        fbbf fbbfVar17 = ((akgb) aX).w;
                        set setVar = (set) akkoVar.nL.b();
                        fbbf fbbfVar18 = ((akgb) aX).aD;
                        fbbf fbbfVar19 = ((akgb) aX).aE;
                        fbbf fbbfVar20 = ((akgb) aX).an;
                        akis akisVar2 = ((akgb) aX).b;
                        fbbf fbbfVar21 = akisVar2.aZ;
                        fbbf fbbfVar22 = akisVar2.dQ;
                        fbbf fbbfVar23 = ((akgb) aX).aK;
                        fbbf fbbfVar24 = ((akgb) aX).ao;
                        fbbf fbbfVar25 = ((akgb) aX).D;
                        fbbf fbbfVar26 = akisVar2.b.ak;
                        fbbf fbbfVar27 = ((akgb) aX).ad;
                        fbbf fbbfVar28 = ((akgb) aX).aL;
                        fbbf fbbfVar29 = akisVar2.a.pP;
                        Optional empty = Optional.empty();
                        fbbf fbbfVar30 = ((akgb) aX).aM;
                        fbbf fbbfVar31 = ((akgb) aX).aO;
                        fbaz.a(((akgb) aX).aP);
                        Optional empty2 = Optional.empty();
                        fbbf fbbfVar32 = ((akgb) aX).aQ;
                        fbbf fbbfVar33 = ((akgb) aX).af;
                        akis akisVar3 = ((akgb) aX).b;
                        fbbf fbbfVar34 = akisVar3.b.jB;
                        akkp akkpVar2 = akisVar3.a;
                        fbbf fbbfVar35 = akkpVar2.ld;
                        ffsk ffskVar = (ffsk) akkpVar2.aq.b();
                        fbbf fbbfVar36 = ((akgb) aX).c.aw;
                        akis akisVar4 = ((akgb) aX).b;
                        akkp akkpVar3 = akisVar4.a;
                        fbbf fbbfVar37 = akkpVar3.Pt;
                        akko akkoVar2 = akisVar4.b;
                        this.n = new ahqt(mainActivity, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar8, fbbfVar9, fbbfVar10, fbbfVar11, fbbfVar12, elbxVar, fbbfVar13, tamVar, uxvVar, fbbfVar14, fbbfVar15, of, fbbfVar16, fbbfVar17, setVar, fbbfVar18, fbbfVar19, fbbfVar20, fbbfVar21, fbbfVar22, fbbfVar23, fbbfVar24, fbbfVar25, fbbfVar26, fbbfVar27, fbbfVar28, fbbfVar29, empty, fbbfVar30, fbbfVar31, empty2, fbbfVar32, fbbfVar33, fbbfVar34, fbbfVar35, ffskVar, fbbfVar36, fbbfVar37, akkoVar2.om, akkoVar2.nj, akkoVar2.on, akkoVar2.oo, akkpVar3.Q, akkpVar3.Fo, akkpVar3.nV, akkoVar2.op, akkpVar3.RR, (asqd) akkoVar2.oq.b());
                        f2.close();
                        this.n.O = this;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        try {
                            f2.close();
                            throw th;
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    f2.close();
                    throw th;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        } finally {
        }
    }

    @Override // defpackage.ekhr
    public final long D() {
        return this.N;
    }

    @Override // defpackage.cwqf
    public final /* synthetic */ fazw E() {
        return new ekks(this);
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return ahqt.class;
    }

    @Override // defpackage.ekhu
    public final /* bridge */ /* synthetic */ Object H() {
        ahqt ahqtVar = this.n;
        if (ahqtVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.P) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ahqtVar;
    }

    @Override // defpackage.cwps
    protected final boolean I() {
        return af().v.isEmpty();
    }

    @Override // defpackage.cwpv
    public final boolean K() {
        af().v.isPresent();
        return true;
    }

    @Override // defpackage.cwps
    protected final void L() {
        ahqt af = af();
        af.v.isPresent();
        if (af.n().e()) {
            ecqk.a.d(new ecda("HomeScreen"));
        } else if (af.n().d()) {
            ecqk.a.d(new ecda("ConversationScreen"));
        } else {
            super.L();
        }
    }

    public final void M(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final void N() {
        super.recreate();
    }

    public final void O(Toolbar toolbar) {
        super.n(toolbar);
    }

    @Override // defpackage.hl, defpackage.lkr
    public final lkk P() {
        if (this.O == null) {
            this.O = new ekkf(this);
        }
        return this.O;
    }

    @Override // defpackage.cwpv
    public final boolean Q() {
        return af().M();
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.M;
        }
        ellt.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.iy, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.M = context;
        ellt.a(context);
        super.attachBaseContext(context);
        this.M = null;
    }

    @Override // defpackage.cwqd, defpackage.cwpv, defpackage.cwps
    public final cwml eY() {
        af();
        return cwml.e;
    }

    @Override // defpackage.efac, android.app.Activity
    public final void finish() {
        elav a = this.K.a();
        try {
            super.finish();
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

    @Override // defpackage.cwpv
    protected final void fx(final im imVar) {
        super.fx(imVar);
        ahqt af = af();
        af.v.isPresent();
        if (af.N() && af.n().d()) {
            imVar.hide();
            return;
        }
        final vvn p = af.p();
        if ((af.m() == null || !af.n().c()) && p != null && af.n().d()) {
            if (!((Boolean) p.J(new Function() { // from class: vks
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    enru enruVar = vvn.a;
                    ((ugg) obj).w();
                    return false;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: vkt
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
                        czgd[] czgdVarArr = czgjVar.f;
                        int length = czgdVarArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= 2) {
                                break;
                            }
                            czgd czgdVar = czgdVarArr[i];
                            if (((czgdVar instanceof czfx) && !czgjVar.m) || !czgdVar.y()) {
                                i++;
                            } else if (czgdVar.t(im.this)) {
                                z = true;
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            })).booleanValue()) {
                eg G = p.N.G();
                if (G != null) {
                    imVar.setBackgroundDrawable(new ColorDrawable(G.getColor(R.color.color_primary_background_alpha96)));
                }
                if (!p.be() || p.bd()) {
                    imVar.setDisplayOptions(20);
                    imVar.setHomeAsUpIndicator(0);
                    imVar.setHomeActionContentDescription(p.p().getResources().getString(R.string.navigate_up_button_content_description));
                } else {
                    imVar.setDisplayOptions(16);
                }
                View customView = imVar.getCustomView();
                if (customView == null || customView.getId() != R.id.conversation_title_container) {
                    customView = LayoutInflater.from(p.p()).inflate(R.layout.action_bar_conversation_name, (ViewGroup) null);
                    imVar.setCustomView(customView, new ik(-1, -1));
                }
                if (p.cF == null) {
                    p.cD = (ViewGroup) customView.findViewById(R.id.conversation_title_container);
                    p.cE = (ContactIconView) customView.findViewById(R.id.action_bar_contact_icon);
                    p.cF = (TextView) customView.findViewById(R.id.conversation_title);
                    p.cG = (TextView) customView.findViewById(R.id.conversation_subtitle);
                    customView.addOnLayoutChangeListener(new vvb(p, customView));
                }
                ViewGroup viewGroup = p.cD;
                if (viewGroup != null) {
                    viewGroup.setOnClickListener(new elay(p.aT, "ConversationFragmentPeer#updateActionBar", new View.OnClickListener() { // from class: vlt
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            vvn vvnVar = vvn.this;
                            if (!vvnVar.N.aF()) {
                                ensk j = vvn.a.j();
                                j.Y(ente.a, "Bugle");
                                enrr enrrVar = (enrr) j;
                                enrrVar.Y(csux.p, vvnVar.M);
                                ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "getConversationNameClickListener", 6791, "ConversationFragmentPeer.java")).q("ConversationFragment: ConversationFragment has been detached when conversation name is clicked");
                                return;
                            }
                            bcqs bcqsVar = (bcqs) vvnVar.cA.a();
                            if (bcqsVar.d.y()) {
                                vvnVar.ab(2);
                            } else {
                                if (!bcqsVar.p()) {
                                    vvnVar.ab(2);
                                    return;
                                }
                                BusinessInfoData businessInfoData = bcqsVar.k;
                                ((altk) vvnVar.ae.b()).aH(2, eorw.BIZINFO_SOURCE_CONVERSATION_TITLE, businessInfoData == null ? null : businessInfoData.getRbmBotId());
                                vvnVar.ab(2);
                            }
                        }
                    }));
                }
                ContactIconView contactIconView = p.cE;
                if (contactIconView != null) {
                    contactIconView.n = false;
                    String str = ((typ) ((bcqs) p.cA.a()).d).j;
                    if (str == null) {
                        p.cE.i(null);
                    } else {
                        p.cE.i(Uri.parse(str));
                    }
                }
                p.aK();
                String K = p.K();
                if (TextUtils.isEmpty(K)) {
                    String Y = p.N.Y(R.string.app_name);
                    if (!p.be()) {
                        p.cF.setText(Y);
                        p.p().setTitle(Y);
                    }
                } else {
                    p.cF.setContentDescription((String) Collection.EL.stream(emye.d(", ").i(K)).map(new Function() { // from class: vnb
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            String str2 = (String) obj;
                            if (!dkut.w(str2)) {
                                return new SpannableString(str2);
                            }
                            vvn vvnVar = vvn.this;
                            return vvnVar.P.a(vvnVar.bq.n(str2));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.joining(", ")));
                    p.p().setTitle(K);
                }
                p.cF.invalidate();
                p.cF.requestLayout();
                if (!p.be()) {
                    if (p.aD.b && p.aG.n() && !p.bd()) {
                        imVar.hide();
                    } else {
                        imVar.show();
                    }
                }
                int[] iArr = new int[2];
                customView.getLocationInWindow(iArr);
                p.D = iArr[1] + customView.getMeasuredHeight();
            }
            if (af.n().b()) {
                imVar.setDisplayHomeAsUpEnabled(false);
            }
        }
        if (af.n().e()) {
            imVar.hide();
        } else {
            imVar.show();
        }
    }

    @Override // defpackage.efac, defpackage.eg
    public final void h(ea eaVar) {
        super.h(eaVar);
        ahqt af = af();
        af.v.isPresent();
        if (eaVar instanceof adzz) {
            af.A = ((adzz) eaVar).H();
        }
        aedh aedhVar = af.A;
        if (aedhVar != null) {
            aedhVar.aM = af;
        }
    }

    @Override // defpackage.iy
    public final boolean hq() {
        elav k = this.K.k();
        try {
            boolean hq = super.hq();
            k.close();
            return hq;
        } catch (Throwable th) {
            try {
                k.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.iy, android.app.Activity
    public final void invalidateOptionsMenu() {
        elav k = ekyf.k();
        try {
            super.invalidateOptionsMenu();
            k.close();
        } catch (Throwable th) {
            try {
                k.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cwqd, defpackage.iy
    public final void n(Toolbar toolbar) {
        af().J(toolbar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc A[Catch: all -> 0x00c5, TRY_LEAVE, TryCatch #0 {all -> 0x00c5, blocks: (B:3:0x0006, B:5:0x0020, B:7:0x0026, B:9:0x002c, B:11:0x0032, B:13:0x0040, B:15:0x0048, B:17:0x0056, B:21:0x006e, B:23:0x0074, B:27:0x0077, B:29:0x00bc, B:33:0x009e, B:34:0x00b1, B:35:0x00a8), top: B:2:0x0006 }] */
    @Override // defpackage.efac, defpackage.eg, defpackage.abe, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            ekwr r0 = r4.K
            elav r0 = r0.r()
            super.onActivityResult(r5, r6, r7)     // Catch: java.lang.Throwable -> Lc5
            ahqt r7 = r4.af()     // Catch: java.lang.Throwable -> Lc5
            j$.util.Optional r1 = r7.v     // Catch: java.lang.Throwable -> Lc5
            r1.isPresent()     // Catch: java.lang.Throwable -> Lc5
            cfup r1 = defpackage.csgj.q     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r1 = r1.e()     // Catch: java.lang.Throwable -> Lc5
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Lc5
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> Lc5
            if (r1 == 0) goto L67
            aedh r1 = r7.r()     // Catch: java.lang.Throwable -> Lc5
            if (r1 == 0) goto L67
            boolean r2 = defpackage.adhu.a()     // Catch: java.lang.Throwable -> Lc5
            if (r2 == 0) goto L67
            boolean r2 = defpackage.csgj.a()     // Catch: java.lang.Throwable -> Lc5
            if (r2 == 0) goto L67
            cfup r2 = defpackage.csgj.q     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r2 = r2.e()     // Catch: java.lang.Throwable -> Lc5
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Lc5
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Lc5
            if (r2 == 0) goto L67
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.bq     // Catch: java.lang.Throwable -> Lc5
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> Lc5
            if (r2 == 0) goto L67
            ffbr r2 = r1.au     // Catch: java.lang.Throwable -> Lc5
            fbbb r2 = (defpackage.fbbb) r2     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r2 = r2.a     // Catch: java.lang.Throwable -> Lc5
            j$.util.Optional r2 = (j$.util.Optional) r2     // Catch: java.lang.Throwable -> Lc5
            boolean r2 = r2.isPresent()     // Catch: java.lang.Throwable -> Lc5
            if (r2 == 0) goto L67
            ffbr r1 = r1.au     // Catch: java.lang.Throwable -> Lc5
            fbbb r1 = (defpackage.fbbb) r1     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r1 = r1.a     // Catch: java.lang.Throwable -> Lc5
            j$.util.Optional r1 = (j$.util.Optional) r1     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lc5
            tiv r1 = (defpackage.tiv) r1     // Catch: java.lang.Throwable -> Lc5
            r1.a()     // Catch: java.lang.Throwable -> Lc5
        L67:
            r1 = 2
            r2 = 1
            r3 = -1
            if (r5 != r1) goto L98
            if (r6 != r3) goto Lba
            vvn r5 = r7.p()     // Catch: java.lang.Throwable -> Lc5
            if (r5 == 0) goto L77
            r5.cL = r2     // Catch: java.lang.Throwable -> Lc5
            goto Lc1
        L77:
            enru r5 = defpackage.ahqt.a     // Catch: java.lang.Throwable -> Lc5
            ensk r5 = r5.i()     // Catch: java.lang.Throwable -> Lc5
            ensn r6 = defpackage.ente.a     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r7 = "Bugle"
            r5.Y(r6, r7)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r6 = "com/google/android/apps/messaging/main/MainActivityPeer"
            java.lang.String r7 = "onActivityResult"
            java.lang.String r1 = "MainActivityPeer.kt"
            r2 = 2054(0x806, float:2.878E-42)
            ensk r5 = r5.h(r6, r7, r2, r1)     // Catch: java.lang.Throwable -> Lc5
            enrr r5 = (defpackage.enrr) r5     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r6 = "ConversationFragment is missing after launching AttachmentChooserActivity!"
            r5.q(r6)     // Catch: java.lang.Throwable -> Lc5
            goto Lc1
        L98:
            r1 = 1038(0x40e, float:1.455E-42)
            if (r5 != r1) goto Lba
            if (r6 != r3) goto La8
            com.google.android.apps.messaging.main.MainActivity r5 = r7.b     // Catch: java.lang.Throwable -> Lc5
            r6 = 2132085331(0x7f150a53, float:1.9810858E38)
            java.lang.String r5 = r5.getString(r6)     // Catch: java.lang.Throwable -> Lc5
            goto Lb1
        La8:
            com.google.android.apps.messaging.main.MainActivity r5 = r7.b     // Catch: java.lang.Throwable -> Lc5
            r6 = 2132085332(0x7f150a54, float:1.981086E38)
            java.lang.String r5 = r5.getString(r6)     // Catch: java.lang.Throwable -> Lc5
        Lb1:
            r5.getClass()     // Catch: java.lang.Throwable -> Lc5
            com.google.android.apps.messaging.main.MainActivity r6 = r7.b     // Catch: java.lang.Throwable -> Lc5
            defpackage.aens.b(r6, r5)     // Catch: java.lang.Throwable -> Lc5
            goto Lc1
        Lba:
            if (r6 != r2) goto Lc1
            com.google.android.apps.messaging.main.MainActivity r5 = r7.b     // Catch: java.lang.Throwable -> Lc5
            r5.finish()     // Catch: java.lang.Throwable -> Lc5
        Lc1:
            r0.close()
            return
        Lc5:
            r5 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lca
            goto Lce
        Lca:
            r6 = move-exception
            r5.addSuppressed(r6)
        Lce:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.main.MainActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // defpackage.efac, android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        elav b = this.K.b();
        try {
            super.onAttachedToWindow();
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

    @Override // defpackage.efac, defpackage.abe, android.app.Activity
    public final void onBackPressed() {
        elav c = this.K.c();
        try {
            super.onBackPressed();
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, defpackage.iy, defpackage.abe, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ViewTreeObserver viewTreeObserver;
        elav s = this.K.s();
        try {
            super.onConfigurationChanged(configuration);
            ahqt af = af();
            af.v.isPresent();
            vvn p = af.p();
            if (p != null) {
                p.G();
            }
            if (ahpj.a(af.b, af.i.a) != af.G) {
                View findViewById = af.b.findViewById(android.R.id.content);
                if (findViewById != null && (viewTreeObserver = findViewById.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnPreDrawListener(new ahqj(af, findViewById));
                }
                af.H();
            }
            s.close();
        } catch (Throwable th) {
            try {
                s.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ekko, java.lang.Object] */
    @Override // defpackage.cwqd, defpackage.cwpv, defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        elav t = this.K.t();
        try {
            this.L = true;
            ag();
            ((ekkf) P()).h(this.K);
            aX().aP().a();
            af().D(bundle);
            ellg.a(this).b = findViewById(android.R.id.content);
            ahqt ahqtVar = this.n;
            ellj.a(this, aijd.class, new ahqu(ahqtVar));
            ellj.a(this, adhm.class, new ahqv(ahqtVar));
            this.L = false;
            this.K.m();
            t.close();
        } catch (Throwable th) {
            try {
                t.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.abe, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        elav u = this.K.u();
        try {
            super.onCreatePanelMenu(i, menu);
            u.close();
            return true;
        } catch (Throwable th) {
            try {
                u.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cwqf, defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    public final void onDestroy() {
        MessageCoreData messageCoreData;
        elav d = this.K.d();
        try {
            super.onDestroy();
            ahqt af = af();
            af.v.isPresent();
            vvn p = af.p();
            if (p != null) {
                ensk h = ahqt.a.h();
                h.Y(ente.a, "Bugle");
                ((enrr) h.h("com/google/android/apps/messaging/main/MainActivityPeer", "onDestroy", 1138, "MainActivityPeer.kt")).t("DRAFTBUG(b/348065860): tempDraftMessageData set", p.G());
                messageCoreData = p.G();
            } else {
                messageCoreData = null;
            }
            af.M = messageCoreData;
            this.P = true;
            d.close();
        } catch (Throwable th) {
            try {
                d.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, android.app.Activity
    public final void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        ahqt af = af();
        cancellationSignal.getClass();
        consumer.getClass();
        sfr sfrVar = af.K;
        if (sfrVar == null || !((Boolean) sfl.a.e()).booleanValue()) {
            super.onGetDirectActions(cancellationSignal, consumer);
        } else {
            sfrVar.a().c.b(consumer);
        }
    }

    @Override // defpackage.efac, defpackage.abe, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        elav e = this.K.e(intent);
        try {
            super.onNewIntent(intent);
            ahqt af = af();
            intent.getClass();
            af.v.isPresent();
            ensk h = ahqt.a.h();
            h.Y(ente.a, "Bugle");
            ((enrr) h.h("com/google/android/apps/messaging/main/MainActivityPeer", "onNewIntent", 792, "MainActivityPeer.kt")).J("DRAFTBUG(b/348065860): onNewIntent: conversationId: %s, hasComposeRowState: %s, timestamp: %d", af.u(intent), Boolean.valueOf(aygl.e(intent)), Long.valueOf(intent.getLongExtra("intent_timestamp", 0L)));
            ConversationId u = af.u(intent);
            if (u == null || ffkj.e(u, af.t())) {
                af.L = true;
                MainActivity mainActivity = af.b;
                MessageCoreData v = af.v(intent, new ecgk("mayAddConversationIdToIntent"));
                if (u == null && (v != null || intent.getBooleanExtra("open_keyboard", false))) {
                    amet.d(af.n().c, intent, false);
                }
                mainActivity.setIntent(intent);
                ensk h2 = ahqt.a.h();
                h2.Y(ente.a, "Bugle");
                ((enrr) h2.h("com/google/android/apps/messaging/main/MainActivityPeer", "handleDraftUpdateForConversationOne", 896, "MainActivityPeer.kt")).q("DRAFTBUG(b/348065860): handleDraftUpdateForConversationOne invoked");
                vvn p = af.p();
                MessageCoreData v2 = af.v(intent, new ecgk("handleDraftUpdateForConversationOne"));
                if (p != null && v2 != null) {
                    p.aL(v2, intent.getBooleanExtra("combine_draft", false));
                    ahqe.a(intent);
                }
            } else {
                Bundle extras = intent.getExtras();
                Integer valueOf = Integer.valueOf(intent.getIntExtra("conversation_state", 1));
                MessageCoreData messageCoreData = (MessageCoreData) intent.getParcelableExtra("draft_data");
                ensk h3 = ahqt.a.h();
                h3.Y(ente.a, "Bugle");
                ((enrr) h3.h("com/google/android/apps/messaging/main/MainActivityPeer", "handleNewIntentV2", 823, "MainActivityPeer.kt")).t("DRAFTBUG(b/348065860): handleNewIntentV2 launching with draft data. draftCoreData: %s", messageCoreData);
                ((ayfg) af.c.b()).u(af.b, u, valueOf, messageCoreData, intent.getBooleanExtra("open_keyboard", false), extras);
                af.b.finish();
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.cwpv, defpackage.efac, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        elav w = this.K.w();
        try {
            ahqt af = af();
            menuItem.getClass();
            af.v.isPresent();
            boolean z = true;
            if (!super.onOptionsItemSelected(menuItem)) {
                if (menuItem.getItemId() == 16908332) {
                    af.E();
                } else {
                    z = false;
                }
            }
            w.close();
            return z;
        } catch (Throwable th) {
            try {
                w.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cwpv, defpackage.cwps, defpackage.efac, defpackage.eg, android.app.Activity
    protected final void onPause() {
        elav f = this.K.f();
        try {
            super.onPause();
            ahqt af = af();
            af.v.isPresent();
            af.E = true;
            ((dvvb) af.e.b()).b();
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

    @Override // defpackage.efac, android.app.Activity
    public final void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, Consumer consumer) {
        ahqt af = af();
        str.getClass();
        bundle.getClass();
        cancellationSignal.getClass();
        consumer.getClass();
        sfr sfrVar = af.K;
        if (sfrVar == null || !((Boolean) sfl.a.e()).booleanValue()) {
            return;
        }
        sfrVar.a().c.a(str, bundle, consumer);
    }

    @Override // defpackage.abe, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        elav x = this.K.x();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            x.close();
        } catch (Throwable th) {
            try {
                x.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, defpackage.iy, android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        elav y = this.K.y();
        try {
            super.onPostCreate(bundle);
            y.close();
        } catch (Throwable th) {
            try {
                y.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onPostResume() {
        elav g = this.K.g();
        try {
            super.onPostResume();
            g.close();
        } catch (Throwable th) {
            try {
                g.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cwpv, defpackage.efac, android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        elav k = ekyf.k();
        try {
            boolean onPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            k.close();
            return onPrepareOptionsMenu;
        } catch (Throwable th) {
            try {
                k.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        vxl q;
        super.onProvideAssistContent(assistContent);
        ahqt af = af();
        assistContent.getClass();
        af.v.isPresent();
        vvn p = af.p();
        if (p != null && p.aY()) {
            ConversationId t = af.t();
            String b = t != null ? t.b() : null;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("conversation_type", p.bh() ? "Individual" : "Group").put("conversation_id", b);
            } catch (JSONException e) {
                ensk j = ahqt.a.j();
                j.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/main/MainActivityPeer", "onProvideAssistContent", 2190, "MainActivityPeer.kt")).q("Error parsing ConversationData for Assistant");
            }
            assistContent.setStructuredData(jSONObject.toString());
            assistContent.getIntent().putExtra("conversation_id", b);
            ConversationId t2 = af.t();
            if (t2 != null) {
                assistContent.getIntent().putExtra("mapi_conversation_id", t2);
            }
        }
        if (!((athn) af.y.b()).a() || (q = af.q()) == null) {
            return;
        }
        q.f(assistContent);
    }

    @Override // defpackage.cwps, defpackage.efac, defpackage.eg, defpackage.abe, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        elav z = this.K.z();
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            z.close();
        } catch (Throwable th) {
            try {
                z.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cwpv, defpackage.cwps, android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        ahqt af = af();
        af.v.isPresent();
        if (adhu.b() || adhu.a()) {
            Optional optional = (Optional) af.r.b();
            final ffji ffjiVar = new ffji() { // from class: ahpt
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    adht adhtVar = (adht) obj;
                    adhtVar.getClass();
                    adhtVar.c = true;
                    return ffcu.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: ahpu
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
    }

    @Override // defpackage.cwpv, defpackage.cwps, defpackage.efac, defpackage.eg, android.app.Activity
    protected final void onResume() {
        elav h = this.K.h();
        try {
            super.onResume();
            final ahqt af = af();
            ekzz f = eleg.f("MainActivity#onResume");
            try {
                af.v.isPresent();
                af.D = false;
                af.E = false;
                ((dvvb) af.e.b()).a(((adsg) af.h.b()).a(af.b, null));
                af.K();
                if (af.L) {
                    ensk h2 = ahqt.a.h();
                    h2.Y(ente.a, "Bugle");
                    ((enrr) h2.h("com/google/android/apps/messaging/main/MainActivityPeer", "mayRefreshUiStateOnResume", 859, "MainActivityPeer.kt")).q("DRAFTBUG(b/348065860): mayRefreshUiStateOnResume");
                    Intent intent = af.b.getIntent();
                    intent.getClass();
                    af.G(intent, null, true);
                    af.F(intent, intent.getBooleanExtra("via_notification", false));
                    af.L = false;
                }
                if (!((ctvs) af.o.b()).d() && af.n().c() && af.k() != null) {
                    af.I();
                }
                if (adhu.b() || adhu.a()) {
                    Optional optional = (Optional) af.r.b();
                    final ffji ffjiVar = new ffji() { // from class: ahpo
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            adht adhtVar = (adht) obj;
                            adhtVar.getClass();
                            eito eitoVar = (eito) ahqt.this.l.b();
                            eisx eisxVar = adhtVar.a.a;
                            if (adhtVar.c && eisxVar != null && !Objects.equals(adhtVar.b, eisxVar)) {
                                eitoVar.b(eisxVar);
                            }
                            adhtVar.c = false;
                            return ffcu.a;
                        }
                    };
                    optional.ifPresent(new Consumer() { // from class: ahpp
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
                h.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                h.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cwps, defpackage.efac, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        elav A = this.K.A();
        try {
            super.onSaveInstanceState(bundle);
            ahqt af = af();
            bundle.getClass();
            af.v.isPresent();
            bundle.putParcelable("uistate", af.n().clone());
            bundle.putParcelable("usstate", af.o());
            bundle.putBoolean("rcscapabilityupdate", af.H);
            bundle.putBoolean("shouldclearactivitystack", af.I);
            af.D = true;
            A.close();
        } catch (Throwable th) {
            try {
                A.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cwpv, defpackage.cwps, defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onStart() {
        elav i = this.K.i();
        try {
            super.onStart();
            ahqt af = af();
            ekzz f = eleg.f("MainActivity#onStart");
            try {
                af.v.isPresent();
                af.F = false;
                ffig.a(f, null);
                i.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                i.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cwpv, defpackage.cwps, defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onStop() {
        elav j = this.K.j();
        try {
            super.onStop();
            ahqt af = af();
            af.v.isPresent();
            af.F = true;
            j.close();
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, android.app.Activity
    public final void onUserInteraction() {
        elav l = this.K.l();
        try {
            super.onUserInteraction();
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        vvn p;
        super.onWindowFocusChanged(z);
        ahqt af = af();
        af.v.isPresent();
        ekzm b = af.g.b("ConversationActivityPeer onWindowFocusChanged");
        try {
            if (!((Boolean) tvt.a.e()).booleanValue()) {
                if (z && (p = af.p()) != null) {
                    p.aA();
                }
                ffig.a(b, null);
                return;
            }
            final vvn p2 = af.p();
            if (p2 != null) {
                boolean ag = p2.cC.ag();
                p2.cC.ae();
                if (z) {
                    p2.aA();
                    if (ag) {
                        p2.cr.post(new Runnable() { // from class: vpv
                            @Override // java.lang.Runnable
                            public final void run() {
                                vvn.this.S(new Consumer() { // from class: vmf
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj) {
                                        enru enruVar = vvn.a;
                                        ((uav) obj).f(true);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                }, new Consumer() { // from class: vmg
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj) {
                                        enru enruVar = vvn.a;
                                        ((ComposeMessageView) obj).H().G(true);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                            }
                        });
                    }
                }
            }
            ffig.a(b, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(b, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Activity
    public final void recreate() {
        af().H();
    }

    @Override // defpackage.efac, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        if (ekht.a(intent, getApplicationContext())) {
            eldl.o(intent);
        }
        super.startActivity(intent);
    }

    @Override // defpackage.efac, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        if (ekht.a(intent, getApplicationContext())) {
            eldl.o(intent);
        }
        super.startActivity(intent, bundle);
    }

    @Override // defpackage.iy
    protected final void r() {
    }

    @Override // defpackage.iy
    protected final void s() {
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.composebox.LighterEditText;
import com.google.android.libraries.messaging.lighter.ui.conversation.ConversationView;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ekkz;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahlp extends ahmy implements ekhu, fbas, ekhq, ekkk, elar {
    private ahma a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public ahlp() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return ahma.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            ahma H = H();
            H.r = layoutInflater.inflate(R.layout.lighter_conversation_fragment, viewGroup, false);
            View view = H.r;
            ekyf.q();
            return view;
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
    public final ahma H() {
        ahma ahmaVar = this.a;
        if (ahmaVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ahmaVar;
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

    @Override // defpackage.ahmy, defpackage.efaf, defpackage.ea
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
        elav b = this.c.b();
        try {
            ba();
            ahma H = H();
            if (!H.b.fe().isFinishing()) {
                dzhe dzheVar = H.u;
                if (dzheVar != null) {
                    dzheVar.c = null;
                }
                final eaar eaarVar = H.t;
                if (eaarVar != null) {
                    erny.f(eaarVar.A.b(1), new emwl() { // from class: dzzz
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            if (!((Boolean) obj).booleanValue()) {
                                return null;
                            }
                            eaar eaarVar2 = eaar.this;
                            eaarVar2.c.e(eaarVar2.d);
                            return null;
                        }
                    }, erpp.a);
                }
                ahmi ahmiVar = H.s;
                if (ahmiVar.b == 1) {
                    ((alrv) ahmiVar.a.b()).b(alrv.K);
                    ahmiVar.b = 3;
                }
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void am() {
        this.c.k();
        try {
            bh();
            H();
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
    public final void ao() {
        elav b = this.c.b();
        try {
            bi();
            H();
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            bm(view, bundle);
            final ahma H = H();
            if (H.b.fe().isFinishing()) {
                ahma.a.m("Activity already finishing, skipping onViewCreated");
            } else {
                H.s = (ahmi) new lmw(H.b).a(ahmi.class);
                dzja dzjaVar = H.h;
                dzpt dzptVar = H.n;
                long j = H.o;
                long j2 = H.p;
                String str = H.q;
                ConversationView conversationView = (ConversationView) H.r.findViewById(R.id.lighter_conversation_view);
                String str2 = H.m;
                if (str2 != null && !str2.isEmpty()) {
                    ((LighterEditText) H.r.findViewById(R.id.compose)).setText(H.m);
                }
                dylh h = ((dygx) H.c.b()).h();
                dyij a = ((dygx) H.c.b()).a();
                dyim c = ((dygx) H.c.b()).c();
                dyil b = ((dygx) H.c.b()).b();
                dyiu e = ((dygx) H.c.b()).e();
                dyom i = ((dygx) H.c.b()).i();
                ((dygx) H.c.b()).k();
                dzhn g = ((dygx) H.c.b()).g();
                ((dygx) H.c.b()).l();
                H.t = new eaar(conversationView, dzptVar, dzjaVar, h, a, c, b, e, i, g);
                eaar eaarVar = H.t;
                emxc.j(Long.valueOf(j));
                emxc.j(Long.valueOf(j2));
                emxc.j(str);
                eaarVar.e.c(110);
                if (((Boolean) H.x.b()).booleanValue()) {
                    Context context = H.r.getContext();
                    dyhd dyhdVar = new dyhd(context);
                    emxc emxcVar = H.j;
                    emxc emxcVar2 = H.l;
                    emxc emxcVar3 = H.k;
                    dyji.a();
                    if (fdql.o()) {
                        if (emxcVar2.g()) {
                            dyhdVar.b.setText((CharSequence) emxcVar2.c());
                            dyhdVar.d.setVisibility(0);
                        }
                        if (emxcVar3.g()) {
                            dyhdVar.c.setText((CharSequence) emxcVar3.c());
                            dyhdVar.d.setVisibility(0);
                        }
                        emxcVar.g();
                    }
                    dzyw dzywVar = H.t.z;
                    ((dygx) H.c.b()).i();
                    dyhc dyhcVar = new dyhc(dyhdVar, context);
                    dzywVar.c = dyhcVar;
                    dzywVar.a.b(dyhcVar.d);
                }
                eaar eaarVar2 = H.t;
                eaarVar2.i = new ahlw(H);
                eaarVar2.j = new ahlx();
                eaarVar2.C = new ahly();
                eaarVar2.k = new dzzf() { // from class: ahlt
                    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.CharSequence, java.lang.Object] */
                    @Override // defpackage.dzzf
                    public final void a(final dzja dzjaVar2, final dzqs dzqsVar) {
                        final emxc j3;
                        dzgm dzgmVar = dzgj.c().a;
                        if (!fdql.k()) {
                            dyhr.a("LighterLinkPreviewController", "Link preview flag not enabled");
                            return;
                        }
                        if (dzgl.c(dzqsVar)) {
                            dyhr.a("LighterLinkPreviewController", "Calling maybeDisplayLinkPreview on message with existing link preview");
                            if (!fdql.l()) {
                                dyhr.a("LighterLinkPreviewController", "Link preview TTL flag not enabled");
                                return;
                            }
                        }
                        if (dzqsVar.h().a() == 2 || dzgl.c(dzqsVar)) {
                            List a2 = dzgr.a(dzgl.b(dzqsVar));
                            j3 = a2.size() != 1 ? emux.a : emxc.j((String) a2.get(0));
                        } else {
                            dyhr.a("LighterLinkPreviewController", "Attempted to detect url on message that does not have text or link preview");
                            j3 = emux.a;
                        }
                        if (!j3.g() || TextUtils.isEmpty(j3.c())) {
                            return;
                        }
                        final dzgr dzgrVar = (dzgr) dzgmVar;
                        erqt.r(erqt.n(new erog() { // from class: dzgo
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                Object c2 = j3.c();
                                dyxa c3 = dyxb.c();
                                ((dyww) c3).a = "ImageDownload";
                                c3.b(dyxf.g);
                                dyxb a3 = c3.a();
                                UUID randomUUID = UUID.randomUUID();
                                dzja dzjaVar3 = dzjaVar2;
                                dzgx dzgxVar = new dzgx(dzjaVar3, (String) c2, dzqsVar);
                                dzgu dzguVar = dzgr.this.c;
                                return dzguVar.a.b(randomUUID, dzgxVar, erqt.i(new dzcj(fbqn.a(dzguVar.a.d.c))), dzjaVar3, a3, true);
                            }
                        }, dzgrVar.b), new dzgq(dzgrVar, dzjaVar2, dzqsVar), erpp.a);
                    }
                };
                eaarVar2.l = new dzze() { // from class: ahlu
                };
                eaarVar2.y = new MenuItem.OnMenuItemClickListener() { // from class: ahlv
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        ahma ahmaVar = ahma.this;
                        eisx eisxVar = ahmaVar.i;
                        if (eisxVar == null || eisxVar.a() == -1) {
                            ((adtc) ahmaVar.g.b()).e(ahmaVar.b.fe(), "Messenger_main");
                            ahma.a.m("Feedback started from Lighter conversation without accountId.");
                            return true;
                        }
                        adtc adtcVar = (adtc) ahmaVar.g.b();
                        eg fe = ahmaVar.b.fe();
                        eisx eisxVar2 = ahmaVar.i;
                        eisxVar2.getClass();
                        axnw.h(adtcVar.c(fe, "Messenger_main", eisxVar2));
                        ahma.a.m("Feedback started from Lighter conversation with accountId.");
                        return true;
                    }
                };
                ((ecmt) H.e.b()).f(conversationView.a, alrv.J, null);
                if (!((Boolean) H.w.b()).booleanValue()) {
                    H.t.x = new ahlz(H);
                }
                H.u = new dzhe(H.b.z(), H.h, ((dygx) H.c.b()).h());
                final dzhe dzheVar = H.u;
                final eaar eaarVar3 = H.t;
                dylh dylhVar = dzheVar.d;
                dzja dzjaVar2 = dzheVar.b;
                erny.f(dylhVar.b(7), new emwl() { // from class: dzhc
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        final Boolean bool = (Boolean) obj;
                        final dzhe dzheVar2 = dzhe.this;
                        final dzzh dzzhVar = eaarVar3;
                        dzhe.a.post(new Runnable() { // from class: dzhd
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (!Boolean.TRUE.equals(bool) || dzhe.this.c == null) {
                                    return;
                                }
                                dzzh dzzhVar2 = dzzhVar;
                                if (fdql.h()) {
                                    eace eaceVar = ((eacx) ((eaar) dzzhVar2).h).a;
                                    eaceVar.b.put(6, new dzhf());
                                    return;
                                }
                                eace eaceVar2 = ((eacx) ((eaar) dzzhVar2).h).a;
                                dzhf dzhfVar = new dzhf();
                                int i2 = eaceVar2.f;
                                eaceVar2.f = i2 + 1;
                                int i3 = i2 + 6;
                                if (i3 >= 1024) {
                                    throw new IllegalStateException("View content type ids over MESSAGE_CONTENT_OFFSET: 1024");
                                }
                                if (eaceVar2.a.containsKey("link_preview")) {
                                    i3 = ((Integer) eaceVar2.a.get("link_preview")).intValue();
                                }
                                eaceVar2.a.put("link_preview", Integer.valueOf(i3));
                                eaceVar2.b.put(i3, dzhfVar);
                            }
                        });
                        return null;
                    }
                }, erpp.a);
                ((dygx) H.c.b()).h();
                if (dylh.a(4)) {
                    ahmx ahmxVar = (ahmx) H.d.b();
                    ViewGroup viewGroup = (ViewGroup) H.r.findViewById(R.id.lighter_compose_container);
                    EditText editText = (EditText) H.r.findViewById(R.id.compose);
                    dzwu a2 = ((dygx) H.c.b()).i().a(H.n);
                    Consumer consumer = new Consumer() { // from class: ahlr
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            engw.r(Uri.parse((String) obj));
                            throw null;
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                            return Consumer$CC.$default$andThen(this, consumer2);
                        }
                    };
                    Consumer consumer2 = new Consumer() { // from class: ahls
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ahma ahmaVar = ahma.this;
                            ((dygx) ahmaVar.c.b()).i().b(ahmaVar.n, (String) obj);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer3) {
                            return Consumer$CC.$default$andThen(this, consumer3);
                        }
                    };
                    ea eaVar = (ea) ((fbbb) ahmxVar.a).a;
                    dsfh dsfhVar = (dsfh) ahmxVar.b.b();
                    dsfhVar.getClass();
                    ahmo ahmoVar = (ahmo) ahmxVar.c.b();
                    ahmoVar.getClass();
                    ahmn ahmnVar = (ahmn) ahmxVar.d.b();
                    ahmnVar.getClass();
                    viewGroup.getClass();
                    editText.getClass();
                    a2.getClass();
                    H.v = new ahmw(eaVar, dsfhVar, ahmoVar, ahmnVar, H, viewGroup, editText, a2, consumer, consumer2);
                }
                final cgkv cgkvVar = (cgkv) H.f.b();
                axnw.h(cgkvVar.a().i(new eroh() { // from class: cgks
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        if (((Boolean) obj).booleanValue()) {
                            return elfo.e(null);
                        }
                        cgkv cgkvVar2 = cgkv.this;
                        return cgkvVar2.a.j(new emwl() { // from class: cgkn
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                cgkl cgklVar = (cgkl) obj2;
                                cgkx cgkxVar = cgklVar.c;
                                if (cgkxVar == null) {
                                    cgkxVar = cgkx.a;
                                }
                                cgkw cgkwVar = (cgkw) cgkxVar.toBuilder();
                                cgkwVar.copyOnWrite();
                                ((cgkx) cgkwVar.instance).b = true;
                                cgkx cgkxVar2 = (cgkx) cgkwVar.build();
                                cgkk cgkkVar = (cgkk) cgklVar.toBuilder();
                                cgkkVar.copyOnWrite();
                                cgkl cgklVar2 = (cgkl) cgkkVar.instance;
                                cgkxVar2.getClass();
                                cgklVar2.c = cgkxVar2;
                                cgklVar2.b |= 1;
                                return (cgkl) cgkkVar.build();
                            }
                        }).h(new emwl() { // from class: cgko
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return null;
                            }
                        }, cgkvVar2.b);
                    }
                }, cgkvVar.b));
            }
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.ahmy
    protected final /* bridge */ /* synthetic */ ekky b() {
        return new ekkt(this, false);
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

    @Override // defpackage.ahmy, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgo) aX).e).a;
                    if (!(eaVar instanceof ahlp)) {
                        throw new IllegalStateException(a.J(eaVar, ahma.class));
                    }
                    ahlp ahlpVar = (ahlp) eaVar;
                    akis akisVar = ((akgo) aX).a;
                    akkp akkpVar = akisVar.a;
                    fbbf fbbfVar = akkpVar.KS;
                    fbbf fbbfVar2 = ((akgo) aX).ex;
                    fbbf fbbfVar3 = akisVar.fK;
                    fbbf fbbfVar4 = akkpVar.fg;
                    fbbf fbbfVar5 = ((akgo) aX).b.ob;
                    akko akkoVar = akisVar.b;
                    this.a = new ahma(ahlpVar, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, akkoVar.kM, akkoVar.kN);
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
        this.c.k();
        try {
            aY(bundle);
            ahma H = H();
            Bundle bundle2 = H.b.m;
            bundle2.getClass();
            dzja dzjaVar = (dzja) bundle2.getSerializable("account_context");
            if (((Boolean) H.x.b()).booleanValue()) {
                H.l = emxc.i(bundle2.getString("smart_context_title"));
                H.k = emxc.i(bundle2.getString("smart_context_sub_title"));
                H.j = emxc.i(bundle2.getString("smart_context_image_url"));
            }
            if (dzjaVar == null) {
                ahma.a.m("Unable to get the account context.");
                H.b.fe().finish();
            } else {
                dzpt dzptVar = (dzpt) bundle2.getParcelable("conversation_id");
                if (dzptVar == null) {
                    ahma.a.r("Unable to get the conversation id.");
                    H.b.fe().finish();
                } else {
                    H.h = dzjaVar;
                    H.n = dzptVar;
                    H.i = (eisx) bundle2.getParcelable("account_id");
                    H.m = bundle2.getString("conversation_draft_message");
                    if (H.m == null) {
                        H.m = "";
                    }
                    bundle2.getInt("entry_point", 0);
                    H.o = bundle2.getLong("lighter_entry_point_id", 0L);
                    H.p = bundle2.getLong("lighter_entry_point_tracking_id", 0L);
                    String string = bundle2.getString("lighter_entry_point_tracking_event_id");
                    if (!emxe.c(string)) {
                        H.q = string;
                    }
                }
            }
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

    @Override // defpackage.efaf, defpackage.ea
    public final void j() {
        elav a = this.c.a();
        try {
            bg();
            this.ag = true;
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
    public final void l() {
        this.c.k();
        try {
            bk();
            H();
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
            H();
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

    @Override // defpackage.ahmy, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewPager;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.material.button.MaterialButton;
import defpackage.fbal;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dctl extends dcsm implements ekhu, fbas, ekhq, ekkk, elar, ellr {
    public final lkv a = new lkv(this);
    private final ells ag = new ells();
    private boolean ah;
    private dcty d;
    private Context e;

    @Deprecated
    public dctl() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return dcty.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            dcty H = H();
            H.J.isPresent();
            H.P = true;
            Bundle bundle2 = H.H.m;
            if (bundle2 != null) {
                H.aa = bundle2.getBoolean("show_direct_send_viewer");
                H.ab = H.H.m.getBoolean("show_direct_send_button");
            }
            View inflate = H.aa ? layoutInflater.inflate(R.layout.direct_send_viewer_fragment, viewGroup, false) : layoutInflater.inflate(R.layout.media_viewer_fragment, viewGroup, false);
            if (inflate == null) {
                dcuq.a(this, H());
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
        return this.a;
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
        if (this.e == null) {
            this.e = new ekkn(this, super.z());
        }
        return this.e;
    }

    @Override // defpackage.dcsm, defpackage.efaf, defpackage.ea
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
    public final void ap(View view, Bundle bundle) {
        dcso h;
        this.c.k();
        try {
            ellg.b(this).b = view;
            H();
            dcuq.a(this, H());
            bm(view, bundle);
            final dcty H = H();
            eg G = H.H.G();
            Guideline guideline = (Guideline) view.findViewById(R.id.screen_start_guideline);
            guideline.getClass();
            Guideline guideline2 = (Guideline) view.findViewById(R.id.screen_top_guideline);
            guideline2.getClass();
            Guideline guideline3 = (Guideline) view.findViewById(R.id.screen_end_guideline);
            guideline3.getClass();
            Guideline guideline4 = (Guideline) view.findViewById(R.id.screen_bottom_guideline);
            guideline4.getClass();
            H.u = new dcwy(G, guideline, guideline2, guideline3, guideline4);
            H.u.a();
            H.v = (ViewGroup) view.findViewById(R.id.media_viewer_root);
            H.w = (TextView) view.findViewById(R.id.media_viewer_title);
            H.x = (TextView) view.findViewById(R.id.media_viewer_subtitle);
            H.y = (TextView) view.findViewById(R.id.primary_button);
            H.z = (LinearLayout) view.findViewById(R.id.secondary_button_container);
            H.A = (ImageView) view.findViewById(R.id.media_viewer_close_button);
            H.B = (TextView) view.findViewById(R.id.media_viewer_duration_text);
            H.C = H.c().findViewById(R.id.media_edit_button);
            H.c.h(H);
            if (H.aa) {
                H.F = (TextView) view.findViewById(R.id.media_viewer_caption);
                H.G = (MaterialButton) view.findViewById(R.id.primary_button);
                view.findViewById(R.id.direct_send_done_button).setOnClickListener(new View.OnClickListener() { // from class: dctx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        dcty dctyVar = dcty.this;
                        dede dedeVar = dctyVar.S;
                        dctl dctlVar = dctyVar.H;
                        dedeVar.i(dctlVar.z(), dctlVar.N());
                    }
                });
            }
            Bundle bundle2 = H.H.m;
            if (bundle2 != null) {
                Uri uri = (Uri) bundle2.getParcelable("photos");
                String string = bundle2.getString("content_type");
                H.M = (Uri) bundle2.getParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                H.V = bundle2.getInt("media_editor_type");
                int z = dcty.z(bundle2);
                H.Y = new dcur(z);
                Uri uri2 = H.M;
                if (uri2 == null || uri2.equals(Uri.EMPTY) || uri != null) {
                    H.E = new dcta(H.H.I(), H.J);
                    H.D = new crly(H.v, R.id.media_viewer_pager_stub, R.id.media_viewer_pager, new crlx() { // from class: dctv
                        @Override // defpackage.crlx
                        public final void a(Object obj) {
                            MediaViewPager mediaViewPager = (MediaViewPager) obj;
                            dcty dctyVar = dcty.this;
                            mediaViewPager.d(new dctz(dctyVar));
                            mediaViewPager.j(dctyVar.E);
                        }
                    });
                    H.W = true;
                    ((MediaViewPager) H.D.b()).setAlpha(0.0f);
                    ((MediaViewPager) H.D.b()).animate().alpha(1.0f).setDuration(H.H.B().getInteger(android.R.integer.config_longAnimTime));
                    boolean A = le.A(string);
                    H.X = H.k.f().toEpochMilli();
                    if (uri != null) {
                        H.d.b(new dcvg(H.an, uri), H.ag);
                    } else if (bundle2.containsKey("media_viewer_items")) {
                        H.K = bundle2.getInt("media_viewer_position");
                        H.d.b(axoo.a(H.al, bundle2.getParcelableArrayList("media_viewer_items")), H.ag);
                    } else {
                        String string2 = bundle2.getString("conversation_id");
                        String string3 = bundle2.getString("participant_look_up_id");
                        H.K = bundle2.getInt("media_viewer_position");
                        H.L = bundle2.getBoolean("has_star_filter");
                        H.d.b(new dcvo(H.an.e, A, bdgq.b(string2), string3, H.L), H.ag);
                    }
                } else {
                    H.Z = new dcus(0, 0, 1);
                    dcuw dcuwVar = new dcuw();
                    dcuwVar.c(H.M);
                    dcuwVar.b(string);
                    H.N = dcuwVar.a();
                    if (H.P && le.A(string)) {
                        Uri uri3 = H.M;
                        int i = bundle2.getInt("opening_source");
                        long j = bundle2.getLong("video_start_ts");
                        boolean z2 = bundle2.getBoolean("start_playing_video");
                        cg cgVar = new cg(H.H.I());
                        H.J.get();
                        cgVar.E(R.id.media_container, dcxe.k(uri3, i, 1, 0, j, z2));
                        cgVar.c();
                    } else {
                        boolean D = H.D(z, string);
                        boolean z3 = D && bundle2.getBoolean("open_in_editor") && !H.aa;
                        H.Q = z3;
                        Uri uri4 = H.M;
                        boolean z4 = H.aa;
                        int i2 = true != z3 ? 1 : 2;
                        if (z4) {
                            emxf.l(true);
                            h = dcso.f();
                            Bundle bundle3 = new Bundle();
                            bundle3.putParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri4);
                            bundle3.putString("content_type", string);
                            bundle3.putInt("starting_view_state", i2 - 1);
                            bundle3.putBoolean("show_direct_send_viewer", true);
                            h.at(bundle3);
                        } else {
                            h = dcsz.h(uri4, string, i2);
                        }
                        h.a.c(new dcua(H, h));
                        cg cgVar2 = new cg(H.H.I());
                        cgVar2.E(R.id.media_container, h);
                        cgVar2.c();
                        H.O = h;
                        if (D) {
                            if (H.Q) {
                                H.C.setVisibility(8);
                                H.c().setVisibility(8);
                                H.c.h(H);
                                H.H.Q.setSystemUiVisibility(1);
                                H.d.b(H.an.a(), new dcuc(H));
                                H.q = H.d();
                                H.r = H.f();
                            } else {
                                H.s();
                            }
                        }
                    }
                    H.Y.a();
                    H.h(0);
                }
                H.w.setText(H.n.c(bundle2.getString("media_viewer_title")));
                H.x.setText(bundle2.getString("media_viewer_subtitle"));
                H.o = (MediaViewerButton) bundle2.getParcelable("primary_button");
                H.p = bundle2.getParcelableArrayList("secondary_button_list");
                H.s = (MediaViewerButton) bundle2.getParcelable("close_button");
                if (H.aa && H.F != null) {
                    H.R = bundle2.getString("text_caption");
                    H.F.setText(H.R);
                    H.ac = bundle2.getBoolean("use_encrypted_icon");
                }
            }
            H.t(H.o);
            if (H.aa) {
                emxf.l(true);
                MaterialButton materialButton = (MaterialButton) H.H.N().findViewById(R.id.primary_button_icon);
                materialButton.d(dcty.b(H.ab, H.ac));
                materialButton.setContentDescription(H.H.Y(dcty.a(H.ab, H.ac)));
                if (H.ab) {
                    materialButton.setOnClickListener(new View.OnClickListener() { // from class: dcts
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            dcty.this.m();
                        }
                    });
                } else {
                    materialButton.setOnClickListener(new View.OnClickListener() { // from class: dctt
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            dcty.this.j();
                        }
                    });
                }
            }
            H.u(H.p);
            if (H.aa && H.O != null) {
                csmj csmjVar = H.h;
                dctl dctlVar = H.H;
                csmjVar.i(dctlVar.Q, dctlVar.a, new Runnable() { // from class: dctw
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((dcso) dcty.this.O).H().a();
                    }
                });
            }
            MediaViewerButton mediaViewerButton = H.s;
            if (mediaViewerButton != null) {
                H.r(H.A, mediaViewerButton);
                H.I.b(H.A, H.s.d());
            }
            if (H.aa) {
                au auVar = (au) H.F.getLayoutParams();
                if (auVar != null) {
                    H.ad = auVar.bottomMargin;
                }
                H.U.e((ConstraintLayout) H.v);
                H.ae = H.H.B().getDimensionPixelSize(R.dimen.direct_send_viewer_margin);
                H.T.b(new decz() { // from class: dctn
                    @Override // defpackage.decz
                    public final void a(boolean z5) {
                        dcty.this.k();
                    }
                });
                H.T.a(new decy() { // from class: dcto
                    @Override // defpackage.decy
                    public final void b(int i3) {
                        dcty.this.k();
                    }
                });
            }
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.dcsm
    protected final /* synthetic */ fbae b() {
        return new ekku(this);
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

    @Override // defpackage.dcsm, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.d == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof dctl)) {
                        throw new IllegalStateException(a.J(eaVar, dcty.class));
                    }
                    dctl dctlVar = (dctl) eaVar;
                    ellq ellqVar = (ellq) ((akgt) aX).a.b.oJ.b();
                    ejwl ejwlVar = (ejwl) ((akgt) aX).k.b();
                    ejlq ejlqVar = (ejlq) ((akgt) aX).l.b();
                    errl errlVar = (errl) ((akgt) aX).a.t.b();
                    ejtr ejtrVar = (ejtr) ((akgt) aX).a.a.f7do.b();
                    ejvb ejvbVar = (ejvb) ((akgt) aX).a.dy.b();
                    cqoh cqohVar = (cqoh) ((akgt) aX).a.cz.b();
                    csrh csrhVar = (csrh) ((akgt) aX).a.a.xi.b();
                    errl errlVar2 = (errl) ((akgt) aX).a.t.b();
                    cbpl cbplVar = (cbpl) ((akgt) aX).a.a.sr.b();
                    ddwg ddwgVar = (ddwg) ((akgt) aX).c.bq.b();
                    akis akisVar = ((akgt) aX).a;
                    dcvh dcvhVar = new dcvh(errlVar, ejtrVar, ejvbVar, cqohVar, csrhVar, new dcvp(errlVar2, cbplVar, ddwgVar, akisVar.a.Z, (cqoh) akisVar.cz.b(), (ames) ((akgt) aX).a.a.pD.b()));
                    ayfg ayfgVar = (ayfg) ((akgt) aX).a.a.nW.b();
                    fbbf fbbfVar = ((akgt) aX).c.g;
                    sfy sfyVar = (sfy) ((akgt) aX).a.a.Pv.b();
                    csmj csmjVar = (csmj) ((akgt) aX).a.b.le.b();
                    akis akisVar2 = ((akgt) aX).a;
                    alih alihVar = new alih(akisVar2.a.dF, new alid(), (Executor) akisVar2.p.b());
                    akis akisVar3 = ((akgt) aX).a;
                    alia aliaVar = new alia(akisVar3.a.dF, new alid(), (Executor) akisVar3.p.b());
                    alhx ao = ((akgt) aX).a.a.ao();
                    akis akisVar4 = ((akgt) aX).a;
                    alhn alhnVar = new alhn(akisVar4.a.dF, new alid(), (Executor) akisVar4.p.b());
                    akis akisVar5 = ((akgt) aX).a;
                    alht alhtVar = new alht(akisVar5.a.dF, new alid(), (Executor) akisVar5.p.b());
                    akis akisVar6 = ((akgt) aX).a;
                    alhq alhqVar = new alhq(akisVar6.a.dF, new alid(), (Executor) akisVar6.p.b());
                    akis akisVar7 = ((akgt) aX).a;
                    fbbf fbbfVar2 = akisVar7.a.f;
                    cqoh cqohVar2 = (cqoh) akisVar7.cz.b();
                    tam tamVar = (tam) ((akgt) aX).c.m.b();
                    Optional of = Optional.of(new Object() { // from class: dcwx
                    });
                    Optional of2 = Optional.of(new dcxf());
                    akis akisVar8 = ((akgt) aX).a;
                    akkp akkpVar = akisVar8.a;
                    fbbf fbbfVar3 = akkpVar.cf;
                    axop bt = akisVar8.b.bt();
                    cuxh cuxhVar = (cuxh) akkpVar.ae.b();
                    dede dedeVar = (dede) ((akgt) aX).a.b.iq.b();
                    dbxg dbxgVar = (dbxg) ((akgt) aX).bD.b();
                    dcvj dcvjVar = new dcvj((errl) ((akgt) aX).a.t.b(), (ekmz) ((akgt) aX).a.gH.b(), (Context) ((akgt) aX).a.q.b());
                    cbgh cbghVar = (cbgh) ((akgt) aX).a.dY.b();
                    akis akisVar9 = ((akgt) aX).a;
                    fbbf fbbfVar4 = akisVar9.b.a.a.s;
                    this.d = new dcty(dctlVar, ellqVar, ejwlVar, ejlqVar, dcvhVar, ayfgVar, fbbfVar, sfyVar, csmjVar, alihVar, aliaVar, ao, alhnVar, alhtVar, alhqVar, fbbfVar2, cqohVar2, tamVar, of, of2, fbbfVar3, bt, cuxhVar, dedeVar, dbxgVar, dcvjVar, cbghVar, new aueh(fbbfVar4), new auej(fbbfVar4), akisVar9.a.RR, new arpk(fbbfVar4));
                    this.Z.c(new ekkg(this.c, this.a));
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
            LayoutInflater cloneInContext = aO.cloneInContext(new fbal.a(aO, this));
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
            dcty H = H();
            ddwj ddwjVar = H.b;
            ddwjVar.a.G().getClass();
            ddwjVar.b = ddwjVar.a.G().getWindow();
            if (bundle != null) {
                ddwjVar.d = bundle.getBoolean("state_translucent_navigation_flag");
                ddwjVar.e = bundle.getBoolean("state_had_light_navigation_bar_flag");
                ddwjVar.c = bundle.getInt("state_previous_navigation_bar_color");
            } else {
                boolean z = true;
                ddwjVar.d = (ddwjVar.b.getAttributes().flags & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) == 134217728;
                ddwjVar.c = ddwjVar.b.getNavigationBarColor();
                if ((ddwjVar.b.getDecorView().getSystemUiVisibility() & 16) == 0) {
                    z = false;
                }
                ddwjVar.e = z;
            }
            H.e.k(H.aj);
            H.e.k(H.ai);
            H.e.k(H.ah);
            H.e.k(H.ak);
            if (bundle != null) {
                dbth dbthVar = H.c;
                dbthVar.a = (dbti) new lmw(dbthVar.g()).a(dbti.class);
                dbthVar.a.b(bundle.getBoolean("STATE_FULLSCREEN"));
                dbthVar.a.a(bundle.getBoolean("STATE_ENABLED"));
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
            dcty H = H();
            ddwj ddwjVar = H.b;
            bundle.putBoolean("state_translucent_navigation_flag", ddwjVar.d);
            bundle.putBoolean("state_had_light_navigation_bar_flag", ddwjVar.e);
            bundle.putInt("state_previous_navigation_bar_color", ddwjVar.c);
            dbth dbthVar = H.c;
            bundle.putBoolean("STATE_FULLSCREEN", dbthVar.a.b);
            bundle.putBoolean("STATE_ENABLED", dbthVar.a.a);
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
            dcty H = H();
            if (H.Y == null) {
                H.Y = new dcur(dcty.z(H.H.m));
            }
            H.Y.b = H.k.f().toEpochMilli();
            if (!H.W) {
                H.i();
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r5 > r10) goto L11;
     */
    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r12 = this;
            ekxu r0 = r12.c
            r0.k()
            r12.bl()     // Catch: java.lang.Throwable -> L63
            dcty r0 = r12.H()     // Catch: java.lang.Throwable -> L63
            dcur r1 = r0.Y     // Catch: java.lang.Throwable -> L63
            if (r1 == 0) goto L5f
            cqoh r2 = r0.k     // Catch: java.lang.Throwable -> L63
            j$.time.Instant r2 = r2.f()     // Catch: java.lang.Throwable -> L63
            long r2 = r2.toEpochMilli()     // Catch: java.lang.Throwable -> L63
            r1.c = r2     // Catch: java.lang.Throwable -> L63
            alia r1 = r0.i     // Catch: java.lang.Throwable -> L63
            eqad r2 = r0.e()     // Catch: java.lang.Throwable -> L63
            dcur r3 = r0.Y     // Catch: java.lang.Throwable -> L63
            int r4 = r3.a     // Catch: java.lang.Throwable -> L63
            long r5 = r3.b     // Catch: java.lang.Throwable -> L63
            r7 = -1
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r8 = 0
            if (r7 == 0) goto L3a
            long r10 = r3.c     // Catch: java.lang.Throwable -> L63
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 == 0) goto L3e
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 <= 0) goto L3e
        L3a:
            long r5 = r3.c     // Catch: java.lang.Throwable -> L63
            r3.b = r5     // Catch: java.lang.Throwable -> L63
        L3e:
            long r10 = r3.c     // Catch: java.lang.Throwable -> L63
            long r10 = r10 - r5
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            int r5 = (int) r10     // Catch: java.lang.Throwable -> L63
            r6 = 0
            if (r3 < 0) goto L4b
            if (r5 < 0) goto L4b
            r3 = 1
            goto L4c
        L4b:
            r3 = r6
        L4c:
            defpackage.emxf.a(r3)     // Catch: java.lang.Throwable -> L63
            dcur r3 = r0.Y     // Catch: java.lang.Throwable -> L63
            int r3 = r3.e     // Catch: java.lang.Throwable -> L63
            alhz r7 = new alhz     // Catch: java.lang.Throwable -> L63
            r7.<init>()     // Catch: java.lang.Throwable -> L63
            r1.o(r7)     // Catch: java.lang.Throwable -> L63
            dcur r0 = r0.Y     // Catch: java.lang.Throwable -> L63
            r0.a = r6     // Catch: java.lang.Throwable -> L63
        L5f:
            defpackage.ekyf.q()
            return
        L63:
            r0 = move-exception
            defpackage.ekyf.q()     // Catch: java.lang.Throwable -> L68
            goto L6c
        L68:
            r1 = move-exception
            r0.addSuppressed(r1)
        L6c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dctl.m():void");
    }

    @Override // defpackage.efaf, defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final dcty H = H();
        dcwy dcwyVar = H.u;
        if (dcwyVar != null) {
            dcwyVar.a();
        }
        if (H.t != null && le.n(H.N.h()) && (H.O instanceof dcso)) {
            csmj csmjVar = H.h;
            dctl dctlVar = H.H;
            csmjVar.i(dctlVar.Q, dctlVar.a, new Runnable() { // from class: dctm
                @Override // java.lang.Runnable
                public final void run() {
                    dcty dctyVar = dcty.this;
                    ((dcwf) dctyVar.t).H().a(((dcso) dctyVar.O).H().a());
                }
            });
        }
    }

    @Override // defpackage.ekhu
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final dcty H() {
        dcty dctyVar = this.d;
        if (dctyVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return dctyVar;
    }

    @Override // defpackage.dcsm, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

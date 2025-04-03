package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.protobuf.contrib.android.ProtoParsers;
import ddae.a;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dczw extends dczt implements ekhu, fbas, ekhq, ekkk, elar {
    private ddae ag;
    private Context ah;
    private final lkv ai = new lkv(this);
    private final ekxu aj = new ekxu(this);
    private boolean ak;

    @Deprecated
    public dczw() {
        efbd.c();
    }

    public static dczw aY(ddap ddapVar) {
        dczw dczwVar = new dczw();
        fbae.e(dczwVar);
        ekku.a(dczwVar, ddapVar);
        return dczwVar;
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return ddae.class;
    }

    @Override // defpackage.efam, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aj.k();
        try {
            super.M(layoutInflater, viewGroup, bundle);
            ddae H = H();
            View inflate = layoutInflater.inflate(R.layout.phone_number_input_bottomsheet_layout, viewGroup, false);
            inflate.getViewTreeObserver().addOnWindowFocusChangeListener(new ddag(H));
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
        return this.ai;
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

    @Override // defpackage.efam, defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        elav j = this.aj.j();
        try {
            boolean aM = super.aM(menuItem);
            j.close();
            return aM;
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ea
    public final void aR(int i, int i2) {
        this.aj.h(i, i2);
        ekyf.q();
    }

    @Override // defpackage.dczt
    protected final /* synthetic */ fbae aU() {
        return new ekku(this);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.ah == null) {
            this.ah = new ekkn(this, super.z());
        }
        return this.ah;
    }

    @Override // defpackage.efam, defpackage.ea
    public final void ae(Bundle bundle) {
        this.aj.k();
        try {
            super.ae(bundle);
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

    @Override // defpackage.efam, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        elav f = this.aj.f();
        try {
            super.af(i, i2, intent);
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

    @Override // defpackage.dczt, defpackage.efam, defpackage.ea
    public final void ag(Activity activity) {
        this.aj.k();
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

    @Override // defpackage.efam, defpackage.ea
    public final void ai() {
        elav b = this.aj.b();
        try {
            super.ai();
            ddae H = H();
            ddar ddarVar = H.A;
            if (ddarVar != null) {
                ddarVar.a.b = null;
                H.A = null;
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

    @Override // defpackage.efam, defpackage.ea
    public final void am() {
        this.aj.k();
        try {
            super.am();
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

    @Override // defpackage.efam, defpackage.ea
    public final void ao() {
        elav b = this.aj.b();
        try {
            super.ao();
            ddae H = H();
            H.l();
            if (((Optional) H.c.get()).isPresent()) {
                H.k(epgr.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_SEEN);
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

    @Override // defpackage.efam, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.aj.k();
        try {
            super.ap(view, bundle);
            final ddae H = H();
            if (H.p()) {
                TextView textView = (TextView) H.d.N().findViewById(R.id.tos_reminder_text);
                dday ddayVar = (dday) H.i.b();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ddayVar.a.getString(R.string.phone_number_input_tos_reminder_text_v2, ddayVar.a.getString(R.string.phone_number_input_tos_text_v2)));
                String string = ddayVar.a.getResources().getString(R.string.phone_number_input_tos_text_v2);
                int indexOf = TextUtils.indexOf(spannableStringBuilder, string);
                if (indexOf != -1) {
                    spannableStringBuilder.setSpan(new ddax(dcxs.b(ctid.c(ddayVar.a))), indexOf, string.length() + indexOf, 17);
                }
                textView.setText(spannableStringBuilder);
                egyl.b(textView);
                egyl.c(textView);
                textView.setVisibility(0);
            }
            if (H.q()) {
                H.d.N().findViewById(R.id.multi_sim_subtitle).setVisibility(0);
                ((dcxx) H.j.b()).c(H.d.A(), (TextView) H.d.N().findViewById(R.id.multi_sim_subtitle));
            }
            TextInputLayout textInputLayout = (TextInputLayout) H.d.N().findViewById(R.id.country_code_text_container);
            textInputLayout.u(new ddaf(textInputLayout));
            TextInputEditText textInputEditText = (TextInputEditText) H.d.N().findViewById(R.id.country_code_text);
            textInputEditText.setInputType(0);
            textInputEditText.setKeyListener(null);
            textInputEditText.setLongClickable(false);
            textInputEditText.setOnClickListener(new View.OnClickListener() { // from class: ddac
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ddae ddaeVar = ddae.this;
                    adg adgVar = ddaeVar.v;
                    if (adgVar != null) {
                        adgVar.c(ddaeVar.f());
                    }
                }
            });
            textInputEditText.setOnTouchListener(new View.OnTouchListener() { // from class: ddad
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 1) {
                        return false;
                    }
                    view2.performClick();
                    return true;
                }
            });
            TextInputEditText textInputEditText2 = (TextInputEditText) H.d.N().findViewById(R.id.phone_number_text);
            H.c().addTextChangedListener(H.e());
            egyl.c(textInputEditText);
            egyl.c(textInputEditText2);
            textInputLayout.h(cwoj.a(H.d.fe()));
            ((TextInputLayout) H.d.N().findViewById(R.id.phone_number_text_container)).h(cwoj.a(H.d.fe()));
            String f = ((ctyx) H.g.b()).f("manual_msisdn_entered_phone_number_for_sim_".concat(String.valueOf(H.e)), "");
            H.s = H.f();
            H.j();
            if (TextUtils.isEmpty(f)) {
                H.a().setEnabled(false);
            } else {
                H.c().setText(f);
            }
            ((Button) H.d.N().findViewById(R.id.cancel_button)).setOnClickListener(new View.OnClickListener() { // from class: ddab
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ddae ddaeVar = ddae.this;
                    if (djai.W()) {
                        ((dcxs) ddaeVar.u.get()).g();
                    }
                    ddaeVar.s(9);
                    ddaeVar.k(epgr.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_REJECTED);
                    ddaeVar.i(0);
                    ddar ddarVar = ddaeVar.A;
                    if (ddarVar != null) {
                        dczw dczwVar = ddaeVar.d;
                        ddat ddatVar = ddarVar.a;
                        final eg fe = dczwVar.fe();
                        ddatVar.h();
                        String string2 = fe.getString(R.string.phone_number_ui_dismissed_snackbar_text_v2);
                        String string3 = fe.getString(R.string.phone_number_ui_dismissed_snackbar_action_text);
                        final ddat ddatVar2 = ddarVar.a;
                        aens.a(fe, string2, string3, new View.OnClickListener() { // from class: ddaq
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                akvg akvgVar = (akvg) ddat.this.a.b();
                                Activity activity = fe;
                                eldl.p(activity, akvgVar.o(activity));
                            }
                        });
                    }
                    ((cmne) ddaeVar.k.b()).m(ddaeVar.e, Duration.ZERO, 2, eqws.PHONE_NUMBER_INPUT_BOTTOM_SHEET_CANCEL_BUTTON);
                }
            });
            ((Button) H.d.N().findViewById(R.id.continue_button)).setOnClickListener(new View.OnClickListener() { // from class: dczz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    cfva cfvaVar = aoqm.a;
                    boolean booleanValue = ((Boolean) new aopz().get()).booleanValue();
                    final ddae ddaeVar = ddae.this;
                    if (!(booleanValue ? ddaeVar.d().s() : ((ctvb) ddaeVar.f.b()).L(ddaeVar.h()))) {
                        ddaeVar.c().setError(ddaeVar.d.z().getString(R.string.phone_number_input_invalid_number_text));
                        return;
                    }
                    ddaeVar.s(10);
                    Editable text = ddaeVar.c().getText();
                    final efto eftoVar = ddaeVar.s;
                    final String h = ddaeVar.h();
                    if (eftoVar != null && text != null) {
                        if (((Boolean) new aoqg().get()).booleanValue()) {
                            cmay a = ((cmba) ddaeVar.o.b()).a(emxe.b(ddaeVar.d().p(((Boolean) new aoqg().get()).booleanValue())), ddaeVar.r() == 4, ddaeVar.e);
                            ((ejlq) ddaeVar.l.b()).i(ejlp.b(((cmba) ddaeVar.o.b()).b(ddaeVar.e, a)), ejlm.a(a), ddaeVar.x);
                        } else {
                            String b = emxe.b(h);
                            int r = ddaeVar.r();
                            cmay a2 = ((cmba) ddaeVar.o.b()).a(b, r == 4, ddaeVar.e);
                            ((ejlq) ddaeVar.l.b()).i(ejlp.b(((cmba) ddaeVar.o.b()).b(ddaeVar.e, a2)), ejlm.a(a2), ddaeVar.x);
                        }
                        ((ejlq) ddaeVar.l.b()).g(ejlp.b(elfo.f(new Runnable() { // from class: dczx
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte[] byteArray = eftoVar.toByteArray();
                                ddae ddaeVar2 = ddae.this;
                                ((ctyx) ddaeVar2.g.b()).i("manual_msisdn_entered_country_code", byteArray);
                                ((ctyx) ddaeVar2.g.b()).l("manual_msisdn_entered_phone_number_for_sim_".concat(String.valueOf(ddaeVar2.e)), h);
                                ((cmne) ddaeVar2.k.b()).m(ddaeVar2.e, Duration.ZERO, 2, eqws.PHONE_NUMBER_INPUT_BOTTOM_SHEET_CONTINUE_BUTTON);
                            }
                        }, (Executor) ddaeVar.h.b())), ddaeVar.y);
                    }
                    final String g = ddaeVar.g();
                    if (djai.W()) {
                        ((dcxs) ddaeVar.u.get()).g();
                    } else if (((Boolean) new aoqg().get()).booleanValue()) {
                        final dday ddayVar2 = (dday) ddaeVar.i.b();
                        final aoku d = ddaeVar.d();
                        final String str = ddaeVar.e;
                        axnw.h(elfo.f(new Runnable() { // from class: ddau
                            @Override // java.lang.Runnable
                            public final void run() {
                                csjy.c("Bugle", "send msisdn to provisioning engine");
                                String str2 = str;
                                if (TextUtils.isEmpty(str2)) {
                                    return;
                                }
                                aoku aokuVar = d;
                                if (aokuVar.E()) {
                                    return;
                                }
                                dday ddayVar3 = dday.this;
                                cfva cfvaVar2 = aoqm.a;
                                ((dkdw) ddayVar3.c.b()).v(str2, aokuVar.p(((Boolean) new aoqg().get()).booleanValue()));
                            }
                        }, ddayVar2.b));
                    } else {
                        final dday ddayVar3 = (dday) ddaeVar.i.b();
                        final String str2 = ddaeVar.e;
                        axos.a(new Runnable() { // from class: ddaw
                            @Override // java.lang.Runnable
                            public final void run() {
                                csjy.c("Bugle", "send msisdn to provisioning engine");
                                String str3 = str2;
                                if (TextUtils.isEmpty(str3)) {
                                    return;
                                }
                                String str4 = g;
                                if (TextUtils.isEmpty(str4)) {
                                    return;
                                }
                                ((dkdw) dday.this.c.b()).v(str3, str4);
                            }
                        }, ddayVar3.b);
                    }
                    ddaeVar.k(epgr.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_ACCEPTED);
                    if (ddaeVar.r() == 4) {
                        String str3 = ddaeVar.e;
                        ((enrr) ((enrr) ddae.a.h()).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputBottomSheetFragmentPeer", "incrementRetryCounterForSimId", 956, "PhoneNumberInputBottomSheetFragmentPeer.java")).t("Incrementing daily retry counter for simId: %s", dktx.SIM_ID.c(str3));
                        ((ejlq) ddaeVar.l.b()).i(ejlp.b(((cmgr) ddaeVar.p.b()).e(new djro(str3))), new ejlm(str3), ddaeVar.z);
                    }
                    ddaeVar.i(-1);
                    ddar ddarVar = ddaeVar.A;
                    if (ddarVar != null) {
                        dczw dczwVar = ddaeVar.d;
                        ddat ddatVar = ddarVar.a;
                        eg fe = dczwVar.fe();
                        ddatVar.h();
                        aens.b(fe, fe.getString(R.string.phone_number_ui_accepted_snackbar_text_v2));
                    }
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

    @Override // defpackage.ekhu
    /* renamed from: ba, reason: merged with bridge method [inline-methods] */
    public final ddae H() {
        ddae ddaeVar = this.ag;
        if (ddaeVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ddaeVar;
    }

    @Override // defpackage.elar
    public final elds bb() {
        return this.aj.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.aj.e(eldsVar, z);
    }

    @Override // defpackage.elar
    public final void be(elds eldsVar) {
        this.aj.b = eldsVar;
    }

    @Override // defpackage.dczt, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        this.aj.k();
        try {
            if (this.ak) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ag == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof dczw)) {
                        throw new IllegalStateException(a.J(eaVar, ddae.class));
                    }
                    dczw dczwVar = (dczw) eaVar;
                    Bundle a = ((akgt) aX).a();
                    eyfc eyfcVar = (eyfc) ((akgt) aX).a.b.gz.b();
                    emxf.b(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    ddap ddapVar = (ddap) ProtoParsers.f(a, "TIKTOK_FRAGMENT_ARGUMENT", ddap.a, eyfcVar);
                    ddapVar.getClass();
                    akis akisVar = ((akgt) aX).a;
                    akkp akkpVar = akisVar.a;
                    fbbf fbbfVar = akkpVar.u;
                    fbbf fbbfVar2 = akisVar.aU;
                    fbbf fbbfVar3 = akkpVar.c;
                    fbbf fbbfVar4 = akisVar.t;
                    akko akkoVar = akisVar.b;
                    this.ag = new ddae(dczwVar, ddapVar, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, akkoVar.ke, ((akgt) aX).bE, akkoVar.iq, akkpVar.Dr, akkpVar.Cv, akisVar.cz, ((akgt) aX).l, ((akgt) aX).aw, akkpVar.Pw, akkoVar.kc, ((akgt) aX).bF, ((akgt) aX).k, akkpVar.Z, akkpVar.wi, ((akgt) aX).f, ((akgt) aX).bG, akkoVar.kd);
                    this.Z.c(new ekkg(this.aj, this.ai));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            lkr lkrVar = this.E;
            if (lkrVar instanceof elar) {
                ekxu ekxuVar = this.aj;
                if (ekxuVar.a == null) {
                    ekxuVar.e(((elar) lkrVar).bb(), true);
                }
            }
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.dczt, defpackage.dn, defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.aj.k();
        try {
            LayoutInflater gI = super.gI(bundle);
            LayoutInflater cloneInContext = gI.cloneInContext(new ekkn(this, gI));
            ekyf.q();
            return cloneInContext;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efam, defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        this.aj.k();
        try {
            super.h(bundle);
            ddae H = H();
            ((ejlq) H.l.b()).k(H.y);
            H.w = new clzg(ddae.b);
            ((ejlq) H.l.b()).k(H.w);
            H.x = new cmaz(ddae.b);
            ((ejlq) H.l.b()).k(H.x);
            ((ejlq) H.l.b()).k(H.z);
            ejwl ejwlVar = (ejwl) H.n.b();
            final cmao cmaoVar = (cmao) H.m.b();
            final String str = H.e;
            ejwlVar.b(new ejvn(cmaoVar.c, new ejuy(cmaoVar.e, new eros() { // from class: cmak
                @Override // defpackage.eros
                public final erph a(erpc erpcVar) {
                    return new erph(cmao.this.d(str).h(new emwl() { // from class: clzq
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return Integer.valueOf(cmao.b((engw) obj));
                        }
                    }, erpp.a));
                }
            }, cmel.b)), H.new a());
            ejxn ejxnVar = (ejxn) H.q.b();
            clyz clyzVar = (clyz) H.r.b();
            String str2 = H.e;
            str2.getClass();
            ejxnVar.g(R.id.phone_number_input_ui_sim_info_id, new clyy(clyzVar, str2), new ddam(H));
            H.v = H.d.O(new ddai(H), new ddaj(H));
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

    @Override // defpackage.ehbo, defpackage.kc, defpackage.dn
    public final Dialog hf(Bundle bundle) {
        super.hf(bundle);
        ddae H = H();
        ehbn ehbnVar = new ehbn(H.d.z(), R.style.ThemeOverlay_Bugle_InputBottomSheetDialog);
        ehbnVar.b.b(ehbnVar, new ddah(H));
        ehbnVar.setOnShowListener(new ddak(H));
        return ehbnVar;
    }

    @Override // defpackage.ehbo, defpackage.dn
    public final void hw() {
        elav k = ekyf.k();
        try {
            super.hw();
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

    @Override // defpackage.efam, defpackage.dn, defpackage.ea
    public final void i() {
        elav b = this.aj.b();
        try {
            super.i();
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

    @Override // defpackage.efam, defpackage.dn, defpackage.ea
    public final void j() {
        elav a = this.aj.a();
        try {
            super.j();
            this.ak = true;
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

    @Override // defpackage.efam, defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        this.aj.k();
        try {
            super.k(bundle);
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

    @Override // defpackage.efam, defpackage.dn, defpackage.ea
    public final void l() {
        this.aj.k();
        try {
            super.l();
            elle.c(this);
            if (this.c) {
                elle.b(this);
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

    @Override // defpackage.efam, defpackage.dn, defpackage.ea
    public final void m() {
        this.aj.k();
        try {
            super.m();
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

    @Override // defpackage.dn, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.aj.g().close();
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        elav i = this.aj.i();
        try {
            super.onDismiss(dialogInterface);
            i.close();
        } catch (Throwable th) {
            try {
                i.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dczt, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

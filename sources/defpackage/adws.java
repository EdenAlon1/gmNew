package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackActivity;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.fbal;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adws extends adxy implements ekhu, fbas, ekhq, ekkk, elar {
    private adxn a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public adws() {
        efbd.c();
    }

    public static adws a() {
        adws adwsVar = new adws();
        fbae.e(adwsVar);
        return adwsVar;
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return adxn.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final adxn H = H();
            View inflate = layoutInflater.inflate(R.layout.advanced_feedback_fragment, viewGroup, false);
            eg G = H.d.G();
            G.getClass();
            Bundle extras = G.getIntent().getExtras();
            H.x = (AdvancedFeedbackActivity) G;
            if (extras != null) {
                H.r = eoio.b(extras.getInt("advanced_feedback_config_data"));
            }
            if (H.r == eoio.BUGLE_ADVANCED_FEEDBACK_SOURCE_NOTIFICATION_GENERIC && ((Boolean) adwg.d.e()).booleanValue()) {
                ((cins) H.p.b()).l();
                ((alsi) H.u.b()).a(((cnmx) H.q.b()).f(G.getIntent(), "report_issue_event_type", 3));
            }
            Bundle bundle2 = H.d.m;
            String string = bundle2 != null ? bundle2.getString("screenshot_file_key") : null;
            if (string != null) {
                ejwl ejwlVar = H.e;
                final aduq aduqVar = H.f;
                final File file = new File(string);
                ejwlVar.b(new ejuy(aduqVar.b, new eros() { // from class: adup
                    @Override // defpackage.eros
                    public final erph a(erpc erpcVar) {
                        adyy adyyVar = aduq.this.a;
                        ((ensz) adyyVar.c.o().h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/util/AdvancedFeedbackScreenshotHelper", "getScreenshot", 65, "AdvancedFeedbackScreenshotHelper.java")).q("Getting screenshot from temp file");
                        final File file2 = file;
                        return new erph(elfo.g(new Callable() { // from class: adyx
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                File file3 = file2;
                                if (!file3.exists()) {
                                    return Optional.empty();
                                }
                                FileInputStream fileInputStream = new FileInputStream(file3);
                                Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
                                fileInputStream.close();
                                file3.delete();
                                return Optional.of(decodeStream);
                            }
                        }, adyyVar.b));
                    }
                }, file.getPath()), H.y);
            }
            H.i = (TextInputLayout) inflate.findViewById(R.id.advanced_feedback_fragment_issue_list_layout);
            H.h = (AutoCompleteTextView) inflate.findViewById(R.id.advanced_feedback_fragment_issue_list_view);
            H.j = (LinearLayout) inflate.findViewById(R.id.advanced_feedback_fragment_checkbox_list);
            Stream map = Collection.EL.stream(H.b.a()).map(new Function() { // from class: adwt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((advh) obj).c();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            H.h.setAdapter(new ArrayAdapter(H.a, R.layout.advanced_feedback_issue_view, (engw) map.collect(endq.a)));
            H.h.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: adxe
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                    adxn adxnVar = adxn.this;
                    adxnVar.c((advh) adxnVar.b.a().get(i2));
                }
            });
            adtx adtxVar = H.c;
            engr engrVar = new engr();
            engrVar.h(adtxVar.a);
            engrVar.h(adtxVar.b);
            if (((Boolean) adwg.b.e()).booleanValue()) {
                engrVar.h((adtw) adtxVar.c.b());
            }
            if (((Boolean) csks.a.e()).booleanValue()) {
                engrVar.h(adtxVar.d);
            }
            if (((Boolean) adwg.c.e()).booleanValue()) {
                engrVar.h(adtxVar.e);
            }
            engw g = engrVar.g();
            int i2 = ((enou) g).c;
            for (int i3 = 0; i3 < i2; i3++) {
                adtw adtwVar = (adtw) g.get(i3);
                AdvancedFeedbackDataView advancedFeedbackDataView = (AdvancedFeedbackDataView) layoutInflater.inflate(R.layout.advanced_feedback_data_view, (ViewGroup) H.j, false);
                advancedFeedbackDataView.j = adtwVar;
                String h = adtwVar.h();
                if (h != null) {
                    advancedFeedbackDataView.h.setText(h);
                }
                H.k.add(advancedFeedbackDataView);
                H.j.addView(advancedFeedbackDataView);
            }
            View findViewById = inflate.findViewById(R.id.advanced_feedback_share_with_partner_title);
            View findViewById2 = inflate.findViewById(R.id.advanced_feedback_share_with_external_card);
            if (ctib.a()) {
                findViewById2.setVisibility(8);
                findViewById.setVisibility(8);
                H.s.a = eoim.BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_NOT_REQUIRED;
            } else {
                final CheckBox checkBox = (CheckBox) findViewById2.findViewById(R.id.advanced_feedback_share_with_external_checkbox);
                H.s.a = eoim.BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_CONSENTED;
                checkBox.setChecked(true);
                findViewById2.setOnClickListener(new View.OnClickListener() { // from class: adxb
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CheckBox checkBox2 = checkBox;
                        checkBox2.toggle();
                        adxn.this.s.a = checkBox2.isChecked() ? eoim.BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_CONSENTED : eoim.BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_REJECTED;
                    }
                });
            }
            H.d();
            Intent a = H.a();
            if (a != null) {
                int intExtra = a.getIntExtra("report_issue_type_value_extra", 0);
                H.w = intExtra;
                if (intExtra != 0) {
                    ephv b = ephv.b(intExtra);
                    b.getClass();
                    int ordinal = b.ordinal();
                    advh advhVar = ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? ordinal != 7 ? ((advl) H.b).a : ((advl) H.b).c : ((advl) H.b).e : ((advl) H.b).b : ((advl) H.b).d;
                    H.h.setText((CharSequence) advhVar.c(), false);
                    H.c(advhVar);
                }
            }
            String f = H.f();
            if (f != null) {
                ((ensz) ((ensz) H.l.h()).h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragmentPeer", "onCreateView", 233, "AdvancedFeedbackFragmentPeer.java")).t("Messages automatically detected an error. User tapped notification, launching advanced feedback: %s", f);
            }
            ((adtv) H.t.b()).a(2, Optional.of(H.r), Optional.empty(), Optional.empty(), Optional.empty());
            ekyf.q();
            return inflate;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.e;
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

    @Override // defpackage.adxy, defpackage.efaf, defpackage.ea
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

    @Override // defpackage.ekhu
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final adxn H() {
        adxn adxnVar = this.a;
        if (adxnVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return adxnVar;
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

    @Override // defpackage.adxy
    protected final /* synthetic */ fbae e() {
        return new ekku(this);
    }

    @Override // defpackage.adxy, defpackage.ekkd, defpackage.ea
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
                    Context context2 = (Context) ((akgt) aX).c.d.b();
                    adtc adtcVar = (adtc) ((akgt) aX).b.bt.b();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof adws)) {
                        throw new IllegalStateException(a.J(eaVar, adxn.class));
                    }
                    adws adwsVar = (adws) eaVar;
                    akgg akggVar = ((akgt) aX).b;
                    advn advnVar = new advn(akggVar.a.b.a.q);
                    advv advvVar = new advv(akggVar.a.b.a.q);
                    advt advtVar = new advt(akggVar.a.b.a.q);
                    advr advrVar = new advr(akggVar.a.b.a.q);
                    adwd adwdVar = new adwd(akggVar.a.b.a.q);
                    advp advpVar = new advp(akggVar.a.b.a.q);
                    adwb adwbVar = new adwb(akggVar.a.b.a.q);
                    advx advxVar = new advx(akggVar.a.b.a.q);
                    advz advzVar = new advz(akggVar.a.b.a.q);
                    adwf adwfVar = new adwf(akggVar.a.b.a.q);
                    adud K = akggVar.a.b.K();
                    aduk L = akggVar.a.b.L();
                    akko akkoVar = akggVar.a.b;
                    advl advlVar = new advl(advnVar, advvVar, advtVar, advrVar, adwdVar, advpVar, adwbVar, advxVar, advzVar, adwfVar, K, L, akkoVar.pf, akkoVar.M(), akggVar.d());
                    adud K2 = ((akgt) aX).a.b.K();
                    aduk L2 = ((akgt) aX).a.b.L();
                    akko akkoVar2 = ((akgt) aX).a.b;
                    adtx adtxVar = new adtx(K2, L2, akkoVar2.pf, akkoVar2.M(), ((akgt) aX).b.d());
                    ellq ellqVar = (ellq) ((akgt) aX).a.b.oJ.b();
                    adul adulVar = new adul();
                    ejwl ejwlVar = (ejwl) ((akgt) aX).k.b();
                    aduq aduqVar = new aduq((adyy) ((akgt) aX).a.nW.b(), (ejvb) ((akgt) aX).a.dy.b());
                    ctud ctudVar = (ctud) ((akgt) aX).a.cT.b();
                    fbbf fbbfVar = ((akgt) aX).c.g;
                    aduc aducVar = (aduc) ((akgt) aX).a.b.pf.b();
                    akkp akkpVar = ((akgt) aX).a.a;
                    this.a = new adxn(context2, adtcVar, adwsVar, advlVar, adtxVar, ellqVar, adulVar, ejwlVar, aduqVar, ctudVar, fbbfVar, aducVar, akkpVar.jc, ((akgt) aX).b.bn, ((akgt) aX).ai, akkpVar.Sa);
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

    @Override // defpackage.adxy, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.dittosatellite.impl.DittoWebActivity;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxr extends acxq implements ekhu, fbas, ekhq, ekkk, elar {
    private acxx ag;
    private Context ai;
    private final lkv aj = new lkv(this);
    private final ekxu ak = new ekxu(this);
    private boolean al;

    @Deprecated
    public acxr() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return acxx.class;
    }

    @Override // defpackage.efae, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ak.k();
        try {
            View M = super.M(layoutInflater, viewGroup, bundle);
            ekyf.q();
            return M;
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
        return this.aj;
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

    @Override // defpackage.efae, defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        elav j = this.ak.j();
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
        this.ak.h(i, i2);
        ekyf.q();
    }

    @Override // defpackage.acxq
    protected final /* synthetic */ fbae aU() {
        return new ekku(this);
    }

    @Override // defpackage.ekhu
    /* renamed from: aY, reason: merged with bridge method [inline-methods] */
    public final acxx H() {
        acxx acxxVar = this.ag;
        if (acxxVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.al) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return acxxVar;
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.ai == null) {
            this.ai = new ekkn(this, super.z());
        }
        return this.ai;
    }

    @Override // defpackage.efae, defpackage.ea
    public final void ae(Bundle bundle) {
        this.ak.k();
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

    @Override // defpackage.efae, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        elav f = this.ak.f();
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

    @Override // defpackage.acxq, defpackage.efae, defpackage.ea
    public final void ag(Activity activity) {
        this.ak.k();
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

    @Override // defpackage.efae, defpackage.ea
    public final void ai() {
        elav b = this.ak.b();
        try {
            super.ai();
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

    @Override // defpackage.efae, defpackage.ea
    public final void am() {
        this.ak.k();
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

    @Override // defpackage.efae, defpackage.ea
    public final void ao() {
        elav b = this.ak.b();
        try {
            super.ao();
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

    @Override // defpackage.efae, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.ak.k();
        try {
            super.ap(view, bundle);
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

    @Override // defpackage.elar
    public final elds bb() {
        return this.ak.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.ak.e(eldsVar, z);
    }

    @Override // defpackage.elar
    public final void be(elds eldsVar) {
        this.ak.b = eldsVar;
    }

    @Override // defpackage.acxq, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        this.ak.k();
        try {
            if (this.al) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ag == null) {
                try {
                    Object aX = aX();
                    Bundle a = ((akgt) aX).a();
                    eyfc eyfcVar = (eyfc) ((akgt) aX).a.b.gz.b();
                    emxf.b(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    acxt acxtVar = (acxt) ProtoParsers.f(a, "TIKTOK_FRAGMENT_ARGUMENT", acxt.a, eyfcVar);
                    acxtVar.getClass();
                    akis akisVar = ((akgt) aX).a;
                    fbbf fbbfVar = akisVar.t;
                    akgb akgbVar = ((akgt) aX).c;
                    this.ag = new acxx(acxtVar, fbbfVar, akgbVar.d, akisVar.a.jZ, akgbVar.aG, akgbVar.aH, akisVar.aJ);
                    this.Z.c(new ekkg(this.ak, this.aj));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            lkr lkrVar = this.E;
            if (lkrVar instanceof elar) {
                ekxu ekxuVar = this.ak;
                if (ekxuVar.a == null) {
                    ekxuVar.e(((elar) lkrVar).bb(), true);
                }
            }
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.acxq, defpackage.dn, defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.ak.k();
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

    @Override // defpackage.efae, defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        this.ak.k();
        try {
            super.h(bundle);
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

    /* JADX WARN: Type inference failed for: r1v36, types: [aoku, java.lang.Object] */
    @Override // defpackage.dn
    public final Dialog hf(Bundle bundle) {
        super.hf(bundle);
        final acxx H = H();
        acxt acxtVar = H.d;
        final acmd b = acmd.b(acxtVar.b);
        if (b == null) {
            b = acmd.UNRECOGNIZED;
        }
        final boolean z = acxtVar.c;
        int ordinal = b.ordinal();
        H.b = ordinal != 1 ? ordinal != 2 ? acmd.UNKNOWN : acmd.REMOTE : acmd.STANDALONE;
        View inflate = LayoutInflater.from((Context) H.e.b()).inflate(R.layout.switcher_peer_view, (ViewGroup) null);
        AlertDialog create = new AlertDialog.Builder((Context) H.e.b(), R.style.SwitcherDialogPeerStyle).setView(inflate).setPositiveButton(((Context) H.e.b()).getResources().getString(R.string.switcher_positive_button_text), new elbb((elbx) H.h.b(), "SwitcherDialog:positive", new DialogInterface.OnClickListener() { // from class: acxw
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                acxx acxxVar = acxx.this;
                acmd acmdVar = b;
                if (z) {
                    ((bzea) acxxVar.f.b()).z(acxx.d(acxxVar.b), 3, acrz.f());
                } else if (acmdVar != acxxVar.b) {
                    ((bzea) acxxVar.f.b()).z(acxx.d(acxxVar.b), 2, acrz.f());
                }
                acxxVar.c(acxxVar.b);
                if (acmdVar == acmd.REMOTE && acxxVar.b == acmd.STANDALONE) {
                    if (acxxVar.e.b() instanceof DittoWebActivity) {
                        acxx.a.m("launching Standalone mode");
                        DittoWebActivity dittoWebActivity = (DittoWebActivity) acxxVar.e.b();
                        dittoWebActivity.setResult(-1, dittoWebActivity.getIntent());
                        dittoWebActivity.finish();
                        return;
                    }
                    return;
                }
                if (acmdVar == acmd.STANDALONE && acxxVar.b == acmd.REMOTE) {
                    acxx.a.m("launching Remote mode");
                    ((Context) acxxVar.e.b()).startActivity(akuv.c((Context) acxxVar.e.b(), DittoWebActivity.class, "android.intent.action.VIEW").a());
                }
            }
        })).create();
        if (H.m == null) {
            H.m = (LottieAnimationView) inflate.findViewById(R.id.switcher_animation);
        }
        H.m.g(((Context) H.e.b()).getString(R.string.switcher_json));
        H.m.d();
        float dimension = ((Context) H.e.b()).getResources().getDimension(R.dimen.switcher_option_corner);
        H.c = new float[]{dimension, dimension, dimension, dimension, dimension, dimension, dimension, dimension};
        H.i = inflate.findViewById(R.id.use_device_sim_layout);
        H.k = (ImageView) H.i.findViewById(R.id.use_device_sim_check_mark);
        H.j = inflate.findViewById(R.id.pair_device_layout);
        H.l = (ImageView) H.j.findViewById(R.id.pair_device_check_mark);
        Optional a = ((acxk) H.g.b()).a();
        TextView textView = (TextView) H.i.findViewById(R.id.use_device_sim_number);
        if (a.isPresent()) {
            textView.setText(((Context) H.e.b()).getString(R.string.switcher_use_device_sim_number, a.get().G().a));
            textView.setVisibility(0);
        } else if (!((acxk) H.g.b()).d()) {
            textView.setText(((Context) H.e.b()).getString(R.string.switcher_no_phone_number));
            textView.setVisibility(0);
        }
        H.a();
        H.i.setOnClickListener(new View.OnClickListener() { // from class: acxu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acxx.this.b(acmd.STANDALONE);
            }
        });
        H.j.setOnClickListener(new View.OnClickListener() { // from class: acxv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acxx.this.b(acmd.REMOTE);
            }
        });
        return create;
    }

    @Override // defpackage.efae, defpackage.dn
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

    @Override // defpackage.efae, defpackage.dn, defpackage.ea
    public final void i() {
        elav b = this.ak.b();
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

    @Override // defpackage.efae, defpackage.dn, defpackage.ea
    public final void j() {
        elav a = this.ak.a();
        try {
            super.j();
            this.al = true;
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

    @Override // defpackage.efae, defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        this.ak.k();
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

    @Override // defpackage.efae, defpackage.dn, defpackage.ea
    public final void l() {
        this.ak.k();
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

    @Override // defpackage.efae, defpackage.dn, defpackage.ea
    public final void m() {
        this.ak.k();
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
        this.ak.g().close();
    }

    @Override // defpackage.efae, defpackage.dn, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        elav i = this.ak.i();
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

    @Override // defpackage.acxq, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

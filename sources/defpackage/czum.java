package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czum extends czul implements ekhu, fbas, ekhq, ekkk, elar {
    private czup ag;
    private Context ai;
    private final lkv aj = new lkv(this);
    private final ekxu ak = new ekxu(this);
    private boolean al;

    @Deprecated
    public czum() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return czup.class;
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

    @Override // defpackage.czul
    protected final /* synthetic */ fbae aU() {
        return new ekku(this);
    }

    @Override // defpackage.ekhu
    /* renamed from: aY, reason: merged with bridge method [inline-methods] */
    public final czup H() {
        czup czupVar = this.ag;
        if (czupVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.al) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return czupVar;
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

    @Override // defpackage.czul, defpackage.efae, defpackage.ea
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

    @Override // defpackage.czul, defpackage.dn, defpackage.ea
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
                    fbbf fbbfVar = ((akgt) aX).bg;
                    akis akisVar = ((akgt) aX).a;
                    fbbf fbbfVar2 = akisVar.aJ;
                    akkp akkpVar = akisVar.a;
                    this.ag = new czup(fbbfVar, fbbfVar2, akkpVar.Px, akkpVar.r);
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
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.czul, defpackage.dn, defpackage.ea
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

    @Override // defpackage.dn
    public final Dialog hf(Bundle bundle) {
        super.hf(bundle);
        final czup H = H();
        final czum czumVar = (czum) H.a.b();
        View inflate = LayoutInflater.from(czumVar.z()).inflate(R.layout.suggestion_shortcut_popup_fragment, (ViewGroup) null);
        ehft ehftVar = new ehft(inflate.getContext());
        ehftVar.z(inflate);
        ehftVar.t(R.string.suggestion_shortcut_dialog_positive_button, new elbb((elbx) H.b.b(), "SuggestionShortcutDialog OK", new DialogInterface.OnClickListener() { // from class: czun
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                czum.this.hw();
            }
        }));
        View findViewById = inflate.findViewById(R.id.suggestion_shortcut_popup_subsection_body);
        findViewById.getClass();
        TextView textView = (TextView) findViewById;
        String a = crmi.a(((czum) H.a.b()).z());
        textView.setText(ddyi.f(((czum) H.a.b()).fe(), ((czum) H.a.b()).Z(R.string.suggestion_shortcut_dialog_subsection_body_text, a), a));
        textView.setOnClickListener(new elay((elbx) H.b.b(), "SuggestionShortcutDialog Learn More", new View.OnClickListener() { // from class: czuo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                czup czupVar = czup.this;
                akvg akvgVar = (akvg) czupVar.c.b();
                eg fe = ((czum) czupVar.a.b()).fe();
                emyl emylVar = czur.a;
                akvgVar.y(fe, (String) czur.c.e());
            }
        }));
        LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.suggestion_shortcut_popup_animation);
        egya egyaVar = egya.a;
        lottieAnimationView.getClass();
        egxp.e(egyaVar, lottieAnimationView, ((crjx) H.d.b()).g());
        return ehftVar.create();
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

    @Override // defpackage.czul, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

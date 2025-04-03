package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.akzt;
import defpackage.dbwd;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbwb extends dbwk implements ekhu, fbas, ekhq, ekkk, elar {
    private dbwd ag;
    private Context ah;
    private final lkv ai = new lkv(this);
    private final ekxu aj = new ekxu(this);
    private boolean ak;

    @Deprecated
    public dbwb() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return dbwd.class;
    }

    @Override // defpackage.efam, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aj.k();
        try {
            super.M(layoutInflater, viewGroup, bundle);
            final dbwd H = H();
            layoutInflater.getClass();
            View inflate = layoutInflater.inflate(R.layout.gaia_pairing_verification_error_state_fragment, (ViewGroup) null);
            ((Button) inflate.findViewById(R.id.gaia_pairing_dismiss_button)).setOnClickListener(new View.OnClickListener() { // from class: dbwc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    eg G = dbwd.this.b.G();
                    if (G != null) {
                        G.finish();
                    }
                }
            });
            inflate.getClass();
            Button button = (Button) inflate.findViewById(R.id.gaia_pairing_dismiss_button);
            TextView textView = (TextView) inflate.findViewById(R.id.gaia_pairing_verification_title);
            TextView textView2 = (TextView) inflate.findViewById(R.id.gaia_pairing_verification_info);
            button.setText(H.b.B().getString(R.string.gaia_pairing_verification_dismiss_button_text));
            textView.setText(H.b.B().getString(R.string.gaia_pairing_secure_account_title_text));
            String string = H.b.B().getString(R.string.gaia_pairing_google_account_security_link_text);
            string.getClass();
            String string2 = H.b.B().getString(R.string.gaia_pairing_secure_account_text);
            string2.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
            Context z = H.b.z();
            if (z == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Bundle bundle2 = H.b.m;
            String string3 = bundle2 != null ? bundle2.getString("dusi") : null;
            if (string3 != null && string3.length() != 0) {
                final String str = dbwd.a.e() + "/id/" + string3;
                crmi.c(z, spannableStringBuilder, string, new URLSpan(str) { // from class: com.google.android.apps.messaging.ui.gaia.verification.GaiaPairingVerificationSecureAccountFragmentPeer$setupSecureAccountTextWithLink$2
                    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        view.getClass();
                        super.onClick(view);
                        ((akzt) dbwd.this.c.b()).c("Bugle.Gaia.Pairing.Account.Secure.Url.Clicked");
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        textPaint.getClass();
                    }
                });
                textView2.setText(spannableStringBuilder);
                egyl.d(textView2, LinkMovementMethod.getInstance());
                textView2.setContentDescription(H.b.B().getString(R.string.gaia_pairing_secure_account_text));
                ekyf.q();
                return inflate;
            }
            final String str2 = (String) dbwd.a.e();
            crmi.c(z, spannableStringBuilder, string, new URLSpan(str2) { // from class: com.google.android.apps.messaging.ui.gaia.verification.GaiaPairingVerificationSecureAccountFragmentPeer$setupSecureAccountTextWithLink$1
                @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                public final void onClick(View view) {
                    view.getClass();
                    super.onClick(view);
                    ((akzt) dbwd.this.c.b()).c("Bugle.Gaia.Pairing.Account.Secure.Url.Clicked");
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.getClass();
                }
            });
            textView2.setText(spannableStringBuilder);
            egyl.d(textView2, LinkMovementMethod.getInstance());
            textView2.setContentDescription(H.b.B().getString(R.string.gaia_pairing_secure_account_text));
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

    @Override // defpackage.ekhu
    /* renamed from: aT, reason: merged with bridge method [inline-methods] */
    public final dbwd H() {
        dbwd dbwdVar = this.ag;
        if (dbwdVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return dbwdVar;
    }

    @Override // defpackage.dbwk
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

    @Override // defpackage.dbwk, defpackage.efam, defpackage.ea
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

    @Override // defpackage.dbwk, defpackage.dn, defpackage.ea
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
                    if (!(eaVar instanceof dbwb)) {
                        throw new IllegalStateException(a.J(eaVar, dbwd.class));
                    }
                    this.ag = new dbwd((dbwb) eaVar, ((akgt) aX).a.a.C);
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
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dbwk, defpackage.dn, defpackage.ea
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

    @Override // defpackage.dbwk, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

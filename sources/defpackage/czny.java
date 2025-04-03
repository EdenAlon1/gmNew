package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import defpackage.fbal;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czny extends czni implements ekhu, fbas, ekhq, ekkk, elar {
    private czob a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public czny() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return czob.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            final czob H = H();
            layoutInflater.getClass();
            View inflate = layoutInflater.inflate(R.layout.rbm_deep_link_error_page_fragment, viewGroup, false);
            Button button = (Button) inflate.findViewById(R.id.rbm_error_page_button);
            button.setText(inflate.getContext().getResources().getString(R.string.rbm_error_page_button));
            button.setOnClickListener(new View.OnClickListener() { // from class: cznz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    czob.this.a.fe().finish();
                }
            });
            TextView textView = (TextView) inflate.findViewById(R.id.rbm_error_page_body);
            Context context = inflate.getContext();
            context.getClass();
            String string = context.getResources().getString(R.string.rbm_error_page_learn_more);
            string.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getResources().getString(R.string.rbm_error_page_body, string));
            crmi.d(context, spannableStringBuilder, string, new View.OnClickListener() { // from class: czoa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    czob czobVar = czob.this;
                    eg fe = czobVar.a.fe();
                    GoogleHelp googleHelp = new GoogleHelp("eligible");
                    googleHelp.G = true;
                    googleHelp.q = Uri.parse((String) czobVar.b.b());
                    InProductHelp inProductHelp = new InProductHelp(googleHelp, null, null, 0, null, 0, null);
                    inProductHelp.c = (String) czobVar.b.b();
                    new dgno(fe).d(inProductHelp);
                }
            });
            textView.setText(spannableStringBuilder);
            egyl.b(textView);
            egyl.c(textView);
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

    @Override // defpackage.czni, defpackage.efaf, defpackage.ea
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

    @Override // defpackage.czni
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

    @Override // defpackage.ekhu
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final czob H() {
        czob czobVar = this.a;
        if (czobVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return czobVar;
    }

    @Override // defpackage.czni, defpackage.ekkd, defpackage.ea
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
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof czny)) {
                        throw new IllegalStateException(a.J(eaVar, czob.class));
                    }
                    czob czobVar = new czob((czny) eaVar, ((akgt) aX).a.b.px);
                    this.a = czobVar;
                    czobVar.c = this;
                    this.Z.c(new ekkg(this.c, this.e));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
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

    @Override // defpackage.czni, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.fbal;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajko extends ajkj implements ekhu, fbas, ekhq, ekkk, elar {
    private ajkt a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public ajko() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return ajkt.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            ajkt H = H();
            layoutInflater.getClass();
            View inflate = layoutInflater.inflate(true != H.b() ? R.layout.identity_details_fragment_legacy : R.layout.identity_details_fragment, viewGroup, false);
            if (((bzqa) H.e.b()).p()) {
                inflate.getClass();
                TextView textView = (TextView) inflate.findViewById(R.id.identity_details_intro);
                textView.setText(R.string.security_key_page_intro);
                final Context context = inflate.getContext();
                Resources resources = context.getResources();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(resources.getString(R.string.security_key_page_description));
                String e = ((bzqa) H.e.b()).e();
                e.getClass();
                if (!TextUtils.isEmpty(e)) {
                    String a = crmi.a(context);
                    spannableStringBuilder = ddyi.f(context, spannableStringBuilder.append((CharSequence) " ").append((CharSequence) a).toString(), a);
                    final Uri a2 = ddyi.a(e, context);
                    ((TextView) inflate.findViewById(R.id.identity_details_learn_more)).setOnClickListener(new View.OnClickListener() { // from class: ajkp
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            enru enruVar = ajkt.a;
                            Context context2 = context;
                            context2.getClass();
                            Intent data = new Intent("android.intent.action.VIEW").setData(a2);
                            data.getClass();
                            eldl.p(context2, data);
                        }
                    });
                }
                ((TextView) inflate.findViewById(R.id.identity_details_learn_more)).setText(spannableStringBuilder);
                ejxn ejxnVar = (ejxn) H.h.b();
                bzqg bzqgVar = (bzqg) H.f.b();
                awui awuiVar = H.i.c;
                if (awuiVar == null) {
                    awuiVar = awui.a;
                }
                ejxnVar.g(R.id.get_identity_details_security_key, bzqgVar.a(awuiVar, H.i.d), H.j);
                ((akzt) H.g.b()).c("Bugle.Etouffee.UI.IdentityDetails.Page.Open.Counts");
            }
            if (H.b()) {
                inflate.getClass();
                ComposeView composeView = (ComposeView) inflate.findViewById(R.id.identity_details_compose_view);
                composeView.j();
                composeView.a(new hpw(-1954299512, true, new ajks(H)));
            }
            inflate.getClass();
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

    @Override // defpackage.ajkj, defpackage.efaf, defpackage.ea
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

    @Override // defpackage.ajkj
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
    public final ajkt H() {
        ajkt ajktVar = this.a;
        if (ajktVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ajktVar;
    }

    @Override // defpackage.ajkj, defpackage.ekkd, defpackage.ea
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
                    akis akisVar = ((akgt) aX).a;
                    fbbf fbbfVar = akisVar.lz;
                    fbbf fbbfVar2 = akisVar.cI;
                    fbbf fbbfVar3 = akisVar.b.pg;
                    fbbf fbbfVar4 = akisVar.a.f;
                    fbbf fbbfVar5 = ((akgt) aX).ag;
                    Bundle a = ((akgt) aX).a();
                    eyfc eyfcVar = (eyfc) ((akgt) aX).a.b.gz.b();
                    emxf.b(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    ajkn ajknVar = (ajkn) ProtoParsers.f(a, "TIKTOK_FRAGMENT_ARGUMENT", ajkn.a, eyfcVar);
                    ajknVar.getClass();
                    this.a = new ajkt(eaVar, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, ajknVar);
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

    @Override // defpackage.ajkj, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

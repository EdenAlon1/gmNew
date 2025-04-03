package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.ekkz;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbtz extends dbvc implements ekhu, fbas, ekhq, ekkk, elar {
    private dbuc a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public dbtz() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return dbuc.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final dbuc H = H();
            layoutInflater.getClass();
            View inflate = layoutInflater.inflate(R.layout.gaia_pairing_reset_primary_fragment_v2, (ViewGroup) null);
            inflate.getClass();
            ((TextView) inflate.findViewById(R.id.gaia_pairing_reset_primary_title)).setText(H.b.B().getString(R.string.gaia_pairing_reset_primary_title_text));
            ((TextView) inflate.findViewById(R.id.gaia_pairing_reset_primary_info)).setText(H.b.B().getString(R.string.gaia_pairing_reset_primary_info_text_v2));
            ((Button) inflate.findViewById(R.id.gaia_pairing_reset_primary_button)).setText(H.b.B().getString(R.string.gaia_pairing_reset_primary_button_text_v2));
            ((Button) inflate.findViewById(R.id.gaia_pairing_reset_primary_button)).setOnClickListener(new elay((elbx) H.e.b(), "GaiaPairingResetPrimaryFragmentPeer::resetPrimaryButtonOnClickListener", new View.OnClickListener() { // from class: dbua
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    view.setEnabled(false);
                    ensk h = dbuc.a.h();
                    h.Y(ente.a, "BugleGDitto");
                    ((enrr) h.h("com/google/android/apps/messaging/ui/gaia/GaiaPairingResetPrimaryFragmentPeer", "onCreateView$lambda$0", 74, "GaiaPairingResetPrimaryFragmentPeer.kt")).q("Start resetting to be the primary device flow");
                    dbuc dbucVar = dbuc.this;
                    ((ejlq) dbucVar.d.b()).g(ejlp.b(((bzib) dbucVar.c.b()).f()), dbucVar.g);
                }
            }));
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

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dbuc H() {
        dbuc dbucVar = this.a;
        if (dbucVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return dbucVar;
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

    @Override // defpackage.dbvc, defpackage.efaf, defpackage.ea
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

    @Override // defpackage.dbvc
    protected final /* bridge */ /* synthetic */ ekky b() {
        return new ekkt(this, true);
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

    @Override // defpackage.dbvc, defpackage.ekkd, defpackage.ea
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
                    if (!(eaVar instanceof dbtz)) {
                        throw new IllegalStateException(a.J(eaVar, dbuc.class));
                    }
                    this.a = new dbuc((dbtz) eaVar, ((akgo) aX).dl, ((akgo) aX).f, ((akgo) aX).b.ap, ((akgo) aX).a.a.C);
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
            dbuc H = H();
            ((ejlq) H.d.b()).k(H.g);
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

    @Override // defpackage.dbvc, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

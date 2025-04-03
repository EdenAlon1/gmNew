package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.Compose2oMessagePartDataConverter;
import defpackage.ekkz;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhu extends uhz implements ekhu, fbas, ekhq, ekkk, elar {
    private uhx a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public uhu() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return uhx.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            H();
            View inflate = layoutInflater.inflate(R.layout.c2o_fragment, viewGroup, false);
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
    public final uhx H() {
        uhx uhxVar = this.a;
        if (uhxVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return uhxVar;
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ae(Bundle bundle) {
        this.c.k();
        try {
            aU(bundle);
            uhx H = H();
            czgy g = H.g();
            Compose2oFragment h = H.h();
            dbxp H2 = h.H();
            if (g.aY() && g.fu()) {
                H2.d(0, 0, H.e.b(-1));
                if (((Boolean) cjja.a.e()).booleanValue()) {
                    H2.l = true;
                }
            } else {
                cpbn H3 = g.H();
                H2.d(H3.c(), H3.b(), H3.d());
                if (((Boolean) cjja.a.e()).booleanValue()) {
                    H2.l = false;
                }
            }
            bcvr bcvrVar = (bcvr) g.E().a();
            H.h = new AttachmentQueueState(bcvrVar, new Compose2oMessagePartDataConverter());
            bcvrVar.D(H.h);
            h.H().f(H.d.d());
            h.H().n(true);
            h.H().e(new uhw(H));
            H.g.b(bundle);
            H.i.g(bundle);
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

    @Override // defpackage.uhz, defpackage.efaf, defpackage.ea
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
            uhx H = H();
            dcae dcaeVar = H.i;
            if (dcaeVar != null) {
                dcaeVar.h();
            }
            bcpw E = H.g().E();
            if (E != null && E.g()) {
                ((bcvr) E.a()).am(H.h);
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
            dcae dcaeVar = H().i;
            if (dcaeVar != null) {
                dcaeVar.r();
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ao() {
        elav b = this.c.b();
        try {
            bi();
            dcae dcaeVar = H().i;
            if (dcaeVar != null) {
                dcaeVar.s();
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

    @Override // defpackage.uhz
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

    @Override // defpackage.uhz, defpackage.ekkd, defpackage.ea
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
                    this.a = new uhx((uco) ((akgo) aX).a.b.ht.b(), (alcb) ((akgo) aX).p.b(), (dcax) ((akgo) aX).aU.b(), (cxqh) ((akgo) aX).a.a.af.b(), (csuk) ((akgo) aX).a.a.ha.b(), (ea) ((fbbb) ((akgo) aX).e).a, (uot) ((akgo) aX).T.b(), (alct) ((akgo) aX).an.b(), ((akgo) aX).d());
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
    public final void k(Bundle bundle) {
        this.c.k();
        try {
            bj(bundle);
            uhx H = H();
            dcae dcaeVar = H.i;
            if (dcaeVar != null) {
                dcaeVar.i(bundle);
            }
            H.g.c(bundle);
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
            dcae dcaeVar = H().i;
            if (dcaeVar != null) {
                dcaeVar.t();
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void m() {
        this.c.k();
        try {
            bl();
            dcae dcaeVar = H().i;
            if (dcaeVar != null) {
                dcaeVar.u();
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

    @Override // defpackage.efaf, defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dcae dcaeVar = H().i;
        if (dcaeVar != null) {
            dcaeVar.p(configuration);
        }
    }

    @Override // defpackage.efaf, defpackage.ea, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        dcae dcaeVar = H().i;
        if (dcaeVar != null) {
            dcaeVar.q();
        }
    }

    @Override // defpackage.uhz, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.fbal;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cznm extends cznh implements ekhu, fbas, ekhq, ekkk, elar {
    private czns a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public cznm() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return czns.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            czns H = H();
            layoutInflater.getClass();
            ((ensz) czns.a.h()).q("Attempted to launch RbmDeepLinkFragment.");
            View inflate = layoutInflater.inflate(R.layout.rbm_open_deep_link_fragment, viewGroup, false);
            Object b = H.c.b();
            b.getClass();
            axol.k((ffsk) b, null, new cznv(H, null), 3);
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

    @Override // defpackage.cznh, defpackage.efaf, defpackage.ea
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

    @Override // defpackage.cznh
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
    public final czns H() {
        czns cznsVar = this.a;
        if (cznsVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cznsVar;
    }

    @Override // defpackage.cznh, defpackage.ekkd, defpackage.ea
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
                    Activity activity = (Activity) ((akgt) aX).c.d.b();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof cznm)) {
                        throw new IllegalStateException(a.J(eaVar, czns.class));
                    }
                    fbbf fbbfVar = ((akgt) aX).g;
                    akis akisVar = ((akgt) aX).a;
                    akkp akkpVar = akisVar.a;
                    fbbf fbbfVar2 = akkpVar.p;
                    akgg akggVar = ((akgt) aX).b;
                    fbbf fbbfVar3 = akggVar.f;
                    fbbf fbbfVar4 = akkpVar.Z;
                    fbbf fbbfVar5 = akkpVar.nW;
                    akko akkoVar = akisVar.b;
                    czns cznsVar = new czns(activity, (cznm) eaVar, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, akkoVar.fp, akkpVar.eT, akkpVar.BQ, ((akgt) aX).k, ((akgt) aX).bf, akkoVar.pu, akkoVar.oG, ((akgt) aX).aL, akisVar.q, akkoVar.fa, akkpVar.ld, akkpVar.BP, akkoVar.pv, akkoVar.pw, akkpVar.nH, akkpVar.G, akggVar.d);
                    this.a = cznsVar;
                    cznsVar.o = this;
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

    @Override // defpackage.cznh, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

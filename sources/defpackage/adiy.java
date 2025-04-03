package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.messaging.R;
import defpackage.fbal;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adiy extends adjg implements ekhu, fbas, ekhq, ekkk, elar {
    private adjf a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public adiy() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return adjf.class;
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.e;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final adjf H() {
        adjf adjfVar = this.a;
        if (adjfVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return adjfVar;
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

    @Override // defpackage.adjg, defpackage.efaf, defpackage.ea
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

    @Override // defpackage.adjg
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

    @Override // defpackage.adjg, defpackage.ekkd, defpackage.ea
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
                    this.a = new adjf(eaVar, akisVar.a.f, akisVar.aJ, akisVar.aR, ((akgt) aX).f, ((akgt) aX).ae, akisVar.cz, akisVar.aK, ((akgt) aX).af);
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aY(bundle);
            final adjf H = H();
            if (bundle != null) {
                H.k = bundle.getBoolean("state_disc_visible", true);
            }
            H.f = ejgs.a(H.d.I());
            H.g = ((ebbg) H.f).b;
            ((ejxn) H.m.b()).g(R.id.account_menu_refresh_local_subscription_id, new adiv((adiw) H.n.b()), new adje(H));
            ea eaVar = H.d;
            if (((Boolean) ((cfup) csfu.k.get()).e()).booleanValue() && csgj.a()) {
                eaVar.I().r(new fx() { // from class: adja
                    @Override // defpackage.fx
                    public final void h(ea eaVar2) {
                        if (eaVar2 instanceof dn) {
                            adjf adjfVar = adjf.this;
                            Boolean bool = adjfVar.r;
                            if (bool != null && !bool.booleanValue()) {
                                ensk e = adjf.c.e();
                                e.Y(ente.a, "BugleCms");
                                ((enrr) ((enrr) e).h("com/google/android/apps/messaging/gaia/apd/BugleNonAccountScopedOGParticleDiscActionFragmentPeer", "addObserverToTheAccountMenuCard", 270, "BugleNonAccountScopedOGParticleDiscActionFragmentPeer.java")).q("No linked account for CMS, skip adding observer on the Account Menu.");
                            } else {
                                ensk e2 = adjf.c.e();
                                e2.Y(ente.a, "BugleCms");
                                ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/gaia/apd/BugleNonAccountScopedOGParticleDiscActionFragmentPeer", "addObserverToTheAccountMenuCard", 277, "BugleNonAccountScopedOGParticleDiscActionFragmentPeer.java")).q("Adding observer on the Account Menu: OgDialogFragment.");
                                eaVar2.P().c(new adjd(adjfVar));
                            }
                        }
                    }
                });
                ekyf.q();
            }
            ensk e = adjf.c.e();
            e.Y(ente.a, "BugleCms");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/gaia/apd/BugleNonAccountScopedOGParticleDiscActionFragmentPeer", "addObserverToTheAccountMenuCard", 260, "BugleNonAccountScopedOGParticleDiscActionFragmentPeer.java")).q("Flag is off, skip adding observer on the Account Menu.");
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void k(Bundle bundle) {
        this.c.k();
        try {
            bj(bundle);
            bundle.putBoolean("state_disc_visible", H().k);
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
            adjf H = H();
            H.g.c(H.e);
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
            adjf H = H();
            H.g.d(H.e);
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

    @Override // defpackage.adjg, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

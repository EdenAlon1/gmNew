package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.fbal;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czzq extends czys implements ekhu, fbas, ekhq, ekkk, elar {
    private czzu b;
    private Context c;
    private final lkv d = new lkv(this);
    private boolean e;

    @Deprecated
    public czzq() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return czzu.class;
    }

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a.k();
        try {
            q(layoutInflater, viewGroup, bundle);
            czzu H = H();
            layoutInflater.getClass();
            ((enrr) czzu.a.h().h("com/google/android/apps/messaging/ui/conversationlist/ShareIntentTabletModeCheckFragmentPeer", "onCreateView", 80, "ShareIntentTabletModeCheckFragmentPeer.kt")).q("DRAFTBUG(b/348065860): onCreateView");
            if (((Optional) H.c.b()).isPresent() && ((acio) ((Optional) H.c.b()).get()).m() && ((Optional) H.d.b()).isPresent()) {
                final acls aclsVar = (acls) ((Optional) H.d.b()).get();
                ((ejwl) H.b.b()).b(new ejuy((ejvb) H.e.b(), new eros() { // from class: czzt
                    @Override // defpackage.eros
                    public final erph a(erpc erpcVar) {
                        return new erph(acls.this.b());
                    }
                }, "ditto_satellite_mode_key"), H.f);
            } else {
                H.b();
            }
            ekyf.q();
            return null;
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
        return this.d;
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
        if (this.c == null) {
            this.c = new ekkn(this, super.z());
        }
        return this.c;
    }

    @Override // defpackage.czys, defpackage.ea
    public final void ag(Activity activity) {
        this.a.k();
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

    @Override // defpackage.czys
    protected final /* synthetic */ fbae b() {
        return new ekku(this);
    }

    @Override // defpackage.ekkc, defpackage.elar
    public final elds bb() {
        return this.a.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.ekkc, defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.a.e(eldsVar, z);
    }

    @Override // defpackage.ekkc, defpackage.elar
    public final void be(elds eldsVar) {
        this.a.b = eldsVar;
    }

    @Override // defpackage.ekhu
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final czzu H() {
        czzu czzuVar = this.b;
        if (czzuVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return czzuVar;
    }

    @Override // defpackage.czys, defpackage.ekkc, defpackage.ea
    public final void g(Context context) {
        this.a.k();
        try {
            if (this.e) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.b == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof czzq)) {
                        throw new IllegalStateException(a.J(eaVar, czzu.class));
                    }
                    fbbf fbbfVar = ((akgt) aX).k;
                    fazb a = fbaz.a(((akgt) aX).c.aK);
                    fbbf fbbfVar2 = ((akgt) aX).bk;
                    akis akisVar = ((akgt) aX).a;
                    this.b = new czzu((czzq) eaVar, fbbfVar, a, fbbfVar2, akisVar.b.fp, ((akgt) aX).c.aG, akisVar.dy, akisVar.a.nV);
                    this.Z.c(new ekkg(this.a, this.d));
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
        this.a.k();
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

    @Override // defpackage.ea
    public final void j() {
        elav a = this.a.a();
        try {
            p();
            this.e = true;
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

    @Override // defpackage.czys, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

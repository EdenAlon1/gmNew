package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aesr extends aesq implements ekhu, fbas, ekhq, ekkk, elar {
    private aesu aq;
    private Context ar;
    private final lkv as = new lkv(this);
    private final ekxu at = new ekxu(this);
    private boolean au;

    @Deprecated
    public aesr() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return aesu.class;
    }

    @Override // defpackage.drwc, defpackage.efam, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.at.k();
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
        return this.as;
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
        elav j = this.at.j();
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
        this.at.h(i, i2);
        ekyf.q();
    }

    @Override // defpackage.ekhu
    /* renamed from: aU, reason: merged with bridge method [inline-methods] */
    public final aesu H() {
        aesu aesuVar = this.aq;
        if (aesuVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.au) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return aesuVar;
    }

    @Override // defpackage.druz
    protected final /* synthetic */ fbae aV() {
        return new ekku(this);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.ar == null) {
            this.ar = new ekkn(this, super.z());
        }
        return this.ar;
    }

    @Override // defpackage.efam, defpackage.ea
    public final void ae(Bundle bundle) {
        this.at.k();
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
        elav f = this.at.f();
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

    @Override // defpackage.aesq, defpackage.druz, defpackage.efam, defpackage.ea
    public final void ag(Activity activity) {
        this.at.k();
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
        elav b = this.at.b();
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
        this.at.k();
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
        elav b = this.at.b();
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

    @Override // defpackage.drwc, defpackage.efam, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.at.k();
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
        return this.at.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.at.e(eldsVar, z);
    }

    @Override // defpackage.elar
    public final void be(elds eldsVar) {
        this.at.b = eldsVar;
    }

    @Override // defpackage.aesq, defpackage.druz, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        this.at.k();
        try {
            if (this.au) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.aq == null) {
                try {
                    this.aq = new aesu(((akgt) aX()).ak);
                    this.Z.c(new ekkg(this.at, this.as));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            lkr lkrVar = this.E;
            if (lkrVar instanceof elar) {
                ekxu ekxuVar = this.at;
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

    @Override // defpackage.aesq, defpackage.druz, defpackage.dn, defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.at.k();
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
        this.at.k();
        try {
            super.h(bundle);
            aesu H = H();
            if (bundle != null) {
                GalleryContent galleryContent = (GalleryContent) bundle.getParcelable("contentKey");
                if (galleryContent != null) {
                    H.a(galleryContent);
                }
                H.c = bundle.getInt("contentPositionInList", -1);
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
        elav b = this.at.b();
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
        elav a = this.at.a();
        try {
            super.j();
            this.au = true;
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
        this.at.k();
        try {
            super.k(bundle);
            aesu H = H();
            GalleryContent galleryContent = H.b;
            if (galleryContent == null) {
                ffkj.c("content");
                galleryContent = null;
            }
            bundle.putParcelable("contentKey", galleryContent);
            bundle.putInt("contentPositionInList", H.c);
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
        this.at.k();
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
        this.at.k();
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
        this.at.g().close();
    }

    @Override // defpackage.drwc, defpackage.dn, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        elav i = this.at.i();
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

    @Override // defpackage.aesq, defpackage.druz, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

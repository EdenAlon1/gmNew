package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgu extends abgt implements ekhu, fbas, ekhq, ekkk, elar {
    private abho ag;
    private Context ah;
    private final lkv ai = new lkv(this);
    private final ekxu aj = new ekxu(this);
    private boolean ak;

    @Deprecated
    public abgu() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return abho.class;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007a, code lost:
    
        if (r6 != 3) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0136 A[Catch: all -> 0x0158, TryCatch #0 {all -> 0x0158, blocks: (B:3:0x0007, B:6:0x0020, B:11:0x00cc, B:13:0x00e1, B:14:0x00ef, B:16:0x0125, B:17:0x012a, B:18:0x012f, B:20:0x0136, B:21:0x014d, B:28:0x007c, B:31:0x0087, B:35:0x0091, B:37:0x00c1, B:38:0x00c6), top: B:2:0x0007 }] */
    @Override // defpackage.efam, defpackage.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View M(android.view.LayoutInflater r20, android.view.ViewGroup r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abgu.M(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
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

    @Override // defpackage.abgt
    protected final /* synthetic */ fbae aU() {
        return new ekku(this);
    }

    @Override // defpackage.ekhu
    /* renamed from: aY, reason: merged with bridge method [inline-methods] */
    public final abho H() {
        abho abhoVar = this.ag;
        if (abhoVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return abhoVar;
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

    @Override // defpackage.abgt, defpackage.efam, defpackage.ea
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
            dsfg dsfgVar = H().r;
            if (dsfgVar != null) {
                dsfgVar.f();
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

    @Override // defpackage.efam, defpackage.ea
    public final void am() {
        this.aj.k();
        try {
            super.am();
            dsfg dsfgVar = H().r;
            if (dsfgVar == null) {
                ffkj.c("hugoManager");
                dsfgVar = null;
            }
            dsfgVar.f();
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
            abho H = H();
            H.c.N().setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            dsfg dsfgVar = H.r;
            dsfg dsfgVar2 = null;
            if (dsfgVar == null) {
                ffkj.c("hugoManager");
                dsfgVar = null;
            }
            dsfgVar.d();
            int a = abgw.a(H.f.c);
            if (a == 0) {
                a = 1;
            }
            int i = a - 2;
            if (i == 1) {
                dsfg dsfgVar3 = H.r;
                if (dsfgVar3 == null) {
                    ffkj.c("hugoManager");
                } else {
                    dsfgVar2 = dsfgVar3;
                }
                dsfgVar2.m(ffdx.b(dszr.b), dszr.b);
            } else if (i == 2) {
                dsfg dsfgVar4 = H.r;
                if (dsfgVar4 == null) {
                    ffkj.c("hugoManager");
                } else {
                    dsfgVar2 = dsfgVar4;
                }
                dsfgVar2.k(dszr.a);
            } else {
                if (i != 3) {
                    throw new IllegalStateException("A picker mode must be specified.");
                }
                dsfg dsfgVar5 = H.r;
                if (dsfgVar5 == null) {
                    ffkj.c("hugoManager");
                } else {
                    dsfgVar2 = dsfgVar5;
                }
                dsfgVar2.m(ffdx.g(dszr.i, dszr.b), dszr.b);
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

    @Override // defpackage.efam, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.aj.k();
        try {
            super.ap(view, bundle);
            abho H = H();
            view.getClass();
            if (bundle != null) {
                dsfg dsfgVar = H.r;
                if (dsfgVar == null) {
                    ffkj.c("hugoManager");
                    dsfgVar = null;
                }
                dsfgVar.i(bundle);
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
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        emxf.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
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

    @Override // defpackage.abgt, defpackage.dn, defpackage.ea
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
                    if (!(eaVar instanceof abgu)) {
                        throw new IllegalStateException(a.J(eaVar, abho.class));
                    }
                    dsfh dsfhVar = (dsfh) ((akgt) aX).s.b();
                    dsma dsmaVar = (dsma) ((akgt) aX).c.bx.b();
                    Optional of = Optional.of(((akgt) aX).a.hI);
                    Optional of2 = Optional.of(((akgt) aX).u);
                    Optional of3 = Optional.of(((akgt) aX).P);
                    dqki dqkiVar = (dqki) ((akgt) aX).a.b.hE.b();
                    dqnk dqnkVar = (dqnk) ((akgt) aX).t.b();
                    Bundle a = ((akgt) aX).a();
                    eyfc eyfcVar = (eyfc) ((akgt) aX).a.b.gz.b();
                    emxf.b(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    abgx abgxVar = (abgx) ProtoParsers.f(a, "TIKTOK_FRAGMENT_ARGUMENT", abgx.a, eyfcVar);
                    abgxVar.getClass();
                    this.ag = new abho((abgu) eaVar, dsfhVar, dsmaVar, of, of2, of3, dqkiVar, dqnkVar, abgxVar);
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
        } finally {
        }
    }

    @Override // defpackage.abgt, defpackage.dn, defpackage.ea
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
            H().c.q(1, R.style.ReactionPickerStyle);
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

    @Override // defpackage.ehbo, defpackage.kc, defpackage.dn
    public final Dialog hf(Bundle bundle) {
        super.hf(bundle);
        abho H = H();
        abgu abguVar = H.c;
        return new abhm(H, abguVar.A(), abguVar.b);
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
            dsfg dsfgVar = H().r;
            if (dsfgVar == null) {
                ffkj.c("hugoManager");
                dsfgVar = null;
            }
            dsfgVar.j(bundle);
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
        Window window;
        this.aj.k();
        try {
            super.l();
            abho H = H();
            Dialog dialog = H.c.d;
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setFlags(2, 2);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.dimAmount = kpp.a(H.c.B(), R.dimen.reaction_picker_background_dim_amount);
                window.setAttributes(attributes);
            }
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

    @Override // defpackage.efam, defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dsfg dsfgVar = H().r;
        if (dsfgVar == null) {
            ffkj.c("hugoManager");
            dsfgVar = null;
        }
        dsfgVar.g();
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

    @Override // defpackage.abgt, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

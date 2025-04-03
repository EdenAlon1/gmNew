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
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejia extends ejih implements ekhu, fbas, ekhq, ekkk, elar {
    private ejie ag;
    private Context ah;
    private final lkv ai = new lkv(this);
    private final ekxu aj = new ekxu(this);
    private boolean ak;

    @Deprecated
    public ejia() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return ejie.class;
    }

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aj.k();
        try {
            super.M(layoutInflater, viewGroup, bundle);
            final ejie H = H();
            View inflate = layoutInflater.inflate(R.layout.express_sign_in_fragment, viewGroup, false);
            ExpressSignInLayout expressSignInLayout = (ExpressSignInLayout) inflate.findViewById(R.id.express_sign_in_layout);
            ejii ejiiVar = ((ejhu) ekhs.a(H.e)).b;
            ebrs ebrsVar = H.o;
            ebrv c = ebry.c();
            final elgr elgrVar = H.n;
            final ebrx ebrxVar = new ebrx() { // from class: ejib
                /* JADX WARN: Type inference failed for: r6v15, types: [ejhy, java.lang.Object] */
                @Override // defpackage.ebrx
                public final ListenableFuture a(emxc emxcVar) {
                    eixn eixnVar;
                    final ejie ejieVar = ejie.this;
                    if (emxcVar.g()) {
                        eixnVar = (eixn) emxcVar.c();
                    } else {
                        eixnVar = ejieVar.s;
                        eixnVar.getClass();
                    }
                    emxf.l(ejieVar.r.g());
                    emxf.l(((enhk) ejieVar.r.c()).containsKey(eixnVar));
                    if (((enhk) ejieVar.r.c()).get(eixnVar) == ejgk.INELIGIBLE) {
                        emxf.l(ejieVar.l.g());
                        ejieVar.l.c().a().t(ejieVar.f.I(), "$tiktok$account_ineligible_dialog");
                        return erqt.i(false);
                    }
                    final eisx a = eixnVar.a();
                    new ejij(eixnVar.b().c, eixnVar.b().g, eixnVar.b().k);
                    ejieVar.h.i(ejlp.b(erny.g(erre.a, eldl.d(new eroh() { // from class: ejic
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            return ejie.this.j.a(a);
                        }
                    }), ejieVar.q)), new ejlm(a), ejieVar.b);
                    return erqt.i(true);
                }
            };
            ((ebpm) c).a = new ebrx() { // from class: elgp
                @Override // defpackage.ebrx
                public final ListenableFuture a(emxc emxcVar) {
                    ebrx ebrxVar2 = ebrxVar;
                    ekzm b = elgr.this.a.b("Click Continue in TikTok Express SignIn");
                    try {
                        ListenableFuture a = ebrxVar2.a(emxcVar);
                        b.close();
                        return a;
                    } catch (Throwable th) {
                        try {
                            b.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            };
            ((ebpm) c).b = ((ejhz) ejiiVar).a;
            expressSignInLayout.a(ebrsVar, c.a());
            H.g.b(H.k, H.d);
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

    @Override // defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        this.aj.j().close();
        return false;
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
    public final ejie H() {
        ejie ejieVar = this.ag;
        if (ejieVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ejieVar;
    }

    @Override // defpackage.ejih
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

    @Override // defpackage.ea
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

    @Override // defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        elav f = this.aj.f();
        try {
            super.af(i, i2, intent);
            ejie H = H();
            if (i == 29878) {
                H.a();
            }
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

    @Override // defpackage.ejih, defpackage.ea
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

    @Override // defpackage.ea
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

    @Override // defpackage.ea
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

    @Override // defpackage.ea
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

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.aj.k();
        ekyf.q();
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

    @Override // defpackage.ejih, defpackage.dn, defpackage.ea
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
                    Context context2 = (Context) ((akgt) aX).c.d.b();
                    eg egVar = (eg) ((akgt) aX).c.f.b();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof ejia)) {
                        throw new IllegalStateException(a.J(eaVar, ejie.class));
                    }
                    ejia ejiaVar = (ejia) eaVar;
                    emxc j = emxc.j("google");
                    ejwl ejwlVar = (ejwl) ((akgt) aX).k.b();
                    ejlq ejlqVar = (ejlq) ((akgt) aX).l.b();
                    elbx elbxVar = (elbx) ((akgt) aX).a.aJ.b();
                    eiyk eiykVar = (eiyk) ((akgt) aX).a.a.o.b();
                    eiyh mv = ((akgt) aX).a.a.mv();
                    akko akkoVar = ((akgt) aX).a.b;
                    this.ag = new ejie(context2, egVar, ejiaVar, j, ejwlVar, ejlqVar, elbxVar, eiykVar, mv, new ejgj(new eizp((eiyx) akkoVar.a.a.Ud.b(), (eiyk) akkoVar.a.a.o.b()), enoz.a, (Executor) ((akgt) aX).a.p.b()), enoz.a, ((akgt) aX).H(), (ekmz) ((akgt) aX).ck.b(), (eizh) ((akgt) aX).ah.b(), ((akgt) aX).I(), (dwch) ((akgt) aX).a.b.kr.b(), (Executor) ((akgt) aX).a.p.b(), (errl) ((akgt) aX).a.t.b());
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

    @Override // defpackage.ejih, defpackage.dn, defpackage.ea
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

    @Override // defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        this.aj.k();
        try {
            super.h(bundle);
            ejie H = H();
            if (bundle != null) {
                H.p.a(bundle);
            }
            H.h.k(H.b);
            H.h.k(H.c);
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

    @Override // defpackage.dn
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

    @Override // defpackage.dn, defpackage.ea
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

    @Override // defpackage.dn, defpackage.ea
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

    @Override // defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        this.aj.k();
        try {
            super.k(bundle);
            H().p.b(bundle);
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

    @Override // defpackage.dn, defpackage.ea
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

    @Override // defpackage.dn, defpackage.ea
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

    @Override // defpackage.ejih, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

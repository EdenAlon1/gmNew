package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.fbal;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejhn extends ejhm implements ekhu, fbas, ekhq, ekkk, elar {
    private ejhs a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public ejhn() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return ejhs.class;
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        elav f = this.c.f();
        try {
            aV(i, i2, intent);
            ejhs H = H();
            if (i == 38294) {
                ejjz.c(H.k.b(), "Failed account invalidation.", new Object[0]);
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

    @Override // defpackage.ejhm, defpackage.efaf, defpackage.ea
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

    @Override // defpackage.ejhm
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
    public final ejhs H() {
        ejhs ejhsVar = this.a;
        if (ejhsVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ejhsVar;
    }

    @Override // defpackage.ejhm, defpackage.ekkd, defpackage.ea
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
                    Context context2 = (Context) ((akgt) aX).c.d.b();
                    Activity activity = (Activity) ((akgt) aX).c.d.b();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    emxc j = emxc.j("google");
                    ekmz ekmzVar = (ekmz) ((akgt) aX).ck.b();
                    elbx elbxVar = (elbx) ((akgt) aX).a.aJ.b();
                    eito eitoVar = (eito) ((akgt) aX).c.w.b();
                    eiyk eiykVar = (eiyk) ((akgt) aX).a.a.o.b();
                    eiyh mv = ((akgt) aX).a.a.mv();
                    eizh eizhVar = (eizh) ((akgt) aX).ah.b();
                    eixo eixoVar = (eixo) ((akgt) aX).a.a.as.b();
                    ejlq ejlqVar = (ejlq) ((akgt) aX).l.b();
                    ejwl ejwlVar = (ejwl) ((akgt) aX).k.b();
                    dfpi dfpiVar = (dfpi) ((akgt) aX).a.dF.b();
                    Executor executor = (Executor) ((akgt) aX).a.p.b();
                    errl errlVar = (errl) ((akgt) aX).a.t.b();
                    dwch dwchVar = (dwch) ((akgt) aX).a.b.kr.b();
                    Activity activity2 = (Activity) ((akgt) aX).c.d.b();
                    ebsi k = ebsj.k();
                    emux emuxVar = emux.a;
                    String string = activity2.getString(R.string.sign_in_for_messages_features);
                    if (string == null) {
                        throw new NullPointerException("Null title");
                    }
                    ((ebsb) k).a = emxc.j(new ebsa(string, emuxVar, emuxVar, emuxVar));
                    this.a = new ejhs(context2, activity, eaVar, j, ekmzVar, elbxVar, eitoVar, eiykVar, mv, eizhVar, eixoVar, ejlqVar, ejwlVar, dfpiVar, executor, errlVar, dwchVar, emxc.j(k.e()), ((akgt) aX).I());
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
            final ejhs H = H();
            if (bundle != null) {
                H.s.a(bundle);
            }
            ebrv c = ebry.c();
            c.c(new elgq(H.q, "Express SignIn Dialog: Clicked Continue", new ebrw() { // from class: ejhq
                @Override // defpackage.ebrw
                public final void a(emxc emxcVar) {
                    eixn eixnVar;
                    final ejhs ejhsVar = ejhs.this;
                    if (emxcVar.g()) {
                        eixnVar = (eixn) emxcVar.c();
                    } else {
                        eixnVar = ejhsVar.v;
                        eixnVar.getClass();
                    }
                    final eisx a = eixnVar.a();
                    new ejij(eixnVar.b().c, eixnVar.b().g, eixnVar.b().k);
                    ejhsVar.m.i(ejlp.b(erny.g(erre.a, eldl.d(new eroh() { // from class: ejhr
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            return ejhs.this.j.a(a);
                        }
                    }), ejhsVar.t)), new ejlm(a), ejhsVar.c);
                }
            }));
            final emxc emxcVar = H.p;
            ebsi a = ((ebsj) ((emxn) emxcVar).a).a();
            a.b(ebsn.a(H.f, new Runnable() { // from class: ejho
                @Override // java.lang.Runnable
                public final void run() {
                    emxn emxnVar = (emxn) emxcVar;
                    if (((ebsj) emxnVar.a).c().g()) {
                        ejhs ejhsVar = ejhs.this;
                        ((ebsm) ((ebsj) emxnVar.a).c().c()).a.run();
                        cg cgVar = new cg(ejhsVar.h.J());
                        cgVar.n(ejhsVar.h);
                        cgVar.c();
                    }
                }
            }));
            ((ebpm) c).b = a.e();
            ebry a2 = c.a();
            emux emuxVar = emux.a;
            ebrs ebrsVar = H.r;
            if (ebrsVar == null) {
                throw new NullPointerException("Null expressSignInManager");
            }
            ebpj ebpjVar = new ebpj(ebrsVar, a2, emuxVar, true);
            ea eaVar = H.h;
            H.u = new ebpy(eaVar.A(), eaVar.I(), ebpjVar, eaVar.G());
            H.m.k(H.c);
            H.m.k(H.d);
            H.n.b(H.l.b(), H.e);
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
            H().s.b(bundle);
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

    @Override // defpackage.ejhm, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

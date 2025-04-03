package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import defpackage.ejgy;
import defpackage.fbal;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejgq extends ejgn implements ekhu, fbas, ekhq, ekkk, elar {
    private ejgs a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public ejgq() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return ejgs.class;
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

    @Override // defpackage.ejgn, defpackage.efaf, defpackage.ea
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
            ejgs H = H();
            eivw eivwVar = H.a;
            eivwVar.a.remove(H.g);
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

    @Override // defpackage.ejgn
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
    public final ejgs H() {
        ejgs ejgsVar = this.a;
        if (ejgsVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ejgsVar;
    }

    @Override // defpackage.ejgn, defpackage.ekkd, defpackage.ea
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
                    if (!(eaVar instanceof ejgq)) {
                        throw new IllegalStateException(a.J(eaVar, ejgs.class));
                    }
                    ejgq ejgqVar = (ejgq) eaVar;
                    eivw eivwVar = (eivw) ((akgt) aX).c.o.b();
                    ejwl ejwlVar = (ejwl) ((akgt) aX).k.b();
                    eixo eixoVar = (eixo) ((akgt) aX).a.a.as.b();
                    ekmz ekmzVar = (ekmz) ((akgt) aX).c.U.b();
                    akgb akgbVar = ((akgt) aX).c;
                    final Activity activity = (Activity) akgbVar.d.b();
                    final ejhf aN = akgbVar.aN();
                    final elgu aR = akgbVar.aR();
                    final emxc j = emxc.j("google");
                    ebbd ebbdVar = new ebbd();
                    final ebaq ebaqVar = new ebaq() { // from class: ejgt
                        @Override // defpackage.ebaq, defpackage.eavd
                        public final void a(View view, Object obj) {
                            activity.startActivity(new Intent("android.settings.SYNC_SETTINGS"));
                        }
                    };
                    final String str = "OG: Manage Accounts";
                    ebbdVar.c = new ebaq() { // from class: elgs
                        @Override // defpackage.ebaq, defpackage.eavd
                        public final void a(View view, Object obj) {
                            ebaq ebaqVar2 = ebaqVar;
                            eixn eixnVar = (eixn) obj;
                            ekzm b = elgu.this.a.b(str);
                            try {
                                ebaqVar2.a(view, eixnVar);
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
                    };
                    final ebaq ebaqVar2 = new ebaq() { // from class: ejgu
                        @Override // defpackage.ebaq, defpackage.eavd
                        public final void a(View view, Object obj) {
                            Intent intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
                            intent.putExtra("account_types", new String[]{"com.google"});
                            activity.startActivity(intent);
                        }
                    };
                    final String str2 = "OG: Add Account";
                    ebbdVar.b = new ebaq() { // from class: elgs
                        @Override // defpackage.ebaq, defpackage.eavd
                        public final void a(View view, Object obj) {
                            ebaq ebaqVar22 = ebaqVar2;
                            eixn eixnVar = (eixn) obj;
                            ekzm b = elgu.this.a.b(str2);
                            try {
                                ebaqVar22.a(view, eixnVar);
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
                    };
                    final ebaq ebaqVar3 = new ebaq() { // from class: ejgv
                        @Override // defpackage.ebaq, defpackage.eavd
                        public final void a(View view, Object obj) {
                            eixn eixnVar = (eixn) obj;
                            if (eixnVar != null) {
                                emxc emxcVar = emxc.this;
                                if (((String) ((emxn) emxcVar).a).equals(eixnVar.b().k)) {
                                    Activity activity2 = activity;
                                    Intent a = ejha.a(eixnVar, 1);
                                    if (a.resolveActivity(activity2.getPackageManager()) != null) {
                                        activity2.startActivityForResult(a, 9631);
                                        return;
                                    } else {
                                        ejha.b(activity2, aN.c());
                                        return;
                                    }
                                }
                            }
                            throw new UnsupportedOperationException("Should only be visible for Google accounts");
                        }
                    };
                    final String str3 = "OG: My Account";
                    ebbdVar.a = new ebaq() { // from class: elgs
                        @Override // defpackage.ebaq, defpackage.eavd
                        public final void a(View view, Object obj) {
                            ebaq ebaqVar22 = ebaqVar3;
                            eixn eixnVar = (eixn) obj;
                            ekzm b = elgu.this.a.b(str3);
                            try {
                                ebaqVar22.a(view, eixnVar);
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
                    };
                    ebas a = ebbdVar.a();
                    akgb akgbVar2 = ((akgt) aX).c;
                    final Activity activity2 = (Activity) akgbVar2.d.b();
                    final ejhf aN2 = akgbVar2.aN();
                    final elgu aR2 = akgbVar2.aR();
                    final emxc j2 = emxc.j("google");
                    emux emuxVar = emux.a;
                    final eavd eavdVar = new eavd() { // from class: ejhb
                        @Override // defpackage.eavd
                        public final void a(View view, Object obj) {
                            Activity activity3 = activity2;
                            ejhf ejhfVar = aN2;
                            eixn eixnVar = (eixn) obj;
                            if (eixnVar != null) {
                                emxc emxcVar = emxc.this;
                                if (((String) ((emxn) emxcVar).a).equals(eixnVar.b().k)) {
                                    Intent a2 = ejha.a(eixnVar, 500);
                                    if (a2.resolveActivity(activity3.getPackageManager()) != null) {
                                        activity3.startActivityForResult(a2, 9631);
                                        return;
                                    } else {
                                        ejha.b(activity3, ejhfVar.d());
                                        return;
                                    }
                                }
                            }
                            ejha.b(activity3, ejhfVar.d());
                        }
                    };
                    final String str4 = "OG: Privacy Policy";
                    emxc j3 = emxc.j(new eavd() { // from class: elgt
                        @Override // defpackage.eavd
                        public final void a(View view, Object obj) {
                            eavd eavdVar2 = eavdVar;
                            eixn eixnVar = (eixn) obj;
                            ekzm b = elgu.this.a.b(str4);
                            try {
                                eavdVar2.a(view, eixnVar);
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
                    });
                    final eavd eavdVar2 = new eavd() { // from class: ejhc
                        @Override // defpackage.eavd
                        public final void a(View view, Object obj) {
                            Activity activity3 = activity2;
                            ejhf ejhfVar = aN2;
                            eixn eixnVar = (eixn) obj;
                            if (eixnVar != null) {
                                emxc emxcVar = emxc.this;
                                if (((String) ((emxn) emxcVar).a).equals(eixnVar.b().k)) {
                                    Intent a2 = ejha.a(eixnVar, 503);
                                    if (a2.resolveActivity(activity3.getPackageManager()) != null) {
                                        activity3.startActivityForResult(a2, 9631);
                                        return;
                                    } else {
                                        ejha.b(activity3, ejhfVar.e());
                                        return;
                                    }
                                }
                            }
                            ejha.b(activity3, ejhfVar.e());
                        }
                    };
                    final String str5 = "OG: Terms of Service";
                    ebla eblaVar = new ebla(j3, emxc.j(new eavd() { // from class: elgt
                        @Override // defpackage.eavd
                        public final void a(View view, Object obj) {
                            eavd eavdVar22 = eavdVar2;
                            eixn eixnVar = (eixn) obj;
                            ekzm b = elgu.this.a.b(str5);
                            try {
                                eavdVar22.a(view, eixnVar);
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
                    }), emuxVar, emuxVar);
                    eiwl aM = ((akgt) aX).c.aM();
                    emxc j4 = emxc.j("google");
                    Object b = ((akgt) aX).cj.b();
                    Object b2 = ((akgt) aX).cj.b();
                    ejgy ejgyVar = (ejgy) b2;
                    this.a = new ejgs(ejgqVar, eivwVar, ejwlVar, eixoVar, ekmzVar, a, eblaVar, aM, j4, (ejgy) b, new ejgy.a(ejgyVar, emxc.j(((akgt) aX).a.b.pX.b()), (ejgz) ((akgt) aX).a.b.pY.b(), emxc.j(Boolean.valueOf(((ersq) new aukx(((akgt) aX).c.b.b.a.a.s).a.b()).a("bugle.enable_sync_profile_cache_on_interactive")))), ((akgt) aX).c.aN(), (ScheduledExecutorService) ((akgt) aX).a.t.b(), (dwch) ((akgt) aX).a.b.kr.b());
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
            ejgs H = H();
            if (bundle == null) {
                ejgy ejgyVar = H.d;
                eisx b = H.f.g() != -1 ? eisx.b(H.f.g()) : null;
                boolean z = true;
                emxf.m(!((lkv) ejgyVar.a.P()).c.a(lkj.CREATED), "setInitialActiveAccount should only be invoked before or during #onCreate!");
                if (ejgyVar.d != null) {
                    z = false;
                }
                emxf.m(z, "activeAccount has already been set!");
                ejgyVar.d = b;
            }
            H.b.c(H.c.b(), ejwa.SAME_DAY, H.e);
            H.a.a(H.g);
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

    @Override // defpackage.ejgn, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekwr {
    public elat a;
    public boolean b;
    public elat c;
    public boolean d;
    public elav e;
    private final eg f;
    private final Context g;
    private elat h;
    private boolean i;
    private boolean j;
    private elav k;
    private elav l;

    public ekwr(eg egVar, Context context) {
        this.f = egVar;
        this.g = context;
    }

    static /* synthetic */ elav B(ekwr ekwrVar, String str) {
        return ekwrVar.D(str, null);
    }

    private final elae C(elae elaeVar) {
        elae e = elae.e(elaeVar, elae.d(((elcc) fazh.a(this.g, elcc.class)).bd()));
        e.getClass();
        return e;
    }

    private final elav D(String str, elae elaeVar) {
        if (!ekyf.v()) {
            elbx a = elcb.a(this.g);
            a.getClass();
            return elaeVar != null ? a.a.b(str, elae.e((elae) a.b.b(), elaeVar), a.d) : a.b(str);
        }
        if (elaeVar == null) {
            elaeVar = elad.a;
        }
        elaeVar.getClass();
        return eleg.g(str, C(elaeVar));
    }

    private final String E(String str) {
        return str + " " + this.g.getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void F(String str, String str2, Intent intent) {
        elae elaeVar;
        this.c = ekyf.c();
        long j = eldl.a;
        elat r = eldl.r(intent, true);
        elae elaeVar2 = elam.b;
        elac b = elae.b();
        b.a(elam.c, new ekyk() { // from class: ekwk
            @Override // defpackage.ekyk
            public final void a() {
            }
        });
        elae f = ((elae) b).f();
        if (r != null) {
            ekyf.g(r);
            this.a = r;
            elaeVar2.getClass();
            elaeVar = C(elaeVar2);
        } else {
            elat elatVar = this.a;
            if (elatVar != null) {
                ekyf.g(elatVar);
                elaeVar2.getClass();
                elaeVar = C(elaeVar2);
            } else {
                this.j = ekyf.w();
                elat c = ekyf.c();
                boolean z = (c instanceof elkx) && ((elkx) c).a();
                if (!ekyf.v() || z) {
                    elat f2 = ekyf.f();
                    if (f2 != null) {
                        this.k = f2;
                        ekyf.g(f2);
                        this.l = eleg.g(E(str), elae.e(f, elam.a(elal.INTENT_TO_ACTIVITY)));
                    } else {
                        this.k = elcb.a(this.g).c(E(str), elae.e(elaeVar2, elam.a(elal.INTENT_TO_ACTIVITY)));
                    }
                } else {
                    elaeVar2.getClass();
                    elaeVar2 = C(elaeVar2);
                }
                this.a = ekyf.c();
                elaeVar = elaeVar2;
            }
        }
        this.e = eleg.g(E(str2), elae.e(elaeVar, elam.a(elal.ACTIVITY_CREATE)));
        efbd.e(new Runnable() { // from class: ekwl
            @Override // java.lang.Runnable
            public final void run() {
                ekwr.this.a = null;
            }
        });
    }

    private final void G() {
        if (this.i) {
            this.a = null;
            this.i = false;
        }
    }

    private final void H() {
        elat elatVar = this.h;
        if (elatVar != null) {
            this.a = elatVar;
            this.h = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [elat, elav] */
    private final void I() {
        ?? r1;
        if (this.b) {
            return;
        }
        synchronized (eldl.c) {
            r1 = eldl.d;
            eldl.d = null;
        }
        if (r1 != 0) {
            this.b = true;
            this.a = r1;
        }
    }

    private final void J() {
        elav elavVar = this.e;
        if (elavVar == null) {
            return;
        }
        Objects.toString(elavVar);
        throw new IllegalStateException("Expected lifecycleStepSpan to be null but was: ".concat(elavVar.toString()));
    }

    public final elav A() {
        elae elaeVar = elad.a;
        elaeVar.getClass();
        p("onSaveInstanceState", elaeVar);
        return new ekwn(this);
    }

    public final elav a() {
        elae elaeVar = ekxh.a;
        final elav D = D("finish", ekxh.a);
        elat c = ekyf.c();
        this.h = c;
        c.getClass();
        synchronized (eldl.c) {
            eldl.d = c;
        }
        final eldh eldhVar = new eldh(c);
        return new elav() { // from class: ekwh
            @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                elav.this.close();
                eldhVar.close();
            }
        };
    }

    public final elav b() {
        J();
        return B(this, "onAttachedToWindow");
    }

    public final elav c() {
        J();
        final elav B = B(this, "Back pressed");
        final elav k = ekyf.k();
        return new elav() { // from class: ekwj
            @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                elav.this.close();
                k.close();
            }
        };
    }

    public final elav d() {
        H();
        p("onDestroy", elam.a(elal.ACTIVITY_DESTROY));
        return new elav() { // from class: ekwo
            @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                ekwr ekwrVar = ekwr.this;
                ekwrVar.q();
                ekwrVar.o();
                ekwrVar.a = null;
            }
        };
    }

    public final elav e(Intent intent) {
        intent.getClass();
        F("Reintenting into", "onNewIntent", intent);
        return new ekwp(this);
    }

    public final elav f() {
        H();
        p("onPause", elam.a(elal.ACTIVITY_PAUSE));
        return new ekwn(this);
    }

    public final elav g() {
        this.c = ekyf.c();
        ekyf.g(this.a);
        final elav B = B(this, "onPostResume");
        return new elav() { // from class: ekwm
            @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                elav.this.close();
                ekwr ekwrVar = this;
                ekwrVar.a = null;
                ekwrVar.b = false;
                ekyf.g(ekwrVar.c);
                ekwrVar.c = null;
            }
        };
    }

    public final elav h() {
        G();
        I();
        p("onResume", elam.a(elal.ACTIVITY_RESUME));
        return new ekwp(this);
    }

    public final elav i() {
        G();
        I();
        p("onStart", elam.a(elal.ACTIVITY_START));
        return new ekwp(this);
    }

    public final elav j() {
        H();
        p("onStop", elam.a(elal.ACTIVITY_STOP));
        return new ekwn(this);
    }

    public final elav k() {
        J();
        return B(this, "onSupportNavigateUp");
    }

    public final elav l() {
        J();
        return B(this, "onUserInteraction");
    }

    public final void m() {
        this.f.a().s(new elbu(elcb.a(this.g)));
    }

    public final void n(lki lkiVar) {
        int ordinal = lkiVar.ordinal();
        if (ordinal == 0) {
            if (this.d) {
                q();
                this.d = false;
                return;
            }
            return;
        }
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
            q();
        } else {
            Objects.toString(lkiVar);
            throw new UnsupportedOperationException("Unknown lifecycle: ".concat(lkiVar.toString()));
        }
    }

    public final void o() {
        this.i = true;
        if (this.f.isChangingConfigurations() || this.f.isFinishing()) {
            return;
        }
        this.a = null;
    }

    public final void p(String str, elae elaeVar) {
        this.c = ekyf.c();
        elae e = elae.e(elam.b, elaeVar);
        elat elatVar = this.a;
        if (elatVar != null) {
            ekyf.g(elatVar);
            e.getClass();
            e = C(e);
        } else {
            this.j = ekyf.w();
            if (ekyf.v()) {
                e.getClass();
                e = C(e);
            } else {
                Context context = this.g;
                Class<?> cls = context.getClass();
                elbx a = elcb.a(context);
                this.k = a.a.b(cls.getSimpleName() + ": " + str, elae.e((elae) a.b.b(), e), a.d);
            }
            this.a = ekyf.c();
        }
        this.e = eleg.g(E(str), e);
    }

    public final void q() {
        elav elavVar = this.e;
        if (elavVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        elavVar.close();
        this.e = null;
        if (this.j) {
            this.j = false;
            ekyf.q();
        }
        elav elavVar2 = this.l;
        if (elavVar2 != null) {
            elavVar2.close();
        }
        this.l = null;
        elav elavVar3 = this.k;
        if (elavVar3 != null) {
            elavVar3.close();
        }
        this.k = null;
        ekyf.g(this.c);
        this.c = null;
    }

    public final elav r() {
        J();
        G();
        I();
        if (this.a == null) {
            return B(this, "onActivityResult");
        }
        final elat c = ekyf.c();
        ekyf.g(this.a);
        final elav B = B(this, "onActivityResult");
        return new elav() { // from class: ekwi
            @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                elav.this.close();
                ekyf.g(c);
            }
        };
    }

    public final elav s() {
        return B(this, "onConfigurationChanged");
    }

    public final elav t() {
        I();
        Intent intent = this.f.getIntent();
        intent.getClass();
        F("Intenting into", "onCreate", intent);
        return new ekwp(this);
    }

    public final elav u() {
        elav j = ekyf.j();
        if (ekyf.v()) {
            return j;
        }
        Context context = this.g;
        final ekzm a = elcb.a(context).a(context.getClass(), "onCreatePanelMenu");
        return new elav() { // from class: ekwq
            @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                ekzm.this.close();
                ekyf.q();
            }
        };
    }

    public final elav v() {
        J();
        return B(this, "onMenuItemSelected");
    }

    public final elav w() {
        J();
        return B(this, "onOptionsItemSelected");
    }

    public final elav x() {
        J();
        return B(this, "onPictureInPictureModeChanged");
    }

    public final elav y() {
        G();
        elae elaeVar = elad.a;
        elaeVar.getClass();
        p("onPostCreate", elaeVar);
        return new ekwp(this);
    }

    public final elav z() {
        return B(this, "onRequestPermissionsResult");
    }
}

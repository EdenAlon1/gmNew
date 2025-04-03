package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.ConfirmationConfiguration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djji implements djjr {
    public static final diyy a = dizd.a(188291725);
    private static final diyy v = dizd.a(192639545);
    public djjw b;
    public final eehs c;
    protected final dkgw d;

    @Deprecated
    public final djts e;
    public final djtl f;
    public djtp g;
    public final djjq h;
    public final String i;
    public final dkrk k;
    public final dktn l;
    public final djqr m;
    public final eehz n;
    public final djkd o;
    public final djjx p;
    public final dkur q;
    public final dkpf r;
    public final diod s;
    private djqs w;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public final List t = new CopyOnWriteArrayList();
    public final djkh u = new djjg(this);

    public djji(djjq djjqVar, String str, djtp djtpVar, diod diodVar, dktn dktnVar, Context context, eehz eehzVar, eehs eehsVar, djqr djqrVar, dkgw dkgwVar, djkd djkdVar, dkpf dkpfVar, djjx djjxVar, dkur dkurVar, errm errmVar) {
        this.s = diodVar;
        this.l = dktnVar;
        this.i = str;
        this.h = djjqVar;
        this.n = eehzVar;
        this.c = eehsVar;
        this.g = djtpVar;
        this.e = new djts(djtpVar.m(), djtpVar.e());
        this.f = new djtl(djtpVar, djtpVar.e());
        this.k = new dkrk(dktnVar, ditq.a(context.getApplicationContext(), dktnVar.a.concat(".ims_refreshable_manager")), errmVar);
        this.o = djkdVar;
        this.m = djqrVar;
        this.d = dkgwVar;
        this.r = dkpfVar;
        this.p = djjxVar;
        this.q = dkurVar;
        dkty.l(dktnVar, "IMS module has been created", new Object[0]);
        djjqVar.onImsModuleInitialized();
    }

    private final void o() {
        djtp djtpVar;
        if (!((Boolean) v.a()).booleanValue() || (djtpVar = this.g) == null || djtpVar.m() == null) {
            return;
        }
        if (this.g.m().equals(dizg.J() ? this.f.a.m() : this.e.a)) {
            return;
        }
        dkty.r(this.l, "IMS configuration has been updated after Configuration is updated.", new Object[0]);
        this.g.C(ImsConfiguration.a(dizg.J() ? this.f.a.m() : this.e.a));
    }

    @Override // defpackage.djjr
    public final ConfirmationConfiguration a() {
        return this.g.l();
    }

    @Override // defpackage.djjr
    public final djtp b() {
        o();
        return this.g;
    }

    @Override // defpackage.djjr
    public final ImsConfiguration c() {
        o();
        return this.g.n();
    }

    @Override // defpackage.djjr
    public final InstantMessageConfiguration d() {
        return this.g.o();
    }

    @Override // defpackage.djjr
    public final String e() {
        djjw djjwVar = this.b;
        return djjwVar == null ? dizg.J() ? this.f.a.m().w() : this.e.a.w() : djjwVar.d();
    }

    public final void f(djkh djkhVar) {
        this.t.add(djkhVar);
    }

    public final void g(dilc dilcVar) {
        this.h.onImsModuleStartFailed(dilcVar);
    }

    public final void h(dilc dilcVar) {
        this.h.onImsModuleStopped(dilcVar);
    }

    public final void i(dilc dilcVar) {
        if (!this.j.get()) {
            dkty.r(this.l, "IMS module not started yet", new Object[0]);
            return;
        }
        djjw djjwVar = this.b;
        djjwVar.getClass();
        djjwVar.g(dilcVar);
    }

    public final synchronized void j(int i) {
        if (this.c == null) {
            dkty.h(this.l, "ImsServiceDispatcher is null, should be set before calling start", new Object[0]);
            return;
        }
        if (this.j.get()) {
            dkty.r(this.l, "IMS module already started", new Object[0]);
            return;
        }
        if (this.g.S() && this.g.X()) {
            dkty.r(this.l, "Reconfiguration required. Aborting IMS module start.", new Object[0]);
            g(dilc.RECONFIGURATION_REQUIRED);
            return;
        }
        try {
            dkty.d(this.l, "Start the IMS module", new Object[0]);
            dkty.l(this.l, "Starting IMS dispatcher", new Object[0]);
            this.j.set(true);
            if (Objects.isNull(this.b)) {
                dkty.h(this.l, "ImsRegistrationController is null, should be set before calling start", new Object[0]);
                this.j.set(false);
                return;
            }
            this.b.i(i);
            if (this.w == null) {
                djjh djjhVar = new djjh(this);
                this.w = djjhVar;
                this.m.b(djjhVar);
            }
            dkty.l(this.l, "IMS module started", new Object[0]);
        } catch (Exception e) {
            dkty.j(e, this.l, "Error while starting IMS module: %s", e.getMessage());
            this.j.set(false);
        }
    }

    @Override // defpackage.djjr
    public final synchronized void k(dilc dilcVar) {
        if (!this.j.get()) {
            dkty.r(this.l, "IMS module not started yet", new Object[0]);
            return;
        }
        dkty.d(this.l, "Stop the IMS module due to %s", dilcVar);
        this.j.set(false);
        djqs djqsVar = this.w;
        if (djqsVar != null) {
            this.m.g(djqsVar);
            this.w = null;
        }
        this.d.g(dilcVar);
        djjw djjwVar = this.b;
        djjwVar.getClass();
        djjwVar.j(dilcVar);
        dkty.l(this.l, "IMS module stopped", new Object[0]);
        if (((Boolean) a.a()).booleanValue()) {
            return;
        }
        h(dilcVar);
    }

    public final void l(djtp djtpVar) {
        dkty.d(this.l, "Updating RCS configuration to %d", Integer.valueOf(djtpVar.e()));
        this.g = djtpVar;
        if (dizg.J()) {
            this.f.a(djtpVar, djtpVar.e());
        } else {
            this.e.a(djtpVar.m(), djtpVar.e());
        }
    }

    @Override // defpackage.djjr
    public final boolean m() {
        djjw djjwVar = this.b;
        if (djjwVar == null) {
            return false;
        }
        return djjwVar.l();
    }

    public final boolean n() {
        return this.j.get();
    }
}

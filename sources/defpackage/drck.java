package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.fbal;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class drck extends dtaa implements fbat {
    private ContextWrapper a;
    private boolean b;
    private volatile fbae c;
    private final Object d;
    private boolean e;

    drck() {
        this.d = new Object();
        this.e = false;
    }

    private final void a() {
        if (this.a == null) {
            this.a = new fbal.a(super.z(), this);
            this.b = fazm.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.lkd
    public final lms R() {
        return fazp.b(this, super.R());
    }

    @Override // defpackage.fbat
    /* renamed from: aT, reason: merged with bridge method [inline-methods] */
    public final fbae aW() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new fbae(this);
                }
            }
        }
        return this.c;
    }

    protected final void aU() {
        if (this.e) {
            return;
        }
        this.e = true;
        drcf drcfVar = (drcf) this;
        akgt akgtVar = (akgt) aX();
        drcfVar.aK = (ernh) akgtVar.a.lm.b();
        drcfVar.aL = akgtVar.a.ll;
        drcfVar.aM = (ffsk) akgtVar.g.b();
        drcfVar.aN = Optional.of(akgtVar.a.b.pP);
        drcfVar.b = (Context) akgtVar.a.q.b();
        drcfVar.c = (dqze) akgtVar.a.a.un.b();
        drcfVar.d = (dtdg) akgtVar.bQ.b();
        drcfVar.e = akgtVar.a.a.ma();
        drcfVar.ag = new drcp(akgtVar.bT);
        drcfVar.ah = (ffsk) akgtVar.a.a.p.b();
        drcfVar.ai = (dqza) akgtVar.a.a.Kh.b();
        drcfVar.aj = Optional.of((adao) akgtVar.a.b.lO.b());
        drcfVar.ak = (Optional) akgtVar.bU.b();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && fbae.d(contextWrapper) != activity) {
            z = false;
        }
        fbau.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
        aU();
    }

    @Override // defpackage.dslv, defpackage.ea
    public void g(Context context) {
        super.g(context);
        a();
        aU();
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        LayoutInflater aO = aO();
        return aO.cloneInContext(new fbal.a(aO, this));
    }

    @Override // defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.b) {
            return null;
        }
        a();
        return this.a;
    }

    public drck(Integer num, dtab dtabVar) {
        super(num, dtabVar);
        this.d = new Object();
        this.e = false;
    }
}
